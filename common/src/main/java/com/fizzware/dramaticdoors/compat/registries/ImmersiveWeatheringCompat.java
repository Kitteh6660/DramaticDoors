package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ImmersiveWeatheringCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerWeatheringDoorBlockAndItem(DDNames.TALL_EXPOSED_IRON, DDNames.SHORT_EXPOSED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true, WeatherState.EXPOSED);
		DDRegistry.registerWeatheringDoorBlockAndItem(DDNames.TALL_WEATHERED_IRON, DDNames.SHORT_WEATHERED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true, WeatherState.WEATHERED);
		DDRegistry.registerWeatheringDoorBlockAndItem(DDNames.TALL_RUSTED_IRON, DDNames.SHORT_RUSTED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true, WeatherState.OXIDIZED);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_IRON, DDNames.SHORT_WAXED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_EXPOSED_IRON, DDNames.SHORT_WAXED_EXPOSED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_WEATHERED_IRON, DDNames.SHORT_WAXED_WEATHERED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WAXED_RUSTED_IRON, DDNames.SHORT_WAXED_RUSTED_IRON, Blocks.IRON_DOOR.properties(), BlockSetType.IRON, true);
    }
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "exposed_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "weathered_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "rusted_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_exposed_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_weathered_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_rusted_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "exposed_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "weathered_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "rusted_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_exposed_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_weathered_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_rusted_iron_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "exposed_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "weathered_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "rusted_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_exposed_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_weathered_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_rusted_iron_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "exposed_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "weathered_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "rusted_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_exposed_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_weathered_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_RUSTED_IRON, ResourceLocation.fromNamespaceAndPath("immersive_weathering", "waxed_rusted_iron_door"), "tall_metal_door");
	}
}
