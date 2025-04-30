package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.pathfinder.WalkNodeEvaluator;

// Ported from Fabric version of Dramatic Doors.
@Mixin(WalkNodeEvaluator.class)
public class WalkNodeEvaluatorMixin
{
	@Inject(method = "getPathTypeFromState(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/level/pathfinder/PathType;", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/block/state/BlockState;getBlock()Lnet/minecraft/world/level/block/Block;"), cancellable = true)
	private static void injectDoorType(BlockGetter world, BlockPos pos, CallbackInfoReturnable<PathType> callback) {
		BlockState blockStateDDCheck = world.getBlockState(pos);
		if ((blockStateDDCheck.getBlock() instanceof ShortDoorBlock) && !blockStateDDCheck.getValue(BlockStateProperties.OPEN).booleanValue()) {
            callback.setReturnValue(((ShortDoorBlock)blockStateDDCheck.getBlock()).type().canOpenByHand() ? PathType.DOOR_WOOD_CLOSED : PathType.DOOR_IRON_CLOSED);
        }
		if ((blockStateDDCheck.getBlock() instanceof TallDoorBlock) && !blockStateDDCheck.getValue(BlockStateProperties.OPEN).booleanValue()) {
            callback.setReturnValue(((TallDoorBlock)blockStateDDCheck.getBlock()).type().canOpenByHand() ? PathType.DOOR_WOOD_CLOSED : PathType.DOOR_IRON_CLOSED);
        }
		if ((blockStateDDCheck.getBlock() instanceof TallDoorBlock || blockStateDDCheck.getBlock() instanceof ShortDoorBlock) && blockStateDDCheck.getValue(BlockStateProperties.OPEN).booleanValue()) {
            callback.setReturnValue(PathType.DOOR_OPEN);
        }
	}

}
