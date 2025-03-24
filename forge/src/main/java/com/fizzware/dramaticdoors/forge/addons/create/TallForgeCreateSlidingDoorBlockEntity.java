package com.fizzware.dramaticdoors.forge.addons.create;

import java.util.List;

import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.forge.compat.CreateForgeCompat;
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

public class TallForgeCreateSlidingDoorBlockEntity extends SmartBlockEntity
{
	
	private LerpedFloat animation;
	int bridgeTicks;
	boolean deferUpdate;
	
	public TallForgeCreateSlidingDoorBlockEntity(BlockPos pos, BlockState blockState) {
		super(CreateForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, pos, blockState);
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
		boolean wasSettled = getAnimation().settled();
		getAnimation().chase(open ? 1 : 0, .15f, Chaser.LINEAR);
		getAnimation().tickChaser();

		if (level.isClientSide()) {
			if (bridgeTicks < 2 && open) {
				bridgeTicks++;
			}
			else if (bridgeTicks > 0 && !open && isVisible(getBlockState())) {
				bridgeTicks--;
			}
			return;
		}

		if (!open && !wasSettled && getAnimation().settled() && !isVisible(getBlockState())) {
			showBlockModel();
		}
	}
	
	protected void showBlockModel() {
		level.setBlock(worldPosition, getBlockState().setValue(TallCreateSlidingDoorBlock.VISIBLE, true), 3);
		level.playSound(null, worldPosition, SoundEvents.IRON_DOOR_CLOSE, SoundSource.BLOCKS, .5f, 1);
	}
	
	public static boolean isVisible(BlockState state) {
		return state.getOptionalValue(DDBlockStateProperties.VISIBLE).orElse(true);
	}
	
	public static boolean isOpen(BlockState state) {
		return state.getOptionalValue(TallDoorBlock.OPEN).orElse(false);
	}
	
	public boolean shouldRenderSpecial(BlockState state) {
		return !isVisible(state) || bridgeTicks != 0;
	}

	@Override
	public void addBehaviours(List<BlockEntityBehaviour> list) {}

	public LerpedFloat getAnimation() {
		return animation;
	}

	public void setAnimation(LerpedFloat animation) {
		this.animation = animation;
	}
}
