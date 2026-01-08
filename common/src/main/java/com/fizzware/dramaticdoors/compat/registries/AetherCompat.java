package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AetherCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AETHER_SKYROOT, DDNames.SHORT_AETHER_SKYROOT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether", "skyroot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AETHER_SKYROOT, new ResourceLocation("aether", "skyroot_door"), "tall_wooden_door");
	}
}
