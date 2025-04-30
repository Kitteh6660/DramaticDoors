package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

// Partially implemented
public class ThingamajigsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ALARMED, DDNames.SHORT_ALARMED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "alarmed_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BUBBLE, DDNames.SHORT_BUBBLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "bubble_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FESTIVE, DDNames.SHORT_FESTIVE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "festive_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKABLE, DDNames.SHORT_LOCKABLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_METALLIC, DDNames.SHORT_METALLIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "metallic_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCREEN, DDNames.SHORT_SCREEN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "screen_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SNOWMAN, DDNames.SHORT_SNOWMAN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "snowman_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STONE, DDNames.SHORT_STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "stone_door")), BlockSetType.STONE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_WOOD, DDNames.SHORT_RUBBER_WOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WHITE_WOOD, DDNames.SHORT_WHITE_WOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thingamajigs", "white_wood_door")), BlockSetType.OAK, false);
	}
	
	private static void registerRecipes() {
		/*DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ALARMED, ResourceLocation.fromNamespaceAndPath("thingamajigs", "alarmed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BUBBLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "bubble_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FESTIVE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "festive_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_METALLIC, ResourceLocation.fromNamespaceAndPath("thingamajigs", "metallic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCREEN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "screen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SNOWMAN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "snowman_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_STONE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WHITE_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "white_wood_door"));*/
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ALARMED, ResourceLocation.fromNamespaceAndPath("thingamajigs", "alarmed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BUBBLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "bubble_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FESTIVE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "festive_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_METALLIC, ResourceLocation.fromNamespaceAndPath("thingamajigs", "metallic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCREEN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "screen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SNOWMAN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "snowman_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_STONE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WHITE_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "white_wood_door"));
	
		/*DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ALARMED, ResourceLocation.fromNamespaceAndPath("thingamajigs", "alarmed_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BUBBLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "bubble_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FESTIVE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "festive_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_METALLIC, ResourceLocation.fromNamespaceAndPath("thingamajigs", "metallic_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCREEN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "screen_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SNOWMAN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "snowman_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_STONE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "stone_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WHITE_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "white_wood_door"), true);*/
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ALARMED, ResourceLocation.fromNamespaceAndPath("thingamajigs", "alarmed_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BUBBLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "bubble_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FESTIVE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "festive_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKABLE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "lockable_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_METALLIC, ResourceLocation.fromNamespaceAndPath("thingamajigs", "metallic_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCREEN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "screen_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SNOWMAN, ResourceLocation.fromNamespaceAndPath("thingamajigs", "snowman_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_STONE, ResourceLocation.fromNamespaceAndPath("thingamajigs", "stone_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "rubber_wood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WHITE_WOOD, ResourceLocation.fromNamespaceAndPath("thingamajigs", "white_wood_door"), "tall_wooden_door");
	}
}
