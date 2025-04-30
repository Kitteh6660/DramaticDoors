package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortNetheriteDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallNetheriteDoorBlock;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class SupplementariesCompat
{
	public static final Block SHORT_GOLD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("supplementaries", "gold_door"))) : null;
	public static final Block SHORT_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortNetheriteDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("supplementaries", "netherite_door"))) : null;
	public static final Block TALL_GOLD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("supplementaries", "gold_door"))) : null;
	public static final Block TALL_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallNetheriteDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("supplementaries", "netherite_door"))) : null;
	
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
    	DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.SHORT_GOLD, SHORT_GOLD_DOOR));
    	DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.SHORT_NETHERITE, SHORT_NETHERITE_DOOR));
    	DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.TALL_GOLD, TALL_GOLD_DOOR));
    	DDRegistry.DOOR_BLOCKS.add(new Pair<String, Block>(DDNames.TALL_NETHERITE, TALL_NETHERITE_DOOR));
    	
    	DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.SHORT_GOLD, new BlockItem(SHORT_GOLD_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.SHORT_NETHERITE, new BlockItem(SHORT_NETHERITE_DOOR, DDRegistry.PROPERTIES.fireResistant())));
    	DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.TALL_GOLD, new BlockItem(TALL_GOLD_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS.add(new Pair<String, Item>(DDNames.TALL_NETHERITE, new BlockItem(TALL_NETHERITE_DOOR, DDRegistry.PROPERTIES.fireResistant())));
		/*if (checker.isModLoaded("forge")) {
    	    DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_SILVER, SHORT_SILVER_DOOR));
    	    DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_LEAD, SHORT_LEAD_DOOR));
	    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_SILVER, TALL_SILVER_DOOR));
	    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_LEAD, TALL_LEAD_DOOR));	
	    	
	    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_SILVER, new BlockItem(SHORT_SILVER_DOOR, DDRegistry.PROPERTIES)));
	    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_LEAD, new BlockItem(SHORT_LEAD_DOOR, DDRegistry.PROPERTIES)));
	    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_SILVER, new BlockItem(TALL_SILVER_DOOR, DDRegistry.PROPERTIES)));
	    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_LEAD, new BlockItem(TALL_LEAD_DOOR, DDRegistry.PROPERTIES)));
		}*/
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GOLD, ResourceLocation.fromNamespaceAndPath("supplementaries", "gold_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NETHERITE, ResourceLocation.fromNamespaceAndPath("supplementaries", "netherite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GOLD, ResourceLocation.fromNamespaceAndPath("supplementaries", "gold_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NETHERITE, ResourceLocation.fromNamespaceAndPath("supplementaries", "netherite_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GOLD, ResourceLocation.fromNamespaceAndPath("supplementaries", "gold_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NETHERITE, ResourceLocation.fromNamespaceAndPath("supplementaries", "netherite_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GOLD, ResourceLocation.fromNamespaceAndPath("supplementaries", "gold_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NETHERITE, ResourceLocation.fromNamespaceAndPath("supplementaries", "netherite_door"), "tall_metal_door");
		
		/*if (checker.isModLoaded("forge")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SILVER, ResourceLocation.fromNamespaceAndPath("supplementaries", "silver_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LEAD, ResourceLocation.fromNamespaceAndPath("supplementaries", "lead_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SILVER, ResourceLocation.fromNamespaceAndPath("supplementaries", "silver_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LEAD, ResourceLocation.fromNamespaceAndPath("supplementaries", "lead_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SILVER, ResourceLocation.fromNamespaceAndPath("supplementaries", "silver_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LEAD, ResourceLocation.fromNamespaceAndPath("supplementaries", "lead_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SILVER, ResourceLocation.fromNamespaceAndPath("supplementaries", "silver_door"), "tall_metal_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LEAD, ResourceLocation.fromNamespaceAndPath("supplementaries", "lead_door"), "tall_metal_door");
		}*/
	}
}
