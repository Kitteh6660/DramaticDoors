package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MalumCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUNEWOOD, DDNames.SHORT_RUNEWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("malum", "runewood_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOULWOOD, DDNames.SHORT_SOULWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("malum", "soulwood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUNEWOOD, ResourceLocation.fromNamespaceAndPath("malum", "runewood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SOULWOOD, ResourceLocation.fromNamespaceAndPath("malum", "soulwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUNEWOOD, ResourceLocation.fromNamespaceAndPath("malum", "runewood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SOULWOOD, ResourceLocation.fromNamespaceAndPath("malum", "soulwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUNEWOOD, ResourceLocation.fromNamespaceAndPath("malum", "runewood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SOULWOOD, ResourceLocation.fromNamespaceAndPath("malum", "soulwood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUNEWOOD, ResourceLocation.fromNamespaceAndPath("malum", "runewood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SOULWOOD, ResourceLocation.fromNamespaceAndPath("malum", "soulwood_door"), "tall_wooden_door");	
	}
}
