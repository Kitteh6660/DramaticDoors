package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class YippeeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MYSTICAL_OAK, DDNames.SHORT_MYSTICAL_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("yippee", "mystical_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MYSTICAL_OAK, new ResourceLocation("yippee", "mystical_oak_door"), "tall_wooden_door");
	}
}
