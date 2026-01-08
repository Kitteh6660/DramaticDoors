package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class NethersExoticismCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JABOTICABA, DDNames.SHORT_JABOTICABA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("nethers_exoticism", "jaboticaba_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RAMBOUTAN, DDNames.SHORT_RAMBOUTAN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("nethers_exoticism", "ramboutan_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JABOTICABA, new ResourceLocation("nethers_exoticism", "jaboticaba_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RAMBOUTAN, new ResourceLocation("nethers_exoticism", "ramboutan_door"), "tall_wooden_door");
	}
}
