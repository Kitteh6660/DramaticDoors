package com.fizzware.dramaticdoors.neoforge.addons.create;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.simibubi.create.content.contraptions.Contraption;
import com.simibubi.create.content.contraptions.behaviour.SimpleBlockMovingInteraction;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate.StructureBlockInfo;

public class ShortDoorMovingInteraction extends SimpleBlockMovingInteraction
{
	@Override
	protected BlockState handle(Player player, Contraption contraption, BlockPos pos, BlockState currentState) {
		if (!(currentState.getBlock() instanceof ShortDoorBlock)) {
			return currentState;
		}

		boolean trainDoor = currentState.getBlock() instanceof TallCreateSlidingDoorBlock; // Short not yet implemented.
		SoundEvent sound = currentState.getValue(ShortDoorBlock.OPEN) ? trainDoor ? null : SoundEvents.WOODEN_DOOR_CLOSE : trainDoor ? SoundEvents.IRON_DOOR_OPEN : SoundEvents.WOODEN_DOOR_OPEN;

		currentState = currentState.cycle(DoorBlock.OPEN);

		if (player != null) {

			if (trainDoor) {
				DoorHingeSide hinge = currentState.getValue(TallCreateSlidingDoorBlock.HINGE);
				Direction facing = currentState.getValue(TallCreateSlidingDoorBlock.FACING);
				BlockPos doublePos = pos.relative(hinge == DoorHingeSide.LEFT ? facing.getClockWise() : facing.getCounterClockWise());
				StructureBlockInfo doubleInfo = contraption.getBlocks().get(doublePos);
				if (doubleInfo != null && TallCreateSlidingDoorBlock.isDoubleDoor(currentState, hinge, facing, doubleInfo.state())) {
					handlePlayerInteraction(null, InteractionHand.MAIN_HAND, doublePos, contraption.entity);
				}
			}

			float pitch = player.level().getRandom().nextFloat() * 0.1F + 0.9F;
			if (sound != null) {
				playSound(player, sound, pitch);
			}
		}

		return currentState;
	}

	@Override
	protected boolean updateColliders() {
		return true;
	}
}
