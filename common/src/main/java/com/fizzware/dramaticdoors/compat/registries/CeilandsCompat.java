package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CeilandsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CEILINUM, DDNames.SHORT_CEILINUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ceilands", "ceilinum_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CEILTRUNK, DDNames.SHORT_CEILTRUNK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ceilands", "ceiltrunk_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LUZAWOOD, DDNames.SHORT_LUZAWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ceilands", "luzawood_door")), BlockSetType.CHERRY, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CEILINUM, ResourceLocation.fromNamespaceAndPath("ceilands", "ceilinum_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CEILTRUNK, ResourceLocation.fromNamespaceAndPath("ceilands", "ceiltrunk_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LUZAWOOD, ResourceLocation.fromNamespaceAndPath("ceilands", "luzawood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CEILINUM, ResourceLocation.fromNamespaceAndPath("ceilands", "ceilinum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CEILTRUNK, ResourceLocation.fromNamespaceAndPath("ceilands", "ceiltrunk_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LUZAWOOD, ResourceLocation.fromNamespaceAndPath("ceilands", "luzawood_door"));
				
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CEILINUM, ResourceLocation.fromNamespaceAndPath("ceilands", "ceilinum_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CEILTRUNK, ResourceLocation.fromNamespaceAndPath("ceilands", "ceiltrunk_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LUZAWOOD, ResourceLocation.fromNamespaceAndPath("ceilands", "luzawood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CEILINUM, ResourceLocation.fromNamespaceAndPath("ceilands", "ceilinum_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CEILTRUNK, ResourceLocation.fromNamespaceAndPath("ceilands", "ceiltrunk_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LUZAWOOD, ResourceLocation.fromNamespaceAndPath("ceilands", "luzawood_door"), "tall_wooden_door");
	}
}
