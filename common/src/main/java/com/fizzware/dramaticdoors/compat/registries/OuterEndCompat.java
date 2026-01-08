package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class OuterEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AZURE, DDNames.SHORT_AZURE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("outer_end", "azure_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AZURE, new ResourceLocation("outer_end", "azure_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AZURE, new ResourceLocation("outer_end", "azure_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AZURE, new ResourceLocation("outer_end", "azure_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AZURE, new ResourceLocation("outer_end", "azure_door"), "tall_wooden_door");
	}
}
