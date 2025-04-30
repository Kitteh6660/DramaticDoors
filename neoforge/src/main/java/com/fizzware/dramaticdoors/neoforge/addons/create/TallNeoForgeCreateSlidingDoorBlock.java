package com.fizzware.dramaticdoors.neoforge.addons.create;

import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.neoforge.compat.CreateNeoForgeCompat;
import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import com.simibubi.create.content.contraptions.ContraptionWorld;
import com.simibubi.create.content.equipment.wrench.IWrenchable;
import com.simibubi.create.foundation.block.IBE;
import com.simibubi.create.foundation.block.IHaveBigOutline;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallNeoForgeCreateSlidingDoorBlock extends TallCreateSlidingDoorBlock implements IWrenchable, IBE<TallNeoForgeCreateSlidingDoorBlockEntity>, IHaveBigOutline
{	
	public static final BooleanProperty VISIBLE = DDBlockStateProperties.VISIBLE;
	
	public TallNeoForgeCreateSlidingDoorBlock(BlockSetType blockset, Block from, boolean isFolding) {
		super(blockset, from, isFolding);
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		if (state.getValue(THIRD) == TripleBlockPart.LOWER) {
			return new TallNeoForgeCreateSlidingDoorBlockEntity(pos, state);
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
		return TallCreateSlidingDoorBlock.getShapeByProperty(direction, hinge, isFoldingDoor());
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
		TallNeoForgeCreateSlidingDoorBlockEntity be = getBlockEntity(level, lower ? pos : pos.below());
		if (be != null && be.deferUpdate) {
			return;
		}
		BlockState changedState = state.setValue(POWERED, Boolean.valueOf(isPowered)).setValue(OPEN, Boolean.valueOf(isPowered));
		if (isPowered) {
			changedState = changedState.setValue(VISIBLE, false);
		}
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
	public void deferUpdate(LevelAccessor level, BlockPos pos) {
		withBlockEntityDo(level, pos, sdte -> sdte.deferUpdate = true);
	}
	
	@Override
	public Class<TallNeoForgeCreateSlidingDoorBlockEntity> getBlockEntityClass() {
		return TallNeoForgeCreateSlidingDoorBlockEntity.class;
	}

	@Override
	public BlockEntityType<? extends TallNeoForgeCreateSlidingDoorBlockEntity> getBlockEntityType() {
		return CreateNeoForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY;
	}
}