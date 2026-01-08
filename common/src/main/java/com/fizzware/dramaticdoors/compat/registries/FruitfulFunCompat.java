package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.state.properties.SlidingDoorType;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class FruitfulFunCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FF_CITRUS, DDNames.SHORT_FF_CITRUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruitfulfun", "citrus_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FF_REDLOVE, DDNames.SHORT_FF_REDLOVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruitfulfun", "redlove_door")), BlockSetType.CHERRY, true);
		DDRegistry.registerSlidingDoorBlockAndItem(DDNames.TALL_FF_REDLOVE_SLIDING, DDNames.SHORT_FF_REDLOVE_SLIDING, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("fruitfulfun", "redlove_door")), BlockSetType.CHERRY, false, SlidingDoorType.FRUITFUL_FUN);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FF_CITRUS, new ResourceLocation("fruitfulfun", "citrus_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FF_REDLOVE, new ResourceLocation("fruitfulfun", "redlove_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FF_CITRUS, new ResourceLocation("fruitfulfun", "citrus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FF_REDLOVE, new ResourceLocation("fruitfulfun", "redlove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FF_REDLOVE_SLIDING, new ResourceLocation("fruitfulfun", "redlove_sliding_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FF_CITRUS, new ResourceLocation("fruitfulfun", "citrus_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FF_REDLOVE, new ResourceLocation("fruitfulfun", "redlove_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FF_CITRUS, new ResourceLocation("fruitfulfun", "citrus_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FF_REDLOVE, new ResourceLocation("fruitfulfun", "redlove_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FF_REDLOVE_SLIDING, new ResourceLocation("fruitfulfun", "redlove_sliding_door"), "tall_wooden_door");
	}
}
