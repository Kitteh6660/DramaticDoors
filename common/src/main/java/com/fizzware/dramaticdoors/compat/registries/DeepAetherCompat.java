package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class DeepAetherCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CONBERRY, DDNames.SHORT_CONBERRY, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("deep_aether", "conberry_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRUDEROOT, DDNames.SHORT_CRUDEROOT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("deep_aether", "cruderoot_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROSEROOT, DDNames.SHORT_ROSEROOT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("deep_aether", "roseroot_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SUNROOT, DDNames.SHORT_SUNROOT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("deep_aether", "sunroot_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_YAGROOT, DDNames.SHORT_YAGROOT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("deep_aether", "yagroot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CONBERRY, ResourceLocation.fromNamespaceAndPath("deep_aether", "conberry_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRUDEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "cruderoot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROSEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "roseroot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SUNROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "sunroot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_YAGROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "yagroot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CONBERRY, ResourceLocation.fromNamespaceAndPath("deep_aether", "conberry_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRUDEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "cruderoot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROSEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "roseroot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SUNROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "sunroot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_YAGROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "yagroot_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CONBERRY, ResourceLocation.fromNamespaceAndPath("deep_aether", "conberry_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRUDEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "cruderoot_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROSEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "roseroot_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SUNROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "sunroot_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_YAGROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "yagroot_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CONBERRY, ResourceLocation.fromNamespaceAndPath("deep_aether", "conberry_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRUDEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "cruderoot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROSEROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "roseroot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SUNROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "sunroot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_YAGROOT, ResourceLocation.fromNamespaceAndPath("deep_aether", "yagroot_door"), "tall_wooden_door");
	}
}
