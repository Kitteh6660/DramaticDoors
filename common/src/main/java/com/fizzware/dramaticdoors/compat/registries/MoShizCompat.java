package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MoShizCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_IRON_BAR, DDNames.SHORT_MS_IRON_BAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/iron_bar"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GLOWOOD, DDNames.SHORT_MS_GLOWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/glowood")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_HELLWOOD, DDNames.SHORT_MS_HELLWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/hellwood")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_MAPLE, DDNames.SHORT_MS_MAPLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/maple")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_SILVERBELL, DDNames.SHORT_MS_SILVERBELL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/silverebell")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_TIGERWOOD, DDNames.SHORT_MS_TIGERWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/tigerwood")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_WILLOW, DDNames.SHORT_MS_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/willow")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GLASS, DDNames.SHORT_MS_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_SOUL_GLASS, DDNames.SHORT_MS_SOUL_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/soul_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_TINTED_GLASS, DDNames.SHORT_MS_TINTED_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/tinted_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BLACK_GLASS, DDNames.SHORT_MS_BLACK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/black_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GREY_GLASS, DDNames.SHORT_MS_GREY_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/grey_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIGHT_GREY_GLASS, DDNames.SHORT_MS_LIGHT_GREY_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/light_grey_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_WHITE_GLASS, DDNames.SHORT_MS_WHITE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/white_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_RED_GLASS, DDNames.SHORT_MS_RED_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/red_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_ORANGE_GLASS, DDNames.SHORT_MS_ORANGE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/orange_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_YELLOW_GLASS, DDNames.SHORT_MS_YELLOW_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/yellow_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIME_GLASS, DDNames.SHORT_MS_LIME_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/lime_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GREEN_GLASS, DDNames.SHORT_MS_GREEN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/green_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_CYAN_GLASS, DDNames.SHORT_MS_CYAN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/cyan_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BLUE_GLASS, DDNames.SHORT_MS_BLUE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/blue_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_PURPLE_GLASS, DDNames.SHORT_MS_PURPLE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/purple_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_MAGENTA_GLASS, DDNames.SHORT_MS_MAGENTA_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/magenta_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_PINK_GLASS, DDNames.SHORT_MS_PINK_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/pink_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIGHT_BLUE_GLASS, DDNames.SHORT_MS_LIGHT_BLUE_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/light_blue_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BROWN_GLASS, DDNames.SHORT_MS_BROWN_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ms", "door/brown_glass")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_IRON_BAR, new ResourceLocation("ms", "door/iron_bar"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GLOWOOD, new ResourceLocation("ms", "door/glowood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_HELLWOOD, new ResourceLocation("ms", "door/hellwood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_MAPLE, new ResourceLocation("ms", "door/maple"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_SILVERBELL, new ResourceLocation("ms", "door/silverbell"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_TIGERWOOD, new ResourceLocation("ms", "door/tigerwood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_WILLOW, new ResourceLocation("ms", "door/willow"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GLASS, new ResourceLocation("ms", "door/glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_SOUL_GLASS, new ResourceLocation("ms", "door/soul_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_TINTED_GLASS, new ResourceLocation("ms", "door/tinted_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_BLACK_GLASS, new ResourceLocation("ms", "door/black_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GREY_GLASS, new ResourceLocation("ms", "door/grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "door/light_grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_WHITE_GLASS, new ResourceLocation("ms", "door/white_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_RED_GLASS, new ResourceLocation("ms", "door/red_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_ORANGE_GLASS, new ResourceLocation("ms", "door/orange_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_YELLOW_GLASS, new ResourceLocation("ms", "door/yellow_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_LIME_GLASS, new ResourceLocation("ms", "door/lime_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GREEN_GLASS, new ResourceLocation("ms", "door/green_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_CYAN_GLASS, new ResourceLocation("ms", "door/cyan_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_BLUE_GLASS, new ResourceLocation("ms", "door/blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_PURPLE_GLASS, new ResourceLocation("ms", "door/purple_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_MAGENTA_GLASS, new ResourceLocation("ms", "door/magenta_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_PINK_GLASS, new ResourceLocation("ms", "door/pink_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "door/light_blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_BROWN_GLASS, new ResourceLocation("ms", "door/brown_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_IRON_BAR, new ResourceLocation("ms", "door/iron_bar"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GLOWOOD, new ResourceLocation("ms", "door/glowood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_HELLWOOD, new ResourceLocation("ms", "door/hellwood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_MAPLE, new ResourceLocation("ms", "door/maple"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_SILVERBELL, new ResourceLocation("ms", "door/silverbell"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_TIGERWOOD, new ResourceLocation("ms", "door/tigerwood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_WILLOW, new ResourceLocation("ms", "door/willow"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GLASS, new ResourceLocation("ms", "door/glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_SOUL_GLASS, new ResourceLocation("ms", "door/soul_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_TINTED_GLASS, new ResourceLocation("ms", "door/tinted_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_BLACK_GLASS, new ResourceLocation("ms", "door/black_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GREY_GLASS, new ResourceLocation("ms", "door/grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "door/light_grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_WHITE_GLASS, new ResourceLocation("ms", "door/white_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_RED_GLASS, new ResourceLocation("ms", "door/red_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_ORANGE_GLASS, new ResourceLocation("ms", "door/orange_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_YELLOW_GLASS, new ResourceLocation("ms", "door/yellow_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_LIME_GLASS, new ResourceLocation("ms", "door/lime_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GREEN_GLASS, new ResourceLocation("ms", "door/green_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_CYAN_GLASS, new ResourceLocation("ms", "door/cyan_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_BLUE_GLASS, new ResourceLocation("ms", "door/blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_PURPLE_GLASS, new ResourceLocation("ms", "door/purple_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_MAGENTA_GLASS, new ResourceLocation("ms", "door/magenta_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_PINK_GLASS, new ResourceLocation("ms", "door/pink_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "door/light_blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_BROWN_GLASS, new ResourceLocation("ms", "door/brown_glass"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_IRON_BAR, new ResourceLocation("ms", "door/iron_bar"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GLOWOOD, new ResourceLocation("ms", "door/glowood"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_HELLWOOD, new ResourceLocation("ms", "door/hellwood"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_MAPLE, new ResourceLocation("ms", "door/maple"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_SILVERBELL, new ResourceLocation("ms", "door/silverbell"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_TIGERWOOD, new ResourceLocation("ms", "door/tigerwood"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_WILLOW, new ResourceLocation("ms", "door/willow"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GLASS, new ResourceLocation("ms", "door/glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_SOUL_GLASS, new ResourceLocation("ms", "door/soul_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_TINTED_GLASS, new ResourceLocation("ms", "door/tinted_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_BLACK_GLASS, new ResourceLocation("ms", "door/black_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GREY_GLASS, new ResourceLocation("ms", "door/grey_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "door/light_grey_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_WHITE_GLASS, new ResourceLocation("ms", "door/white_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_RED_GLASS, new ResourceLocation("ms", "door/red_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_ORANGE_GLASS, new ResourceLocation("ms", "door/orange_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_YELLOW_GLASS, new ResourceLocation("ms", "door/yellow_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_LIME_GLASS, new ResourceLocation("ms", "door/lime_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GREEN_GLASS, new ResourceLocation("ms", "door/green_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_CYAN_GLASS, new ResourceLocation("ms", "door/cyan_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_BLUE_GLASS, new ResourceLocation("ms", "door/blue_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_PURPLE_GLASS, new ResourceLocation("ms", "door/purple_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_MAGENTA_GLASS, new ResourceLocation("ms", "door/magenta_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_PINK_GLASS, new ResourceLocation("ms", "door/pink_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "door/light_blue_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_BROWN_GLASS, new ResourceLocation("ms", "door/brown_glass"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_IRON_BAR, new ResourceLocation("ms", "door/iron_bar"), "tall_metal");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GLOWOOD, new ResourceLocation("ms", "door/glowood"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_HELLWOOD, new ResourceLocation("ms", "door/hellwood"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_MAPLE, new ResourceLocation("ms", "door/maple"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_SILVERBELL, new ResourceLocation("ms", "door/silverbell"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_TIGERWOOD, new ResourceLocation("ms", "door/tigerwood"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_WILLOW, new ResourceLocation("ms", "door/willow"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GLASS, new ResourceLocation("ms", "door/glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_SOUL_GLASS, new ResourceLocation("ms", "door/soul_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_TINTED_GLASS, new ResourceLocation("ms", "door/tinted_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_BLACK_GLASS, new ResourceLocation("ms", "door/black_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GREY_GLASS, new ResourceLocation("ms", "door/grey_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_LIGHT_GREY_GLASS, new ResourceLocation("ms", "door/light_grey_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_WHITE_GLASS, new ResourceLocation("ms", "door/white_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_RED_GLASS, new ResourceLocation("ms", "door/red_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_ORANGE_GLASS, new ResourceLocation("ms", "door/orange_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_YELLOW_GLASS, new ResourceLocation("ms", "door/yellow_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_LIME_GLASS, new ResourceLocation("ms", "door/lime_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GREEN_GLASS, new ResourceLocation("ms", "door/green_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_CYAN_GLASS, new ResourceLocation("ms", "door/cyan_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_BLUE_GLASS, new ResourceLocation("ms", "door/blue_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_PURPLE_GLASS, new ResourceLocation("ms", "door/purple_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_MAGENTA_GLASS, new ResourceLocation("ms", "door/magenta_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_PINK_GLASS, new ResourceLocation("ms", "door/pink_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_LIGHT_BLUE_GLASS, new ResourceLocation("ms", "door/light_blue_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_BROWN_GLASS, new ResourceLocation("ms", "door/brown_glass"), "tall_glass_door");
	}
}
