package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AbnormalsCompat
{
	/* ------------------------- *
	 * DRAMATIC DOORS FUN FACT!  *
	 * ------------------------- *
	 * Abnormals was the first   *
	 * mod support to be added   *
	 * to Dramatic Doors!        *
	 * ------------------------- */	
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
		if (Compats.isModLoaded("atmospheric", checker)) { // Atmospheric
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ASPEN, DDNames.SHORT_ASPEN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "aspen_door")), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRIMWOOD, DDNames.SHORT_GRIMWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "grimwood_door")), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_KOUSA, DDNames.SHORT_KOUSA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "kousa_door")), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LAUREL, DDNames.SHORT_LAUREL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "laurel_door")), BlockSetType.SPRUCE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MORADO, DDNames.SHORT_MORADO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "morado_door")), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROSEWOOD, DDNames.SHORT_ROSEWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "rosewood_door")), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YUCCA, DDNames.SHORT_YUCCA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "yucca_door")), BlockSetType.OAK, true);
		}
		if (Compats.isModLoaded("autumnity", checker)) { // Autumnity
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MAPLE, DDNames.SHORT_MAPLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("autumnity", "maple_door")), BlockSetType.OAK, true);
		}
		if (Compats.isModLoaded("buzzier_bees", checker)) { // Buzzier Bees
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HONEYCOMB, DDNames.SHORT_HONEYCOMB, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("buzzier_bees", "honeycomb_door")), BlockSetType.OAK, true);
		}
		if (Compats.isModLoaded("caverns_and_chasms", checker)) { // Caverns & Chasms
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AZALEA, DDNames.SHORT_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("caverns_and_chasms", "azalea_door")), BlockSetType.OAK, true);
		}
		if (Compats.isModLoaded("clayworks", checker)) { // Clayworks
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLASS, DDNames.SHORT_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WHITE_STAINED_GLASS, DDNames.SHORT_WHITE_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "white_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIGHT_GRAY_STAINED_GLASS, DDNames.SHORT_LIGHT_GRAY_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "light_gray_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRAY_STAINED_GLASS, DDNames.SHORT_GRAY_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "gray_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLACK_STAINED_GLASS, DDNames.SHORT_BLACK_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "black_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RED_STAINED_GLASS, DDNames.SHORT_RED_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "red_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ORANGE_STAINED_GLASS, DDNames.SHORT_ORANGE_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "orange_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YELLOW_STAINED_GLASS, DDNames.SHORT_YELLOW_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "yellow_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIME_STAINED_GLASS, DDNames.SHORT_LIME_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "lime_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GREEN_STAINED_GLASS, DDNames.SHORT_GREEN_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "green_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CYAN_STAINED_GLASS, DDNames.SHORT_CYAN_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "cyan_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLUE_STAINED_GLASS, DDNames.SHORT_BLUE_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "blue_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PURPLE_STAINED_GLASS, DDNames.SHORT_PURPLE_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "purple_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MAGENTA_STAINED_GLASS, DDNames.SHORT_MAGENTA_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "magenta_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PINK_STAINED_GLASS, DDNames.SHORT_PINK_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "pink_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIGHT_BLUE_STAINED_GLASS, DDNames.SHORT_LIGHT_BLUE_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "light_blue_stained_glass_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BROWN_STAINED_GLASS, DDNames.SHORT_BROWN_STAINED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("clayworks", "brown_stained_glass_door")), BlockSetType.STONE, true);
			if (Compats.isModLoaded("atmospheric", checker)) {
				DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ARID_GLASS, DDNames.SHORT_ARID_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("atmospheric", "arid_glass_door")), BlockSetType.STONE, true);				
			}
		}
		if (Compats.isModLoaded("endergetic", checker)) { // Endergetic Expansion
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POISE, DDNames.SHORT_POISE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("endergetic", "poise_door")), BlockSetType.WARPED, true);
		}
		if (Compats.isModLoaded("environmental", checker)) { // Environmental
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PLUM, DDNames.SHORT_PLUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("environmental", "plum_door")), BlockSetType.CHERRY, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PINE, DDNames.SHORT_PINE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("environmental", "pine_door")), BlockSetType.SPRUCE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WILLOW, DDNames.SHORT_WILLOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("environmental", "willow_door")), BlockSetType.MANGROVE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WISTERIA, DDNames.SHORT_WISTERIA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("environmental", "wisteria_door")), BlockSetType.CHERRY, true);
		}
		/*if (Compats.isModLoaded("sniffed_out", checker)) { // Sniffed Out
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VESSEL, DDNames.SHORT_VESSEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("sniffed_out", "vessel_door")), BlockSetType.SPRUCE, true);
		}*/
		if (Compats.isModLoaded("upgrade_aquatic", checker)) { // Upgrade Aquatic
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRIFTWOOD, DDNames.SHORT_DRIFTWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "driftwood_door")), BlockSetType.SPRUCE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RIVER, DDNames.SHORT_RIVER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "river_door")), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TOOTH, DDNames.SHORT_TOOTH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "tooth_door")), BlockSetType.STONE, true);
		}
	}
	 
	private static void registerRecipes(CompatChecker checker) {
		if (Compats.isModLoaded("atmospheric", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ASPEN, ResourceLocation.fromNamespaceAndPath("atmospheric", "aspen_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GRIMWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "grimwood_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_KOUSA, ResourceLocation.fromNamespaceAndPath("atmospheric", "kousa_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LAUREL, ResourceLocation.fromNamespaceAndPath("atmospheric", "laurel_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MORADO, ResourceLocation.fromNamespaceAndPath("atmospheric", "morado_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROSEWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "rosewood_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_YUCCA, ResourceLocation.fromNamespaceAndPath("atmospheric", "yucca_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ASPEN, ResourceLocation.fromNamespaceAndPath("atmospheric", "aspen_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GRIMWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "grimwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_KOUSA, ResourceLocation.fromNamespaceAndPath("atmospheric", "kousa_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LAUREL, ResourceLocation.fromNamespaceAndPath("atmospheric", "laurel_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MORADO, ResourceLocation.fromNamespaceAndPath("atmospheric", "morado_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROSEWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "rosewood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_YUCCA, ResourceLocation.fromNamespaceAndPath("atmospheric", "yucca_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ASPEN, ResourceLocation.fromNamespaceAndPath("atmospheric", "aspen_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GRIMWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "grimwood_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_KOUSA, ResourceLocation.fromNamespaceAndPath("atmospheric", "kousa_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LAUREL, ResourceLocation.fromNamespaceAndPath("atmospheric", "laurel_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MORADO, ResourceLocation.fromNamespaceAndPath("atmospheric", "morado_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROSEWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "rosewood_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_YUCCA, ResourceLocation.fromNamespaceAndPath("atmospheric", "yucca_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ASPEN, ResourceLocation.fromNamespaceAndPath("atmospheric", "aspen_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GRIMWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "grimwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_KOUSA, ResourceLocation.fromNamespaceAndPath("atmospheric", "kousa_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LAUREL, ResourceLocation.fromNamespaceAndPath("atmospheric", "laurel_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MORADO, ResourceLocation.fromNamespaceAndPath("atmospheric", "morado_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROSEWOOD, ResourceLocation.fromNamespaceAndPath("atmospheric", "rosewood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_YUCCA, ResourceLocation.fromNamespaceAndPath("atmospheric", "yucca_door"), "tall_wooden_door");
		}
		if (Compats.isModLoaded("autumnity", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MAPLE, ResourceLocation.fromNamespaceAndPath("autumnity", "maple_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MAPLE, ResourceLocation.fromNamespaceAndPath("autumnity", "maple_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MAPLE, ResourceLocation.fromNamespaceAndPath("autumnity", "maple_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MAPLE, ResourceLocation.fromNamespaceAndPath("autumnity", "maple_door"), "tall_wooden_door");
		}
		if (Compats.isModLoaded("buzzier_bees", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HONEYCOMB, ResourceLocation.fromNamespaceAndPath("buzzier_bees", "honeycomb_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HONEYCOMB, ResourceLocation.fromNamespaceAndPath("buzzier_bees", "honeycomb_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HONEYCOMB, ResourceLocation.fromNamespaceAndPath("buzzier_bees", "honeycomb_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HONEYCOMB, ResourceLocation.fromNamespaceAndPath("buzzier_bees", "honeycomb_door"), "tall_misc_door");
		}
		if (Compats.isModLoaded("caverns_and_chasms", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AZALEA, ResourceLocation.fromNamespaceAndPath("caverns_and_chasms", "azalea_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AZALEA, ResourceLocation.fromNamespaceAndPath("caverns_and_chasms", "azalea_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AZALEA, ResourceLocation.fromNamespaceAndPath("caverns_and_chasms", "azalea_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AZALEA, ResourceLocation.fromNamespaceAndPath("caverns_and_chasms", "azalea_door"), "tall_wooden_door");
		}
		if (Compats.isModLoaded("clayworks", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "glass_door"), false);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLACK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "black_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "gray_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIGHT_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_gray_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WHITE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "white_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RED_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "red_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ORANGE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "orange_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_YELLOW_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "yellow_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIME_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "lime_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GREEN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "green_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CYAN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "cyan_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "blue_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PURPLE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "purple_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MAGENTA_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "magenta_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PINK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "pink_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIGHT_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_blue_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BROWN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "brown_stained_glass_door"));
			
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLACK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "black_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "gray_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIGHT_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_gray_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WHITE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "white_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RED_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "red_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ORANGE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "orange_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_YELLOW_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "yellow_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIME_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "lime_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GREEN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "green_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CYAN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "cyan_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "blue_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PURPLE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "purple_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MAGENTA_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "magenta_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PINK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "pink_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIGHT_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_blue_stained_glass_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BROWN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "brown_stained_glass_door"));

			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLACK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "black_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "gray_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIGHT_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_gray_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WHITE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "white_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RED_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "red_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ORANGE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "orange_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_YELLOW_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "yellow_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIME_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "lime_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GREEN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "green_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CYAN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "cyan_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "blue_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PURPLE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "purple_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MAGENTA_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "magenta_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PINK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "pink_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIGHT_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_blue_stained_glass_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BROWN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "brown_stained_glass_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "glass_door"), "tall_misc_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLACK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "black_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "gray_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIGHT_GRAY_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_gray_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WHITE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "white_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RED_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "red_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ORANGE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "orange_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_YELLOW_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "yellow_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIME_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "lime_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GREEN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "green_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CYAN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "cyan_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "blue_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PURPLE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "purple_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MAGENTA_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "magenta_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PINK_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "pink_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIGHT_BLUE_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "light_blue_stained_glass_door"), "tall_stained_glass_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BROWN_STAINED_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "brown_stained_glass_door"), "tall_stained_glass_door");
			if (Compats.isModLoaded("atmospheric", checker)) {
				DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ARID_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "arid_glass_door"), false);
				DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ARID_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "arid_glass_door"));
				DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ARID_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "arid_glass_door"), false);
				DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ARID_GLASS, ResourceLocation.fromNamespaceAndPath("clayworks", "arid_glass_door"), "tall_misc_door");		
			}
		}
		if (Compats.isModLoaded("endergetic", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_POISE, ResourceLocation.fromNamespaceAndPath("endergetic", "poise_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_POISE, ResourceLocation.fromNamespaceAndPath("endergetic", "poise_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_POISE, ResourceLocation.fromNamespaceAndPath("endergetic", "poise_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_POISE, ResourceLocation.fromNamespaceAndPath("endergetic", "poise_door"), "tall_wooden_door");
		}
		if (Compats.isModLoaded("environmental", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PLUM, ResourceLocation.fromNamespaceAndPath("environmental", "plum_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PINE, ResourceLocation.fromNamespaceAndPath("environmental", "pine_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WILLOW, ResourceLocation.fromNamespaceAndPath("environmental", "willow_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WISTERIA, ResourceLocation.fromNamespaceAndPath("environmental", "wisteria_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PLUM, ResourceLocation.fromNamespaceAndPath("environmental", "plum_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PINE, ResourceLocation.fromNamespaceAndPath("environmental", "pine_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WILLOW, ResourceLocation.fromNamespaceAndPath("environmental", "willow_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WISTERIA, ResourceLocation.fromNamespaceAndPath("environmental", "wisteria_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PLUM, ResourceLocation.fromNamespaceAndPath("environmental", "plum_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PINE, ResourceLocation.fromNamespaceAndPath("environmental", "pine_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WILLOW, ResourceLocation.fromNamespaceAndPath("environmental", "willow_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WISTERIA, ResourceLocation.fromNamespaceAndPath("environmental", "wisteria_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PLUM, ResourceLocation.fromNamespaceAndPath("environmental", "plum_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PINE, ResourceLocation.fromNamespaceAndPath("environmental", "pine_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WILLOW, ResourceLocation.fromNamespaceAndPath("environmental", "willow_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WISTERIA, ResourceLocation.fromNamespaceAndPath("environmental", "wisteria_door"), "tall_wooden_door");
		}
		/*if (Compats.isModLoaded("sniffed_out", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VESSEL, ResourceLocation.fromNamespaceAndPath("sniffed_out", "vessel_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VESSEL, ResourceLocation.fromNamespaceAndPath("sniffed_out", "vessel_door"));

			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VESSEL, ResourceLocation.fromNamespaceAndPath("sniffed_out", "vessel_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VESSEL, ResourceLocation.fromNamespaceAndPath("sniffed_out", "vessel_door"), "tall_misc_door");
		}*/
		if (Compats.isModLoaded("upgrade_aquatic", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DRIFTWOOD, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "driftwood_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RIVER, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "river_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TOOTH, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "tooth_door"), false);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DRIFTWOOD, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "driftwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RIVER, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "river_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TOOTH, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "tooth_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DRIFTWOOD, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "driftwood_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RIVER, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "river_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TOOTH, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "tooth_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DRIFTWOOD, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "driftwood_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RIVER, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "river_door"), "tall_wooden_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TOOTH, ResourceLocation.fromNamespaceAndPath("upgrade_aquatic", "tooth_door"), "tall_misc_door");
		}
	}
}
