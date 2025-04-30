package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EndPhantasmCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PREAM, DDNames.SHORT_PREAM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("phantasm", "pream_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PREAM, ResourceLocation.fromNamespaceAndPath("phantasm", "pream_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PREAM, ResourceLocation.fromNamespaceAndPath("phantasm", "pream_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PREAM, ResourceLocation.fromNamespaceAndPath("phantasm", "pream_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PREAM, ResourceLocation.fromNamespaceAndPath("phantasm", "pream_door"), "tall_wooden_door");	
	}
}
