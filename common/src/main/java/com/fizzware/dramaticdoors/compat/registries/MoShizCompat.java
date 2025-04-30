package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

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
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_IRON_BAR, DDNames.SHORT_MS_IRON_BAR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/iron_bar"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GLOWOOD, DDNames.SHORT_MS_GLOWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/glowood")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_HELLWOOD, DDNames.SHORT_MS_HELLWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/hellwood")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_MAPLE, DDNames.SHORT_MS_MAPLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/maple")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_SILVERBELL, DDNames.SHORT_MS_SILVERBELL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/silverebell")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_TIGERWOOD, DDNames.SHORT_MS_TIGERWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/tigerwood")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_WILLOW, DDNames.SHORT_MS_WILLOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/willow")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GLASS, DDNames.SHORT_MS_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_SOUL_GLASS, DDNames.SHORT_MS_SOUL_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/soul_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_TINTED_GLASS, DDNames.SHORT_MS_TINTED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/tinted_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BLACK_GLASS, DDNames.SHORT_MS_BLACK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/black_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GREY_GLASS, DDNames.SHORT_MS_GREY_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/grey_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIGHT_GREY_GLASS, DDNames.SHORT_MS_LIGHT_GREY_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/light_grey_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_WHITE_GLASS, DDNames.SHORT_MS_WHITE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/white_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_RED_GLASS, DDNames.SHORT_MS_RED_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/red_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_ORANGE_GLASS, DDNames.SHORT_MS_ORANGE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/orange_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_YELLOW_GLASS, DDNames.SHORT_MS_YELLOW_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/yellow_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIME_GLASS, DDNames.SHORT_MS_LIME_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/lime_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_GREEN_GLASS, DDNames.SHORT_MS_GREEN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/green_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_CYAN_GLASS, DDNames.SHORT_MS_CYAN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/cyan_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BLUE_GLASS, DDNames.SHORT_MS_BLUE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/blue_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_PURPLE_GLASS, DDNames.SHORT_MS_PURPLE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/purple_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_MAGENTA_GLASS, DDNames.SHORT_MS_MAGENTA_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/magenta_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_PINK_GLASS, DDNames.SHORT_MS_PINK_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/pink_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_LIGHT_BLUE_GLASS, DDNames.SHORT_MS_LIGHT_BLUE_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/light_blue_glass")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MS_BROWN_GLASS, DDNames.SHORT_MS_BROWN_GLASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ms", "door/brown_glass")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_IRON_BAR, ResourceLocation.fromNamespaceAndPath("ms", "door/iron_bar"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GLOWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/glowood"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_HELLWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/hellwood"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_MAPLE, ResourceLocation.fromNamespaceAndPath("ms", "door/maple"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_SILVERBELL, ResourceLocation.fromNamespaceAndPath("ms", "door/silverbell"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_TIGERWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/tigerwood"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_WILLOW, ResourceLocation.fromNamespaceAndPath("ms", "door/willow"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_SOUL_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/soul_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_TINTED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/tinted_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_BLACK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/black_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_LIGHT_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_WHITE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/white_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_RED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/red_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_ORANGE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/orange_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_YELLOW_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/yellow_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_LIME_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/lime_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_GREEN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/green_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_CYAN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/cyan_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_PURPLE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/purple_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_MAGENTA_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/magenta_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_PINK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/pink_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MS_BROWN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/brown_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_IRON_BAR, ResourceLocation.fromNamespaceAndPath("ms", "door/iron_bar"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GLOWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/glowood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_HELLWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/hellwood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_MAPLE, ResourceLocation.fromNamespaceAndPath("ms", "door/maple"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_SILVERBELL, ResourceLocation.fromNamespaceAndPath("ms", "door/silverbell"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_TIGERWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/tigerwood"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_WILLOW, ResourceLocation.fromNamespaceAndPath("ms", "door/willow"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_SOUL_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/soul_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_TINTED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/tinted_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_BLACK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/black_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_LIGHT_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_grey_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_WHITE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/white_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_RED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/red_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_ORANGE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/orange_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_YELLOW_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/yellow_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_LIME_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/lime_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_GREEN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/green_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_CYAN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/cyan_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_PURPLE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/purple_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_MAGENTA_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/magenta_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_PINK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/pink_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_LIGHT_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_blue_glass"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MS_BROWN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/brown_glass"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_IRON_BAR, ResourceLocation.fromNamespaceAndPath("ms", "door/iron_bar"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GLOWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/glowood"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_HELLWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/hellwood"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_MAPLE, ResourceLocation.fromNamespaceAndPath("ms", "door/maple"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_SILVERBELL, ResourceLocation.fromNamespaceAndPath("ms", "door/silverbell"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_TIGERWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/tigerwood"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_WILLOW, ResourceLocation.fromNamespaceAndPath("ms", "door/willow"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_SOUL_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/soul_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_TINTED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/tinted_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_BLACK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/black_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/grey_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_LIGHT_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_grey_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_WHITE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/white_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_RED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/red_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_ORANGE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/orange_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_YELLOW_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/yellow_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_LIME_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/lime_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_GREEN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/green_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_CYAN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/cyan_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/blue_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_PURPLE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/purple_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_MAGENTA_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/magenta_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_PINK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/pink_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_LIGHT_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_blue_glass"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MS_BROWN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/brown_glass"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_IRON_BAR, ResourceLocation.fromNamespaceAndPath("ms", "door/iron_bar"), "tall_metal");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GLOWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/glowood"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_HELLWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/hellwood"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_MAPLE, ResourceLocation.fromNamespaceAndPath("ms", "door/maple"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_SILVERBELL, ResourceLocation.fromNamespaceAndPath("ms", "door/silverbell"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_TIGERWOOD, ResourceLocation.fromNamespaceAndPath("ms", "door/tigerwood"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_WILLOW, ResourceLocation.fromNamespaceAndPath("ms", "door/willow"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_SOUL_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/soul_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_TINTED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/tinted_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_BLACK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/black_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/grey_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_LIGHT_GREY_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_grey_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_WHITE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/white_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_RED_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/red_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_ORANGE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/orange_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_YELLOW_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/yellow_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_LIME_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/lime_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_GREEN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/green_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_CYAN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/cyan_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/blue_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_PURPLE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/purple_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_MAGENTA_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/magenta_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_PINK_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/pink_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_LIGHT_BLUE_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/light_blue_glass"), "tall_glass_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MS_BROWN_GLASS, ResourceLocation.fromNamespaceAndPath("ms", "door/brown_glass"), "tall_glass_door");
	}
}
