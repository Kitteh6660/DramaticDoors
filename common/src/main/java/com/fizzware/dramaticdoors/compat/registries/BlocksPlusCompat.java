package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class BlocksPlusCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_GOLDEN, DDNames.SHORT_BP_GOLDEN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blocksplus", "golden_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_DIAMOND, DDNames.SHORT_BP_DIAMOND, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blocksplus", "diamond_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_EMERALD, DDNames.SHORT_BP_EMERALD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blocksplus", "emerald_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_MUSHROOM, DDNames.SHORT_BP_MUSHROOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blocksplus", "mushroom_door")), BlockSetType.WARPED, true);
		
		Block shortNetheriteDoor = new TallDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blocksplus", "netherite_door"), Blocks.IRON_DOOR));
		Block tallNetheriteDoor = new TallDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blocksplus", "netherite_door"), Blocks.IRON_DOOR));
		
		DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.SHORT_BP_NETHERITE, shortNetheriteDoor));
    	DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.TALL_BP_NETHERITE, tallNetheriteDoor));

    	DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.SHORT_BP_NETHERITE, new BlockItem(shortNetheriteDoor, DDRegistry.PROPERTIES.fireResistant())));
    	DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.TALL_BP_NETHERITE, new BlockItem(tallNetheriteDoor, DDRegistry.PROPERTIES.fireResistant())));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_GOLDEN, ResourceLocation.fromNamespaceAndPath("blocksplus", "golden_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_DIAMOND, ResourceLocation.fromNamespaceAndPath("blocksplus", "diamond_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_EMERALD, ResourceLocation.fromNamespaceAndPath("blocksplus", "emerald_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_NETHERITE, ResourceLocation.fromNamespaceAndPath("blocksplus", "netherite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_MUSHROOM, ResourceLocation.fromNamespaceAndPath("blocksplus", "mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_GOLDEN, ResourceLocation.fromNamespaceAndPath("blocksplus", "golden_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_DIAMOND, ResourceLocation.fromNamespaceAndPath("blocksplus", "diamond_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_EMERALD, ResourceLocation.fromNamespaceAndPath("blocksplus", "emerald_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_NETHERITE, ResourceLocation.fromNamespaceAndPath("blocksplus", "netherite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_MUSHROOM, ResourceLocation.fromNamespaceAndPath("blocksplus", "mushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_GOLDEN, ResourceLocation.fromNamespaceAndPath("blocksplus", "golden_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_DIAMOND, ResourceLocation.fromNamespaceAndPath("blocksplus", "diamond_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_EMERALD, ResourceLocation.fromNamespaceAndPath("blocksplus", "emerald_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_NETHERITE, ResourceLocation.fromNamespaceAndPath("blocksplus", "netherite_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_MUSHROOM, ResourceLocation.fromNamespaceAndPath("blocksplus", "mushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_GOLDEN, ResourceLocation.fromNamespaceAndPath("blocksplus", "golden_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_DIAMOND, ResourceLocation.fromNamespaceAndPath("blocksplus", "diamond_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_EMERALD, ResourceLocation.fromNamespaceAndPath("blocksplus", "emerald_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_NETHERITE, ResourceLocation.fromNamespaceAndPath("blocksplus", "netherite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_MUSHROOM, ResourceLocation.fromNamespaceAndPath("blocksplus", "mushroom_door"), "tall_wooden_door");
	}
}
