package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class WilderWildCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WW_BAOBAB, DDNames.SHORT_WW_BAOBAB, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("wilderwild", "baobab_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WW_CYPRESS, DDNames.SHORT_WW_CYPRESS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("wilderwild", "cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WW_PALM, DDNames.SHORT_WW_PALM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("wilderwild", "palm_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WW_BAOBAB, ResourceLocation.fromNamespaceAndPath("wilderwild", "baobab_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WW_CYPRESS, ResourceLocation.fromNamespaceAndPath("wilderwild", "cypress_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WW_PALM, ResourceLocation.fromNamespaceAndPath("wilderwild", "palm_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WW_BAOBAB, ResourceLocation.fromNamespaceAndPath("wilderwild", "baobab_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WW_CYPRESS, ResourceLocation.fromNamespaceAndPath("wilderwild", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WW_PALM, ResourceLocation.fromNamespaceAndPath("wilderwild", "palm_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WW_BAOBAB, ResourceLocation.fromNamespaceAndPath("wilderwild", "baobab_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WW_CYPRESS, ResourceLocation.fromNamespaceAndPath("wilderwild", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WW_PALM, ResourceLocation.fromNamespaceAndPath("wilderwild", "palm_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WW_BAOBAB, ResourceLocation.fromNamespaceAndPath("wilderwild", "baobab_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WW_CYPRESS, ResourceLocation.fromNamespaceAndPath("wilderwild", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WW_PALM, ResourceLocation.fromNamespaceAndPath("wilderwild", "palm_door"), "tall_wooden_door");
	}
}
