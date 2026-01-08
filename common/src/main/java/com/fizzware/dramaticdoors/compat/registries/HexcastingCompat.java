package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HexcastingCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_EDIFIED, DDNames.SHORT_EDIFIED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("hexcasting", "edified_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EDIFIED, new ResourceLocation("hexcasting", "edified_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EDIFIED, new ResourceLocation("hexcasting", "edified_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EDIFIED, new ResourceLocation("hexcasting", "edified_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EDIFIED, new ResourceLocation("hexcasting", "edified_door"), "tall_wooden_door");
	}
}
