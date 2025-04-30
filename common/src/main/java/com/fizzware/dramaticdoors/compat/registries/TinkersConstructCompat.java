package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TinkersConstructCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOODSHROOM, DDNames.SHORT_BLOODSHROOM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GREENHEART, DDNames.SHORT_GREENHEART, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("tconstruct", "greenheart_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SKYROOT, DDNames.SHORT_SKYROOT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("tconstruct", "skyroot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOODSHROOM, ResourceLocation.fromNamespaceAndPath("tconstruct", "bloodshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GREENHEART, ResourceLocation.fromNamespaceAndPath("tconstruct", "greenheart_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SKYROOT, ResourceLocation.fromNamespaceAndPath("tconstruct", "skyroot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOODSHROOM, ResourceLocation.fromNamespaceAndPath("tconstruct", "bloodshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GREENHEART, ResourceLocation.fromNamespaceAndPath("tconstruct", "greenheart_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SKYROOT, ResourceLocation.fromNamespaceAndPath("tconstruct", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOODSHROOM, ResourceLocation.fromNamespaceAndPath("tconstruct", "bloodshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GREENHEART, ResourceLocation.fromNamespaceAndPath("tconstruct", "greenheart_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SKYROOT, ResourceLocation.fromNamespaceAndPath("tconstruct", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOODSHROOM, ResourceLocation.fromNamespaceAndPath("tconstruct", "bloodshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GREENHEART, ResourceLocation.fromNamespaceAndPath("tconstruct", "greenheart_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SKYROOT, ResourceLocation.fromNamespaceAndPath("tconstruct", "skyroot_door"), "tall_wooden_door");
	}
}
