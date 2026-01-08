package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class EternalStarlightCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BANYIN, DDNames.SHORT_BANYIN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "banyin_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRADLEWOOD, DDNames.SHORT_CRADLEWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "cradlewood_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JINGLESTEM, DDNames.SHORT_JINGLESTEM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "jinglestem_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LUNAR, DDNames.SHORT_LUNAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "lunar_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NORTHLAND, DDNames.SHORT_NORTHLAND, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "northland_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCARLET, DDNames.SHORT_SCARLET, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "scarlet_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TORREYA, DDNames.SHORT_TORREYA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("eternal_starlight", "torreya_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BANYIN, new ResourceLocation("eternal_starlight", "banyin_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRADLEWOOD, new ResourceLocation("eternal_starlight", "cradlewood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_JINGLESTEM, new ResourceLocation("eternal_starlight", "jinglestem_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LUNAR, new ResourceLocation("eternal_starlight", "lunar_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NORTHLAND, new ResourceLocation("eternal_starlight", "northland_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCARLET, new ResourceLocation("eternal_starlight", "scarlet_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TORREYA, new ResourceLocation("eternal_starlight", "torreya_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BANYIN, new ResourceLocation("eternal_starlight", "banyin_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRADLEWOOD, new ResourceLocation("eternal_starlight", "cradlewood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_JINGLESTEM, new ResourceLocation("eternal_starlight", "jinglestem_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LUNAR, new ResourceLocation("eternal_starlight", "lunar_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NORTHLAND, new ResourceLocation("eternal_starlight", "northland_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCARLET, new ResourceLocation("eternal_starlight", "scarlet_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TORREYA, new ResourceLocation("eternal_starlight", "torreya_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BANYIN, new ResourceLocation("eternal_starlight", "banyin_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRADLEWOOD, new ResourceLocation("eternal_starlight", "cradlewood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JINGLESTEM, new ResourceLocation("eternal_starlight", "jinglestem_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LUNAR, new ResourceLocation("eternal_starlight", "lunar_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NORTHLAND, new ResourceLocation("eternal_starlight", "northland_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCARLET, new ResourceLocation("eternal_starlight", "scarlet_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TORREYA, new ResourceLocation("eternal_starlight", "torreya_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BANYIN, new ResourceLocation("eternal_starlight", "banyin_door"), "tall_eternal_starlight_door");	
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRADLEWOOD, new ResourceLocation("eternal_starlight", "cradlewood_door"), "tall_eternal_starlight_door");	
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_JINGLESTEM, new ResourceLocation("eternal_starlight", "jinglestem_door"), "tall_eternal_starlight_door");	
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LUNAR, new ResourceLocation("eternal_starlight", "lunar_door"), "tall_eternal_starlight_door");	
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NORTHLAND, new ResourceLocation("eternal_starlight", "northland_door"), "tall_eternal_starlight_door");	
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCARLET, new ResourceLocation("eternal_starlight", "scarlet_door"), "tall_eternal_starlight_door");	
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TORREYA, new ResourceLocation("eternal_starlight", "torreya_door"), "tall_eternal_starlight_door");	
	}
}
