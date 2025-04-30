package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnhancedMushroomsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BROWN_MUSHROOM, DDNames.SHORT_BROWN_MUSHROOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "brown_mushroom_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RED_MUSHROOM, DDNames.SHORT_RED_MUSHROOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "red_mushroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BROWN_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "brown_mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RED_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "red_mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BROWN_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "brown_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RED_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "red_mushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BROWN_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "brown_mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RED_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "red_mushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BROWN_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "brown_mushroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RED_MUSHROOM, ResourceLocation.fromNamespaceAndPath("enhanced_mushrooms", "red_mushroom_door"), "tall_wooden_door");
	}
}
