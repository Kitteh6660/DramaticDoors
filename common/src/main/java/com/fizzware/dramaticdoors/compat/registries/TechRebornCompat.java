package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TechRebornCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER, DDNames.SHORT_RUBBER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("techreborn", "rubber_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER, ResourceLocation.fromNamespaceAndPath("techreborn", "rubber_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER, ResourceLocation.fromNamespaceAndPath("techreborn", "rubber_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER, ResourceLocation.fromNamespaceAndPath("techreborn", "rubber_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER, ResourceLocation.fromNamespaceAndPath("techreborn", "rubber_door"), "tall_wooden_door");
	}
}
