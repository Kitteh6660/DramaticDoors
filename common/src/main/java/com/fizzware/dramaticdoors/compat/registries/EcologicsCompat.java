package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EcologicsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_AZALEA, DDNames.SHORT_ECO_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ecologics", "azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_FLOWERING_AZALEA, DDNames.SHORT_ECO_FLOWERING_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ecologics", "flowering_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_COCONUT, DDNames.SHORT_ECO_COCONUT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ecologics", "coconut_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECO_WALNUT, DDNames.SHORT_ECO_WALNUT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("ecologics", "walnut_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECO_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECO_FLOWERING_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "flowering_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECO_COCONUT, ResourceLocation.fromNamespaceAndPath("ecologics", "coconut_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECO_WALNUT, ResourceLocation.fromNamespaceAndPath("ecologics", "walnut_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECO_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECO_FLOWERING_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "flowering_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECO_COCONUT, ResourceLocation.fromNamespaceAndPath("ecologics", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECO_WALNUT, ResourceLocation.fromNamespaceAndPath("ecologics", "walnut_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECO_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECO_FLOWERING_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "flowering_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECO_COCONUT, ResourceLocation.fromNamespaceAndPath("ecologics", "coconut_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECO_WALNUT, ResourceLocation.fromNamespaceAndPath("ecologics", "walnut_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECO_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECO_FLOWERING_AZALEA, ResourceLocation.fromNamespaceAndPath("ecologics", "flowering_azalea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECO_COCONUT, ResourceLocation.fromNamespaceAndPath("ecologics", "coconut_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECO_WALNUT, ResourceLocation.fromNamespaceAndPath("ecologics", "walnut_door"), "tall_wooden_door");
	}
}
