package com.fizzware.dramaticdoors.neoforge;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blockentities.DDBlockEntities;
import com.fizzware.dramaticdoors.blockentities.TallNetheriteDoorBlockEntity;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.compat.registries.SupplementariesCompat;
import com.fizzware.dramaticdoors.neoforge.addons.create.TallNeoForgeCreateSlidingDoorBlockEntity;
import com.fizzware.dramaticdoors.neoforge.compat.CreateNeoForgeCompat;
import com.fizzware.dramaticdoors.registry.DDCreativeTabs;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.neoforge.registries.RegisterEvent;
import oshi.util.tuples.Pair;

public class DDNeoForgeRegistry
{
	@SubscribeEvent
	public static void registerBlocksItems(RegisterEvent event) {
		// Hook in compats.
		Compats.registerCompats(NeoforgeUtils.INSTANCE);
		if (Compats.isModLoaded("create", NeoforgeUtils.INSTANCE)) {
			CreateNeoForgeCompat.registerCompat();
		}
		// Register blocks.
		event.register(Registries.BLOCK, helper -> {
	        for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS) {
	        	helper.register(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
	        }
		});
		event.register(Registries.ITEM, helper -> {
	        for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
	        	helper.register(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, pair.getA()), pair.getB());
	        }
		});
		event.register(Registries.BLOCK_ENTITY_TYPE, helper -> {
			if (Compats.isModLoaded("supplementaries", NeoforgeUtils.INSTANCE)) {
				DDBlockEntities.TALL_NETHERITE_DOOR = BlockEntityType.Builder.of(TallNetheriteDoorBlockEntity::new, SupplementariesCompat.SHORT_NETHERITE_DOOR, SupplementariesCompat.TALL_NETHERITE_DOOR).build(null);
				helper.register(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "tall_netherite_door"), DDBlockEntities.TALL_NETHERITE_DOOR);
			}
			if (Compats.isModLoaded("create", NeoforgeUtils.INSTANCE)) {
				CreateNeoForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY = BlockEntityType.Builder.of(TallNeoForgeCreateSlidingDoorBlockEntity::new, CreateCompat.TALL_ANDESITE_DOOR, CreateCompat.TALL_BRASS_DOOR, CreateCompat.TALL_COPPER_DOOR, CreateCompat.TALL_FRAMED_GLASS_DOOR, CreateCompat.TALL_TRAIN_DOOR).build(null);
				helper.register(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, "tall_sliding_door"), CreateNeoForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY);
			}
		});
    	event.register(Registries.CREATIVE_MODE_TAB, helper -> {
    		helper.register(DDCreativeTabs.MAIN_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_OAK))); }).build());
    		if (NeoforgeUtils.INSTANCE.isModLoaded("chipped")) {
    			helper.register(DDCreativeTabs.CHIPPED_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors_chipped")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_CHIPPED_BIRCH_GATED))); }).build());
    		}
    		if (NeoforgeUtils.INSTANCE.isModLoaded("mcwdoors")) {
    			helper.register(DDCreativeTabs.MACAW_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors_macaw")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_MACAW_DARK_OAK_BARN))); }).build());
    		}
    		if (NeoforgeUtils.INSTANCE.isModLoaded("manyideas_doors")) {
    			helper.register(DDCreativeTabs.MANYIDEAS_TAB, CreativeModeTab.builder().title(Component.translatable("itemGroup.dramaticdoors_manyideas")).withTabsBefore(CreativeModeTabs.SPAWN_EGGS).icon(() -> { return new ItemStack(BuiltInRegistries.ITEM.get(ResourceLocation.fromNamespaceAndPath(DramaticDoors.MOD_ID, DDNames.TALL_MANYIDEAS_CRIMSON_BLANK))); }).build());
    		}
    	});
	}
}
