package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DarkerDepthsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PETRIFIED, DDNames.SHORT_PETRIFIED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("darkerdepths", "petrified_door")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PETRIFIED, ResourceLocation.fromNamespaceAndPath("darkerdepths", "petrified_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PETRIFIED, ResourceLocation.fromNamespaceAndPath("darkerdepths", "petrified_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PETRIFIED, ResourceLocation.fromNamespaceAndPath("darkerdepths", "petrified_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PETRIFIED, ResourceLocation.fromNamespaceAndPath("darkerdepths", "petrified_door"), "tall_wooden_door");
	}
}
