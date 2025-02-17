package com.fizzware.dramaticdoors.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.monster.Witch;

// Because witches should be able to open regular doors too.
@Mixin(Witch.class)
public class WitchMixin 
{	
	@Inject(at = @At("TAIL"), method = "registerGoals()V")
	private void addDoorGoals(CallbackInfo info) {
		((GroundPathNavigation)((Mob)(Object)this).getNavigation()).setCanOpenDoors(true);
		((Mob)(Object)this).goalSelector.addGoal(1, new OpenDoorGoal((Mob)(Object)this, true));
	}
}
