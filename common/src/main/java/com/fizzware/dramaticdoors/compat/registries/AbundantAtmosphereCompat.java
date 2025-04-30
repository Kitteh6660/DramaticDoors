package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AbundantAtmosphereCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ASH, DDNames.SHORT_ASH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "ash_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GOURDROT, DDNames.SHORT_GOURDROT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "gourdrot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ASH, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "ash_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GOURDROT, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "gourdrot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ASH, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "ash_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GOURDROT, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "gourdrot_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ASH, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "ash_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GOURDROT, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "gourdrot_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ASH, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "ash_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GOURDROT, ResourceLocation.fromNamespaceAndPath("abundant_atmosphere", "gourdrot_door"), "tall_wooden_door");
	}
}
