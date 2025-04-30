package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class NethersExoticismCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JABOTICABA, DDNames.SHORT_JABOTICABA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "jaboticaba_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RAMBOUTAN, DDNames.SHORT_RAMBOUTAN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "ramboutan_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JABOTICABA, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "jaboticaba_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RAMBOUTAN, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "ramboutan_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JABOTICABA, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "jaboticaba_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RAMBOUTAN, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "ramboutan_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JABOTICABA, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "jaboticaba_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RAMBOUTAN, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "ramboutan_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JABOTICABA, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "jaboticaba_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RAMBOUTAN, ResourceLocation.fromNamespaceAndPath("nethers_exoticism", "ramboutan_door"), "tall_wooden_door");
	}
}
