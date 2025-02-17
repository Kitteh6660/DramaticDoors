package com.fizzware.dramaticdoors.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.google.gson.JsonElement;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.ServerAdvancementManager;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;

@Mixin(ServerAdvancementManager.class)
public class AdvancementManagerMixin
{
	@Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<ResourceLocation, JsonElement> map, ResourceManager manager, ProfilerFiller profiler, CallbackInfo info) {
    	DDCompatAdvancement.RECIPE_ADVANCEMENTS.forEach((advancement) -> { map.put(new ResourceLocation(DramaticDoors.MOD_ID, "recipes/redstone/" + advancement.getAsJsonObject("rewards").getAsJsonArray("recipes").get(0).getAsString().replace(DramaticDoors.MOD_ID + ":", "")), advancement); } );
    }
}
