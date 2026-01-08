package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringDoorBlock;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
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

public class TrickyTrialsBackportCompat 
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
		Block shortCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortExposedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "exposed_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWeatheredCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "weathered_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortOxidizedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "oxidized_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block shortWaxedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block shortWaxedExposedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_exposed_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.EXPOSED);
		Block shortWaxedWeatheredCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_weathered_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.WEATHERED);
		Block shortWaxedOxidizedCopperDoor = new ShortWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_oxidized_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallExposedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "exposed_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWeatheredCopperDoor =  new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "weathered_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallOxidizedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "oxidized_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.OXIDIZED);
		Block tallWaxedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.UNAFFECTED);
		Block tallWaxedExposedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_exposed_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.EXPOSED);
		Block tallWaxedWeatheredCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_weathered_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.WEATHERED);
		Block tallWaxedOxidizedCopperDoor = new TallWeatheringDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tricky_trials", "waxed_oxidized_copper_door"), Blocks.COPPER_BLOCK), BlockSetType.IRON, WeatherState.OXIDIZED);
		
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_COPPER, shortCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_EXPOSED_COPPER, shortExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WEATHERED_COPPER, shortWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_OXIDIZED_COPPER, shortOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_COPPER, shortWaxedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_EXPOSED_COPPER, shortWaxedExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_WEATHERED_COPPER, shortWaxedWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_WAXED_OXIDIZED_COPPER, shortWaxedOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_COPPER, tallCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_EXPOSED_COPPER, tallExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WEATHERED_COPPER, tallWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_OXIDIZED_COPPER, tallOxidizedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_COPPER, tallWaxedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_EXPOSED_COPPER, tallWaxedExposedCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_WEATHERED_COPPER, tallWaxedWeatheredCopperDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_WAXED_OXIDIZED_COPPER, tallWaxedOxidizedCopperDoor));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_COPPER, new ShortDoorItem(shortCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_EXPOSED_COPPER, new ShortDoorItem(shortExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WEATHERED_COPPER, new ShortDoorItem(shortWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_OXIDIZED_COPPER, new ShortDoorItem(shortOxidizedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_COPPER, new ShortDoorItem(shortWaxedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ShortDoorItem(shortWaxedExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ShortDoorItem(shortWaxedWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ShortDoorItem(shortWaxedOxidizedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_COPPER, new TallDoorItem(tallCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_EXPOSED_COPPER, new TallDoorItem(tallExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WEATHERED_COPPER, new TallDoorItem(tallWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_OXIDIZED_COPPER, new TallDoorItem(tallOxidizedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_COPPER, new TallDoorItem(tallWaxedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_EXPOSED_COPPER, new TallDoorItem(tallWaxedExposedCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_WEATHERED_COPPER, new TallDoorItem(tallWaxedWeatheredCopperDoor, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_WAXED_OXIDIZED_COPPER, new TallDoorItem(tallWaxedOxidizedCopperDoor, DDRegistry.PROPERTIES)));

	}
	
	private static void registerRecipes(CompatChecker checker) {
		if (Compats.isModLoaded("tricky_trials", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_COPPER, new ResourceLocation("tricky_trials", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("tricky_trials", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "waxed_exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "waxed_weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "waxed_oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_COPPER, new ResourceLocation("tricky_trials", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_COPPER, new ResourceLocation("tricky_trials", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "waxed_exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "waxed_weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "waxed_oxidized_copper_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_COPPER, new ResourceLocation("tricky_trials", "copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "exposed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "weathered_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "oxidized_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("tricky_trials", "waxed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "waxed_exposed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "waxed_weathered_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "waxed_oxidized_copper_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_COPPER, new ResourceLocation("tricky_trials", "copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "exposed_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "weathered_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "oxidized_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_COPPER, new ResourceLocation("tricky_trials", "copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("tricky_trials", "waxed_exposed_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("tricky_trials", "waxed_weathered_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("tricky_trials", "waxed_oxidized_copper_door"), "tall_waxed_copper_door");
		}
		if (Compats.isModLoaded("trials", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_COPPER, new ResourceLocation("trials", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("trials", "copper_door_exposed"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("trials", "copper_door_weathered"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("trials", "copper_door_oxidized"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("trials", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("trials", "waxed_copper_door_exposed"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("trials", "waxed_copper_door_weathered"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("trials", "waxed_copper_door_oxidized"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_COPPER, new ResourceLocation("trials", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("trials", "copper_door_exposed"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("trials", "copper_door_weathered"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("trials", "copper_door_oxidized"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_COPPER, new ResourceLocation("trials", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("trials", "waxed_copper_door_exposed"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("trials", "waxed_copper_door_weathered"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("trials", "waxed_copper_door_oxidized"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_COPPER, new ResourceLocation("trials", "copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("trials", "copper_door_exposed"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("trials", "copper_door_weathered"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("trials", "copper_door_oxidized"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("trials", "waxed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("trials", "waxed_copper_door_exposed"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("trials", "waxed_copper_door_weathered"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("trials", "waxed_copper_door_oxidized"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_COPPER, new ResourceLocation("trials", "copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("trials", "copper_door_exposed"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("trials", "copper_door_weathered"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("trials", "copper_door_oxidized"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_COPPER, new ResourceLocation("trials", "waxed_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("trials", "waxed_copper_door_exposed"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("trials", "waxed_copper_door_weathered"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("trials", "waxed_copper_door_oxidized"), "tall_waxed_copper_door");
		}
		if (Compats.isModLoaded("copperandtuffbackport", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_COPPER, new ResourceLocation("copperandtuffbackport", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_COPPER, new ResourceLocation("copperandtuffbackport", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_oxidized_copper_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_COPPER, new ResourceLocation("copperandtuffbackport", "copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "exposed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "weathered_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "oxidized_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_exposed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_weathered_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_oxidized_copper_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_COPPER, new ResourceLocation("copperandtuffbackport", "copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "exposed_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "weathered_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "oxidized_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_COPPER, new ResourceLocation("copperandtuffbackport", "copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_exposed_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_weathered_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("copperandtuffbackport", "waxed_oxidized_copper_door"), "tall_waxed_copper_door");
		}
		if (Compats.isModLoaded("minecraft_121_update", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_COPPER, new ResourceLocation("minecraft_121_update", "copperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "exposedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "weatheredcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "oxidizedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("minecraft_121_update", "waxedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "waxedexposedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "waxedweatheredcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "waxedoxidizedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_COPPER, new ResourceLocation("minecraft_121_update", "copperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "exposedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "weatheredcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "oxidizedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_COPPER, new ResourceLocation("minecraft_121_update", "waxedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "waxedexposedcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "waxedweatheredcopperdoor"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "waxedoxidizedcopperdoor"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_COPPER, new ResourceLocation("minecraft_121_update", "copperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "exposedcopperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "weatheredcopperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "oxidizedcopperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("minecraft_121_update", "waxedcopperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "waxedexposedcopperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "waxedweatheredcopperdoor"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "waxedoxidizedcopperdoor"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_COPPER, new ResourceLocation("minecraft_121_update", "copperdoor"), "tallcopperdoor");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "exposedcopperdoor"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "weatheredcopperdoor"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "oxidizedcopperdoor"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_COPPER, new ResourceLocation("minecraft_121_update", "copperdoor"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("minecraft_121_update", "waxedexposedcopperdoor"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("minecraft_121_update", "waxedweatheredcopperdoor"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("minecraft_121_update", "waxedoxidizedcopperdoor"), "tall_waxed_copper_door");
		}
		/*if (Compats.isModLoaded("vanillabackport", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_COPPER, new ResourceLocation("vanillabackport", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("vanillabackport", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "waxed_exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "waxed_weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "waxed_oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_COPPER, new ResourceLocation("vanillabackport", "copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "oxidized_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_COPPER, new ResourceLocation("vanillabackport", "waxed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "waxed_exposed_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "waxed_weathered_copper_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "waxed_oxidized_copper_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_COPPER, new ResourceLocation("vanillabackport", "copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "exposed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "weathered_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "oxidized_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_COPPER, new ResourceLocation("vanillabackport", "waxed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "waxed_exposed_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "waxed_weathered_copper_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WAXED_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "waxed_oxidized_copper_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_COPPER, new ResourceLocation("vanillabackport", "copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "exposed_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "weathered_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "oxidized_copper_door"), "tall_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_COPPER, new ResourceLocation("vanillabackport", "copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_EXPOSED_COPPER, new ResourceLocation("vanillabackport", "waxed_exposed_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_WEATHERED_COPPER, new ResourceLocation("vanillabackport", "waxed_weathered_copper_door"), "tall_waxed_copper_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WAXED_OXIDIZED_COPPER, new ResourceLocation("vanillabackport", "waxed_oxidized_copper_door"), "tall_waxed_copper_door");
		}*/
	}
}
