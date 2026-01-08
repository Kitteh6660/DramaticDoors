package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class GoodEndingCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GE_CYPRESS, DDNames.SHORT_GE_CYPRESS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("goodending", "cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GE_MUDDY_OAK, DDNames.SHORT_GE_MUDDY_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("goodending", "muddy_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GE_CYPRESS, new ResourceLocation("goodending", "cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GE_MUDDY_OAK, new ResourceLocation("goodending", "muddy_oak_door"), "tall_wooden_door");
	}
}
