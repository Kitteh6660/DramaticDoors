package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DeeperDarkerCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECHO, DDNames.SHORT_ECHO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("deeperdarker", "echo_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECHO, ResourceLocation.fromNamespaceAndPath("deeperdarker", "echo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECHO, ResourceLocation.fromNamespaceAndPath("deeperdarker", "echo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECHO, ResourceLocation.fromNamespaceAndPath("deeperdarker", "echo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECHO, ResourceLocation.fromNamespaceAndPath("deeperdarker", "echo_door"), "tall_wooden_door");
	}
}
