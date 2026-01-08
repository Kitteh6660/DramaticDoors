package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
//import com.fizzware.dramaticdoors.blocks.ShortLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.ShortNetheriteDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
//import com.fizzware.dramaticdoors.blocks.TallLeadDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallNetheriteDoorBlock;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.ShortDoorItem;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import oshi.util.tuples.Pair;

public class SupplementariesCompat
{
	public static final Block SHORT_GOLD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON) : null;
	//public static final Block SHORT_SILVER_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "silver_door")), BlockSetType.IRON) : null;
	//public static final Block SHORT_LEAD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortLeadDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "lead_door")), BlockSetType.IRON) : null;
	public static final Block SHORT_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new ShortNetheriteDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON) : null;
	public static final Block TALL_GOLD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "gold_door")), BlockSetType.IRON) : null;
	//public static final Block TALL_SILVER_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "silver_door")), BlockSetType.IRON) : null;
	//public static final Block TALL_LEAD_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallLeadDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "lead_door")), BlockSetType.IRON) : null;
	public static final Block TALL_NETHERITE_DOOR = Compats.SUPPLEMENTARIES_INSTALLED ? new TallNetheriteDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("supplementaries", "netherite_door")), BlockSetType.IRON) : null;
	
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_GOLD, SHORT_GOLD_DOOR));
    	//DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_SILVER, SHORT_SILVER_DOOR));
    	//DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_LEAD, SHORT_LEAD_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.SHORT_NETHERITE, SHORT_NETHERITE_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_GOLD, TALL_GOLD_DOOR));
    	//DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_SILVER, TALL_SILVER_DOOR));
    	//DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_LEAD, TALL_LEAD_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_NETHERITE, TALL_NETHERITE_DOOR));
    	
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_GOLD, new ShortDoorItem(SHORT_GOLD_DOOR, DDRegistry.PROPERTIES)));
    	//DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_SILVER, new ShortDoorItem(SHORT_SILVER_DOOR, DDRegistry.PROPERTIES)));
    	//DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_LEAD, new ShortDoorItem(SHORT_LEAD_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.SHORT_NETHERITE, new ShortDoorItem(SHORT_NETHERITE_DOOR, DDRegistry.PROPERTIES.fireResistant())));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_GOLD, new TallDoorItem(TALL_GOLD_DOOR, DDRegistry.PROPERTIES)));
    	//DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_SILVER, new TallDoorItem(TALL_SILVER_DOOR, DDRegistry.PROPERTIES)));
    	//DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_LEAD, new TallDoorItem(TALL_LEAD_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_NETHERITE, new TallDoorItem(TALL_NETHERITE_DOOR, DDRegistry.PROPERTIES.fireResistant())));
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GOLD, new ResourceLocation("supplementaries", "gold_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GOLD, new ResourceLocation("supplementaries", "gold_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"), false);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GOLD, new ResourceLocation("supplementaries", "gold_door"), "tall_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NETHERITE, new ResourceLocation("supplementaries", "netherite_door"), "tall_metal_door");
		
		/*if (checker.isModLoaded("forge")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SILVER, new ResourceLocation("supplementaries", "silver_door"), false);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LEAD, new ResourceLocation("supplementaries", "lead_door"), false);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SILVER, new ResourceLocation("supplementaries", "silver_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LEAD, new ResourceLocation("supplementaries", "lead_door"));
	
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SILVER, new ResourceLocation("supplementaries", "silver_door"), false);
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LEAD, new ResourceLocation("supplementaries", "lead_door"), false);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SILVER, new ResourceLocation("supplementaries", "silver_door"), "tall_metal_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LEAD, new ResourceLocation("supplementaries", "lead_door"), "tall_metal_door");
		}*/
	}
}
