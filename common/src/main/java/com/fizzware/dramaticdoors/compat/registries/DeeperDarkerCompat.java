package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DeeperDarkerCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOOM, DDNames.SHORT_BLOOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "bloom_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ECHO, DDNames.SHORT_ECHO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("deeperdarker", "echo_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOOM, new ResourceLocation("deeperdarker", "bloom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOOM, new ResourceLocation("deeperdarker", "bloom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOOM, new ResourceLocation("deeperdarker", "bloom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ECHO, new ResourceLocation("deeperdarker", "echo_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOOM, new ResourceLocation("deeperdarker", "bloom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ECHO, new ResourceLocation("deeperdarker", "echo_door"), "tall_wooden_door");
	}
}
