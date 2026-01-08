package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnlightenedEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EE_CERULEAN, DDNames.SHORT_EE_CERULEAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enlightened_end", "cerulean_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EE_INDIGO, DDNames.SHORT_EE_INDIGO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enlightened_end", "indigo_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EE_CERULEAN, new ResourceLocation("enlightened_end", "cerulean_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EE_INDIGO, new ResourceLocation("enlightened_end", "indigo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EE_CERULEAN, new ResourceLocation("enlightened_end", "cerulean_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EE_INDIGO, new ResourceLocation("enlightened_end", "indigo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EE_CERULEAN, new ResourceLocation("enlightened_end", "cerulean_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EE_INDIGO, new ResourceLocation("enlightened_end", "indigo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EE_CERULEAN, new ResourceLocation("enlightened_end", "cerulean_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EE_INDIGO, new ResourceLocation("enlightened_end", "indigo_door"), "tall_wooden_door");
	}
}
