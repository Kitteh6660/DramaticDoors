package com.fizzware.dramaticdoors.blocks;

import com.fizzware.dramaticdoors.DramaticDoors;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import org.apache.commons.lang3.NotImplementedException;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DramaticDoors.MOD_ID)
public class DramaticDoorsBlocks {

    @ObjectHolder(TallDoorBlock.NAME_OAK) public static final Block TALL_OAK_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_SPRUCE) public static final Block TALL_SPRUCE_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_BIRCH) public static final Block TALL_BIRCH_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_JUNGLE) public static final Block TALL_JUNGLE_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_ACACIA) public static final Block TALL_ACACIA_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_DARK_OAK) public static final Block TALL_DARK_OAK_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_IRON) public static final Block TALL_IRON_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_CRIMSON) public static final Block TALL_CRIMSON_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_WARPED) public static final Block TALL_WARPED_DOOR = null;

    //Atmospheric
    @ObjectHolder(TallDoorBlock.NAME_ASPEN) public static final Block TALL_ASPEN_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_GRIMWOOD) public static final Block TALL_GRIMWOOD_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_KOUSA) public static final Block TALL_KOUSA_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_MORADO) public static final Block TALL_MORADO_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_ROSEWOOD) public static final Block TALL_ROSEWOOD_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_YUCCA) public static final Block TALL_YUCCA_DOOR = null;
    
    //Autumnity
    @ObjectHolder(TallDoorBlock.NAME_MAPLE) public static final Block TALL_MAPLE_DOOR = null;
    
    //Bamboo Blocks
    @ObjectHolder(TallDoorBlock.NAME_BAMBOO) public static final Block TALL_BAMBOO_DOOR = null;

    //Buzzier Bees
    @ObjectHolder(TallDoorBlock.NAME_HONEYCOMB) public static final Block TALL_HONEYCOMB_DOOR = null;
    
    //Endergetic Expansion
    @ObjectHolder(TallDoorBlock.NAME_POISE) public static final Block TALL_POISE_DOOR = null;
    
    //Environmental
    @ObjectHolder(TallDoorBlock.NAME_CHERRY) public static final Block TALL_CHERRY_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_WILLOW) public static final Block TALL_WILLOW_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_WISTERIA) public static final Block TALL_WISTERIA_DOOR = null;
    
    //Upgrade Aquatic
    @ObjectHolder(TallDoorBlock.NAME_DRIFTWOOD) public static final Block TALL_DRIFTWOOD_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_RIVER) public static final Block TALL_RIVER_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_GLASS) public static final Block TALL_GLASS_DOOR = null;
    @ObjectHolder(TallDoorBlock.NAME_TOOTH) public static final Block TALL_TOOTH_DOOR = null;
    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> blockRegistry) {
        IForgeRegistry<Block> registry = blockRegistry.getRegistry();
        addBlockSeries(registry, DoorSeries.VANILLA);
        //Conditionally add doors based on whether mods are loaded.
        if (ModList.get().isLoaded("atmospheric")) {
        	addBlockSeries(registry, DoorSeries.ATMOSPHERIC);
        }
        if (ModList.get().isLoaded("autumnity")) {
        	addBlockSeries(registry, DoorSeries.AUTUMNITY);
        }
        if (ModList.get().isLoaded("bamboo_blocks")) {
        	addBlockSeries(registry, DoorSeries.BAMBOO);
        }
        if (ModList.get().isLoaded("buzzier_bees")) {
        	addBlockSeries(registry, DoorSeries.BUZZIER);
        }
        if (ModList.get().isLoaded("endergetic")) {
        	addBlockSeries(registry, DoorSeries.ENDERGETIC);
        }
        if (ModList.get().isLoaded("environmental")) {
        	addBlockSeries(registry, DoorSeries.ENVIRONMENTAL);
        }
        if (ModList.get().isLoaded("upgrade_aquatic")) {
        	addBlockSeries(registry, DoorSeries.UPGRADE_AQUATIC);
        }
    }

    private static void addBlockSeries(IForgeRegistry<Block> registry, DoorSeries series) {
        String[] tallDoorNames = TallDoorBlock.getNames(series);
        Block[] baseDoors = getBlockList(series);
        for (int i = 0; i < baseDoors.length; i++) {
            registry.register(new TallDoorBlock(baseDoors[i]).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, tallDoorNames[i])));
        }
    }
    
    @SuppressWarnings("deprecation")
	public static Block[] getBlockList(DoorSeries series) {
        switch (series) {
            case VANILLA:
                return new Block[] {
                        Blocks.OAK_DOOR, Blocks.SPRUCE_DOOR, Blocks.BIRCH_DOOR,
                        Blocks.JUNGLE_DOOR, Blocks.ACACIA_DOOR, Blocks.DARK_OAK_DOOR,
                        Blocks.IRON_DOOR, Blocks.CRIMSON_DOOR, Blocks.WARPED_DOOR };
            case VANILLA_TALL:
                return new Block[] {
                        TALL_OAK_DOOR, TALL_SPRUCE_DOOR, TALL_BIRCH_DOOR,
                        TALL_JUNGLE_DOOR, TALL_ACACIA_DOOR, TALL_DARK_OAK_DOOR,
                        TALL_IRON_DOOR, TALL_CRIMSON_DOOR, TALL_WARPED_DOOR };
            case BOP:
                throw new NotImplementedException("Biomes O' Plenty not yet supported."); // TODO BOP (Many)
            case BOP_TALL:
                throw new NotImplementedException("Biomes O' Plenty not yet supported."); // TODO BOP (Many Tall)
            case ATMOSPHERIC:
            	return new Block[] { 
            			Registry.BLOCK.get(new ResourceLocation("atmospheric", "aspen_door")),
            			Registry.BLOCK.get(new ResourceLocation("atmospheric", "grimwood_door")),
            			Registry.BLOCK.get(new ResourceLocation("atmospheric", "kousa_door")),
            			Registry.BLOCK.get(new ResourceLocation("atmospheric", "morado_door")),
            			Registry.BLOCK.get(new ResourceLocation("atmospheric", "rosewood_door")),
            			Registry.BLOCK.get(new ResourceLocation("atmospheric", "yucca_door")) };
            case ATMOSPHERIC_TALL:
            	return new Block[] { TALL_ASPEN_DOOR, TALL_GRIMWOOD_DOOR, TALL_KOUSA_DOOR, TALL_MORADO_DOOR, TALL_ROSEWOOD_DOOR, TALL_YUCCA_DOOR };
            case AUTUMNITY:
            	return new Block[] { Registry.BLOCK.get(new ResourceLocation("autumnity", "maple_door")) };
            case AUTUMNITY_TALL:
            	return new Block[] { TALL_MAPLE_DOOR };
            case BAMBOO:
            	return new Block[] { Registry.BLOCK.get(new ResourceLocation("bamboo_blocks", "bamboo_door")) };
            case BAMBOO_TALL:
            	return new Block[] { TALL_BAMBOO_DOOR };
            case BUZZIER:
            	return new Block[] { Registry.BLOCK.get(new ResourceLocation("buzzier_bees", "honeycomb_door")) };
            case BUZZIER_TALL:
            	return new Block[] { TALL_HONEYCOMB_DOOR };
            case ENDERGETIC:
            	return new Block[] { Registry.BLOCK.get(new ResourceLocation("endergetic", "poise_door")) };
            case ENDERGETIC_TALL:
            	return new Block[] { TALL_POISE_DOOR };
            case ENVIRONMENTAL:
            	return new Block[] { 
            			Registry.BLOCK.get(new ResourceLocation("environmental", "cherry_door")),
            			Registry.BLOCK.get(new ResourceLocation("environmental", "willow_door")),
            			Registry.BLOCK.get(new ResourceLocation("environmental", "wisteria_door")) };
            case ENVIRONMENTAL_TALL:
            	return new Block[] { TALL_CHERRY_DOOR, TALL_WILLOW_DOOR, TALL_WISTERIA_DOOR };
            case UPGRADE_AQUATIC:
            	return new Block[] { 
            			Registry.BLOCK.get(new ResourceLocation("upgrade_aquatic", "driftwood_door")),
            			Registry.BLOCK.get(new ResourceLocation("upgrade_aquatic", "river_door")),
           			    Registry.BLOCK.get(new ResourceLocation("upgrade_aquatic", "glass_door")),
            			Registry.BLOCK.get(new ResourceLocation("upgrade_aquatic", "tooth_door")) };
            case UPGRADE_AQUATIC_TALL:
            	return new Block[] { TALL_DRIFTWOOD_DOOR, TALL_RIVER_DOOR, TALL_GLASS_DOOR, TALL_TOOTH_DOOR };
            default:
                return new Block[] {};
        }
    }

    public enum DoorSeries {
        VANILLA,
        VANILLA_TALL,
        BOP,
        BOP_TALL,
        ATMOSPHERIC,
        ATMOSPHERIC_TALL,
        AUTUMNITY,
        AUTUMNITY_TALL,
        BAMBOO,
        BAMBOO_TALL,
        BUZZIER,
        BUZZIER_TALL,
        ENDERGETIC,
        ENDERGETIC_TALL,
        ENVIRONMENTAL,
        ENVIRONMENTAL_TALL,
        UPGRADE_AQUATIC,
        UPGRADE_AQUATIC_TALL
    }
}
