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

@Mixin(InteractWithDoor.class)
public class OpenDoorsTaskMixin
{
	@Inject(method = "closeDoorsThatIHaveOpenedOrPassedThrough(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/LivingEntity;Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;Ljava/util/Set;Ljava/util/Optional;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/server/level/ServerLevel;getBlockState(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/block/state/BlockState;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private static void injectPathToDoor(ServerLevel world, LivingEntity entity, @Nullable Node lastNode, @Nullable Node currentNode, Set<GlobalPos> doors, Optional<List<LivingEntity>> otherMobs, CallbackInfo ci, Iterator<GlobalPos> iterator, GlobalPos globalPos, BlockPos blockPos) {
		BlockState blockStateDD = world.getBlockState(blockPos);
        if (blockStateDD.is(DDBlockTags.TALL_WOODEN_DOORS, state -> state.getBlock() instanceof TallDoorBlock)) {
        	TallDoorBlock tallDoorBlock = (TallDoorBlock)blockStateDD.getBlock();
        	tallDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
        if (blockStateDD.is(DDBlockTags.SHORT_WOODEN_DOORS, state -> state.getBlock() instanceof ShortDoorBlock)) {
        	ShortDoorBlock shortDoorBlock = (ShortDoorBlock)blockStateDD.getBlock();
        	shortDoorBlock.setOpen(entity, world, blockStateDD, blockPos, false);
        }
	}
}
