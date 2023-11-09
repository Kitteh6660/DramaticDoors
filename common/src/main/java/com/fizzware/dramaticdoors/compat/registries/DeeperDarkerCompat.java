package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;


public class DeeperDarkerCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECHO, DDNames.SHORT_ECHO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "echo_door")), true, DDRegistry.MAIN_TAB);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"), "tall_wooden_door");
	}
}
