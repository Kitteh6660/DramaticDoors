package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnlightenedEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CERULEAN, DDNames.SHORT_CERULEAN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("enlightened_end", "cerulean_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_INDIGO, DDNames.SHORT_INDIGO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("enlightened_end", "indigo_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CERULEAN, ResourceLocation.fromNamespaceAndPath("enlightened_end", "cerulean_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_INDIGO, ResourceLocation.fromNamespaceAndPath("enlightened_end", "indigo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CERULEAN, ResourceLocation.fromNamespaceAndPath("enlightened_end", "cerulean_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_INDIGO, ResourceLocation.fromNamespaceAndPath("enlightened_end", "indigo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CERULEAN, ResourceLocation.fromNamespaceAndPath("enlightened_end", "cerulean_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_INDIGO, ResourceLocation.fromNamespaceAndPath("enlightened_end", "indigo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CERULEAN, ResourceLocation.fromNamespaceAndPath("enlightened_end", "cerulean_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_INDIGO, ResourceLocation.fromNamespaceAndPath("enlightened_end", "indigo_door"), "tall_wooden_door");
	}
}
