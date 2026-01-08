package com.fizzware.dramaticdoors.fabric.addons.create;

import java.util.List;

import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;
import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.simibubi.create.foundation.blockEntity.SmartBlockEntity;
import com.simibubi.create.foundation.blockEntity.behaviour.BlockEntityBehaviour;

import net.createmod.catnip.animation.LerpedFloat;
import net.createmod.catnip.animation.LerpedFloat.Chaser;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.AABB;

public class TallFabricCreateSlidingDoorBlockEntity extends SmartBlockEntity
{
	private LerpedFloat animation;
	int bridgeTicks;
	boolean deferUpdate;
	
	public TallFabricCreateSlidingDoorBlockEntity(BlockPos pos, BlockState blockState) {
		super(CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, pos, blockState);
		animation = LerpedFloat.linear().startWithValue(isOpen(blockState) ? 1 : 0);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	public void tick() {
		if (deferUpdate && !level.isClientSide()) {
			deferUpdate = false;
			BlockState blockState = getBlockState();
			blockState.neighborChanged(level, worldPosition, Blocks.AIR, worldPosition, false);
		}

		super.tick();
		boolean open = isOpen(getBlockState());
		boolean wasSettled = animation.settled();
		animation.chase(open ? 1 : 0, .15f, Chaser.LINEAR);
		animation.tickChaser();

		if (level.isClientSide()) {
			if (bridgeTicks < 2 && open) {
				bridgeTicks++;
			}
			else if (bridgeTicks > 0 && !open && isVisible(getBlockState())) {
				bridgeTicks--;
			}
			return;
		}

		if (!open && !wasSettled && animation.settled() && !isVisible(getBlockState())) {
			showBlockModel();
		}
	}
	
	@Override
	protected AABB createRenderBoundingBox() {
		return super.createRenderBoundingBox().inflate(2);
	}
	
	public static boolean isVisible(BlockState state) {
		return state.getOptionalValue(DDBlockStateProperties.VISIBLE).orElse(true);
	}
	
	public boolean shouldRenderSpecial(BlockState state) {
		return !isVisible(state) || bridgeTicks != 0;
	}
	
	protected void showBlockModel() {
		level.setBlock(worldPosition, getBlockState().setValue(TallCreateSlidingDoorBlock.VISIBLE, true), 3);
		level.playSound(null, worldPosition, SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS, .5f, 1);
	}

	@Override
	public void addBehaviours(List<BlockEntityBehaviour> list) {}

	public static boolean isOpen(BlockState state) {
		return state.getOptionalValue(TallDoorBlock.OPEN).orElse(false);
	}
	
	public LerpedFloat getAnimation() {
		return animation;
	}

	public void setAnimation(LerpedFloat animation) {
		this.animation = animation;
	}
}
