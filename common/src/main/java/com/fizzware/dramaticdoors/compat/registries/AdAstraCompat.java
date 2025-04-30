package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AdAstraCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AERONOS, DDNames.SHORT_AERONOS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ad_astra", "aeronos_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIAN, DDNames.SHORT_GLACIAN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ad_astra", "glacian_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STROPHAR, DDNames.SHORT_STROPHAR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ad_astra", "strophar_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AA_STEEL, DDNames.SHORT_AA_STEEL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ad_astra", "steel_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AERONOS, ResourceLocation.fromNamespaceAndPath("ad_astra", "aeronos_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLACIAN, ResourceLocation.fromNamespaceAndPath("ad_astra", "glacian_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_STROPHAR, ResourceLocation.fromNamespaceAndPath("ad_astra", "strophar_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AA_STEEL, ResourceLocation.fromNamespaceAndPath("ad_astra", "steel_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AERONOS, ResourceLocation.fromNamespaceAndPath("ad_astra", "aeronos_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLACIAN, ResourceLocation.fromNamespaceAndPath("ad_astra", "glacian_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_STROPHAR, ResourceLocation.fromNamespaceAndPath("ad_astra", "strophar_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AA_STEEL, ResourceLocation.fromNamespaceAndPath("ad_astra", "steel_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AERONOS, ResourceLocation.fromNamespaceAndPath("ad_astra", "aeronos_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLACIAN, ResourceLocation.fromNamespaceAndPath("ad_astra", "glacian_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_STROPHAR, ResourceLocation.fromNamespaceAndPath("ad_astra", "strophar_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AA_STEEL, ResourceLocation.fromNamespaceAndPath("ad_astra", "steel_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AERONOS, ResourceLocation.fromNamespaceAndPath("ad_astra", "aeronos_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLACIAN, ResourceLocation.fromNamespaceAndPath("ad_astra", "glacian_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_STROPHAR, ResourceLocation.fromNamespaceAndPath("ad_astra", "strophar_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AA_STEEL, ResourceLocation.fromNamespaceAndPath("ad_astra", "steel_door"), "tall_metal_door");
	}
}
