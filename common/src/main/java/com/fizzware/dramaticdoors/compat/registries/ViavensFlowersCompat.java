package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ViavensFlowersCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VF_GOLDEN_CHAIN, DDNames.SHORT_VF_GOLDEN_CHAIN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("viavens_flowers", "goldenchaindoor")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VF_WISTERIA, DDNames.SHORT_VF_WISTERIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("viavens_flowers", "wisteriadoor")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VF_GOLDEN_CHAIN, new ResourceLocation("viavens_flowers", "goldenchaindoor"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VF_WISTERIA, new ResourceLocation("viavens_flowers", "wisteriadoor"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VF_GOLDEN_CHAIN, new ResourceLocation("viavens_flowers", "goldenchaindoor"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VF_WISTERIA, new ResourceLocation("viavens_flowers", "wisteriadoor"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VF_GOLDEN_CHAIN, new ResourceLocation("viavens_flowers", "goldenchaindoor"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VF_WISTERIA, new ResourceLocation("viavens_flowers", "wisteriadoor"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VF_GOLDEN_CHAIN, new ResourceLocation("viavens_flowers", "goldenchaindoor"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VF_WISTERIA, new ResourceLocation("viavens_flowers", "wisteriadoor"), "tall_wooden_door");
	}
}
