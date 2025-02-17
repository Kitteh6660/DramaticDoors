package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CreateDecoCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANDESITE, DDNames.SHORT_ANDESITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "andesite_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRASS, DDNames.SHORT_BRASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "brass_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CD_COPPER, DDNames.SHORT_CD_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "copper_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CD_INDUSTRIAL_IRON, DDNames.SHORT_CD_INDUSTRIAL_IRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "industrial_iron_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ZINC, DDNames.SHORT_ZINC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "zinc_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_ANDESITE, DDNames.SHORT_LOCKED_ANDESITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_andesite_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_BRASS, DDNames.SHORT_LOCKED_BRASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_brass_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_COPPER, DDNames.SHORT_LOCKED_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_copper_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_INDUSTRIAL_IRON, DDNames.SHORT_LOCKED_INDUSTRIAL_IRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_industrial_iron_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LOCKED_ZINC, DDNames.SHORT_LOCKED_ZINC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("createdeco", "locked_zinc_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRASS, new ResourceLocation("createdeco", "brass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CD_COPPER, new ResourceLocation("createdeco", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CD_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ZINC, new ResourceLocation("createdeco", "zinc_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "locked_industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRASS, new ResourceLocation("createdeco", "brass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CD_COPPER, new ResourceLocation("createdeco", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CD_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ZINC, new ResourceLocation("createdeco", "zinc_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "locked_industrial_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ANDESITE, new ResourceLocation("createdeco", "andesite_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRASS, new ResourceLocation("createdeco", "brass_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CD_COPPER, new ResourceLocation("createdeco", "copper_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CD_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "industrial_iron_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ZINC, new ResourceLocation("createdeco", "zinc_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "locked_industrial_iron_door"));
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"));
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ANDESITE, new ResourceLocation("createdeco", "andesite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRASS, new ResourceLocation("createdeco", "brass_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CD_COPPER, new ResourceLocation("createdeco", "copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CD_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "industrial_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ZINC, new ResourceLocation("createdeco", "zinc_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_ANDESITE, new ResourceLocation("createdeco", "locked_andesite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_BRASS, new ResourceLocation("createdeco", "locked_brass_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_COPPER, new ResourceLocation("createdeco", "locked_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_INDUSTRIAL_IRON, new ResourceLocation("createdeco", "locked_industrial_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LOCKED_ZINC, new ResourceLocation("createdeco", "locked_zinc_door"), "tall_metal_door");
	}
}
