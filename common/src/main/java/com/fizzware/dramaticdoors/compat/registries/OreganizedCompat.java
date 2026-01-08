package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class OreganizedCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LEAD, DDNames.SHORT_LEAD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("oreganized", "lead_door")), BlockSetType.IRON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LEAD, new ResourceLocation("oreganized", "lead_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LEAD, new ResourceLocation("oreganized", "lead_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LEAD, new ResourceLocation("oreganized", "lead_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LEAD, new ResourceLocation("oreganized", "lead_door"), "tall_metal_door");
	}
}
