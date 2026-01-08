package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AllthemodiumCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ANCIENT, DDNames.SHORT_ANCIENT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("allthemodium", "ancient_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DEMONIC, DDNames.SHORT_DEMONIC, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("allthemodium", "demonic_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SOUL, DDNames.SHORT_SOUL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("allthemodium", "soul_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ANCIENT, new ResourceLocation("allthemodium", "ancient_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DEMONIC, new ResourceLocation("allthemodium", "demonic_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SOUL, new ResourceLocation("allthemodium", "soul_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ANCIENT, new ResourceLocation("allthemodium", "ancient_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DEMONIC, new ResourceLocation("allthemodium", "demonic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SOUL, new ResourceLocation("allthemodium", "soul_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ANCIENT, new ResourceLocation("allthemodium", "ancient_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DEMONIC, new ResourceLocation("allthemodium", "demonic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SOUL, new ResourceLocation("allthemodium", "soul_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ANCIENT, new ResourceLocation("allthemodium", "ancient_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DEMONIC, new ResourceLocation("allthemodium", "demonic_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SOUL, new ResourceLocation("allthemodium", "soul_door"), "tall_wooden_door");
	}
}
