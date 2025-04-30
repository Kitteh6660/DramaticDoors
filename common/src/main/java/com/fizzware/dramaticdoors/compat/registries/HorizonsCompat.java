package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HorizonsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CYPRESS, DDNames.SHORT_CYPRESS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("horizons", "cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JACARANDA, DDNames.SHORT_JACARANDA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("horizons", "jacaranda_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_REDBUD, DDNames.SHORT_REDBUD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("horizons", "redbud_door")), BlockSetType.BIRCH, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JACARANDA, ResourceLocation.fromNamespaceAndPath("horizons", "jacaranda_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_REDBUD, ResourceLocation.fromNamespaceAndPath("horizons", "redbud_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CYPRESS, ResourceLocation.fromNamespaceAndPath("horizons", "cypress_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JACARANDA, ResourceLocation.fromNamespaceAndPath("horizons", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_REDBUD, ResourceLocation.fromNamespaceAndPath("horizons", "redbud_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CYPRESS, ResourceLocation.fromNamespaceAndPath("horizons", "cypress_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CYPRESS, ResourceLocation.fromNamespaceAndPath("horizons", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JACARANDA, ResourceLocation.fromNamespaceAndPath("horizons", "jacaranda_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_REDBUD, ResourceLocation.fromNamespaceAndPath("horizons", "redbud_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CYPRESS, ResourceLocation.fromNamespaceAndPath("horizons", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JACARANDA, ResourceLocation.fromNamespaceAndPath("horizons", "jacaranda_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_REDBUD, ResourceLocation.fromNamespaceAndPath("horizons", "redbud_door"), "tall_wooden_door");
	}
}
