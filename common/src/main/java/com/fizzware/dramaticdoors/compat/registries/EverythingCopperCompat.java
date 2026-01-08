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

public class EverythingCopperCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		Block shortCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortExposedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWeatheredCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortOxidizedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block shortWaxedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortWaxedExposedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWaxedWeatheredCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortWaxedOxidizedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallExposedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWeatheredCopperDoor =  new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallOxidizedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallWaxedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallWaxedExposedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWaxedWeatheredCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallWaxedOxidizedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, WeatherState.OXIDIZED);
		
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_COPPER, shortCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_EXPOSED_COPPER, shortExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WEATHERED_COPPER, shortWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_OXIDIZED_COPPER, shortOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_COPPER, shortWaxedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, shortWaxedExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, shortWaxedWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, shortWaxedOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_COPPER, tallCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_EXPOSED_COPPER, tallExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WEATHERED_COPPER, tallWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_OXIDIZED_COPPER, tallOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_COPPER, tallWaxedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, tallWaxedExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, tallWaxedWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, tallWaxedOxidizedCopperDoor));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_COPPER, new ShortDoorItem(shortCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_EXPOSED_COPPER, new ShortDoorItem(shortExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WEATHERED_COPPER, new ShortDoorItem(shortWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_OXIDIZED_COPPER, new ShortDoorItem(shortOxidizedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_COPPER, new ShortDoorItem(shortWaxedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ShortDoorItem(shortWaxedExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ShortDoorItem(shortWaxedWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ShortDoorItem(shortWaxedOxidizedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_COPPER, new TallDoorItem(tallCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_EXPOSED_COPPER, new TallDoorItem(tallExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WEATHERED_COPPER, new TallDoorItem(tallWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_OXIDIZED_COPPER, new TallDoorItem(tallOxidizedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_COPPER, new TallDoorItem(tallWaxedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new TallDoorItem(tallWaxedExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new TallDoorItem(tallWaxedWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new TallDoorItem(tallWaxedOxidizedCopperDoor, DDRegistry.PROPERTIES)));

	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "waxed_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "waxed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "waxed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_COPPER, new ResourceLocation("everythingcopper", "copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "exposed_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "weathered_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "oxidized_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_WAXED_COPPER, new ResourceLocation("everythingcopper", "copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, new ResourceLocation("everythingcopper", "waxed_exposed_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, new ResourceLocation("everythingcopper", "waxed_weathered_copper_door"), "tall_copper_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, new ResourceLocation("everythingcopper", "waxed_oxidized_copper_door"), "tall_copper_door");
	}
}
