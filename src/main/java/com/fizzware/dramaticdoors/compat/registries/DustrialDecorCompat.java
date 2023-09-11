package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

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
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CARDBOARD, DDNames.SHORT_CARDBOARD, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "cardboard_door")), BlockSetType.OAK, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_CHAIN, DDNames.SHORT_CHAIN, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "chain_door")), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON_BAR, DDNames.SHORT_IRON_BAR, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "iron_bar_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_PADDED, DDNames.SHORT_PADDED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "padded_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUSTY_IRON, DDNames.SHORT_RUSTY_IRON, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "rusty_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_INDUSTRIAL_IRON, DDNames.SHORT_INDUSTRIAL_IRON, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "industrial_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_SHEET_METAL, DDNames.SHORT_SHEET_METAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "sheet_metal_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_RUSTY_SHEET_METAL, DDNames.SHORT_RUSTY_SHEET_METAL, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_PADDED, new ResourceLocation("dustrial_decor", "padded_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_PADDED, new ResourceLocation("dustrial_decor", "padded_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_PADDED, new ResourceLocation("dustrial_decor", "padded_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CARDBOARD, new ResourceLocation("dustrial_decor", "cardboard_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHAIN, new ResourceLocation("dustrial_decor", "chain_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_IRON_BAR, new ResourceLocation("dustrial_decor", "iron_bar_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_PADDED, new ResourceLocation("dustrial_decor", "padded_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUSTY_IRON, new ResourceLocation("dustrial_decor", "rusty_iron_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_INDUSTRIAL_IRON, new ResourceLocation("dustrial_decor", "industrial_iron_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_SHEET_METAL, new ResourceLocation("dustrial_decor", "sheet_metal_door"), "tall_dustrial_metal_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_RUSTY_SHEET_METAL, new ResourceLocation("dustrial_decor", "rusty_sheet_metal_door"), "tall_dustrial_metal_door");
	}
}