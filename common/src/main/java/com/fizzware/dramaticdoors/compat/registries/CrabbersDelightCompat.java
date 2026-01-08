package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CrabbersDelightCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PALM, DDNames.SHORT_PALM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("crabbersdelight", "palm_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PALM, new ResourceLocation("crabbersdelight", "palm_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PALM, new ResourceLocation("crabbersdelight", "palm_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PALM, new ResourceLocation("crabbersdelight", "palm_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PALM, new ResourceLocation("crabbersdelight", "palm_door"), "tall_wooden_door");
	}
}
