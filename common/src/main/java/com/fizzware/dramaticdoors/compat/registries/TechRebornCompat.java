package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TechRebornCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER, DDNames.SHORT_RUBBER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("techreborn", "rubber_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER, new ResourceLocation("techreborn", "rubber_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER, new ResourceLocation("techreborn", "rubber_door"), "tall_wooden_door");
	}
}