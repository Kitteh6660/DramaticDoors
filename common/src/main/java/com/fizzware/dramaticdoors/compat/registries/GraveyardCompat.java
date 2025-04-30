package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class GraveyardCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_IRON, DDNames.SHORT_DARK_IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("graveyard", "dark_iron_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_IRON, ResourceLocation.fromNamespaceAndPath("graveyard", "dark_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARK_IRON, ResourceLocation.fromNamespaceAndPath("graveyard", "dark_iron_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_IRON, ResourceLocation.fromNamespaceAndPath("graveyard", "dark_iron_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARK_IRON, ResourceLocation.fromNamespaceAndPath("graveyard", "dark_iron_door"), "tall_metal_door");
	}
}
