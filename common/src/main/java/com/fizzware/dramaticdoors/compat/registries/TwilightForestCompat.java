package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TwilightForestCompat
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CANOPY, DDNames.SHORT_CANOPY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "canopy_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARKWOOD, DDNames.SHORT_DARKWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "dark_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TWILIGHT_MANGROVE, DDNames.SHORT_TWILIGHT_MANGROVE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "mangrove_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MINEWOOD, DDNames.SHORT_MINEWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "mining_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SORTINGWOOD, DDNames.SHORT_SORTINGWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "sorting_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TIMEWOOD, DDNames.SHORT_TIMEWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "time_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TRANSWOOD, DDNames.SHORT_TRANSWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "transformation_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TWILIGHT_OAK, DDNames.SHORT_TWILIGHT_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("twilightforest", "twilight_oak_door")), BlockSetType.OAK, true);
		if (Compats.isModLoaded("tflostblocks", checker)) {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_THORN, DDNames.SHORT_THORN, Properties.of().sound(SoundType.WOOD).strength(50.0F, 2000.0F).noOcclusion(), BlockSetType.OAK, true);
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TOWERWOOD, DDNames.SHORT_TOWERWOOD, Properties.of().sound(SoundType.WOOD).strength(40.0F, 6.0F).noOcclusion(), BlockSetType.OAK, true);
		}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CANOPY, ResourceLocation.fromNamespaceAndPath("twilightforest", "canopy_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DARKWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "dark_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TWILIGHT_MANGROVE, ResourceLocation.fromNamespaceAndPath("twilightforest", "mangrove_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MINEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "mining_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SORTINGWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "sorting_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TIMEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "time_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TRANSWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "transformation_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TWILIGHT_OAK, ResourceLocation.fromNamespaceAndPath("twilightforest", "twilight_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CANOPY, ResourceLocation.fromNamespaceAndPath("twilightforest", "canopy_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DARKWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "dark_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TWILIGHT_MANGROVE, ResourceLocation.fromNamespaceAndPath("twilightforest", "mangrove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MINEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "mining_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SORTINGWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "sorting_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TIMEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "time_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TRANSWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "transformation_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TWILIGHT_OAK, ResourceLocation.fromNamespaceAndPath("twilightforest", "twilight_oak_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CANOPY, ResourceLocation.fromNamespaceAndPath("twilightforest", "canopy_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARKWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "dark_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TWILIGHT_MANGROVE, ResourceLocation.fromNamespaceAndPath("twilightforest", "mangrove_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MINEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "mining_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SORTINGWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "sorting_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TIMEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "time_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TRANSWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "transformation_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TWILIGHT_OAK, ResourceLocation.fromNamespaceAndPath("twilightforest", "twilight_oak_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CANOPY, ResourceLocation.fromNamespaceAndPath("twilightforest", "canopy_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DARKWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "dark_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TWILIGHT_MANGROVE, ResourceLocation.fromNamespaceAndPath("twilightforest", "mangrove_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MINEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "mining_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SORTINGWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "sorting_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TIMEWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "time_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TRANSWOOD, ResourceLocation.fromNamespaceAndPath("twilightforest", "transformation_door"), "tall_tf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TWILIGHT_OAK, ResourceLocation.fromNamespaceAndPath("twilightforest", "twilight_oak_door"), "tall_tf_wooden_door");
		
		if (Compats.isModLoaded("tflostblocks", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_THORN, ResourceLocation.fromNamespaceAndPath("tflostblocks", "thorn_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_THORN, ResourceLocation.fromNamespaceAndPath("tflostblocks", "thorn_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TOWERWOOD, ResourceLocation.fromNamespaceAndPath("tflostblocks", "towerwood_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TOWERWOOD, ResourceLocation.fromNamespaceAndPath("tflostblocks", "towerwood_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_THORN, ResourceLocation.fromNamespaceAndPath("tflostblocks", "thorn_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_THORN, ResourceLocation.fromNamespaceAndPath("tflostblocks", "thorn_door"), "tall_tf_wooden_door");
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TOWERWOOD, ResourceLocation.fromNamespaceAndPath("tflostblocks", "towerwood_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TOWERWOOD, ResourceLocation.fromNamespaceAndPath("tflostblocks", "towerwood_door"), "tall_tf_wooden_door");
		}
	}
}
