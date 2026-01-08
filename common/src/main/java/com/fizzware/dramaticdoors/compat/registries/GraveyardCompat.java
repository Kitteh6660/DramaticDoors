package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class GraveyardCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_IRON, DDNames.SHORT_DARK_IRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("graveyard", "dark_iron_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"));
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARK_IRON, new ResourceLocation("graveyard", "dark_iron_door"), "tall_metal_door");
	}
}
