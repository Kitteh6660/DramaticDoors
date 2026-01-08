package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class BlocksPlusCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_COPPER, DDNames.SHORT_BP_COPPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "copper_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_GOLDEN, DDNames.SHORT_BP_GOLDEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "golden_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_DIAMOND, DDNames.SHORT_BP_DIAMOND, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "diamond_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_EMERALD, DDNames.SHORT_BP_EMERALD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "emerald_door")), BlockSetType.IRON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BP_MUSHROOM, DDNames.SHORT_BP_MUSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "mushroom_door")), BlockSetType.WARPED, true);
		
		Block shortNetheriteDoor = new TallDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "netherite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
		Block tallNetheriteDoor = new TallDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("blocksplus", "netherite_door"), Blocks.IRON_DOOR), BlockSetType.IRON);
		
		DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_BP_NETHERITE, shortNetheriteDoor));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_BP_NETHERITE, tallNetheriteDoor));

    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_BP_NETHERITE, new ShortDoorItem(shortNetheriteDoor, DDRegistry.PROPERTIES.fireResistant())));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_BP_NETHERITE, new TallDoorItem(tallNetheriteDoor, DDRegistry.PROPERTIES.fireResistant())));
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_COPPER, new ResourceLocation("blocksplus", "copper_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_GOLDEN, new ResourceLocation("blocksplus", "golden_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_DIAMOND, new ResourceLocation("blocksplus", "diamond_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_EMERALD, new ResourceLocation("blocksplus", "emerald_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_NETHERITE, new ResourceLocation("blocksplus", "netherite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BP_MUSHROOM, new ResourceLocation("blocksplus", "mushroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_COPPER, new ResourceLocation("blocksplus", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_GOLDEN, new ResourceLocation("blocksplus", "golden_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_DIAMOND, new ResourceLocation("blocksplus", "diamond_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_EMERALD, new ResourceLocation("blocksplus", "emerald_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_NETHERITE, new ResourceLocation("blocksplus", "netherite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BP_MUSHROOM, new ResourceLocation("blocksplus", "mushroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_COPPER, new ResourceLocation("blocksplus", "copper_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_GOLDEN, new ResourceLocation("blocksplus", "golden_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_DIAMOND, new ResourceLocation("blocksplus", "diamond_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_EMERALD, new ResourceLocation("blocksplus", "emerald_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_NETHERITE, new ResourceLocation("blocksplus", "netherite_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BP_MUSHROOM, new ResourceLocation("blocksplus", "mushroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_COPPER, new ResourceLocation("blocksplus", "copper_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_GOLDEN, new ResourceLocation("blocksplus", "golden_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_DIAMOND, new ResourceLocation("blocksplus", "diamond_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_EMERALD, new ResourceLocation("blocksplus", "emerald_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_NETHERITE, new ResourceLocation("blocksplus", "netherite_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BP_MUSHROOM, new ResourceLocation("blocksplus", "mushroom_door"), "tall_wooden_door");
	}
}
