package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TheAbyss2Compat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLARU, DDNames.SHORT_BLARU, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "blaru_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOG, DDNames.SHORT_BOG, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "bog_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FROZEN, DDNames.SHORT_FROZEN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "frozen_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ABYSSAL_JUNGLE, DDNames.SHORT_ABYSSAL_JUNGLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "jungle_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SAL, DDNames.SHORT_SAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "sal_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SLIMED, DDNames.SHORT_SLIMED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "slimed_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VIGILANT, DDNames.SHORT_VIGILANT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("theabyss", "vigilant_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLARU, ResourceLocation.fromNamespaceAndPath("theabyss", "blaru_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOG, ResourceLocation.fromNamespaceAndPath("theabyss", "bog_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FROZEN, ResourceLocation.fromNamespaceAndPath("theabyss", "frozen_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ABYSSAL_JUNGLE, ResourceLocation.fromNamespaceAndPath("theabyss", "jungle_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SAL, ResourceLocation.fromNamespaceAndPath("theabyss", "sal_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SLIMED, ResourceLocation.fromNamespaceAndPath("theabyss", "slimed_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VIGILANT, ResourceLocation.fromNamespaceAndPath("theabyss", "vigilant_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLARU, ResourceLocation.fromNamespaceAndPath("theabyss", "blaru_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOG, ResourceLocation.fromNamespaceAndPath("theabyss", "bog_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FROZEN, ResourceLocation.fromNamespaceAndPath("theabyss", "frozen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ABYSSAL_JUNGLE, ResourceLocation.fromNamespaceAndPath("theabyss", "jungle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SAL, ResourceLocation.fromNamespaceAndPath("theabyss", "sal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SLIMED, ResourceLocation.fromNamespaceAndPath("theabyss", "slimed_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VIGILANT, ResourceLocation.fromNamespaceAndPath("theabyss", "vigilant_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLARU, ResourceLocation.fromNamespaceAndPath("theabyss", "blaru_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOG, ResourceLocation.fromNamespaceAndPath("theabyss", "bog_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FROZEN, ResourceLocation.fromNamespaceAndPath("theabyss", "frozen_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ABYSSAL_JUNGLE, ResourceLocation.fromNamespaceAndPath("theabyss", "jungle_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SAL, ResourceLocation.fromNamespaceAndPath("theabyss", "sal_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SLIMED, ResourceLocation.fromNamespaceAndPath("theabyss", "slimed_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VIGILANT, ResourceLocation.fromNamespaceAndPath("theabyss", "vigilant_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLARU, ResourceLocation.fromNamespaceAndPath("theabyss", "blaru_door"), "tall_abyss_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOG, ResourceLocation.fromNamespaceAndPath("theabyss", "bog_door"), "tall_abyss_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FROZEN, ResourceLocation.fromNamespaceAndPath("theabyss", "frozen_door"), "tall_abyss_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ABYSSAL_JUNGLE, ResourceLocation.fromNamespaceAndPath("theabyss", "jungle_door"), "tall_abyss_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SAL, ResourceLocation.fromNamespaceAndPath("theabyss", "sal_door"), "tall_abyss_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SLIMED, ResourceLocation.fromNamespaceAndPath("theabyss", "slimed_door"), "tall_abyss_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VIGILANT, ResourceLocation.fromNamespaceAndPath("theabyss", "vigilant_door"), "tall_abyss_wooden_door");
	}
}
