package com.fizzware.dramaticdoors.fabric.addons.create;

import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import com.simibubi.create.content.contraptions.ContraptionWorld;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import com.simibubi.create.foundation.block.IBE;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallFabricCreateSlidingDoorBlock extends TallCreateSlidingDoorBlock implements IWrenchable, IBE<TallFabricCreateSlidingDoorBlockEntity>
{	
	public TallFabricCreateSlidingDoorBlock(Block from, BlockSetType blockset, boolean isFolding) {
		super(from, blockset, isFolding);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		if (state.getValue(THIRD) == TripleBlockPart.LOWER) {
			return new TallFabricCreateSlidingDoorBlockEntity(pos, state);
		}
		return null;
	}
	
	@Override
	public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
		if (!pState.getValue(OPEN) && (pState.getValue(VISIBLE) || pLevel instanceof ContraptionWorld)) {
			return super.getShape(pState, pLevel, pPos, pContext);
		}
		Direction direction = pState.getValue(FACING);
		boolean hinge = pState.getValue(HINGE) == DoorHingeSide.RIGHT;
		return TallFabricCreateSlidingDoorBlock.getShapeByProperty(direction, hinge, isFoldingDoor());
	}
	
	public static VoxelShape getShapeByProperty(Direction facing, boolean hinge, boolean fold) {
		if (fold) {
			return switch (facing) {
			case SOUTH -> (hinge ? ES_AABB_FOLD : WS_AABB_FOLD);
			case WEST -> (hinge ? SW_AABB_FOLD : NW_AABB_FOLD);
			case NORTH -> (hinge ? WN_AABB_FOLD : EN_AABB_FOLD);
			default -> (hinge ? NE_AABB_FOLD : SE_AABB_FOLD);
			};
		}
		else {
			return switch (facing) {
			case SOUTH -> (hinge ? ES_AABB : WS_AABB);
			case WEST -> (hinge ? SW_AABB : NW_AABB);
			case NORTH -> (hinge ? WN_AABB : EN_AABB);
			default -> (hinge ? NE_AABB : SE_AABB);
			};
		}
	}
	
    @Override
    public void neighborChanged(BlockState state, Level level, BlockPos pos, Block blockIn, BlockPos fromPos, boolean isMoving) {
		boolean lower = state.getValue(THIRD) == TripleBlockPart.LOWER;
		boolean isPowered = isDoorPowered(level, pos, state);
		if (defaultBlockState().is(blockIn)) {
			return;
		}
		if (isPowered == state.getValue(POWERED)) {
			return;
		}
		TallFabricCreateSlidingDoorBlockEntity be = getBlockEntity(level, lower ? pos : pos.below());
		if (be != null && be.deferUpdate) {
			return;
		}
		BlockState changedState = state.setValue(POWERED, Boolean.valueOf(isPowered)).setValue(OPEN, Boolean.valueOf(isPowered));
		if (isPowered)
			changedState = changedState.setValue(VISIBLE, false);

		if (isPowered != state.getValue(OPEN)) {
			this.playSound(null, level, pos, isPowered);
			level.gameEvent(null, isPowered ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);

			DoorHingeSide hinge = changedState.getValue(HINGE);
			Direction facing = changedState.getValue(FACING);
			BlockPos otherPos = pos.relative(hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise());
			BlockState otherDoor = level.getBlockState(otherPos);

			if (isDoubleDoor(changedState, hinge, facing, otherDoor)) {
				otherDoor = otherDoor.setValue(POWERED, Boolean.valueOf(isPowered)).setValue(OPEN, Boolean.valueOf(isPowered));
				if (isPowered) {
					otherDoor = otherDoor.setValue(VISIBLE, false);
				}
				level.setBlock(otherPos, otherDoor, 2);
			}
		}
		level.setBlock(pos, changedState, 2);
    }
	
	@Override
	public boolean isFoldingDoor() {
		return super.isFoldingDoor();
	}
	
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    	super.createBlockStateDefinition(builder);
    }
    
	@Override
	public RenderShape getRenderShape(BlockState state) {
		return state.getValue(VISIBLE) ? RenderShape.MODEL : RenderShape.ENTITYBLOCK_ANIMATED;
	}
	
	@Override
	public void deferUpdate(LevelAccessor level, BlockPos pos) {
		withBlockEntityDo(level, pos, sdte -> sdte.deferUpdate = true);
	}
	
	@Override
	public Class<TallFabricCreateSlidingDoorBlockEntity> getBlockEntityClass() {
		return TallFabricCreateSlidingDoorBlockEntity.class;
	}

	@Override
	public BlockEntityType<? extends TallFabricCreateSlidingDoorBlockEntity> getBlockEntityType() {
		return CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY;
	}
}
