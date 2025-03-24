package com.fizzware.dramaticdoors.forge.addons.framedblocks;

import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import xfacthd.framedblocks.api.block.FramedBlockEntity;
import xfacthd.framedblocks.api.block.FramedProperties;
import xfacthd.framedblocks.api.block.IFramedBlock;
import xfacthd.framedblocks.api.type.IBlockType;

public class TallForgeFramedDoorBlock extends TallDoorBlock implements IFramedBlock
{    
	private final IBlockType type;

	public TallForgeFramedDoorBlock(IBlockType type, Block from, BlockSetType blockset) {
		super(from, blockset);
		this.type = type;
		registerDefaultState(defaultBlockState().setValue(FramedProperties.SOLID, false).setValue(FramedProperties.GLOWING, false));
	}

	@Override
	public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
		return new FramedBlockEntity(pos, state);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(FramedProperties.SOLID, FramedProperties.GLOWING, FramedProperties.PROPAGATES_SKYLIGHT);
	}

	@Override
	public final InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult hit) {
		InteractionResult result = handleUse(state, level, pos, player, hand, hit);
		if (result.consumesAction()) {
			return result;
		}

		return super.use(state, level, pos, player, hand, hit);
	}

    @Override
	public void setPlacedBy(Level level, BlockPos pos, BlockState state, @Nullable LivingEntity placer, ItemStack stack) {
		// noinspection ConstantConditions
		super.setPlacedBy(level, pos, state, placer, stack);

		tryApplyCamoImmediately(level, pos, placer, stack);
		tryApplyCamoImmediately(level, pos.above(), placer, stack); // Apply to upper half as well
	}

	@Override
	public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos currentPos, BlockPos facingPos) {
		BlockState newState = super.updateShape(state, facing, facingState, level, currentPos, facingPos);
		if (newState == state) {
			updateCulling(level, currentPos);
		}
		return newState;
	}

	@Override
	public void neighborChanged(BlockState state, Level level, BlockPos pos, Block block, BlockPos fromPos, boolean isMoving) {
		super.neighborChanged(state, level, pos, block, fromPos, isMoving);
		updateCulling(level, pos);
	}

	@Override
	public boolean useShapeForLightOcclusion(BlockState state) {
		return useCamoOcclusionShapeForLightOcclusion(state);
	}

	@SuppressWarnings("removal")
	@Override
	public VoxelShape getOcclusionShape(BlockState state, BlockGetter level, BlockPos pos) {
		return getCamoOcclusionShape(state, level, pos);
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext ctx) {
		return getCamoVisualShape(state, level, pos, ctx);
	}

	@SuppressWarnings("deprecation")
	@Override
	public List<ItemStack> getDrops(BlockState state, LootParams.Builder builder) {
		return getCamoDrops(super.getDrops(state, builder), builder);
	}

	@Override
	public IBlockType getBlockType() {
		return this.type;
	}
}
