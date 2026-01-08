package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EdenRingCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AURITIS, DDNames.SHORT_AURITIS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("edenring", "auritis_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BALLOON_MUSHROOM, DDNames.SHORT_BALLOON_MUSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("edenring", "balloon_mushroom_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRAIN_TREE, DDNames.SHORT_BRAIN_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("edenring", "brain_tree_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PULSE_TREE, DDNames.SHORT_PULSE_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("edenring", "pulse_tree_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AURITIS, new ResourceLocation("edenring", "auritis_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BALLOON_MUSHROOM, new ResourceLocation("edenring", "balloon_mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRAIN_TREE, new ResourceLocation("edenring", "brain_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PULSE_TREE, new ResourceLocation("edenring", "pulse_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AURITIS, new ResourceLocation("edenring", "auritis_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BALLOON_MUSHROOM, new ResourceLocation("edenring", "balloon_mushroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRAIN_TREE, new ResourceLocation("edenring", "brain_tree_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PULSE_TREE, new ResourceLocation("edenring", "pulse_tree_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AURITIS, new ResourceLocation("edenring", "auritis_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BALLOON_MUSHROOM, new ResourceLocation("edenring", "balloon_mushroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRAIN_TREE, new ResourceLocation("edenring", "brain_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PULSE_TREE, new ResourceLocation("edenring", "pulse_tree_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AURITIS, new ResourceLocation("edenring", "auritis_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BALLOON_MUSHROOM, new ResourceLocation("edenring", "balloon_mushroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRAIN_TREE, new ResourceLocation("edenring", "brain_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PULSE_TREE, new ResourceLocation("edenring", "pulse_tree_door"), "tall_wooden_door");
	}
}
