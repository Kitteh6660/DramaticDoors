package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ArsNouveauCompat 
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ARCHWOOD, DDNames.SHORT_ARCHWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ars_nouveau", "archwood_door")), BlockSetType.WARPED, true);
		if (Compats.isModLoaded("ars_additions", checker)) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOURCESTONE, DDNames.SHORT_SOURCESTONE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ars_additions", "sourcestone_door")), BlockSetType.STONE, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_POLISHED_SOURCESTONE, DDNames.SHORT_POLISHED_SOURCESTONE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ars_additions", "polished_sourcestone_door")), BlockSetType.STONE, true);			
		}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ARCHWOOD, new ResourceLocation("ars_nouveau", "archwood_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ARCHWOOD, new ResourceLocation("ars_nouveau", "archwood_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ARCHWOOD, new ResourceLocation("ars_nouveau", "archwood_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ARCHWOOD, new ResourceLocation("ars_nouveau", "archwood_door"), "tall_wooden_door");
		if (Compats.isModLoaded("ars_additions", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SOURCESTONE, new ResourceLocation("ars_additions", "sourcestone_door"), false);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_POLISHED_SOURCESTONE, new ResourceLocation("ars_additions", "polished_sourcestone_door"), false);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SOURCESTONE, new ResourceLocation("ars_additions", "sourcestone_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_POLISHED_SOURCESTONE, new ResourceLocation("ars_additions", "polished_sourcestone_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SOURCESTONE, new ResourceLocation("ars_additions", "sourcestone_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_POLISHED_SOURCESTONE, new ResourceLocation("ars_additions", "polished_sourcestone_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SOURCESTONE, new ResourceLocation("ars_additions", "sourcestone_door"), "tall_stone_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_POLISHED_SOURCESTONE, new ResourceLocation("ars_additions", "polished_sourcestone_door"), "tall_stone_door");
		}
	}
}
