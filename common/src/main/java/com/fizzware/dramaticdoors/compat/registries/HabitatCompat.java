package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class HabitatCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FAIRY_RING_MUSHROOM, DDNames.SHORT_FAIRY_RING_MUSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("habitat", "fairy_ring_mushroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FAIRY_RING_MUSHROOM, new ResourceLocation("habitat", "fairy_ring_mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FAIRY_RING_MUSHROOM, new ResourceLocation("habitat", "fairy_ring_mushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FAIRY_RING_MUSHROOM, new ResourceLocation("habitat", "fairy_ring_mushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FAIRY_RING_MUSHROOM, new ResourceLocation("habitat", "fairy_ring_mushroom_door"), "tall_wooden_door");
	}
}
