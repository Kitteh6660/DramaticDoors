package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.blocks.TallCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.items.TallDoorItem;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import oshi.util.tuples.Pair;

public class CreateCompat
{
	public static boolean initialized = false;
	
	public static TallCreateSlidingDoorBlock TALL_ANDESITE_DOOR;
	public static TallCreateSlidingDoorBlock TALL_BRASS_DOOR;
	public static TallCreateSlidingDoorBlock TALL_COPPER_DOOR;
	public static TallCreateSlidingDoorBlock TALL_FRAMED_GLASS_DOOR;
	public static TallCreateSlidingDoorBlock TALL_TRAIN_DOOR;
	
	public static TallCreateSlidingDoorBlock TALL_ALUMINUM_DOOR;
	public static TallCreateSlidingDoorBlock TALL_STEEL_DOOR;
	public static TallCreateSlidingDoorBlock TALL_HEAVY_CASING_DOOR;
	public static TallCreateSlidingDoorBlock TALL_HEAVY_PLATED_DOOR;
	
	public static void registerCompat(CompatChecker checker) {
		if (initialized) {
			return;
		}
		initialized = true;
		registerBlocksItems(checker);
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems(CompatChecker checker) {
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_ANDESITE, CreateCompat.TALL_ANDESITE_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_BRASS, CreateCompat.TALL_BRASS_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_COPPER, CreateCompat.TALL_COPPER_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_FRAMED_GLASS, CreateCompat.TALL_FRAMED_GLASS_DOOR));
    	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_CREATE_TRAIN, CreateCompat.TALL_TRAIN_DOOR));

    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_ANDESITE, new TallDoorItem(CreateCompat.TALL_ANDESITE_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_BRASS, new TallDoorItem(CreateCompat.TALL_BRASS_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_COPPER, new TallDoorItem(CreateCompat.TALL_COPPER_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_FRAMED_GLASS, new TallDoorItem(CreateCompat.TALL_FRAMED_GLASS_DOOR, DDRegistry.PROPERTIES)));
    	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_CREATE_TRAIN, new TallDoorItem(CreateCompat.TALL_TRAIN_DOOR, DDRegistry.PROPERTIES)));
    	if (Compats.isModLoaded("tfmg", checker)) {
        	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_TFMG_ALUMINUM, CreateCompat.TALL_ALUMINUM_DOOR));
        	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_TFMG_STEEL, CreateCompat.TALL_STEEL_DOOR));
        	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_TFMG_HEAVY_CASING, CreateCompat.TALL_HEAVY_CASING_DOOR));    		
        	DDRegistry.DOOR_BLOCKS_TO_REGISTER.add(new Pair<String, Block>(DDNames.TALL_TFMG_HEAVY_PLATED, CreateCompat.TALL_HEAVY_PLATED_DOOR));

        	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_TFMG_ALUMINUM, new TallDoorItem(CreateCompat.TALL_ALUMINUM_DOOR, DDRegistry.PROPERTIES)));
        	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_TFMG_STEEL, new TallDoorItem(CreateCompat.TALL_STEEL_DOOR, DDRegistry.PROPERTIES)));
        	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_TFMG_HEAVY_CASING, new TallDoorItem(CreateCompat.TALL_HEAVY_CASING_DOOR, DDRegistry.PROPERTIES)));
        	DDRegistry.DOOR_ITEMS_TO_REGISTER.add(new Pair<String, Item>(DDNames.TALL_TFMG_HEAVY_PLATED, new TallDoorItem(CreateCompat.TALL_HEAVY_PLATED_DOOR, DDRegistry.PROPERTIES)));
    	}
	}
	
	private static void registerRecipes(CompatChecker checker) {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_ANDESITE, new ResourceLocation("create", "andesite_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_BRASS, new ResourceLocation("create", "brass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_COPPER, new ResourceLocation("create", "copper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_FRAMED_GLASS, new ResourceLocation("create", "framed_glass_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CREATE_TRAIN, new ResourceLocation("create", "train_door"));
		
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_ANDESITE, new ResourceLocation("create", "andesite_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_BRASS, new ResourceLocation("create", "brass_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_COPPER, new ResourceLocation("create", "copper_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_FRAMED_GLASS, new ResourceLocation("create", "framed_glass_door"), "tall_create_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CREATE_TRAIN, new ResourceLocation("create", "train_door"), "tall_create_door");
		if (Compats.isModLoaded("tfmg", checker)) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TFMG_ALUMINUM, new ResourceLocation("tfmg", "aluminum_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TFMG_STEEL, new ResourceLocation("tfmg", "steel_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TFMG_HEAVY_CASING, new ResourceLocation("tfmg", "heavy_casing_door"));
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TFMG_HEAVY_PLATED, new ResourceLocation("tfmg", "heavy_plated_door"));

			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TFMG_ALUMINUM, new ResourceLocation("tfmg", "aluminum_door"), "tall_create_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TFMG_STEEL, new ResourceLocation("tfmg", "steel_door"), "tall_create_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TFMG_HEAVY_CASING, new ResourceLocation("tfmg", "heavy_casing_door"), "tall_create_door");
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TFMG_HEAVY_PLATED, new ResourceLocation("tfmg", "heavy_plated_door"), "tall_create_door");
		}
	}
}
