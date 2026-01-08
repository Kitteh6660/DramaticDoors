package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class TinkersConstructCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOODSHROOM, DDNames.SHORT_BLOODSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "bloodshroom_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GREENHEART, DDNames.SHORT_GREENHEART, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "greenheart_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SKYROOT, DDNames.SHORT_SKYROOT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tconstruct", "skyroot_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOODSHROOM, new ResourceLocation("tconstruct", "bloodshroom_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GREENHEART, new ResourceLocation("tconstruct", "greenheart_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SKYROOT, new ResourceLocation("tconstruct", "skyroot_door"), "tall_wooden_door");
	}
}
