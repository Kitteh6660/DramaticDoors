package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WindsweptCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHESTNUT, DDNames.SHORT_CHESTNUT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("windswept", "chestnut_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HOLLY, DDNames.SHORT_HOLLY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("windswept", "holly_door")), BlockSetType.SPRUCE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHESTNUT, ResourceLocation.fromNamespaceAndPath("windswept", "chestnut_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HOLLY, ResourceLocation.fromNamespaceAndPath("windswept", "holly_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHESTNUT, ResourceLocation.fromNamespaceAndPath("windswept", "chestnut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HOLLY, ResourceLocation.fromNamespaceAndPath("windswept", "holly_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHESTNUT, ResourceLocation.fromNamespaceAndPath("windswept", "chestnut_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HOLLY, ResourceLocation.fromNamespaceAndPath("windswept", "holly_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHESTNUT, ResourceLocation.fromNamespaceAndPath("windswept", "chestnut_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HOLLY, ResourceLocation.fromNamespaceAndPath("windswept", "holly_door"), "tall_wooden_door");
	}
}
