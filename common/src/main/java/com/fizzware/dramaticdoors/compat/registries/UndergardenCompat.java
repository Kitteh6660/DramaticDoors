package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class UndergardenCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRONGLE, DDNames.SHORT_GRONGLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("undergarden", "grongle_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SMOGSTEM, DDNames.SHORT_SMOGSTEM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("undergarden", "smogstem_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WIGGLEWOOD, DDNames.SHORT_WIGGLEWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("undergarden", "wigglewood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GRONGLE, ResourceLocation.fromNamespaceAndPath("undergarden", "grongle_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SMOGSTEM, ResourceLocation.fromNamespaceAndPath("undergarden", "smogstem_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WIGGLEWOOD, ResourceLocation.fromNamespaceAndPath("undergarden", "wigglewood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GRONGLE, ResourceLocation.fromNamespaceAndPath("undergarden", "grongle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SMOGSTEM, ResourceLocation.fromNamespaceAndPath("undergarden", "smogstem_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WIGGLEWOOD, ResourceLocation.fromNamespaceAndPath("undergarden", "wigglewood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GRONGLE, ResourceLocation.fromNamespaceAndPath("undergarden", "grongle_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SMOGSTEM, ResourceLocation.fromNamespaceAndPath("undergarden", "smogstem_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WIGGLEWOOD, ResourceLocation.fromNamespaceAndPath("undergarden", "wigglewood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GRONGLE, ResourceLocation.fromNamespaceAndPath("undergarden", "grongle_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SMOGSTEM, ResourceLocation.fromNamespaceAndPath("undergarden", "smogstem_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WIGGLEWOOD, ResourceLocation.fromNamespaceAndPath("undergarden", "wigglewood_door"), "tall_wooden_door");
	}
}
