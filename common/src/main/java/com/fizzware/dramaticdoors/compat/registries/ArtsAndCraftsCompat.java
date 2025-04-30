package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ArtsAndCraftsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CORK, DDNames.SHORT_CORK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("arts_and_crafts", "cork_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CORK, ResourceLocation.fromNamespaceAndPath("arts_and_crafts", "cork_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CORK, ResourceLocation.fromNamespaceAndPath("arts_and_crafts", "cork_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CORK, ResourceLocation.fromNamespaceAndPath("arts_and_crafts", "cork_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CORK, ResourceLocation.fromNamespaceAndPath("arts_and_crafts", "cork_door"), "tall_wooden_door");
	}
}
