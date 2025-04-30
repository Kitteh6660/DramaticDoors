package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BiomesOPlentyCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_DEAD, DDNames.SHORT_BOP_DEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "dead_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_EMPYREAL, DDNames.SHORT_BOP_EMPYREAL, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "empyreal_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_FIR, DDNames.SHORT_BOP_FIR, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_HELLBARK, DDNames.SHORT_BOP_HELLBARK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "hellbark_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_JACARANDA, DDNames.SHORT_BOP_JACARANDA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "jacaranda_door")), BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAGIC, DDNames.SHORT_BOP_MAGIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "magic_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAHOGANY, DDNames.SHORT_BOP_MAHOGANY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "mahogany_door")), BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_MAPLE, DDNames.SHORT_BOP_MAPLE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "maple_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_PALM, DDNames.SHORT_BOP_PALM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "palm_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_PINE, DDNames.SHORT_BOP_PINE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "pine_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_REDWOOD, DDNames.SHORT_BOP_REDWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "redwood_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_UMBRAN, DDNames.SHORT_BOP_UMBRAN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "umbran_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BOP_WILLOW, DDNames.SHORT_BOP_WILLOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("biomesoplenty", "willow_door")), BlockSetType.MANGROVE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_DEAD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "dead_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_EMPYREAL, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "empyreal_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_FIR, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_HELLBARK, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "hellbark_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_JACARANDA, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "jacaranda_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_MAGIC, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "magic_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_MAHOGANY, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "mahogany_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_MAPLE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "maple_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_PALM, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "palm_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_PINE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "pine_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_REDWOOD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "redwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_UMBRAN, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "umbran_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BOP_WILLOW, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "willow_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_DEAD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_EMPYREAL, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "empyreal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_FIR, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_HELLBARK, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "hellbark_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_JACARANDA, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "jacaranda_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_MAGIC, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "magic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_MAHOGANY, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_MAPLE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_PALM, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "palm_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_PINE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "pine_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_REDWOOD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_UMBRAN, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "umbran_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BOP_WILLOW, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "willow_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_DEAD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "dead_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_EMPYREAL, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "empyreal_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_FIR, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_HELLBARK, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "hellbark_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_JACARANDA, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "jacaranda_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_MAGIC, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "magic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_MAHOGANY, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "mahogany_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_MAPLE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_PALM, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "palm_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_PINE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "pine_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_REDWOOD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_UMBRAN, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "umbran_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BOP_WILLOW, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "willow_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_DEAD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "dead_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_EMPYREAL, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "empyreal_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_FIR, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "fir_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_HELLBARK, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "hellbark_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_JACARANDA, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "jacaranda_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_MAGIC, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "magic_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_MAHOGANY, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "mahogany_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_MAPLE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "maple_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_PALM, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "palm_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_PINE, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "pine_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_REDWOOD, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "redwood_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_UMBRAN, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "umbran_door"), "tall_bop_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BOP_WILLOW, ResourceLocation.fromNamespaceAndPath("biomesoplenty", "willow_door"), "tall_bop_wooden_door");
	}
}
