package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class MyNethersDelightCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POWDERY, DDNames.SHORT_POWDERY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("mynethersdelight", "powdery_door")), BlockSetType.BAMBOO, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_POWDERY, new ResourceLocation("mynethersdelight", "powdery_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_POWDERY, new ResourceLocation("mynethersdelight", "powdery_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_POWDERY, new ResourceLocation("mynethersdelight", "powdery_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_POWDERY, new ResourceLocation("mynethersdelight", "powdery_door"), "tall_wooden_door");
	}
}
