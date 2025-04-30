package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class XPSAdditionsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOUL_COPPER, DDNames.SHORT_SOUL_COPPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("xps_additions", "soul_copper_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SOUL_COPPER, ResourceLocation.fromNamespaceAndPath("xps_additions", "soul_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SOUL_COPPER, ResourceLocation.fromNamespaceAndPath("xps_additions", "soul_copper_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SOUL_COPPER, ResourceLocation.fromNamespaceAndPath("xps_additions", "soul_copper_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SOUL_COPPER, ResourceLocation.fromNamespaceAndPath("xps_additions", "soul_copper_door"), "tall_metal_door");
	}
}
