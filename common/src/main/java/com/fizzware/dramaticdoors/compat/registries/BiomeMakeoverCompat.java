package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BiomeMakeoverCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_ANCIENT_OAK, DDNames.SHORT_BM_ANCIENT_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomemakeover", "ancient_oak_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_BLIGHTED_BALSA, DDNames.SHORT_BM_BLIGHTED_BALSA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomemakeover", "blighted_balsa_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_SWAMP_CYPRESS, DDNames.SHORT_BM_SWAMP_CYPRESS, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomemakeover", "swamp_cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BM_WILLOW, DDNames.SHORT_BM_WILLOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomemakeover", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BM_ANCIENT_OAK, ResourceLocation.fromNamespaceAndPath("biomemakeover", "ancient_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BM_BLIGHTED_BALSA, ResourceLocation.fromNamespaceAndPath("biomemakeover", "blighted_balsa_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BM_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("biomemakeover", "swamp_cypress_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BM_WILLOW, ResourceLocation.fromNamespaceAndPath("biomemakeover", "willow_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BM_ANCIENT_OAK, ResourceLocation.fromNamespaceAndPath("biomemakeover", "ancient_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BM_BLIGHTED_BALSA, ResourceLocation.fromNamespaceAndPath("biomemakeover", "blighted_balsa_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BM_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("biomemakeover", "swamp_cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BM_WILLOW, ResourceLocation.fromNamespaceAndPath("biomemakeover", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BM_ANCIENT_OAK, ResourceLocation.fromNamespaceAndPath("biomemakeover", "ancient_oak_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BM_BLIGHTED_BALSA, ResourceLocation.fromNamespaceAndPath("biomemakeover", "blighted_balsa_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BM_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("biomemakeover", "swamp_cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BM_WILLOW, ResourceLocation.fromNamespaceAndPath("biomemakeover", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BM_ANCIENT_OAK, ResourceLocation.fromNamespaceAndPath("biomemakeover", "ancient_oak_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BM_BLIGHTED_BALSA, ResourceLocation.fromNamespaceAndPath("biomemakeover", "blighted_balsa_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BM_SWAMP_CYPRESS, ResourceLocation.fromNamespaceAndPath("biomemakeover", "swamp_cypress_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BM_WILLOW, ResourceLocation.fromNamespaceAndPath("biomemakeover", "willow_door"), "tall_wooden_door");
	}
}
