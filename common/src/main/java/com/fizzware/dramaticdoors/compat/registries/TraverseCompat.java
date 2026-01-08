package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TraverseCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TRAVERSE_FIR, DDNames.SHORT_TRAVERSE_FIR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("traverse", "fir_door")), BlockSetType.SPRUCE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TRAVERSE_FIR, new ResourceLocation("traverse", "fir_door"), "tall_wooden_door");
	}
}
