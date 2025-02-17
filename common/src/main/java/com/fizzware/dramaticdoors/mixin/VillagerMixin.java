package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

import com.fizzware.dramaticdoors.entity.ai.goal.DDVillagerTasks;

import net.minecraft.world.entity.ai.Brain;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerProfession;
import net.minecraft.world.entity.schedule.Activity;

@Mixin(Villager.class)
public class VillagerMixin
{
	@Inject(method = "registerBrainGoals(Lnet/minecraft/world/entity/ai/Brain;)V", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/entity/ai/behavior/VillagerGoalPackages;getCorePackage(Lnet/minecraft/world/entity/npc/VillagerProfession;F)Lcom/google/common/collect/ImmutableList;"), locals = LocalCapture.CAPTURE_FAILSOFT)
	private void injectInitBrain(Brain<Villager> brain, CallbackInfo ci, VillagerProfession villagerProfession) {
		brain.addActivity(Activity.CORE, DDVillagerTasks.createTallDoorTasks(villagerProfession, 0.5f));
		brain.addActivity(Activity.CORE, DDVillagerTasks.createShortDoorTasks(villagerProfession, 0.5f));
	}
}
