package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AurorasDecorationsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}

	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AD_AZALEA, DDNames.SHORT_AD_AZALEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aurorasdeco", "azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AD_JACARANDA, DDNames.SHORT_AD_JACARANDA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aurorasdeco", "jacaranda_door")), BlockSetType.OAK, true);
	}

	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AD_AZALEA, new ResourceLocation("aurorasdeco", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AD_JACARANDA, new ResourceLocation("aurorasdeco", "jacaranda_door"), "tall_wooden_door");
		
		// Add recipes for processing vanilla doors into short doors.
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OAK + "_woodcutting", new ResourceLocation("minecraft", "oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPRUCE + "_woodcutting", new ResourceLocation("minecraft", "spruce_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BIRCH + "_woodcutting", new ResourceLocation("minecraft", "birch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JUNGLE + "_woodcutting", new ResourceLocation("minecraft", "jungle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ACACIA + "_woodcutting", new ResourceLocation("minecraft", "acacia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_OAK + "_woodcutting", new ResourceLocation("minecraft", "dark_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MANGROVE + "_woodcutting", new ResourceLocation("minecraft", "mangrove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHERRY + "_woodcutting", new ResourceLocation("minecraft", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BAMBOO + "_woodcutting", new ResourceLocation("minecraft", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRIMSON + "_woodcutting", new ResourceLocation("minecraft", "crimson_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WARPED + "_woodcutting", new ResourceLocation("minecraft", "warped_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OAK, new ResourceLocation("minecraft", "oak_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRUCE, new ResourceLocation("minecraft", "spruce_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BIRCH, new ResourceLocation("minecraft", "birch_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JUNGLE, new ResourceLocation("minecraft", "jungle_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ACACIA, new ResourceLocation("minecraft", "acacia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_OAK, new ResourceLocation("minecraft", "dark_oak_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MANGROVE, new ResourceLocation("minecraft", "mangrove_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY, new ResourceLocation("minecraft", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("minecraft", "bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRIMSON, new ResourceLocation("minecraft", "crimson_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WARPED, new ResourceLocation("minecraft", "warped_door"), true);
	}
}
