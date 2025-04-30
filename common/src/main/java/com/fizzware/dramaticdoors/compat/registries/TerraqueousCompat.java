package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TerraqueousCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_LIGHT_CLOUD, DDNames.SHORT_TQ_LIGHT_CLOUD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "light_cloud_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_DENSE_CLOUD, DDNames.SHORT_TQ_DENSE_CLOUD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "dense_cloud_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_STORM_CLOUD, DDNames.SHORT_TQ_STORM_CLOUD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "storm_cloud_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_APPLE, DDNames.SHORT_TQ_APPLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "apple_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_BANANA, DDNames.SHORT_TQ_BANANA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "banana_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_CHERRY, DDNames.SHORT_TQ_CHERRY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "cherry_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_COCONUT, DDNames.SHORT_TQ_COCONUT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "coconut_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_LEMON, DDNames.SHORT_TQ_LEMON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "lemon_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_MANGO, DDNames.SHORT_TQ_MANGO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "mango_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_MULBERRY, DDNames.SHORT_TQ_MULBERRY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "mulberry_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_ORANGE, DDNames.SHORT_TQ_ORANGE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "orange_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_PEACH, DDNames.SHORT_TQ_PEACH, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "peach_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_PEAR, DDNames.SHORT_TQ_PEAR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "pear_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TQ_PLUM, DDNames.SHORT_TQ_PLUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("terraqueous", "plum_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_LIGHT_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "light_cloud_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_DENSE_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "dense_cloud_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_STORM_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "storm_cloud_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_APPLE, ResourceLocation.fromNamespaceAndPath("terraqueous", "apple_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_BANANA, ResourceLocation.fromNamespaceAndPath("terraqueous", "banana_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_CHERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "cherry_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_COCONUT, ResourceLocation.fromNamespaceAndPath("terraqueous", "coconut_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_LEMON, ResourceLocation.fromNamespaceAndPath("terraqueous", "lemon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_MANGO, ResourceLocation.fromNamespaceAndPath("terraqueous", "mango_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_MULBERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "mulberry_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_ORANGE, ResourceLocation.fromNamespaceAndPath("terraqueous", "orange_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_PEACH, ResourceLocation.fromNamespaceAndPath("terraqueous", "peach_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_PEAR, ResourceLocation.fromNamespaceAndPath("terraqueous", "pear_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TQ_PLUM, ResourceLocation.fromNamespaceAndPath("terraqueous", "plum_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_LIGHT_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "light_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_DENSE_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "dense_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_STORM_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "storm_cloud_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_APPLE, ResourceLocation.fromNamespaceAndPath("terraqueous", "apple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_BANANA, ResourceLocation.fromNamespaceAndPath("terraqueous", "banana_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_CHERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "cherry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_COCONUT, ResourceLocation.fromNamespaceAndPath("terraqueous", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_LEMON, ResourceLocation.fromNamespaceAndPath("terraqueous", "lemon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_MANGO, ResourceLocation.fromNamespaceAndPath("terraqueous", "mango_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_MULBERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "mulberry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_ORANGE, ResourceLocation.fromNamespaceAndPath("terraqueous", "orange_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_PEACH, ResourceLocation.fromNamespaceAndPath("terraqueous", "peach_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_PEAR, ResourceLocation.fromNamespaceAndPath("terraqueous", "pear_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TQ_PLUM, ResourceLocation.fromNamespaceAndPath("terraqueous", "plum_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_LIGHT_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_DENSE_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_STORM_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "ebony_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_APPLE, ResourceLocation.fromNamespaceAndPath("terraqueous", "apple_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_BANANA, ResourceLocation.fromNamespaceAndPath("terraqueous", "banana_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_CHERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "cherry_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_COCONUT, ResourceLocation.fromNamespaceAndPath("terraqueous", "coconut_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_LEMON, ResourceLocation.fromNamespaceAndPath("terraqueous", "lemon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_MANGO, ResourceLocation.fromNamespaceAndPath("terraqueous", "mango_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_MULBERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "mulberry_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_ORANGE, ResourceLocation.fromNamespaceAndPath("terraqueous", "orange_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_PEACH, ResourceLocation.fromNamespaceAndPath("terraqueous", "peach_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_PEAR, ResourceLocation.fromNamespaceAndPath("terraqueous", "pear_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TQ_PLUM, ResourceLocation.fromNamespaceAndPath("terraqueous", "plum_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_LIGHT_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "azalea_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_DENSE_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "ebony_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_STORM_CLOUD, ResourceLocation.fromNamespaceAndPath("terraqueous", "ebony_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_APPLE, ResourceLocation.fromNamespaceAndPath("terraqueous", "apple_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_BANANA, ResourceLocation.fromNamespaceAndPath("terraqueous", "banana_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_CHERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "cherry_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_COCONUT, ResourceLocation.fromNamespaceAndPath("terraqueous", "coconut_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_LEMON, ResourceLocation.fromNamespaceAndPath("terraqueous", "lemon_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_MANGO, ResourceLocation.fromNamespaceAndPath("terraqueous", "mango_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_MULBERRY, ResourceLocation.fromNamespaceAndPath("terraqueous", "mulberry_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_ORANGE, ResourceLocation.fromNamespaceAndPath("terraqueous", "orange_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_PEACH, ResourceLocation.fromNamespaceAndPath("terraqueous", "peach_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_PEAR, ResourceLocation.fromNamespaceAndPath("terraqueous", "pear_door"), "tall_tq_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TQ_PLUM, ResourceLocation.fromNamespaceAndPath("terraqueous", "plum_door"), "tall_tq_wooden_door");

	}
}
