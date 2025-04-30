package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ArsNouveauCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ARCHWOOD, DDNames.SHORT_ARCHWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ars_nouveau", "archwood_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ARCHWOOD, ResourceLocation.fromNamespaceAndPath("ars_nouveau", "archwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ARCHWOOD, ResourceLocation.fromNamespaceAndPath("ars_nouveau", "archwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ARCHWOOD, ResourceLocation.fromNamespaceAndPath("ars_nouveau", "archwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ARCHWOOD, ResourceLocation.fromNamespaceAndPath("ars_nouveau", "archwood_door"), "tall_wooden_door");
	}
}
