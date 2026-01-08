package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ArchitectsPaletteCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TWISTED, DDNames.SHORT_TWISTED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("architects_palette", "twisted_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TWISTED, new ResourceLocation("architects_palette", "twisted_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"));
	
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TWISTED, new ResourceLocation("architects_palette", "twisted_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TWISTED, new ResourceLocation("architects_palette", "twisted_door"), "tall_wooden_door");
	}
}
