package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AetherGravitationCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AERFIN, DDNames.SHORT_AERFIN, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("gravitation", "aerfin_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BELADON, DDNames.SHORT_BELADON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("gravitation", "beladon_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ENCHANTED, DDNames.SHORT_ENCHANTED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("gravitation", "enchanted_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AERFIN, ResourceLocation.fromNamespaceAndPath("gravitation", "aerfin_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BELADON, ResourceLocation.fromNamespaceAndPath("gravitation", "beladon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ENCHANTED, ResourceLocation.fromNamespaceAndPath("gravitation", "enchanted_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AERFIN, ResourceLocation.fromNamespaceAndPath("gravitation", "aerfin_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BELADON, ResourceLocation.fromNamespaceAndPath("gravitation", "beladon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ENCHANTED, ResourceLocation.fromNamespaceAndPath("gravitation", "enchanted_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AERFIN, ResourceLocation.fromNamespaceAndPath("gravitation", "aerfin_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BELADON, ResourceLocation.fromNamespaceAndPath("gravitation", "beladon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ENCHANTED, ResourceLocation.fromNamespaceAndPath("gravitation", "enchanted_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AERFIN, ResourceLocation.fromNamespaceAndPath("gravitation", "aerfin_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BELADON, ResourceLocation.fromNamespaceAndPath("gravitation", "beladon_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ENCHANTED, ResourceLocation.fromNamespaceAndPath("gravitation", "enchanted_door"), "tall_wooden_door");
	}
}
