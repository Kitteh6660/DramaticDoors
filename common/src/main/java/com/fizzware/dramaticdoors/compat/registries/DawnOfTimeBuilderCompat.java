package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DawnOfTimeBuilderCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHARRED_SPRUCE, DDNames.SHORT_CHARRED_SPRUCE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "charred_spruce_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_OAK, DDNames.SHORT_WAXED_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "waxed_oak_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PAPER, DDNames.SHORT_PAPER, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "paper_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CHARRED_SPRUCE, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "charred_spruce_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_OAK, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "waxed_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PAPER, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "paper_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CHARRED_SPRUCE, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "charred_spruce_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_OAK, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "waxed_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PAPER, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "paper_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHARRED_SPRUCE, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "charred_spruce_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_OAK, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "waxed_oak_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PAPER, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "paper_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CHARRED_SPRUCE, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "charred_spruce_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_OAK, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "waxed_oak_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PAPER, ResourceLocation.fromNamespaceAndPath("dawnoftimebuilder", "paper_door"), "tall_wooden_door");
	}
}
