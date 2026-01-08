package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BetterEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERMINITE, DDNames.SHORT_TERMINITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "terminite_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_THALLASIUM, DDNames.SHORT_THALLASIUM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "thallasium_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRAGON_TREE, DDNames.SHORT_DRAGON_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "dragon_tree_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_END_LOTUS, DDNames.SHORT_END_LOTUS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "end_lotus_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HELIX_TREE, DDNames.SHORT_HELIX_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "helix_tree_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JELLYSHROOM, DDNames.SHORT_JELLYSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "jellyshroom_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LACUGROVE, DDNames.SHORT_LACUGROVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "lacugrove_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LUCERNIA, DDNames.SHORT_LUCERNIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "lucernia_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MOSSY_GLOWSHROOM, DDNames.SHORT_MOSSY_GLOWSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "mossy_glowshroom_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PYTHADENDRON, DDNames.SHORT_PYTHADENDRON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "pythadendron_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TENANEA, DDNames.SHORT_TENANEA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "tenanea_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_UMBRELLA_TREE, DDNames.SHORT_UMBRELLA_TREE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("betterend", "umbrella_tree_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERMINITE, new ResourceLocation("betterend", "terminite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TENANEA, new ResourceLocation("betterend", "tenanea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERMINITE, new ResourceLocation("betterend", "terminite_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TENANEA, new ResourceLocation("betterend", "tenanea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERMINITE, new ResourceLocation("betterend", "terminite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_THALLASIUM, new ResourceLocation("betterend", "thallasium_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DRAGON_TREE, new ResourceLocation("betterend", "dragon_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_END_LOTUS, new ResourceLocation("betterend", "end_lotus_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HELIX_TREE, new ResourceLocation("betterend", "helix_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JELLYSHROOM, new ResourceLocation("betterend", "jellyshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LACUGROVE, new ResourceLocation("betterend", "lacugrove_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LUCERNIA, new ResourceLocation("betterend", "lucernia_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MOSSY_GLOWSHROOM, new ResourceLocation("betterend", "mossy_glowshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PYTHADENDRON, new ResourceLocation("betterend", "pythadendron_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TENANEA, new ResourceLocation("betterend", "tenanea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_UMBRELLA_TREE, new ResourceLocation("betterend", "umbrella_tree_door"), "tall_wooden_door");
	}
}
