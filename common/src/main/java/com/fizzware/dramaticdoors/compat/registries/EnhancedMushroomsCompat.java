package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EnhancedMushroomsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RED_MUSHROOM, DDNames.SHORT_RED_MUSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enhanced_mushrooms", "mushroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "mushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "mushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RED_MUSHROOM, new ResourceLocation("enhanced_mushrooms", "mushroom_door"), "tall_wooden_door");
	}
}
