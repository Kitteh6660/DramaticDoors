package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BlockusCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_STONE, DDNames.SHORT_BLOCKUS_STONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "stone_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_BLACKSTONE, DDNames.SHORT_BLOCKUS_BLACKSTONE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "blackstone_door")), BlockSetType.POLISHED_BLACKSTONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "obsidian_reinforced_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_RAW_BAMBOO, DDNames.SHORT_BLOCKUS_RAW_BAMBOO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "raw_bamboo_door")), BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_CHARRED, DDNames.SHORT_BLOCKUS_CHARRED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "charred_door")), BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_PAPER, DDNames.SHORT_BLOCKUS_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "paper_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOCKUS_WHITE_OAK, DDNames.SHORT_BLOCKUS_WHITE_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("blockus", "white_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_RAW_BAMBOO, ResourceLocation.fromNamespaceAndPath("blockus", "raw_bamboo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_BLACKSTONE, ResourceLocation.fromNamespaceAndPath("blockus", "blackstone_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_CHARRED, ResourceLocation.fromNamespaceAndPath("blockus", "charred_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, ResourceLocation.fromNamespaceAndPath("blockus", "obsidian_reinforced_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_PAPER, ResourceLocation.fromNamespaceAndPath("blockus", "paper_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_STONE, ResourceLocation.fromNamespaceAndPath("blockus", "stone_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOCKUS_WHITE_OAK, ResourceLocation.fromNamespaceAndPath("blockus", "white_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_RAW_BAMBOO, ResourceLocation.fromNamespaceAndPath("blockus", "raw_bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_BLACKSTONE, ResourceLocation.fromNamespaceAndPath("blockus", "blackstone_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_CHARRED, ResourceLocation.fromNamespaceAndPath("blockus", "charred_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, ResourceLocation.fromNamespaceAndPath("blockus", "obsidian_reinforced_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_PAPER, ResourceLocation.fromNamespaceAndPath("blockus", "paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_STONE, ResourceLocation.fromNamespaceAndPath("blockus", "stone_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOCKUS_WHITE_OAK, ResourceLocation.fromNamespaceAndPath("blockus", "white_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_RAW_BAMBOO, ResourceLocation.fromNamespaceAndPath("blockus", "raw_bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_BLACKSTONE, ResourceLocation.fromNamespaceAndPath("blockus", "blackstone_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_CHARRED, ResourceLocation.fromNamespaceAndPath("blockus", "charred_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_OBSIDIAN_REINFORCED, ResourceLocation.fromNamespaceAndPath("blockus", "obsidian_reinforced_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_PAPER, ResourceLocation.fromNamespaceAndPath("blockus", "paper_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_STONE, ResourceLocation.fromNamespaceAndPath("blockus", "stone_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOCKUS_WHITE_OAK, ResourceLocation.fromNamespaceAndPath("blockus", "white_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_RAW_BAMBOO, ResourceLocation.fromNamespaceAndPath("blockus", "raw_bamboo_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_BLACKSTONE, ResourceLocation.fromNamespaceAndPath("blockus", "blackstone_door"), "tall_stone_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_CHARRED, ResourceLocation.fromNamespaceAndPath("blockus", "charred_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_OBSIDIAN_REINFORCED, ResourceLocation.fromNamespaceAndPath("blockus", "obsidian_reinforced_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_PAPER, ResourceLocation.fromNamespaceAndPath("blockus", "paper_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_STONE, ResourceLocation.fromNamespaceAndPath("blockus", "stone_door"), "tall_stone_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOCKUS_WHITE_OAK, ResourceLocation.fromNamespaceAndPath("blockus", "white_oak_door"), "tall_wooden_door");
	}
}
