package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.compat.Compats;
//import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.compat.registries.SupplementariesCompat;
import com.fizzware.dramaticdoors.registry.DDCreativeTabs;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;
//import com.fizzware.dramaticdoors.fabric.addons.create.TallFabricCreateSlidingDoorBlockEntity;
//import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;
import com.fizzware.dramaticdoors.tags.DDItemTags;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
//import net.minecraft.world.level.block.entity.BlockEntityType;
import oshi.util.tuples.Pair;

public class DDFabricRegistry
{
	
	public static void registerBlocksItems() {
		// Iterate through the blocks and items to register.
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS) {
			Registry.register(BuiltInRegistries.BLOCK, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
		}
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
			Registry.register(BuiltInRegistries.ITEM, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
		}
	}

	public static void registerBlockEntities() {
		if (Compats.isModLoaded("supplementaries", FabricUtils.INSTANCE)) {
			DDBlockEntities.TALL_NETHERITE_DOOR = BlockEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, SupplementariesCompat.SHORT_NETHERITE_DOOR, SupplementariesCompat.TALL_NETHERITE_DOOR).build();
			Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "tall_netherite_door"), DDBlockEntities.TALL_NETHERITE_DOOR);
		}
		/*if (Compats.isModLoaded("create", FabricUtils.INSTANCE)) {
			CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY = BlockEntityType.Builder.of(TallFabricCreateSlidingDoorBlockEntity::new, CreateCompat.TALL_ANDESITE_DOOR, CreateCompat.TALL_BRASS_DOOR, CreateCompat.TALL_COPPER_DOOR, CreateCompat.TALL_FRAMED_GLASS_DOOR, CreateCompat.TALL_TRAIN_DOOR).build(null);
			Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "tall_sliding_door"), CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY);
		}*/
	}

	public static void registerCreativeTabs() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDCreativeTabs.MAIN_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors")).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OAK))); }).build());
		if (Compats.isModLoaded("chipped", FabricUtils.INSTANCE)) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDCreativeTabs.CHIPPED_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_chipped")).icon(() -> {
				return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED)));
			}).build());
		}
		if (Compats.isModLoaded("mcwdoors", FabricUtils.INSTANCE)) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDCreativeTabs.MACAW_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_macaw")).icon(() -> {
				return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN)));
			}).build());
		}
		if (Compats.isModLoaded("manyideas_doors", FabricUtils.INSTANCE)) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDCreativeTabs.MANYIDEAS_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_manyideas")).icon(() -> {
				return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)));
			}).build());
		}
	}

	public static void registerWeatherables() {
		OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)));
		OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)));
		OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)));
		OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_COPPER)));
		OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_COPPER)));
		OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OXIDIZED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_OXIDIZED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_OXIDIZED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_EXPOSED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_WEATHERED_COPPER)));
		OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OXIDIZED_COPPER)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_OXIDIZED_COPPER)));
		if (Compats.isModLoaded("immersive_weathering", FabricUtils.INSTANCE)) {
			OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON)));
			OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON)));
			OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTED_IRON)));
			OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_IRON)));
			OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_IRON)));
			OxidizableBlocksRegistry.registerOxidizableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_RUSTED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_EXPOSED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_EXPOSED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WEATHERED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_WEATHERED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_RUSTED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.SHORT_WAXED_RUSTED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_EXPOSED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_EXPOSED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WEATHERED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_WEATHERED_IRON)));
			OxidizableBlocksRegistry.registerWaxableBlockPair(BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_RUSTED_IRON)), BuiltInRegistries.BLOCK.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_WAXED_RUSTED_IRON)));
		}
	}
	
	public static void registerFuels() {
		// Set up fuel. Only wooden doors can be used as fuel. Nether wood automatically excluded.
		FuelRegistry.INSTANCE.add(DDItemTags.TALL_WOODEN_DOORS, 300);
		FuelRegistry.INSTANCE.add(DDItemTags.SHORT_WOODEN_DOORS, 100);
	}
}
