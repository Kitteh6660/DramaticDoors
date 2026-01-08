package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PromenadeCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROMENADE_CHERRY_OAK, DDNames.SHORT_PROMENADE_CHERRY_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("promenade", "cherry_oak_door")), BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROMENADE_DARK_AMARANTH, DDNames.SHORT_PROMENADE_DARK_AMARANTH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("promenade", "dark_amaranth_door")), BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROMENADE_PALM, DDNames.SHORT_PROMENADE_PALM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("promenade", "palm_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROMENADE_CHERRY_OAK, new ResourceLocation("promenade", "cherry_oak_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROMENADE_DARK_AMARANTH, new ResourceLocation("promenade", "dark_amaranth_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROMENADE_PALM, new ResourceLocation("promenade", "palm_door"), "tall_wooden_door");
	}
}
