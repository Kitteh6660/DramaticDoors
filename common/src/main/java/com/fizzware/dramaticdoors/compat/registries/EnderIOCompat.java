package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

// Sample compat file.
public class EnderIOCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_STEEL, DDNames.SHORT_DARK_STEEL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("enderio", "dark_steel_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARK_STEEL, new ResourceLocation("enderio", "dark_steel_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARK_STEEL, new ResourceLocation("enderio", "dark_steel_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_STEEL, new ResourceLocation("enderio", "dark_steel_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARK_STEEL, new ResourceLocation("enderio", "dark_steel_door"), "tall_metal_door");
	}
}
