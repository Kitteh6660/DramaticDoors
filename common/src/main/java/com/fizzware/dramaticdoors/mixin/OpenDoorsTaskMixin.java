package com.fizzware.dramaticdoors.mixin;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.tags.DDBlockTags;

import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;

// Ported from Fabric version of Dramatic Doors.
@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin
{
	/*@Inject(method = "start(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;J)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/InteractWithDoor;closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)V"))
	private void injectStart(ServerLevel world, LivingEntity entity, long time, CallbackInfo ci) {
		TallDoorBlock tallDoorBlock;
		Path path2 = entity.getBrain().getMemory(MemoryModuleType.PATH).get();
		Node node2 = path2.getNextNode();
		BlockState blockStateDD;
		BlockPos blockPosDD;
		if ((blockStateDD = world.getBlockState(blockPosDD = node2.asBlockPos())).is(DDBlockTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock) && !(tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock()).isOpen(blockStateDD)) {
            tallDoorBlock.setOpen(entity, world, blockStateDD, blockPosDD, true);
            ((InteractWithDoor)(Object)this).rememberDoorToClose(world, entity, blockPosDD);
        }
	}*/

	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;Ljava/util/Set;Ljava/util/Optional;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, Set<GlobalPos> doors, Optional<List<LivingEntity>> otherMobs, CallbackInfo ci, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
        if (blockStateDD.is(DDBlockTags.MOB_INTERACTABLE_TALL_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
        if (blockStateDD.is(DDBlockTags.MOB_INTERACTABLE_SHORT_DOORS, state -> state.getBlock() instanceof ShortDoorBlock)) {
        	ShortDoorBlock shortDoorBlock = (ShortDoorBlock)blockStateDD.getBlock();
        	shortDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
	}
}
