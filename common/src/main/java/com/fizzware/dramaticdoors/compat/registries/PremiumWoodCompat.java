package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PremiumWoodCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_MAGIC, DDNames.SHORT_PW_MAGIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("premium_wood", "magic_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_MAPLE, DDNames.SHORT_PW_MAPLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("premium_wood", "maple_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_PURPLE_HEART, DDNames.SHORT_PW_PURPLE_HEART, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("premium_wood", "purple_heart_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_SILVERBELL, DDNames.SHORT_PW_SILVERBELL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("premium_wood", "silverbell_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_TIGER, DDNames.SHORT_PW_TIGER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("premium_wood", "tiger_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PW_WILLOW, DDNames.SHORT_PW_WILLOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("premium_wood", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PW_MAGIC, ResourceLocation.fromNamespaceAndPath("premium_wood", "magic_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PW_MAPLE, ResourceLocation.fromNamespaceAndPath("premium_wood", "maple_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PW_PURPLE_HEART, ResourceLocation.fromNamespaceAndPath("premium_wood", "purple_heart_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PW_SILVERBELL, ResourceLocation.fromNamespaceAndPath("premium_wood", "silverbell_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PW_TIGER, ResourceLocation.fromNamespaceAndPath("premium_wood", "tiger_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PW_WILLOW, ResourceLocation.fromNamespaceAndPath("premium_wood", "willow_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PW_MAGIC, ResourceLocation.fromNamespaceAndPath("premium_wood", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PW_MAPLE, ResourceLocation.fromNamespaceAndPath("premium_wood", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PW_PURPLE_HEART, ResourceLocation.fromNamespaceAndPath("premium_wood", "purple_heart_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PW_SILVERBELL, ResourceLocation.fromNamespaceAndPath("premium_wood", "silverbell_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PW_TIGER, ResourceLocation.fromNamespaceAndPath("yipremium_woodppee", "tiger_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PW_WILLOW, ResourceLocation.fromNamespaceAndPath("premium_wood", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PW_MAGIC, ResourceLocation.fromNamespaceAndPath("premium_wood", "magic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PW_MAPLE, ResourceLocation.fromNamespaceAndPath("premium_wood", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PW_PURPLE_HEART, ResourceLocation.fromNamespaceAndPath("premium_wood", "purple_heart_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PW_SILVERBELL, ResourceLocation.fromNamespaceAndPath("premium_wood", "silverbell_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PW_TIGER, ResourceLocation.fromNamespaceAndPath("premium_wood", "tiger_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PW_WILLOW, ResourceLocation.fromNamespaceAndPath("premium_wood", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PW_MAGIC, ResourceLocation.fromNamespaceAndPath("premium_wood", "magic_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PW_MAPLE, ResourceLocation.fromNamespaceAndPath("premium_wood", "maple_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PW_PURPLE_HEART, ResourceLocation.fromNamespaceAndPath("premium_wood", "purple_heart_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PW_SILVERBELL, ResourceLocation.fromNamespaceAndPath("premium_wood", "silverbell_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PW_TIGER, ResourceLocation.fromNamespaceAndPath("premium_wood", "tiger_door"), "tall_pw_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PW_WILLOW, ResourceLocation.fromNamespaceAndPath("premium_wood", "willow_door"), "tall_pw_wooden_door");
	}
}
