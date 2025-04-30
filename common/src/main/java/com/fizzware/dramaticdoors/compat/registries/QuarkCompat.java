package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class QuarkCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_ANCIENT, DDNames.SHORT_QUARK_ANCIENT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("quark", "ancient_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_AZALEA, DDNames.SHORT_QUARK_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("quark", "azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_QUARK_BLOSSOM, DDNames.SHORT_QUARK_BLOSSOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("quark", "blossom_door")), BlockSetType.CHERRY, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_QUARK_ANCIENT, ResourceLocation.fromNamespaceAndPath("quark", "ancient_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_QUARK_AZALEA, ResourceLocation.fromNamespaceAndPath("quark", "azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_QUARK_BLOSSOM, ResourceLocation.fromNamespaceAndPath("quark", "blossom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_QUARK_ANCIENT, ResourceLocation.fromNamespaceAndPath("quark", "ancient_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_QUARK_AZALEA, ResourceLocation.fromNamespaceAndPath("quark", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_QUARK_BLOSSOM, ResourceLocation.fromNamespaceAndPath("quark", "blossom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_QUARK_ANCIENT, ResourceLocation.fromNamespaceAndPath("quark", "ancient_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_QUARK_AZALEA, ResourceLocation.fromNamespaceAndPath("quark", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_QUARK_BLOSSOM, ResourceLocation.fromNamespaceAndPath("quark", "blossom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_QUARK_ANCIENT, ResourceLocation.fromNamespaceAndPath("quark", "ancient_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_QUARK_AZALEA, ResourceLocation.fromNamespaceAndPath("quark", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_QUARK_BLOSSOM, ResourceLocation.fromNamespaceAndPath("quark", "blossom_door"), "tall_wooden_door");
	}
}
