package com.fizzware.dramaticdoors;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortWeatheringDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallSlidingDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallStableDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallWeatheringDoorBlock;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;
import com.fizzware.dramaticdoors.state.properties.SlidingDoorType;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.WeatheringCopper.WeatherState;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class DDRegistry
{
	public static final List<Pair<String, Block>> DOOR_BLOCKS_TO_REGISTER = new ArrayList<Pair<String, Block>>();
	public static final List<Pair<String, Item>> DOOR_ITEMS_TO_REGISTER = new ArrayList<Pair<String, Item>>();
	
	public static final Item.Properties PROPERTIES = new Item.Properties();
	
	public static final ResourceKey<CreativeModeTab> MAIN_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "main_tab"));
	public static final ResourceKey<CreativeModeTab> CHIPPED_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "chipped_tab"));
	public static final ResourceKey<CreativeModeTab> MACAW_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "macaw_tab"));
	public static final ResourceKey<CreativeModeTab> MANYIDEAS_TAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation("dramaticdoors", "manyideas_tab"));
	
	public static void registerVanilla() {
		// Register iron door.
		if (Compats.IMMERSIVE_WEATHERING_INSTALLED) {
			Block shortIronDoor = new ShortWeatheringDoorBlock(Blocks.IRON_DOOR, BlockSetType.IRON, WeatherState.UNAFFECTED);
			Block tallIronDoor = new TallWeatheringDoorBlock(Blocks.IRON_DOOR, BlockSetType.IRON, WeatherState.UNAFFECTED);
			DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_IRON, shortIronDoor));
			DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_IRON, tallIronDoor));
			DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_IRON, new ShortDoorItem(shortIronDoor, DDRegistry.PROPERTIES)));
			DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_IRON, new TallDoorItem(tallIronDoor, DDRegistry.PROPERTIES)));
		}
		else {
			DDRegistry.registerDoorBlockAndItem(DDNames.TALL_IRON, DDNames.SHORT_IRON, Blocks.IRON_DOOR, BlockSetType.IRON, true);
		}
		// Register wooden doors.
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_OAK, DDNames.SHORT_OAK, Blocks.OAK_DOOR, BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRUCE, DDNames.SHORT_SPRUCE, Blocks.SPRUCE_DOOR, BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BIRCH, DDNames.SHORT_BIRCH, Blocks.BIRCH_DOOR, BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_JUNGLE, DDNames.SHORT_JUNGLE, Blocks.JUNGLE_DOOR, BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ACACIA, DDNames.SHORT_ACACIA, Blocks.ACACIA_DOOR, BlockSetType.ACACIA, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_DARK_OAK, DDNames.SHORT_DARK_OAK, Blocks.DARK_OAK_DOOR, BlockSetType.DARK_OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGROVE, DDNames.SHORT_MANGROVE, Blocks.MANGROVE_DOOR, BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CHERRY, DDNames.SHORT_CHERRY, Blocks.CHERRY_DOOR, BlockSetType.CHERRY, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BAMBOO, DDNames.SHORT_BAMBOO, Blocks.BAMBOO_DOOR, BlockSetType.BAMBOO, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRIMSON, DDNames.SHORT_CRIMSON, Blocks.CRIMSON_DOOR, BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WARPED, DDNames.SHORT_WARPED, Blocks.WARPED_DOOR, BlockSetType.WARPED, true);
		
		// Add sawmill recipes so Fabric stops complaining.
		if (Compats.isModLoaded("woodworks", Compats.modChecker) || Compats.isModLoaded("aurorasdeco", Compats.modChecker) || Compats.isModLoaded("sawmill", Compats.modChecker)) {
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_OAK, new ResourceLocation("minecraft", "oak_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRUCE, new ResourceLocation("minecraft", "spruce_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BIRCH, new ResourceLocation("minecraft", "birch_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_JUNGLE, new ResourceLocation("minecraft", "jungle_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ACACIA, new ResourceLocation("minecraft", "acacia_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_DARK_OAK, new ResourceLocation("minecraft", "dark_oak_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MANGROVE, new ResourceLocation("minecraft", "mangrove_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CHERRY, new ResourceLocation("minecraft", "cherry_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BAMBOO, new ResourceLocation("minecraft", "bamboo_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRIMSON, new ResourceLocation("minecraft", "crimson_door"), true);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WARPED, new ResourceLocation("minecraft", "warped_door"), true);
		}
	} 
	
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createDoorBlock(block, blocksettype, true);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerDoorBlockAndItem(String tallname, @Nullable String shortname, Properties properties, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createDoorBlock(properties, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createDoorBlock(properties, blocksettype, true);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerSlidingDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		registerSlidingDoorBlockAndItem(tallname, shortname, block, blocksettype, includeShort, SlidingDoorType.MACAW);
	}
	
	public static void registerSlidingDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort, SlidingDoorType type) {
		Block tempBlock;
		Item tempItem;
		if (includeShort) {
			tempBlock = createSlidingDoorBlock(block, blocksettype, false, type);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
		tempBlock = createSlidingDoorBlock(block, blocksettype, true, type);
		tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
	}
	
	public static void registerStableDoorBlockAndItem(String tallname, @Nullable String shortname, Block block, BlockSetType blocksettype, boolean includeShort) {
		Block tempBlock = createStableDoorBlock(block, blocksettype, true);
		Item tempItem = createDoorItem(tempBlock, true);
		DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(tallname, tempBlock));
		DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(tallname, tempItem));
		if (includeShort) {
			tempBlock = createStableDoorBlock(block, blocksettype, false);
			tempItem = createDoorItem(tempBlock, false);
			DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(shortname, tempBlock));
			DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(shortname, tempItem));
		}
	}
	
	/* Functions for creation of blocks and items. */
	protected static Block createDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		return isTall ? new TallDoorBlock(block, blocksettype) : new ShortDoorBlock(block, blocksettype);
	}
	
	protected static Block createDoorBlock(Properties properties, BlockSetType blocksettype, boolean isTall) {
		return isTall ? new TallDoorBlock(properties, blocksettype) : new ShortDoorBlock(properties, blocksettype);
	}
	
	protected static Item createDoorItem(Block block, boolean isTall) {
		return isTall ? new TallDoorItem(block, PROPERTIES) : new ShortDoorItem(block, PROPERTIES);
	}
	
	/* Functions for creating special doors from Macaw's Doors. */
	protected static Block createSlidingDoorBlock(Block block, BlockSetType blocksettype, boolean isTall, SlidingDoorType type) {
		if (!isTall) {
			throw new IllegalArgumentException("Short version of Macaw sliding doors are currently not supported.");
		}
		return isTall ? new TallSlidingDoorBlock(block, blocksettype, type) : null;
	}
	
	protected static Block createStableDoorBlock(Block block, BlockSetType blocksettype, boolean isTall) {
		if (!isTall) {
			throw new IllegalArgumentException("Short version of Macaw stable doors are currently not supported.");
		}
		return isTall ? new TallStableDoorBlock(block, blocksettype) : null;
	}
	
	/* Utility functions for getting blocks by key. */
	public static Block getBlockByKey(ResourceLocation loc) {
    	return getBlockByKey(loc, Blocks.OAK_DOOR);
    }
	
	public static Block getBlockByKey(ResourceLocation loc, Block fallback) {
		return BuiltInRegistries.BLOCK.containsKey(loc) ? BuiltInRegistries.BLOCK.get(loc) : fallback;
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource) {
    	return getBlockFromResourceLocation(resource, Blocks.OAK_DOOR);
    }
    
    public static Block getBlockFromResourceLocation(ResourceLocation resource, Block fallback) {
    	return BuiltInRegistries.BLOCK.getOptional(resource).orElse(fallback);
    }
}
