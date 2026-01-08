package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BornInChaosCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MESH, DDNames.SHORT_MESH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("born_in_chaos_v1", "mesh_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCORCHED_PLANKS, DDNames.SHORT_SCORCHED_PLANKS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("born_in_chaos_v1", "scorched_planks_door")), BlockSetType.DARK_OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MESH, new ResourceLocation("born_in_chaos_v1", "mesh_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCORCHED_PLANKS, new ResourceLocation("born_in_chaos_v1", "scorched_planks_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MESH, new ResourceLocation("born_in_chaos_v1", "mesh_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCORCHED_PLANKS, new ResourceLocation("born_in_chaos_v1", "scorched_planks_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MESH, new ResourceLocation("born_in_chaos_v1", "mesh_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCORCHED_PLANKS, new ResourceLocation("born_in_chaos_v1", "scorched_planks_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MESH, new ResourceLocation("born_in_chaos_v1", "mesh_door"), "tall_misc_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCORCHED_PLANKS, new ResourceLocation("born_in_chaos_v1", "scorched_planks_door"), "tall_wooden_door");
	}
}
