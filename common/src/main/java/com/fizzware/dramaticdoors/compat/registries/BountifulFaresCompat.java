package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BountifulFaresCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BF_CERAMIC, DDNames.SHORT_BF_CERAMIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bountifulfares", "ceramic_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BF_HOARY, DDNames.SHORT_BF_HOARY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bountifulfares", "ceramic_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BF_WALNUT, DDNames.SHORT_BF_WALNUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("bountifulfares", "ceramic_door")), BlockSetType.STONE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BF_CERAMIC, new ResourceLocation("bountifulfares", "ceramic_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BF_HOARY, new ResourceLocation("bountifulfares", "hoary_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BF_WALNUT, new ResourceLocation("bountifulfares", "walnut_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BF_CERAMIC, new ResourceLocation("bountifulfares", "ceramic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BF_HOARY, new ResourceLocation("bountifulfares", "hoary_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BF_WALNUT, new ResourceLocation("bountifulfares", "walnut_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BF_CERAMIC, new ResourceLocation("bountifulfares", "ceramic_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BF_HOARY, new ResourceLocation("bountifulfares", "hoary_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BF_WALNUT, new ResourceLocation("bountifulfares", "walnut_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BF_CERAMIC, new ResourceLocation("bountifulfares", "ceramic_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BF_HOARY, new ResourceLocation("bountifulfares", "hoary_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BF_WALNUT, new ResourceLocation("bountifulfares", "walnut_door"), "tall_wooden_door");
	}
}
