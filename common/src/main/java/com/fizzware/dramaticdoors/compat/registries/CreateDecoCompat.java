package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CreateDecoCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANDESITE, DDNames.SHORT_ANDESITE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "andesite_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRASS, DDNames.SHORT_BRASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "brass_door")), BlockSetType.IRON, true);
		//DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CD_COPPER, DDNames.SHORT_CD_COPPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "copper_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CD_INDUSTRIAL_IRON, DDNames.SHORT_CD_INDUSTRIAL_IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "industrial_iron_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ZINC, DDNames.SHORT_ZINC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "zinc_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_ANDESITE, DDNames.SHORT_LOCKED_ANDESITE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "locked_andesite_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_BRASS, DDNames.SHORT_LOCKED_BRASS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "locked_brass_door")), BlockSetType.IRON, true);
		//DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_COPPER, DDNames.SHORT_LOCKED_COPPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "locked_copper_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_INDUSTRIAL_IRON, DDNames.SHORT_LOCKED_INDUSTRIAL_IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "locked_industrial_iron_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_ZINC, DDNames.SHORT_LOCKED_ZINC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("createdeco", "locked_zinc_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "andesite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "brass_door"), false);
		//DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CD_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CD_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "industrial_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "zinc_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_andesite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_brass_door"), false);
		//DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_industrial_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_zinc_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "brass_door"));
		//DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CD_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CD_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "zinc_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_brass_door"));
		//DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_zinc_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "andesite_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "brass_door"));
		//DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CD_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "copper_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CD_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "industrial_iron_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "zinc_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_andesite_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_brass_door"));
		//DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_copper_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_industrial_iron_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_zinc_door"));
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "andesite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "brass_door"), "tall_metal_door");
		//DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CD_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CD_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "industrial_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "zinc_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_ANDESITE, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_andesite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_BRASS, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_brass_door"), "tall_metal_door");
		//DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_COPPER, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_INDUSTRIAL_IRON, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_industrial_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_ZINC, ResourceLocation.fromNamespaceAndPath("createdeco", "locked_zinc_door"), "tall_metal_door");
	}
}
