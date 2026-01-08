package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class ImmersiveWeatheringCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		Block shortExposedIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "exposed_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWeatheredIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "weathered_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortRustedIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "oxidized_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block shortWaxedIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortWaxedExposedIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_exposed_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWaxedWeatheredIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_weathered_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortWaxedRustedIronDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_oxidized_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallExposedIronDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "exposed_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWeatheredIronDoor =  new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "weathered_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallRustedIronDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "oxidized_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallWaxedIronDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallWaxedExposedIronDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_exposed_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWaxedWeatheredIronDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_weathered_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallWaxedRustedIronDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("immersive_weathering", "waxed_oxidized_iron_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EXPOSED_IRON, shortExposedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WEATHERED_IRON, shortWeatheredIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_RUSTED_IRON, shortRustedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_IRON, shortWaxedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_EXPOSED_IRON, shortWaxedExposedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_WEATHERED_IRON, shortWaxedWeatheredIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_RUSTED_IRON, shortWaxedRustedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EXPOSED_IRON, tallExposedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WEATHERED_IRON, tallWeatheredIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_RUSTED_IRON, tallRustedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_IRON, tallWaxedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_EXPOSED_IRON, tallWaxedExposedIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_WEATHERED_IRON, tallWaxedWeatheredIronDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_RUSTED_IRON, tallWaxedRustedIronDoor));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EXPOSED_IRON, new ShortDoorItem(shortExposedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WEATHERED_IRON, new ShortDoorItem(shortWeatheredIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_RUSTED_IRON, new ShortDoorItem(shortRustedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_IRON, new ShortDoorItem(shortWaxedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_EXPOSED_IRON, new ShortDoorItem(shortWaxedExposedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_WEATHERED_IRON, new ShortDoorItem(shortWaxedWeatheredIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_RUSTED_IRON, new ShortDoorItem(shortWaxedRustedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EXPOSED_IRON, new TallDoorItem(tallExposedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WEATHERED_IRON, new TallDoorItem(tallWeatheredIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_RUSTED_IRON, new TallDoorItem(tallRustedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_IRON, new TallDoorItem(tallWaxedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_EXPOSED_IRON, new TallDoorItem(tallWaxedExposedIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_WEATHERED_IRON, new TallDoorItem(tallWaxedWeatheredIronDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_RUSTED_IRON, new TallDoorItem(tallWaxedRustedIronDoor, DDRegistry.PROPERTIES)));	
    }
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "exposed_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "weathered_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUSTED_IRON, new ResourceLocation("immersive_weathering", "rusted_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_IRON, new ResourceLocation("immersive_weathering", "waxed_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "waxed_exposed_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "waxed_weathered_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_RUSTED_IRON, new ResourceLocation("immersive_weathering", "waxed_rusted_iron_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "exposed_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "weathered_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUSTED_IRON, new ResourceLocation("immersive_weathering", "rusted_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_IRON, new ResourceLocation("immersive_weathering", "waxed_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "waxed_exposed_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "waxed_weathered_iron_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_RUSTED_IRON, new ResourceLocation("immersive_weathering", "waxed_rusted_iron_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "exposed_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "weathered_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUSTED_IRON, new ResourceLocation("immersive_weathering", "rusted_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_IRON, new ResourceLocation("immersive_weathering", "waxed_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "waxed_exposed_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "waxed_weathered_iron_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_RUSTED_IRON, new ResourceLocation("immersive_weathering", "waxed_rusted_iron_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "exposed_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "weathered_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUSTED_IRON, new ResourceLocation("immersive_weathering", "rusted_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_IRON, new ResourceLocation("immersive_weathering", "waxed_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_IRON, new ResourceLocation("immersive_weathering", "waxed_exposed_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_IRON, new ResourceLocation("immersive_weathering", "waxed_weathered_iron_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_RUSTED_IRON, new ResourceLocation("immersive_weathering", "waxed_rusted_iron_door"), "tall_metal_door");
	}
}
