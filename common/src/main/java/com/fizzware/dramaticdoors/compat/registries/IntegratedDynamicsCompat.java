package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class IntegratedDynamicsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MENRIL, DDNames.SHORT_MENRIL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("integrateddynamics", "menril_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MENRIL, new ResourceLocation("integrateddynamics", "menril_door"), "tall_wooden_door");
	}
}
