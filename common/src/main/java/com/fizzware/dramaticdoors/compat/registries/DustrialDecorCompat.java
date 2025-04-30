package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DustrialDecorCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CARDBOARD, DDNames.SHORT_CARDBOARD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "cardboard_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHAIN, DDNames.SHORT_CHAIN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "chain_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON_BAR, DDNames.SHORT_IRON_BAR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "iron_bar_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PADDED, DDNames.SHORT_PADDED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "padded_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUSTY_IRON, DDNames.SHORT_RUSTY_IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_INDUSTRIAL_IRON, DDNames.SHORT_INDUSTRIAL_IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "industrial_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SHEET_METAL, DDNames.SHORT_SHEET_METAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "sheet_metal_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUSTY_SHEET_METAL, DDNames.SHORT_RUSTY_SHEET_METAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_sheet_metal_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CARDBOARD, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "cardboard_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHAIN, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "chain_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_IRON_BAR, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "iron_bar_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PADDED, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "padded_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUSTY_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "industrial_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "sheet_metal_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUSTY_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_sheet_metal_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CARDBOARD, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "cardboard_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHAIN, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "chain_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_IRON_BAR, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PADDED, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "padded_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUSTY_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUSTY_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_sheet_metal_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CARDBOARD, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "cardboard_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHAIN, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "chain_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_IRON_BAR, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "iron_bar_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PADDED, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "padded_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUSTY_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "industrial_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "sheet_metal_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUSTY_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_sheet_metal_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CARDBOARD, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "cardboard_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHAIN, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "chain_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_IRON_BAR, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "iron_bar_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PADDED, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "padded_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUSTY_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_iron_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "industrial_iron_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "sheet_metal_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUSTY_SHEET_METAL, ResourceLocation.fromNamespaceAndPath("dustrial_decor", "rusty_sheet_metal_door"), "tall_dustrial_metal_door");
	}
}
