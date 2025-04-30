package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AlexsCavesCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PEWEN, DDNames.SHORT_PEWEN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("alexscaves", "pewen_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_THORNWOOD, DDNames.SHORT_THORNWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("alexscaves", "thornwood_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PEWEN, ResourceLocation.fromNamespaceAndPath("alexscaves", "pewen_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_THORNWOOD, ResourceLocation.fromNamespaceAndPath("alexscaves", "thornwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PEWEN, ResourceLocation.fromNamespaceAndPath("alexscaves", "pewen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_THORNWOOD, ResourceLocation.fromNamespaceAndPath("alexscaves", "thornwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PEWEN, ResourceLocation.fromNamespaceAndPath("alexscaves", "pewen_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_THORNWOOD, ResourceLocation.fromNamespaceAndPath("alexscaves", "thornwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PEWEN, ResourceLocation.fromNamespaceAndPath("alexscaves", "pewen_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_THORNWOOD, ResourceLocation.fromNamespaceAndPath("alexscaves", "thornwood_door"), "tall_wooden_door");
	}
}
