package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fizzware.dramaticdoors.entity.ai.goal.OpenShortDoorsTask;
import com.fizzware.dramaticdoors.entity.ai.goal.OpenTallDoorsTask;
import com.google.common.collect.ImmutableList;

import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinAi;
import net.minecraft.world.entity.schedule.Activity;

@Mixin(PiglinAi.class)
public class PiglinBrainMixin
{

	@Inject(method = "makeBrain(Lnet/minecraft/world/entity/monster/piglin/Piglin;Lnet/minecraft/world/entity/ai/Brain;)Lnet/minecraft/world/entity/ai/Brain;", at = @At (value = "RETURN"))
	private static void injectCreate(Piglin piglin, Brain<Piglin> brain, CallbackInfoReturnable<Brain<?>> cir) {
		initDramaticDoorActivities(brain);
	}
	
    private static void initDramaticDoorActivities(Brain<Piglin> brain) {
        brain.addActivity(Activity.CORE, 1, ImmutableList.of(OpenTallDoorsTask.create()));
        brain.addActivity(Activity.CORE, 1, ImmutableList.of(OpenShortDoorsTask.create()));
    }
}
