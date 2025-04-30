package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BetterEndCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TERMINITE, DDNames.SHORT_TERMINITE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "terminite_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_THALLASIUM, DDNames.SHORT_THALLASIUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DRAGON_TREE, DDNames.SHORT_DRAGON_TREE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "dragon_tree_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_END_LOTUS, DDNames.SHORT_END_LOTUS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "end_lotus_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HELIX_TREE, DDNames.SHORT_HELIX_TREE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "helix_tree_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JELLYSHROOM, DDNames.SHORT_JELLYSHROOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "jellyshroom_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LACUGROVE, DDNames.SHORT_LACUGROVE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "lacugrove_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LUCERNIA, DDNames.SHORT_LUCERNIA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "lucernia_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MOSSY_GLOWSHROOM, DDNames.SHORT_MOSSY_GLOWSHROOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "mossy_glowshroom_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PYTHADENDRON, DDNames.SHORT_PYTHADENDRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "pythadendron_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TENANEA, DDNames.SHORT_TENANEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "tenanea_door")), BlockSetType.WARPED, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_UMBRELLA_TREE, DDNames.SHORT_UMBRELLA_TREE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("betterend", "umbrella_tree_door")), BlockSetType.WARPED, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TERMINITE, ResourceLocation.fromNamespaceAndPath("betterend", "terminite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_THALLASIUM, ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DRAGON_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "dragon_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_END_LOTUS, ResourceLocation.fromNamespaceAndPath("betterend", "end_lotus_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HELIX_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "helix_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JELLYSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "jellyshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LACUGROVE, ResourceLocation.fromNamespaceAndPath("betterend", "lacugrove_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LUCERNIA, ResourceLocation.fromNamespaceAndPath("betterend", "lucernia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MOSSY_GLOWSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "mossy_glowshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PYTHADENDRON, ResourceLocation.fromNamespaceAndPath("betterend", "pythadendron_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TENANEA, ResourceLocation.fromNamespaceAndPath("betterend", "tenanea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_UMBRELLA_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "umbrella_tree_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TERMINITE, ResourceLocation.fromNamespaceAndPath("betterend", "terminite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_THALLASIUM, ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DRAGON_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "dragon_tree_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_END_LOTUS, ResourceLocation.fromNamespaceAndPath("betterend", "end_lotus_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HELIX_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "helix_tree_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JELLYSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "jellyshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LACUGROVE, ResourceLocation.fromNamespaceAndPath("betterend", "lacugrove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LUCERNIA, ResourceLocation.fromNamespaceAndPath("betterend", "lucernia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MOSSY_GLOWSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "mossy_glowshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PYTHADENDRON, ResourceLocation.fromNamespaceAndPath("betterend", "pythadendron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TENANEA, ResourceLocation.fromNamespaceAndPath("betterend", "tenanea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_UMBRELLA_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "umbrella_tree_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TERMINITE, ResourceLocation.fromNamespaceAndPath("betterend", "terminite_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_THALLASIUM, ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DRAGON_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "dragon_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_END_LOTUS, ResourceLocation.fromNamespaceAndPath("betterend", "end_lotus_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HELIX_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "helix_tree_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JELLYSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "jellyshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LACUGROVE, ResourceLocation.fromNamespaceAndPath("betterend", "lacugrove_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LUCERNIA, ResourceLocation.fromNamespaceAndPath("betterend", "lucernia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MOSSY_GLOWSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "mossy_glowshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PYTHADENDRON, ResourceLocation.fromNamespaceAndPath("betterend", "pythadendron_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TENANEA, ResourceLocation.fromNamespaceAndPath("betterend", "tenanea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_UMBRELLA_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "umbrella_tree_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TERMINITE, ResourceLocation.fromNamespaceAndPath("betterend", "terminite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_THALLASIUM, ResourceLocation.fromNamespaceAndPath("betterend", "thallasium_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DRAGON_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "dragon_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_END_LOTUS, ResourceLocation.fromNamespaceAndPath("betterend", "end_lotus_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HELIX_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "helix_tree_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JELLYSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "jellyshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LACUGROVE, ResourceLocation.fromNamespaceAndPath("betterend", "lacugrove_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LUCERNIA, ResourceLocation.fromNamespaceAndPath("betterend", "lucernia_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MOSSY_GLOWSHROOM, ResourceLocation.fromNamespaceAndPath("betterend", "mossy_glowshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PYTHADENDRON, ResourceLocation.fromNamespaceAndPath("betterend", "pythadendron_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TENANEA, ResourceLocation.fromNamespaceAndPath("betterend", "tenanea_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_UMBRELLA_TREE, ResourceLocation.fromNamespaceAndPath("betterend", "umbrella_tree_door"), "tall_wooden_door");
	}
}
