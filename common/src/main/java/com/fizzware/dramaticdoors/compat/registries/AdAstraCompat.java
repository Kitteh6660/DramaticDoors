package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AdAstraCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AERONOS, DDNames.SHORT_AERONOS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "aeronos_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIAN, DDNames.SHORT_GLACIAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "glacian_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_STROPHAR, DDNames.SHORT_STROPHAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "strophar_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AA_STEEL, DDNames.SHORT_AA_STEEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ad_astra", "steel_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AERONOS, new ResourceLocation("ad_astra", "aeronos_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLACIAN, new ResourceLocation("ad_astra", "glacian_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_STROPHAR, new ResourceLocation("ad_astra", "strophar_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AA_STEEL, new ResourceLocation("ad_astra", "steel_door"), "tall_metal_door");
	}
}
