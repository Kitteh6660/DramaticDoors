package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class YippeeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MYSTICAL_OAK, DDNames.SHORT_MYSTICAL_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("yippee", "mystical_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MYSTICAL_OAK, ResourceLocation.fromNamespaceAndPath("yippee", "mystical_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MYSTICAL_OAK, ResourceLocation.fromNamespaceAndPath("yippee", "mystical_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MYSTICAL_OAK, ResourceLocation.fromNamespaceAndPath("yippee", "mystical_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MYSTICAL_OAK, ResourceLocation.fromNamespaceAndPath("yippee", "mystical_oak_door"), "tall_wooden_door");
	}
}
