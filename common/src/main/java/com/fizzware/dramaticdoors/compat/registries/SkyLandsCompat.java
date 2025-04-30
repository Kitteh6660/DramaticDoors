package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class SkyLandsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FIERY_PLANKS, DDNames.SHORT_FIERY_PLANKS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("flying_stuff", "fiery_planks_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LAVIC_PLANKS, DDNames.SHORT_LAVIC_PLANKS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("flying_stuff", "lavic_planks_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIATED, DDNames.SHORT_GLACIATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("flying_stuff", "glaciated_planks_door")), BlockSetType.BIRCH, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FIERY_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "fiery_planks_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LAVIC_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "lavic_planks_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLACIATED, ResourceLocation.fromNamespaceAndPath("flying_stuff", "glaciated_planks_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FIERY_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "fiery_planks_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LAVIC_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "lavic_planks_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLACIATED, ResourceLocation.fromNamespaceAndPath("flying_stuff", "glaciated_planks_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FIERY_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "fiery_planks_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LAVIC_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "lavic_planks_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLACIATED, ResourceLocation.fromNamespaceAndPath("flying_stuff", "glaciated_planks_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FIERY_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "fiery_planks_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LAVIC_PLANKS, ResourceLocation.fromNamespaceAndPath("flying_stuff", "lavic_planks_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLACIATED, ResourceLocation.fromNamespaceAndPath("flying_stuff", "glaciated_planks_door"), "tall_wooden_door");
	}
}
