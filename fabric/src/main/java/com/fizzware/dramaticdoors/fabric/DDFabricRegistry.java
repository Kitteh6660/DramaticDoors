package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.compat.registries.SupplementariesCompat;
import com.fizzware.dramaticdoors.fabric.addons.create.TallFabricCreateSlidingDoorBlockEntity;
import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;
import com.fizzware.dramaticdoors.tags.DDItemTags;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import oshi.util.tuples.Pair;

public class DDFabricRegistry
{
	
	public static void registerBlocksItems() {
		// Iterate through the blocks and items to register.
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
		}
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS_TO_REGISTER) {
			Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
		}
	}

	public static void registerBlockEntities() {
		if (Compats.isModLoaded("supplementaries", FabricUtils.INSTANCE)) {
			DDBlockEntities.TALL_NETHERITE_DOOR = FabricBlockEntityTypeBuilder.create(TallNetheriteDoorBlockEntity::new, SupplementariesCompat.SHORT_NETHERITE_DOOR, SupplementariesCompat.TALL_NETHERITE_DOOR).build();
			Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DramaticDoors.MOD_ID, "tall_netherite_door"), DDBlockEntities.TALL_NETHERITE_DOOR);
		}
		if (FabricLoader.getInstance().isModLoaded("create")) {
			if (Compats.isModLoaded("tfmg", FabricUtils.INSTANCE)) { // Might have to look into a better code eventually...
				CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY = BlockEntityType.Builder.of(TallFabricCreateSlidingDoorBlockEntity::new, CreateCompat.TALL_ANDESITE_DOOR, CreateCompat.TALL_BRASS_DOOR, CreateCompat.TALL_COPPER_DOOR, CreateCompat.TALL_FRAMED_GLASS_DOOR, CreateCompat.TALL_TRAIN_DOOR, CreateCompat.TALL_ALUMINUM_DOOR, CreateCompat.TALL_STEEL_DOOR, CreateCompat.TALL_HEAVY_CASING_DOOR, CreateCompat.TALL_HEAVY_PLATED_DOOR).build(null);
			}
			else {
				CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY = BlockEntityType.Builder.of(TallFabricCreateSlidingDoorBlockEntity::new, CreateCompat.TALL_ANDESITE_DOOR, CreateCompat.TALL_BRASS_DOOR, CreateCompat.TALL_COPPER_DOOR, CreateCompat.TALL_FRAMED_GLASS_DOOR, CreateCompat.TALL_TRAIN_DOOR).build(null);				
			}
			Registry.register(BuiltInRegistries.BLOCK_ENTITY_TYPE, new ResourceLocation(DramaticDoors.MOD_ID, "tall_sliding_door"), CreateFabricCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY);
		}
	}

	public static void registerCreativeTabs() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDRegistry.MAIN_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors")).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_OAK))); }).build());
		if (Compats.isModLoaded("chipped", FabricUtils.INSTANCE)) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDRegistry.CHIPPED_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_chipped")).icon(() -> {
				return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED)));
			}).build());
		}
		if (Compats.isModLoaded("mcwdoors", FabricUtils.INSTANCE)) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDRegistry.MACAW_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_macaw")).icon(() -> {
				return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN)));
			}).build());
		}
		if (Compats.isModLoaded("manyideas_doors", FabricUtils.INSTANCE)) {
			Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, DDRegistry.MANYIDEAS_TAB.location(), FabricItemGroup.builder().title(Component.translatable("itemGroup.dramaticdoors_manyideas")).icon(() -> {
				return new ItemStack(BuiltInRegistries.ITEM.get(new ResourceLocation(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK)));
			}).build());
		}
	}

	public static void registerFuels() {
		// Set up fuel. Only wooden doors can be used as fuel. Nether wood automatically excluded.
		FuelRegistry.INSTANCE.add(DDItemTags.TALL_WOODEN_DOORS, 300);
		FuelRegistry.INSTANCE.add(DDItemTags.SHORT_WOODEN_DOORS, 100);
	}
}
