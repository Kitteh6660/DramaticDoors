package com.fizzware.dramaticdoors.forge.addons.create;

import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
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

public class TallDoorMovingInteraction extends SimpleBlockMovingInteraction
{
	@Override
	protected BlockState handle(Player player, Contraption contraption, BlockPos pos, BlockState currentState) {
		if (!(currentState.getBlock() instanceof TallDoorBlock)) {
			return currentState;
		}

		boolean trainDoor = currentState.getBlock() instanceof TallCreateSlidingDoorBlock;
		SoundEvent sound = currentState.getValue(TallDoorBlock.OPEN) ? trainDoor ? null : SoundEvents.WOODEN_DOOR_CLOSE : trainDoor ? SoundEvents.IRON_DOOR_OPEN : SoundEvents.WOODEN_DOOR_OPEN;

		BlockPos otherPos;
		BlockPos otherPos2;
		switch(currentState.getValue(TallDoorBlock.THIRD)) {
			case UPPER:
				otherPos = pos.below(1);
				otherPos2 = pos.below(2);
				break;
			case MIDDLE:
				otherPos = pos.above(1);
				otherPos2 = pos.below(1);
				break;
			case LOWER:
			default:
				otherPos = pos.above(1);
				otherPos2 = pos.above(2);
		}
		StructureBlockInfo info = contraption.getBlocks().get(otherPos);
		StructureBlockInfo info2 = contraption.getBlocks().get(otherPos2);
		if (info != null && info.state().hasProperty(DoorBlock.OPEN)) {
			BlockState newState = info.state().cycle(DoorBlock.OPEN);
			setContraptionBlockData(contraption.entity, otherPos, new StructureBlockInfo(info.pos(), newState, info.nbt()));
		}
		if (info2 != null && info2.state().hasProperty(DoorBlock.OPEN)) {
			BlockState newState = info2.state().cycle(DoorBlock.OPEN);
			setContraptionBlockData(contraption.entity, otherPos2, new StructureBlockInfo(info2.pos(), newState, info2.nbt()));
		}
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
