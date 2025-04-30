package com.fizzware.dramaticdoors.mixin;

import java.util.Map;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.google.gson.JsonElement;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.crafting.RecipeManager;

@Mixin(RecipeManager.class)
public abstract class RecipeManagerMixin 
{	
    @Inject(method = "apply", at = @At("HEAD"))
    public void interceptApply(Map<ResourceLocation, JsonElement> map, ResourceManager resourceManager, ProfilerFiller profiler, CallbackInfo info) {
    	DDCompatRecipe.SHORT_DOOR_RECIPES.forEach((recipe) -> { map.put(ResourceLocation.parse(recipe.get("result").getAsJsonObject().get("id").getAsString()), recipe); } );
    	DDCompatRecipe.TALL_DOOR_RECIPES.forEach((recipe) -> { map.put(ResourceLocation.parse(recipe.get("result").getAsJsonObject().get("id").getAsString()), recipe); } );
    }
}