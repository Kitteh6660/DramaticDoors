package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PyromancerCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PYROWOOD, DDNames.SHORT_PYROWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("pyromancer", "pyrowood_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN_PLANKS, DDNames.SHORT_ROTTEN_PLANKS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("pyromancer", "rotten_planks_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PYROWOOD, ResourceLocation.fromNamespaceAndPath("pyromancer", "pyrowood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROTTEN_PLANKS, ResourceLocation.fromNamespaceAndPath("pyromancer", "rotten_planks_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PYROWOOD, ResourceLocation.fromNamespaceAndPath("pyromancer", "pyrowood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROTTEN_PLANKS, ResourceLocation.fromNamespaceAndPath("pyromancer", "rotten_planks_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PYROWOOD, ResourceLocation.fromNamespaceAndPath("pyromancer", "pyrowood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROTTEN_PLANKS, ResourceLocation.fromNamespaceAndPath("pyromancer", "rotten_planks_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PYROWOOD, ResourceLocation.fromNamespaceAndPath("pyromancer", "pyrowood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROTTEN_PLANKS, ResourceLocation.fromNamespaceAndPath("pyromancer", "rotten_planks_door"), "tall_wooden_door");
	}
}
