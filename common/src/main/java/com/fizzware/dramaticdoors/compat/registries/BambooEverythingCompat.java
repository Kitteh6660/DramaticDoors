package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BambooEverythingCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BE_BAMBOO, DDNames.SHORT_BE_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "bamboo_door")), BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BE_DRY_BAMBOO, DDNames.SHORT_BE_DRY_BAMBOO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bambooeverything", "dry_bamboo_door")), BlockSetType.BAMBOO, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BE_BAMBOO, new ResourceLocation("bambooeverything", "bamboo_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BE_DRY_BAMBOO, new ResourceLocation("bambooeverything", "dry_bamboo_door"), "tall_wooden_door");
	}
}
