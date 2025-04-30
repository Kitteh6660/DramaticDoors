package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

// Partially Implemented
public class MinestuckCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CARVED, DDNames.SHORT_CARVED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "carved_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CINDERED, DDNames.SHORT_CINDERED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "cindered_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRUXITE, DDNames.SHORT_CRUXITE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "cruxite_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DEAD, DDNames.SHORT_DEAD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "dead_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_END, DDNames.SHORT_END, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "end_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FROST, DDNames.SHORT_FROST, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "frost_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLOWING, DDNames.SHORT_GLOWING, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "glowing_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LACQUERED, DDNames.SHORT_LACQUERED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "lacquered_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PERFECTLY_GENERIC, DDNames.SHORT_PERFECTLY_GENERIC, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "perfectly_generic_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RAINBOW, DDNames.SHORT_RAINBOW, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "rainbow_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SHADEWOOD, DDNames.SHORT_SHADEWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "shadewood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TREATED, DDNames.SHORT_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "treated_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLOOD_ASPECT, DDNames.SHORT_BLOOD_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "blood_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BREATH_ASPECT, DDNames.SHORT_BREATH_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "breath_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DOOM_ASPECT, DDNames.SHORT_DOOM_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "doom_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEART_ASPECT, DDNames.SHORT_HEART_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "heart_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HOPE_ASPECT, DDNames.SHORT_HOPE_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "hope_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIFE_ASPECT, DDNames.SHORT_LIFE_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "life_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIGHT_ASPECT, DDNames.SHORT_LIGHT_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "light_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MIND_ASPECT, DDNames.SHORT_MIND_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "mind_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RAGE_ASPECT, DDNames.SHORT_RAGE_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "rage_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPACE_ASPECT, DDNames.SHORT_SPACE_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "space_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TIME_ASPECT, DDNames.SHORT_TIME_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "time_aspect_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_VOID_ASPECT, DDNames.SHORT_VOID_ASPECT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minestuck", "void_aspect_door")), BlockSetType.OAK, false);
	}
	
	private static void registerRecipes() {
		/*DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CARVED, ResourceLocation.fromNamespaceAndPath("minestuck", "carved_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CINDERED, ResourceLocation.fromNamespaceAndPath("minestuck", "cindered_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRUXITE, ResourceLocation.fromNamespaceAndPath("minestuck", "cruxite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DEAD, ResourceLocation.fromNamespaceAndPath("minestuck", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_END, ResourceLocation.fromNamespaceAndPath("minestuck", "end_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FROST, ResourceLocation.fromNamespaceAndPath("minestuck", "frost_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLOWING, ResourceLocation.fromNamespaceAndPath("minestuck", "glowing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LACQUERED, ResourceLocation.fromNamespaceAndPath("minestuck", "lacquered_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PERFECTLY_GENERIC, ResourceLocation.fromNamespaceAndPath("minestuck", "perfectly_generic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RAINBOW, ResourceLocation.fromNamespaceAndPath("minestuck", "rainbow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SHADEWOOD, ResourceLocation.fromNamespaceAndPath("minestuck", "shadewood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TREATED, ResourceLocation.fromNamespaceAndPath("minestuck", "treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLOOD_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "blood_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BREATH_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "breath_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_DOOM_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "doom_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEART_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "heart_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HOPE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "hope_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIFE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "life_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIGHT_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "light_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MIND_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "mind_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RAGE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "rage_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPACE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "space_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TIME_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "time_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_VOID_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "void_aspect_door"));*/
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CARVED, ResourceLocation.fromNamespaceAndPath("minestuck", "carved_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CINDERED, ResourceLocation.fromNamespaceAndPath("minestuck", "cindered_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRUXITE, ResourceLocation.fromNamespaceAndPath("minestuck", "cruxite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DEAD, ResourceLocation.fromNamespaceAndPath("minestuck", "dead_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_END, ResourceLocation.fromNamespaceAndPath("minestuck", "end_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FROST, ResourceLocation.fromNamespaceAndPath("minestuck", "frost_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLOWING, ResourceLocation.fromNamespaceAndPath("minestuck", "glowing_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LACQUERED, ResourceLocation.fromNamespaceAndPath("minestuck", "lacquered_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PERFECTLY_GENERIC, ResourceLocation.fromNamespaceAndPath("minestuck", "perfectly_generic_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RAINBOW, ResourceLocation.fromNamespaceAndPath("minestuck", "rainbow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SHADEWOOD, ResourceLocation.fromNamespaceAndPath("minestuck", "shadewood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TREATED, ResourceLocation.fromNamespaceAndPath("minestuck", "treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLOOD_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "blood_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BREATH_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "breath_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_DOOM_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "doom_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEART_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "heart_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HOPE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "hope_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIFE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "life_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIGHT_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "light_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MIND_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "mind_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RAGE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "rage_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SPACE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "space_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TIME_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "time_aspect_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_VOID_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "void_aspect_door"));
		
		/*DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CARVED, ResourceLocation.fromNamespaceAndPath("minestuck", "carved_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CINDERED, ResourceLocation.fromNamespaceAndPath("minestuck", "cindered_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRUXITE, ResourceLocation.fromNamespaceAndPath("minestuck", "cruxite_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DEAD, ResourceLocation.fromNamespaceAndPath("minestuck", "dead_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_END, ResourceLocation.fromNamespaceAndPath("minestuck", "end_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FROST, ResourceLocation.fromNamespaceAndPath("minestuck", "frost_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLOWING, ResourceLocation.fromNamespaceAndPath("minestuck", "glowing_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LACQUERED, ResourceLocation.fromNamespaceAndPath("minestuck", "lacquered_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PERFECTLY_GENERIC, ResourceLocation.fromNamespaceAndPath("minestuck", "perfectly_generic_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RAINBOW, ResourceLocation.fromNamespaceAndPath("minestuck", "rainbow_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SHADEWOOD, ResourceLocation.fromNamespaceAndPath("minestuck", "shadewood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TREATED, ResourceLocation.fromNamespaceAndPath("minestuck", "treated_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLOOD_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "blood_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BREATH_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "breath_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DOOM_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "doom_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEART_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "heart_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HOPE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "hope_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIFE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "life_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIGHT_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "light_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MIND_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "mind_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RAGE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "rage_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPACE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "space_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TIME_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "time_aspect_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_VOID_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "void_aspect_door"), true);*/
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CARVED, ResourceLocation.fromNamespaceAndPath("minestuck", "carved_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CINDERED, ResourceLocation.fromNamespaceAndPath("minestuck", "cindered_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRUXITE, ResourceLocation.fromNamespaceAndPath("minestuck", "cruxite_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DEAD, ResourceLocation.fromNamespaceAndPath("minestuck", "dead_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_END, ResourceLocation.fromNamespaceAndPath("minestuck", "end_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FROST, ResourceLocation.fromNamespaceAndPath("minestuck", "frost_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLOWING, ResourceLocation.fromNamespaceAndPath("minestuck", "glowing_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LACQUERED, ResourceLocation.fromNamespaceAndPath("minestuck", "lacquered_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PERFECTLY_GENERIC, ResourceLocation.fromNamespaceAndPath("minestuck", "perfectly_generic_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RAINBOW, ResourceLocation.fromNamespaceAndPath("minestuck", "rainbow_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SHADEWOOD, ResourceLocation.fromNamespaceAndPath("minestuck", "shadewood_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TREATED, ResourceLocation.fromNamespaceAndPath("minestuck", "treated_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLOOD_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "blood_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BREATH_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "breath_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_DOOM_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "doom_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEART_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "heart_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HOPE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "hope_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIFE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "life_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIGHT_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "light_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MIND_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "mind_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RAGE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "rage_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SPACE_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "space_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TIME_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "time_aspect_door"), "tall_minestuck_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_VOID_ASPECT, ResourceLocation.fromNamespaceAndPath("minestuck", "void_aspect_door"), "tall_minestuck_door");
	}
}
