package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class FruitfulFunCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FF_CITRUS, DDNames.SHORT_FF_CITRUS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("fruitfulfun", "citrus_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FF_REDLOVE, DDNames.SHORT_FF_REDLOVE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_door")), BlockSetType.CHERRY, true);
		Block tall_sliding_redlove_door = new TallSlidingDoorBlock(BlockSetType.CHERRY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_sliding_door")));
		DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.TALL_FF_REDLOVE_SLIDING, tall_sliding_redlove_door));
		DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.TALL_FF_REDLOVE_SLIDING, new BlockItem(tall_sliding_redlove_door, DDRegistry.PROPERTIES)));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FF_CITRUS, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "citrus_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FF_REDLOVE, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FF_CITRUS, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "citrus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FF_REDLOVE, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FF_REDLOVE_SLIDING, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_sliding_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FF_CITRUS, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "citrus_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FF_REDLOVE, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FF_CITRUS, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "citrus_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FF_REDLOVE, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FF_REDLOVE_SLIDING, ResourceLocation.fromNamespaceAndPath("fruitfulfun", "redlove_sliding_door"), "tall_wooden_door");
	}
}
