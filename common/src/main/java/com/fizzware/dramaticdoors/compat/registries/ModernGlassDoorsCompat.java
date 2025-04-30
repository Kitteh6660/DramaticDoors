package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ModernGlassDoorsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON_GLASS, DDNames.SHORT_IRON_GLASS, Blocks.IRON_DOOR, BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_OAK_GLASS, DDNames.SHORT_OAK_GLASS, Blocks.OAK_DOOR, BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRUCE_GLASS, DDNames.SHORT_SPRUCE_GLASS, Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BIRCH_GLASS, DDNames.SHORT_BIRCH_GLASS, Blocks.BIRCH_DOOR, BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNGLE_GLASS, DDNames.SHORT_JUNGLE_GLASS, Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ACACIA_GLASS, DDNames.SHORT_ACACIA_GLASS, Blocks.ACACIA_DOOR, BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_OAK_GLASS, DDNames.SHORT_DARK_OAK_GLASS, Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGROVE_GLASS, DDNames.SHORT_MANGROVE_GLASS, Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHERRY_GLASS, DDNames.SHORT_CHERRY_GLASS, Blocks.CHERRY_DOOR, BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BAMBOO_GLASS, DDNames.SHORT_BAMBOO_GLASS, Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRIMSON_GLASS, DDNames.SHORT_CRIMSON_GLASS, Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WARPED_GLASS, DDNames.SHORT_WARPED_GLASS, Blocks.WARPED_DOOR, BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_IRON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "iron_glass_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "oak_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPRUCE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "spruce_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BIRCH_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "birch_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JUNGLE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "jungle_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ACACIA_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "acacia_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "dark_oak_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MANGROVE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "mangrove_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "bamboo_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHERRY_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "cherry_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRIMSON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "crimson_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WARPED_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "warped_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_IRON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "iron_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SPRUCE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "spruce_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BIRCH_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "birch_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JUNGLE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "jungle_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ACACIA_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "acacia_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARK_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "dark_oak_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MANGROVE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "mangrove_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BAMBOO_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "bamboo_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHERRY_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "cherry_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRIMSON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "crimson_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WARPED_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "warped_glass_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_IRON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "iron_glass_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "oak_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRUCE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "spruce_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BIRCH_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "birch_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JUNGLE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "jungle_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ACACIA_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "acacia_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "dark_oak_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MANGROVE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "mangrove_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "bamboo_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "cherry_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRIMSON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "crimson_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WARPED_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "warped_glass_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_IRON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "iron_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "oak_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SPRUCE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "spruce_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BIRCH_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "birch_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JUNGLE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "jungle_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ACACIA_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "acacia_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARK_OAK_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "dark_oak_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MANGROVE_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "mangrove_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BAMBOO_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "bamboo_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHERRY_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "cherry_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRIMSON_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "crimson_glass_door"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WARPED_GLASS, ResourceLocation.fromNamespaceAndPath("modern_glass_doors", "warped_glass_door"), "tall_glass_door");
	}
}
