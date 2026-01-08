package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CobblemonCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_APRICORN, DDNames.SHORT_APRICORN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("cobblemon", "apricorn_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_APRICORN, new ResourceLocation("cobblemon", "apricorn_door"), "tall_wooden_door");
	}
}
