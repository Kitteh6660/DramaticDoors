package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AncientAetherCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AEROGEL_GLASS, DDNames.SHORT_AEROGEL_GLASS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ancient_aether", "aerogel_glass_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HIGHSPROOT, DDNames.SHORT_HIGHSPROOT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ancient_aether", "highsproot_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SAKURA, DDNames.SHORT_SAKURA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("ancient_aether", "sakura_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AEROGEL_GLASS, new ResourceLocation("ancient_aether", "aerogel_glass_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HIGHSPROOT, new ResourceLocation("ancient_aether", "highsproot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SAKURA, new ResourceLocation("ancient_aether", "sakura_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AEROGEL_GLASS, new ResourceLocation("ancient_aether", "aerogel_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HIGHSPROOT, new ResourceLocation("ancient_aether", "highsproot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SAKURA, new ResourceLocation("ancient_aether", "sakura_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AEROGEL_GLASS, new ResourceLocation("ancient_aether", "aerogel_glass_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HIGHSPROOT, new ResourceLocation("ancient_aether", "highsproot_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SAKURA, new ResourceLocation("ancient_aether", "sakura_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AEROGEL_GLASS, new ResourceLocation("ancient_aether", "aerogel_glass_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HIGHSPROOT, new ResourceLocation("ancient_aether", "highsproot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SAKURA, new ResourceLocation("ancient_aether", "sakura_door"), "tall_wooden_door");
	}
}
