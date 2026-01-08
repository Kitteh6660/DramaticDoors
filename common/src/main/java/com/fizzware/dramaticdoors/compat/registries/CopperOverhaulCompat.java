package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CopperOverhaulCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_COPPER, DDNames.SHORT_CO_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_EXPOSED_COPPER, DDNames.SHORT_CO_EXPOSED_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_WEATHERED_COPPER, DDNames.SHORT_CO_WEATHERED_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CO_OXIDIZED_COPPER, DDNames.SHORT_CO_OXIDIZED_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("copperoverhaul", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CO_COPPER, new ResourceLocation("copperoverhaul", "copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CO_EXPOSED_COPPER, new ResourceLocation("copperoverhaul", "exposed_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CO_WEATHERED_COPPER, new ResourceLocation("copperoverhaul", "weathered_copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CO_OXIDIZED_COPPER, new ResourceLocation("copperoverhaul", "oxidized_copper_door"), "tall_metal_door");
	}
}
