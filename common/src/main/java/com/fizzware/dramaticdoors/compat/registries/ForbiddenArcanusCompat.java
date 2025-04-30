package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ForbiddenArcanusCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DEORUM, DDNames.SHORT_DEORUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "deorum_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ARCANE_EDELWOOD, DDNames.SHORT_ARCANE_EDELWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "arcane_edelwood_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AURUM, DDNames.SHORT_AURUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "aurum_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EDELWOOD, DDNames.SHORT_EDELWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "edelwood_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FUNGYSS, DDNames.SHORT_FUNGYSS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "fungyss_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DEORUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "deorum_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ARCANE_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "arcane_edelwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AURUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "aurum_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "edelwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FUNGYSS, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "fungyss_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DEORUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "deorum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ARCANE_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "arcane_edelwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AURUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "aurum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "edelwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FUNGYSS, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "fungyss_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DEORUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "deorum_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ARCANE_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "arcane_edelwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AURUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "aurum_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "edelwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FUNGYSS, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "fungyss_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DEORUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "deorum_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ARCANE_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "arcane_edelwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AURUM, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "aurum_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EDELWOOD, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "edelwood_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FUNGYSS, ResourceLocation.fromNamespaceAndPath("forbidden_arcanus", "fungyss_door"), "tall_wooden_door");
	}
}
