package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class UndergardenCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GRONGLE, DDNames.SHORT_GRONGLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("undergarden", "grongle_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SMOGSTEM, DDNames.SHORT_SMOGSTEM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("undergarden", "smogstem_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WIGGLEWOOD, DDNames.SHORT_WIGGLEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("undergarden", "wigglewood_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GRONGLE, new ResourceLocation("undergarden", "grongle_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GRONGLE, new ResourceLocation("undergarden", "grongle_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SMOGSTEM, new ResourceLocation("undergarden", "smogstem_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WIGGLEWOOD, new ResourceLocation("undergarden", "wigglewood_door"), "tall_wooden_door");
	}
}
