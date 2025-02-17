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
    	DDCompatRecipe.SHORT_DOOR_RECIPES.forEach((recipe) -> { 
    		String recipeID = recipe.get("result").getAsString();
    		if (recipe.get("type").getAsString().contains("aurorasdeco")) {
    			recipeID += "_aurorasdeco_sawmill";
    		}
    		else if (recipe.get("type").getAsString().contains("woodworks")) {
    			recipeID += "_sawing";
    		}
    		else if (recipe.get("type").getAsString().contains("sawmill")) {
    			recipeID += "_universal_sawmill";
    		}
    		map.put(new ResourceLocation(recipeID), recipe);
    	} );
    	DDCompatRecipe.TALL_DOOR_RECIPES.forEach((recipe) -> { map.put(new ResourceLocation(recipe.get("result").getAsJsonObject().get("item").getAsString()), recipe); } );
    }
}