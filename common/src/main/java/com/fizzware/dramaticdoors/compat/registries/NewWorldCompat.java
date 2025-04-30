package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class NewWorldCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FIR, DDNames.SHORT_FIR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("newworld", "fir_door")), BlockSetType.SPRUCE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FIR, ResourceLocation.fromNamespaceAndPath("newworld", "fir_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FIR, ResourceLocation.fromNamespaceAndPath("newworld", "fir_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FIR, ResourceLocation.fromNamespaceAndPath("newworld", "fir_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FIR, ResourceLocation.fromNamespaceAndPath("newworld", "fir_door"), "tall_wooden_door");
	}
}
