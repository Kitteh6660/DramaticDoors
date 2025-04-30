package com.fizzware.dramaticdoors.blocks;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.VoxelShape;

public abstract class TallCreateSlidingDoorBlock extends TallDoorBlock
{

	protected static final VoxelShape SE_AABB = Block.box(0.0D, 0.0D, -13.0D, 3.0D, 16.0D, 3.0D);
	protected static final VoxelShape ES_AABB = Block.box(-13.0D, 0.0D, 0.0D, 3.0D, 16.0D, 3.0D);
	protected static final VoxelShape NW_AABB = Block.box(13.0D, 0.0D, 13.0D, 16.0D, 16.0D, 29.0D);
	protected static final VoxelShape WN_AABB = Block.box(13.0D, 0.0D, 13.0D, 29.0D, 16.0D, 16.0D);
	protected static final VoxelShape SW_AABB = Block.box(13.0D, 0.0D, -13.0D, 16.0D, 16.0D, 3.0D);
	protected static final VoxelShape WS_AABB = Block.box(13.0D, 0.0D, 0.0D, 29.0D, 16.0D, 3.0D);
	protected static final VoxelShape NE_AABB = Block.box(0.0D, 0.0D, 13.0D, 3.0D, 16.0D, 29.0D);
	protected static final VoxelShape EN_AABB = Block.box(-13.0D, 0.0D, 13.0D, 3.0D, 16.0D, 16.0D);

	protected static final VoxelShape SE_AABB_FOLD = Block.box(0.0D, 0.0D, -3.0D, 9.0D, 16.0D, 3.0D);
	protected static final VoxelShape ES_AABB_FOLD = Block.box(-3.0D, 0.0D, 0.0D, 3.0D, 16.0D, 9.0D);
	protected static final VoxelShape NW_AABB_FOLD = Block.box(7.0D, 0.0D, 13.0D, 16.0D, 16.0D, 19.0D);
	protected static final VoxelShape WN_AABB_FOLD = Block.box(13.0D, 0.0D, 7.0D, 19.0D, 16.0D, 16.0D);
	protected static final VoxelShape SW_AABB_FOLD = Block.box(7.0D, 0.0D, -3.0D, 16.0D, 16.0D, 3.0D);
	protected static final VoxelShape WS_AABB_FOLD = Block.box(13.0D, 0.0D, 0.0D, 19.0D, 16.0D, 9.0D);
	protected static final VoxelShape NE_AABB_FOLD = Block.box(0.0D, 0.0D, 13.0D, 9.0D, 16.0D, 19.0D);
	protected static final VoxelShape EN_AABB_FOLD = Block.box(-3.0D, 0.0D, 7.0D, 3.0D, 16.0D, 16.0D);
	
	public static final BooleanProperty VISIBLE = DDBlockStateProperties.VISIBLE;
	private boolean folds = false;
	
	public TallCreateSlidingDoorBlock(BlockSetType blockset, Block from, boolean isFolding) {
		super(blockset, from);
		this.folds = isFolding;
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
	public BlockState updateShape(BlockState state, Direction pFacing, BlockState pFacingState, LevelAccessor level,
		BlockPos pCurrentPos, BlockPos pFacingPos) {
		BlockState blockState = super.updateShape(state, pFacing, pFacingState, level, pCurrentPos, pFacingPos);
		if (blockState.isAir()) {
			return blockState;
		}
		TripleBlockPart part = blockState.getValue(THIRD);
		if (pFacing.getAxis() == Direction.Axis.Y && part == TripleBlockPart.LOWER == (pFacing == Direction.UP)) {
			return pFacingState.is(this) && pFacingState.getValue(THIRD) != part ? blockState.setValue(VISIBLE, pFacingState.getValue(VISIBLE)) : Blocks.AIR.defaultBlockState();
		}
		if (pFacing.getAxis() == Direction.Axis.Y && part == TripleBlockPart.UPPER == (pFacing == Direction.DOWN)) {
			return pFacingState.is(this) && pFacingState.getValue(THIRD) != part ? blockState.setValue(VISIBLE, pFacingState.getValue(VISIBLE)) : Blocks.AIR.defaultBlockState();
		}
		return blockState;
	}
	
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext pContext) {
		BlockState stateForPlacement = super.getStateForPlacement(pContext);
		if (stateForPlacement != null && stateForPlacement.getValue(OPEN)) {
			return stateForPlacement.setValue(OPEN, false).setValue(POWERED, false);
		}
		return stateForPlacement;
	}

	@Override
	public void onPlace(BlockState pState, Level pLevel, BlockPos pPos, BlockState pOldState, boolean pIsMoving) {
		if (!pOldState.is(this)) {
			deferUpdate(pLevel, pPos);
		}
	}
	
	@Override
	public void setOpen(@Nullable Entity entity, Level level, BlockState state, BlockPos pos, boolean open) {
		if (!state.is(this)) {
			return;
		}
		if (state.getValue(OPEN) == open) {
			return;
		}
		BlockState changedState = state.setValue(OPEN, open);
		if (open) {
			changedState = changedState.setValue(VISIBLE, false);
		}
		level.setBlock(pos, changedState, 10);

		DoorHingeSide hinge = changedState.getValue(HINGE);
		Direction facing = changedState.getValue(FACING);
		BlockPos otherPos = pos.relative(hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise());
		BlockState otherDoor = level.getBlockState(otherPos);
		if (isDoubleDoor(changedState, hinge, facing, otherDoor)) {
			setOpen(entity, level, otherDoor, otherPos, open);
		}

		this.playSound(entity, level, pos, open);
		level.gameEvent(entity, open ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);
	}
	
	@Override
	public InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos, Player player, BlockHitResult hit) {
		state = state.cycle(OPEN);
		if (state.getValue(OPEN)) {
			state = state.setValue(VISIBLE, false);
		}
		level.setBlock(pos, state, 10);
		level.gameEvent(player, isOpen(state) ? GameEvent.BLOCK_OPEN : GameEvent.BLOCK_CLOSE, pos);

		DoorHingeSide hinge = state.getValue(HINGE);
		Direction facing = state.getValue(FACING);
		BlockPos otherPos = pos.relative(hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise());
		BlockState otherDoor = level.getBlockState(otherPos);
		if (isDoubleDoor(state, hinge, facing, otherDoor)) {
			useWithoutItem(otherDoor, level, otherPos, player, hit);
		}
		else if (state.getValue(OPEN)) {
			level.gameEvent(player, GameEvent.BLOCK_OPEN, pos);
		}
		return InteractionResult.sidedSuccess(level.isClientSide);
	}
	
	public static boolean isDoubleDoor(BlockState state, DoorHingeSide hinge, Direction facing, BlockState otherDoor) {
		return otherDoor.getBlock() == state.getBlock() && otherDoor.getValue(HINGE) != hinge && otherDoor.getValue(FACING) == facing && otherDoor.getValue(OPEN) != state.getValue(OPEN) && otherDoor.getValue(THIRD) == state.getValue(THIRD);
	}
	
	public static boolean isDoorPowered(Level pLevel, BlockPos pos, BlockState state) {
		boolean lower = state.getValue(THIRD) == TripleBlockPart.LOWER;
		DoorHingeSide hinge = state.getValue(HINGE);
		Direction facing = state.getValue(FACING);
		BlockPos otherPos = pos.relative(hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise());
		BlockState otherDoor = pLevel.getBlockState(otherPos);

		if (isDoubleDoor(state.cycle(OPEN), hinge, facing, otherDoor) && (pLevel.hasNeighborSignal(otherPos) || pLevel.hasNeighborSignal(otherPos.relative(lower ? Direction.UP : Direction.DOWN)))) {
			return true;
		}
		return pLevel.hasNeighborSignal(pos) || pLevel.hasNeighborSignal(pos.relative(lower ? Direction.UP : Direction.DOWN));
	}
	
	public void deferUpdate(LevelAccessor level, BlockPos pos) {}
	
	public boolean isFoldingDoor() {
		return this.folds;
	}
	
    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
    	super.createBlockStateDefinition(builder);
        builder.add(VISIBLE);
    }
    
	@Override
	public RenderShape getRenderShape(BlockState state) {
		return state.getValue(VISIBLE) ? RenderShape.MODEL : RenderShape.ENTITYBLOCK_ANIMATED;
	}
}
