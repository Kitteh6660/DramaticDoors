package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.state.properties.SlidingDoorType;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class TallSlidingDoorBlock extends TallDoorBlock
{
	private final SlidingDoorType doorType;
	
	// Fruitful Fun
    protected static final VoxelShape FF_SOUTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.0D, 0.0D, -0.28125D);
    protected static final VoxelShape FF_NORTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.0D, 0.0D, 0.28125D);
    protected static final VoxelShape FF_WEST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.28125D, 0.0D, 0.0D);
    protected static final VoxelShape FF_EAST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(-0.28125D, 0.0D, 0.0D);
    protected static final VoxelShape FF_SOUTH_OPEN_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(-0.8125D, 0.0D, -0.28125D);
    protected static final VoxelShape FF_NORTH_OPEN_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.8125D, 0.0D, 0.28125D);
    protected static final VoxelShape FF_WEST_OPEN_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.28125D, 0.0D, -0.8125D);
    protected static final VoxelShape FF_EAST_OPEN_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(-0.28125D, 0.0D, 0.8125D);
    protected static final VoxelShape FF_SOUTH_OPEN_LEFT_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.8125D, 0.0D, -0.28125D);
    protected static final VoxelShape FF_NORTH_OPEN_LEFT_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(-0.8125D, 0.0D, 0.28125D);
    protected static final VoxelShape FF_WEST_OPEN_LEFT_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.28125D, 0.0D, 0.8125D);
    protected static final VoxelShape FF_EAST_OPEN_LEFT_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(-0.28125D, 0.0D, -0.8125D);
	
	// Macaw's Doors
    protected static final VoxelShape MACAW_SOUTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape MACAW_NORTH_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D);
    protected static final VoxelShape MACAW_WEST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape MACAW_EAST_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D);
    protected static final VoxelShape MACAW_SOUTH_OPEN_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(-0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape MACAW_NORTH_OPEN_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape MACAW_WEST_OPEN_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, -0.6875D);
    protected static final VoxelShape MACAW_EAST_OPEN_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, 0.6875D);
    protected static final VoxelShape MACAW_SOUTH_OPEN_LEFT_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape MACAW_NORTH_OPEN_LEFT_AABB = Block.box(0.0D, 0.0D, 7.0D, 16.0D, 16.0D, 9.0D).move(-0.6875D, 0.0D, 0.0D);
    protected static final VoxelShape MACAW_WEST_OPEN_LEFT_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, 0.6875D);
    protected static final VoxelShape MACAW_EAST_OPEN_LEFT_AABB = Block.box(7.0D, 0.0D, 0.0D, 9.0D, 16.0D, 16.0D).move(0.0D, 0.0D, -0.6875D);
    
	public TallSlidingDoorBlock(BlockSetType blockset, Block from) {
		this(blockset, from, SlidingDoorType.MACAW);
	}
    
	public TallSlidingDoorBlock(BlockSetType blockset, Block from, SlidingDoorType type) {
		super(blockset, from);
		this.doorType = type;
	}

	@Override
	public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Direction direction = state.getValue(FACING);
        boolean flag = !state.getValue(OPEN);
        boolean flag1 = state.getValue(HINGE) == DoorHingeSide.LEFT;
        if (this.doorType == SlidingDoorType.FRUITFUL_FUN) {
            switch(direction) {
		        case EAST:
		        default:
		            return flag ? FF_EAST_AABB : (flag1 ? FF_EAST_OPEN_LEFT_AABB : FF_EAST_OPEN_AABB);
		        case SOUTH:
		            return flag ? FF_SOUTH_AABB : (flag1 ? FF_SOUTH_OPEN_LEFT_AABB : FF_SOUTH_OPEN_AABB);
		        case WEST:
		            return flag ? FF_WEST_AABB : (flag1 ? FF_WEST_OPEN_LEFT_AABB : FF_WEST_OPEN_AABB);
		        case NORTH:
		            return flag ? FF_NORTH_AABB : (flag1 ? FF_NORTH_OPEN_LEFT_AABB : FF_NORTH_OPEN_AABB);
		    }
        }
        else if (this.doorType == SlidingDoorType.MACAW) {
            switch(direction) {
		        case EAST:
		        default:
		            return flag ? MACAW_EAST_AABB : (flag1 ? MACAW_EAST_OPEN_LEFT_AABB : MACAW_EAST_OPEN_AABB);
		        case SOUTH:
		            return flag ? MACAW_SOUTH_AABB : (flag1 ? MACAW_SOUTH_OPEN_LEFT_AABB : MACAW_SOUTH_OPEN_AABB);
		        case WEST:
		            return flag ? MACAW_WEST_AABB : (flag1 ? MACAW_WEST_OPEN_LEFT_AABB : MACAW_WEST_OPEN_AABB);
		        case NORTH:
		            return flag ? MACAW_NORTH_AABB : (flag1 ? MACAW_NORTH_OPEN_LEFT_AABB : MACAW_NORTH_OPEN_AABB);
		    }
        }
        else {
            return super.getShape(state, level, pos, context);
        }
    }
}
