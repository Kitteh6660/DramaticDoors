package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.compat.DDCompatRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EndlessBiomesCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_EB_PENUMBRA, DDNames.SHORT_EB_PENUMBRA, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("endlessbiomes", "penumbra_door")), BlockSetType.CRIMSON, true);
		DDCompatRegistry.registerDoorBlockAndItem(DDNames.TALL_EB_TWISTED, DDNames.SHORT_EB_TWISTED, DDBlocks.getBlockFromResourceLocation(new ResourceLocation("endlessbiomes", "twisted_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.SHORT_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"));
		DDCompatAdvancement.createRecipeAdvancementJson(DDNames.TALL_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"));
		
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_CHESTNUT, new ResourceLocation("windswept", "penumbra_door"), true);
		DDCompatRecipe.createShortDoorRecipeJson(DDNames.SHORT_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"), true);
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_CHESTNUT, new ResourceLocation("endlessbiomes", "penumbra_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipeJson(DDNames.TALL_HOLLY, new ResourceLocation("endlessbiomes", "twisted_door"), "tall_wooden_door");
	}
}