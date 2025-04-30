package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ThermalFoundationCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBERWOOD, DDNames.SHORT_RUBBERWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thermal", "rubberwood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBERWOOD, ResourceLocation.fromNamespaceAndPath("thermal", "rubberwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBERWOOD, ResourceLocation.fromNamespaceAndPath("thermal", "rubberwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBERWOOD, ResourceLocation.fromNamespaceAndPath("thermal", "rubberwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBERWOOD, ResourceLocation.fromNamespaceAndPath("thermal", "rubberwood_door"), "tall_wooden_door");
	}
}
