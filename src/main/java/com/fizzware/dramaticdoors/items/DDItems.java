package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.blocks.DDBlocks;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@ObjectHolder(DramaticDoors.MOD_ID)
public class DDItems {

    private static final Item.Properties PROPERTIES = new Item.Properties();
    
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> itemRegistry) {
        itemRegistry.getRegistry().registerAll(
            new TallDoorItem(DDBlocks.TALL_IRON_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_IRON)),
            new TallDoorItem(DDBlocks.TALL_OAK_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_OAK)),
            new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_SPRUCE)),
            new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BIRCH)),
            new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_JUNGLE)),
            new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ACACIA)),
            new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_DARK_OAK)),
            new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_CRIMSON)),
            new TallDoorItem(DDBlocks.TALL_WARPED_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_WARPED))
            //new TallDoorItem(DramaticDoorsBlocks.TALL_MANGROVE_DOOR, PROPERTIES.tab(DramaticDoors.TAB)).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_MANGROVE)) // This will be added in 1.19+.
        );
        //Conditionally add items based on whether mods are loaded.
        itemRegistry.getRegistry().registerAll(
            new TallDoorItem(DDBlocks.TALL_BOP_CHERRY_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_CHERRY)),
            new TallDoorItem(DDBlocks.TALL_BOP_DEAD_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_DEAD)),
            new TallDoorItem(DDBlocks.TALL_BOP_FIR_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_FIR)),
            new TallDoorItem(DDBlocks.TALL_BOP_HELLBARK_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_HELLBARK)),
            new TallDoorItem(DDBlocks.TALL_BOP_JACARANDA_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_JACARANDA)),
            new TallDoorItem(DDBlocks.TALL_BOP_MAGIC_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_MAGIC)),
            new TallDoorItem(DDBlocks.TALL_BOP_MAHOGANY_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_MAHOGANY)),
            new TallDoorItem(DDBlocks.TALL_BOP_PALM_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_PALM)),
            new TallDoorItem(DDBlocks.TALL_BOP_REDWOOD_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_REDWOOD)),
            new TallDoorItem(DDBlocks.TALL_BOP_UMBRAN_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_UMBRAN)),
            new TallDoorItem(DDBlocks.TALL_BOP_WILLOW_DOOR, conditionalTabProperties("biomesoplenty")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BOP_WILLOW)),

            new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_ASPEN)),
            new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_BAOBAB)),
            new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_BLUE_ENCHANTED)),
            new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_BULBIS)),
            new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_CHERRY)),
            new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_CIKA)),
            new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_CYPRESS)),
            new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_EBONY)),
            new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_EMBUR)),
            new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_ETHER)),
            new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_FIR)),
            new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR, addIfItemIsAvailable(new ResourceLocation("byg", "florus_door"), conditionalTabProperties("byg"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_FLORUS)),
            new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_GREEN_ENCHANTED)),
            new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_HOLLY)),
            new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_IMPARIUS)),
            new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR, addIfItemIsAvailable(new ResourceLocation("byg", "ironwood_door"), conditionalTabProperties("byg"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_IRONWOOD)),
            new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_JACARANDA)),
            new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_LAMENT)),
            new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_MAHOGANY)),
            new TallDoorItem(DDBlocks.TALL_BYG_MANGROVE_DOOR, addIfItemIsAvailable(new ResourceLocation("byg", "mangrove_door"), conditionalTabProperties("byg"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_MANGROVE)),
            new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_MAPLE)),
            new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_NIGHTSHADE)),
            new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_PALM)),
            new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_PINE)),
            new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_RAINBOW_EUCALYPTUS)),
            new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_REDWOOD)),
            new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_SKYRIS)),
            new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR, addIfItemIsAvailable(new ResourceLocation("byg", "soul_shroom_door"), conditionalTabProperties("byg"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_SOUL_SHROOM)),
            new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_SYTHIAN)),
            new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_WILLOW)),
            new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_WITCH_HAZEL)),
            new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR, conditionalTabProperties("byg")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BYG_ZELKOVA)),
            
        	new TallDoorItem(DDBlocks.TALL_ARAUCARIA_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ARAUCARIA)),
        	new TallDoorItem(DDBlocks.TALL_HEIDIPHYLLUM_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_HEIDIPHYLLUM)),
        	new TallDoorItem(DDBlocks.TALL_LIRIODENDRITES_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LIRIODENDRITES)),
        	new TallDoorItem(DDBlocks.TALL_METASEQUOIA_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_METASEQUOIA)),
        	new TallDoorItem(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PROTOJUNIPEROXYLON)),
        	new TallDoorItem(DDBlocks.TALL_PROTOPICEOXYLON_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PROTOPICEOXYLON)),
        	new TallDoorItem(DDBlocks.TALL_ZAMITES_DOOR, conditionalTabProperties("prehistoricfauna")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ZAMITES)),
            
        	new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_CANOPY)),
        	new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_DARKWOOD)),
        	new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_TWILIGHT_MANGROVE)),
        	new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_MINEWOOD)),
        	new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_SORTINGWOOD)),
        	new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_TIMEWOOD)),
        	new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_TRANSWOOD)),
        	new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR, conditionalTabProperties("twilightforest")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_TWILIGHT_OAK)),
            
            new TallDoorItem(DDBlocks.TALL_ASPEN_DOOR, conditionalTabProperties("atmospheric")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ASPEN)),
            new TallDoorItem(DDBlocks.TALL_GRIMWOOD_DOOR, conditionalTabProperties("atmospheric")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_GRIMWOOD)),
            new TallDoorItem(DDBlocks.TALL_KOUSA_DOOR, conditionalTabProperties("atmospheric")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_KOUSA)),
            new TallDoorItem(DDBlocks.TALL_MORADO_DOOR, conditionalTabProperties("atmospheric")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_MORADO)),
            new TallDoorItem(DDBlocks.TALL_ROSEWOOD_DOOR, conditionalTabProperties("atmospheric")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ROSEWOOD)),
            new TallDoorItem(DDBlocks.TALL_YUCCA_DOOR, conditionalTabProperties("atmospheric")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_YUCCA)),
            
            new TallDoorItem(DDBlocks.TALL_MAPLE_DOOR, conditionalTabProperties("autumnity")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_MAPLE)),
            
            new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR, conditionalTabProperties("bamboo_blocks")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BAMBOO)),
            
            new TallDoorItem(DDBlocks.TALL_HONEYCOMB_DOOR, conditionalTabProperties("buzzier_bees")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_HONEYCOMB)),
            
            new TallDoorItem(DDBlocks.TALL_AZALEA_DOOR, conditionalTabProperties("caverns_and_chasms")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_AZALEA)),
            
            new TallDoorItem(DDBlocks.TALL_POISE_DOOR, conditionalTabProperties("endergetic")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POISE)),
            
            new TallDoorItem(DDBlocks.TALL_CHERRY_DOOR, conditionalTabProperties("environmental")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_CHERRY)),
            new TallDoorItem(DDBlocks.TALL_WILLOW_DOOR, conditionalTabProperties("environmental")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_WILLOW)),
            new TallDoorItem(DDBlocks.TALL_WISTERIA_DOOR, conditionalTabProperties("environmental")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_WISTERIA)),
            
            new TallDoorItem(DDBlocks.TALL_DRIFTWOOD_DOOR, conditionalTabProperties("upgrade_aquatic")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_DRIFTWOOD)),
            new TallDoorItem(DDBlocks.TALL_RIVER_DOOR, conditionalTabProperties("upgrade_aquatic")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_RIVER)),
            new TallDoorItem(DDBlocks.TALL_GLASS_DOOR, conditionalTabProperties("upgrade_aquatic")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_GLASS)),
            new TallDoorItem(DDBlocks.TALL_TOOTH_DOOR, conditionalTabProperties("upgrade_aquatic")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_TOOTH)),

            new TallDoorItem(DDBlocks.TALL_JACARANDA_DOOR, conditionalTabProperties("abundance")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_JACARANDA)),
            new TallDoorItem(DDBlocks.TALL_REDBUD_DOOR, conditionalTabProperties("abundance")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_REDBUD)),

            new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR, conditionalTabProperties("bayou_blues")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_CYPRESS)),

            new TallDoorItem(DDBlocks.TALL_BROWN_MUSHROOM_DOOR, conditionalTabProperties("enhanced_mushrooms")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BROWN_MUSHROOM)),
            new TallDoorItem(DDBlocks.TALL_RED_MUSHROOM_DOOR, conditionalTabProperties("enhanced_mushrooms")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_RED_MUSHROOM)),
            new TallDoorItem(DDBlocks.TALL_GLOWSHROOM_DOOR, conditionalTabProperties("enhanced_mushrooms")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_GLOWSHROOM)),
            
            new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR, conditionalTabProperties("architects_palette")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_TWISTED)),

            new TallDoorItem(DDBlocks.TALL_BP_BAMBOO_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_BAMBOO)),
            new TallDoorItem(DDBlocks.TALL_BP_MUSHROOM_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_MUSHROOM)),
            new TallDoorItem(DDBlocks.TALL_BP_COPPER_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_COPPER)),
            new TallDoorItem(DDBlocks.TALL_BP_GOLDEN_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_GOLDEN)),
            new TallDoorItem(DDBlocks.TALL_BP_DIAMOND_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_DIAMOND)),
            new TallDoorItem(DDBlocks.TALL_BP_EMERALD_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_EMERALD)),
            new TallDoorItem(DDBlocks.TALL_BP_NETHERITE_DOOR, conditionalTabProperties("blocksplus")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BP_NETHERITE)),
            
            new TallDoorItem(DDBlocks.TALL_PETRIFIED_DOOR, conditionalTabProperties("darkerdepths")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PETRIFIED)),

            new TallDoorItem(DDBlocks.TALL_STEEL_DOOR, conditionalTabProperties("alloyed")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_STEEL)),
            new TallDoorItem(DDBlocks.TALL_LOCKED_STEEL_DOOR, conditionalTabProperties("alloyed")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LOCKED_STEEL)),

            new TallDoorItem(DDBlocks.TALL_ANDESITE_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ANDESITE)),
            new TallDoorItem(DDBlocks.TALL_BRASS_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_BRASS)),
            new TallDoorItem(DDBlocks.TALL_COPPER_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_COPPER)),
            new TallDoorItem(DDBlocks.TALL_ZINC_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ZINC)),
            new TallDoorItem(DDBlocks.TALL_LOCKED_ANDESITE_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LOCKED_ANDESITE)),
            new TallDoorItem(DDBlocks.TALL_LOCKED_BRASS_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LOCKED_BRASS)),
            new TallDoorItem(DDBlocks.TALL_LOCKED_COPPER_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LOCKED_COPPER)),
            new TallDoorItem(DDBlocks.TALL_LOCKED_ZINC_DOOR, conditionalTabProperties("createdeco")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LOCKED_ZINC)),
            
            new TallDoorItem(DDBlocks.TALL_CARDBOARD_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_CARDBOARD)),
            new TallDoorItem(DDBlocks.TALL_CHAIN_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_CHAIN)),
            new TallDoorItem(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_INDUSTRIAL_IRON)),
            new TallDoorItem(DDBlocks.TALL_IRON_BAR_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_IRON_BAR)),
            new TallDoorItem(DDBlocks.TALL_PADDED_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PADDED)),
            new TallDoorItem(DDBlocks.TALL_RUSTY_IRON_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_RUSTY_IRON)),
            new TallDoorItem(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_RUSTY_SHEET_METAL)),
            new TallDoorItem(DDBlocks.TALL_SHEET_METAL_DOOR, conditionalTabProperties("dustrial_decor")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_SHEET_METAL)),
            
            new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR, conditionalTabProperties("ecologics")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ECO_AZALEA)),
            new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR, conditionalTabProperties("ecologics")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ECO_FLOWERING_AZALEA)),
            new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR, conditionalTabProperties("ecologics")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ECO_COCONUT)),
            new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR, conditionalTabProperties("ecologics")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_ECO_WALNUT)),
            
            new TallDoorItem(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR, addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), conditionalTabProperties("habitat"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_FAIRY_RING_MUSHROOM)),

            new TallDoorItem(DDBlocks.TALL_AZURE_DOOR, conditionalTabProperties("outer_end")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_AZURE)),
            
            new TallDoorItem(DDBlocks.TALL_POKECUBE_ENIGMA_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_ENIGMA)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_LEPPA_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_LEPPA)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_NANAB_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_NANAB)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_ORAN_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_ORAN)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_PECHA_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_PECHA)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_SITRUS_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_SITRUS)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_AGED_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_AGED)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_CONCRETE_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_CONCRETE)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_CORRUPTED_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_CORRUPTED)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_DISTORTIC_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_DISTORTIC)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_INVERTED_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_INVERTED)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_MIRAGE_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_MIRAGE)),
            new TallDoorItem(DDBlocks.TALL_POKECUBE_TEMPORAL_DOOR, conditionalTabProperties("pokecube")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_POKECUBE_TEMPORAL)),
            
            new TallDoorItem(DDBlocks.TALL_PW_MAGIC_DOOR, conditionalTabProperties("premium_wood")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PW_MAGIC)),
            new TallDoorItem(DDBlocks.TALL_PW_MAPLE_DOOR, conditionalTabProperties("premium_wood")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PW_MAPLE)),
            new TallDoorItem(DDBlocks.TALL_PW_PURPLE_HEART_DOOR, conditionalTabProperties("premium_wood")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PW_PURPLE_HEART)),
            new TallDoorItem(DDBlocks.TALL_PW_SILVERBELL_DOOR, conditionalTabProperties("premium_wood")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PW_SILVERBELL)),
            new TallDoorItem(DDBlocks.TALL_PW_TIGER_DOOR, conditionalTabProperties("premium_wood")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PW_TIGER)),
            new TallDoorItem(DDBlocks.TALL_PW_WILLOW_DOOR, conditionalTabProperties("premium_wood")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_PW_WILLOW)),

            new TallDoorItem(DDBlocks.TALL_QUARK_AZALEA_DOOR, conditionalTabProperties("quark")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_QUARK_AZALEA)),
            new TallDoorItem(DDBlocks.TALL_QUARK_BLOSSOM_DOOR, conditionalTabProperties("quark")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_QUARK_BLOSSOM)),
            
            new TallDoorItem(DDBlocks.TALL_GOLD_DOOR, conditionalTabProperties("supplementaries")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_GOLD)),
            new TallDoorItem(DDBlocks.TALL_SILVER_DOOR, addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), conditionalTabProperties("supplementaries"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_SILVER)),
            new TallDoorItem(DDBlocks.TALL_LEAD_DOOR, addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), conditionalTabProperties("supplementaries"))).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_LEAD)),
            new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR, conditionalTabProperties("supplementaries")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_NETHERITE)),

            new TallDoorItem(DDBlocks.TALL_GRONGLE_DOOR, conditionalTabProperties("undergarden")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_GRONGLE)),
            new TallDoorItem(DDBlocks.TALL_SMOGSTEM_DOOR, conditionalTabProperties("undergarden")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_SMOGSTEM)),
            new TallDoorItem(DDBlocks.TALL_WIGGLEWOOD_DOOR, conditionalTabProperties("undergarden")).setRegistryName(new ResourceLocation(DramaticDoors.MOD_ID, TallDoorBlock.NAME_WIGGLEWOOD))

        		);
    }
    
    private static Item.Properties conditionalTabProperties(String modid) {
    	return ModList.get().isLoaded(modid) ? PROPERTIES.tab(DramaticDoors.TAB) : PROPERTIES.tab(null);
    }
    
    // If a mod conditionally adds doors, only make doors available if the corresponding normal-sized doors are available.
    @SuppressWarnings("deprecation")
	private static Item.Properties addIfItemIsAvailable(ResourceLocation loc, Item.Properties tabProperties) {
    	Item item = Registry.ITEM.get(loc);
    	if (item != null) {
    		if (item.getItemCategory() != null) {
    			return tabProperties;
    		}
    		else {
    			return PROPERTIES.tab(null);
    		}
    	}
    	else {
    		return PROPERTIES.tab(null);
    	}
    }
}