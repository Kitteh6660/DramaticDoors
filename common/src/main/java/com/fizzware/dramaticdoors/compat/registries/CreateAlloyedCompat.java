package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CreateAlloyedCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STEEL, DDNames.SHORT_STEEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("alloyed", "steel_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_STEEL, DDNames.SHORT_LOCKED_STEEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("alloyed", "locked_steel_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "steel_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "locked_steel_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "steel_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "locked_steel_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "steel_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "locked_steel_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "steel_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_STEEL, ResourceLocation.fromNamespaceAndPath("alloyed", "locked_steel_door"), "tall_metal_door");
	}
}
