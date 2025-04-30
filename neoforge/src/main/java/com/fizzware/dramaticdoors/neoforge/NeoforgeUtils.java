package com.fizzware.dramaticdoors.neoforge;

import java.nio.file.Path;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.config.DDConfigCommon;
import com.fizzware.dramaticdoors.registry.DDCreativeTabs;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab.TabVisibility;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.ModList;
import net.neoforged.fml.loading.FMLEnvironment;
import net.neoforged.fml.loading.LoadingModList;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import oshi.util.tuples.Pair;

public class NeoforgeUtils implements CompatChecker
{
	public static final NeoforgeUtils INSTANCE = new NeoforgeUtils();
	
	@Override
	public boolean isModLoaded(String modid) {
		if (LoadingModList.get().getModFileById(modid) != null) {
			return true;
		}
		return ModList.get().isLoaded(modid);
	}
	
	@Override
	public boolean isDev() {
		if (!FMLEnvironment.production) {
			return true;
		}
		return DDConfigCommon.devMode;
	}
    
	@Override
	public boolean isQuarkModuleEnabled() {
		return INSTANCE.isModLoaded("quark");
	}
	
    public static boolean getConfigBooleanValue(Path path, String variable) {
    	final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().build();
    	configData.load();
    	if (configData.get(variable) != null) {
    		return configData.get(variable);
    	}
    	else {
    		return false;
    	}
    }
    
    public static int getConfigIntValue(Path path, String variable) {
    	final CommentedFileConfig configData = CommentedFileConfig.builder(path).sync().build();
    	configData.load();
    	if (configData.get(variable) != null) {
    		return configData.get(variable);
    	}
    	else {
    		return 0;
    	}
    }
	
	@SubscribeEvent
    public static void assignItemsToTabs(BuildCreativeModeTabContentsEvent event) {
    	
    	// Insert into vanilla tabs.
    	if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
    		event.insertBefore(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.WAXED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.WAXED_EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.WAXED_WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.WAXED_OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.SPRUCE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_SPRUCE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.BIRCH_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_BIRCH)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.JUNGLE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_JUNGLE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.ACACIA_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_ACACIA)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.DARK_OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_DARK_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.MANGROVE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.CHERRY_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.BAMBOO_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.CRIMSON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_CRIMSON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.WARPED_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WARPED)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.WAXED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.WAXED_EXPOSED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_EXPOSED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.WAXED_WEATHERED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_WEATHERED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.WAXED_OXIDIZED_COPPER_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_OXIDIZED_COPPER)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.SPRUCE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_SPRUCE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.BIRCH_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_BIRCH)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.JUNGLE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_JUNGLE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.ACACIA_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_ACACIA)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.DARK_OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_DARK_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.MANGROVE_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_MANGROVE)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.CHERRY_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_CHERRY)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.BAMBOO_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_BAMBOO)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.CRIMSON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_CRIMSON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.WARPED_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WARPED)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	if (event.getTabKey() == CreativeModeTabs.REDSTONE_BLOCKS) {
    		event.insertBefore(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertBefore(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.IRON_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_IRON)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    		event.insertAfter(Items.OAK_DOOR.getDefaultInstance(), BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OAK)).getDefaultInstance(), TabVisibility.PARENT_TAB_ONLY);
    	}
    	// Insert into Dramatic Doors tabs.
    	if (event.getTabKey() == DDCreativeTabs.MAIN_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
	        	if (!(pair.getA().contains("chipped") || pair.getA().contains("macaw") || pair.getA().contains("manyideas"))) {
	        		event.accept(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDCreativeTabs.CHIPPED_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
	        	if (pair.getA().contains("chipped")) {
	        		event.accept(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDCreativeTabs.MACAW_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
	        	if (pair.getA().contains("macaw")) {
	        		event.accept(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    	if (event.getTabKey() == DDCreativeTabs.MANYIDEAS_TAB) {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
	        	if (pair.getA().contains("manyideas")) {
	        		event.accept(pair.getB().getDefaultInstance(), TabVisibility.PARENT_AND_SEARCH_TABS);
	        	}
	        }
    	}
    }
}
