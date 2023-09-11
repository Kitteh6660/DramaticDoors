package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnhancedMushroomsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_BROWN_MUSHROOM, DDNames.SHORT_RED_MUSHROOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door")), BlockSetType.WARPED, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RED_MUSHROOM, DDNames.SHORT_RED_MUSHROOM, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "red_mushroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_BROWN_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "brown_mushroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "red_mushroom_door"), "tall_wooden_door");
	}
}