package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class GardensOfTheDeadCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOULBLIGHT, DDNames.SHORT_SOULBLIGHT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "soulblight_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WHISTLECANE, DDNames.SHORT_WHISTLECANE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("gardens_of_the_dead", "whistlecane_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SOULBLIGHT, new ResourceLocation("gardens_of_the_dead", "soulblight_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WHISTLECANE, new ResourceLocation("gardens_of_the_dead", "whistlecane_door"), "tall_wooden_door");
	}
}
