package com.fizzware.dramaticdoors.items;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.DDBlocks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class DDItems {

    private static final Item.Properties PROPERTIES = new Item.Properties();
    
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, DramaticDoors.MOD_ID);
    
    // Vanilla
    public static final RegistryObject<Item> TALL_IRON_DOOR = ITEMS.register(DDNames.TALL_IRON, () -> new TallDoorItem(DDBlocks.TALL_IRON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_OAK_DOOR = ITEMS.register(DDNames.TALL_OAK, () -> new TallDoorItem(DDBlocks.TALL_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_SPRUCE_DOOR = ITEMS.register(DDNames.TALL_SPRUCE, () -> new TallDoorItem(DDBlocks.TALL_SPRUCE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_BIRCH_DOOR = ITEMS.register(DDNames.TALL_BIRCH, () -> new TallDoorItem(DDBlocks.TALL_BIRCH_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_JUNGLE_DOOR = ITEMS.register(DDNames.TALL_JUNGLE, () -> new TallDoorItem(DDBlocks.TALL_JUNGLE_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_ACACIA_DOOR = ITEMS.register(DDNames.TALL_ACACIA, () -> new TallDoorItem(DDBlocks.TALL_ACACIA_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_DARK_OAK_DOOR = ITEMS.register(DDNames.TALL_DARK_OAK, () -> new TallDoorItem(DDBlocks.TALL_DARK_OAK_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_MANGROVE_DOOR.get(), conditionalTabProperties("wildbackport"))); // Only in 1.19+ or with Wild Backport
    public static final RegistryObject<Item> TALL_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BAMBOO_DOOR.get(), conditionalTabProperties("one_twenty_backport"))); // Only in 1.19.3/1.20+ or with One Twenty Backport
    public static final RegistryObject<Item> TALL_CRIMSON_DOOR = ITEMS.register(DDNames.TALL_CRIMSON, () -> new TallDoorItem(DDBlocks.TALL_CRIMSON_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    public static final RegistryObject<Item> TALL_WARPED_DOOR = ITEMS.register(DDNames.TALL_WARPED, () -> new TallDoorItem(DDBlocks.TALL_WARPED_DOOR.get(), PROPERTIES.tab(DramaticDoors.MAIN_TAB)));
    
    // Biomes o' Plenty
    public static final RegistryObject<Item> TALL_BOP_CHERRY_DOOR = ITEMS.register(DDNames.TALL_BOP_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BOP_CHERRY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_DEAD_DOOR = ITEMS.register(DDNames.TALL_BOP_DEAD, () -> new TallDoorItem(DDBlocks.TALL_BOP_DEAD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_FIR_DOOR = ITEMS.register(DDNames.TALL_BOP_FIR, () -> new TallDoorItem(DDBlocks.TALL_BOP_FIR_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_HELLBARK_DOOR = ITEMS.register(DDNames.TALL_BOP_HELLBARK, () -> new TallDoorItem(DDBlocks.TALL_BOP_HELLBARK_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_BOP_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_BOP_JACARANDA_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_MAGIC_DOOR = ITEMS.register(DDNames.TALL_BOP_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_BOP_MAGIC_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_MAHOGANY_DOOR = ITEMS.register(DDNames.TALL_BOP_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_BOP_MAHOGANY_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_PALM_DOOR = ITEMS.register(DDNames.TALL_BOP_PALM, () -> new TallDoorItem(DDBlocks.TALL_BOP_PALM_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_REDWOOD_DOOR = ITEMS.register(DDNames.TALL_BOP_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_BOP_REDWOOD_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_UMBRAN_DOOR = ITEMS.register(DDNames.TALL_BOP_UMBRAN, () -> new TallDoorItem(DDBlocks.TALL_BOP_UMBRAN_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    public static final RegistryObject<Item> TALL_BOP_WILLOW_DOOR = ITEMS.register(DDNames.TALL_BOP_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BOP_WILLOW_DOOR.get(), conditionalTabProperties("biomesoplenty")));
    
    // Oh the Biomes You'll Go
    public static final RegistryObject<Item> TALL_BYG_ASPEN_DOOR = ITEMS.register(DDNames.TALL_BYG_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_BYG_ASPEN_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BAOBAB_DOOR = ITEMS.register(DDNames.TALL_BYG_BAOBAB, () -> new TallDoorItem(DDBlocks.TALL_BYG_BAOBAB_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BLUE_ENCHANTED_DOOR = ITEMS.register(DDNames.TALL_BYG_BLUE_ENCHANTED, () -> new TallDoorItem(DDBlocks.TALL_BYG_BLUE_ENCHANTED_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_BULBIS_DOOR = ITEMS.register(DDNames.TALL_BYG_BULBIS, () -> new TallDoorItem(DDBlocks.TALL_BYG_BULBIS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CHERRY_DOOR = ITEMS.register(DDNames.TALL_BYG_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BYG_CHERRY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CIKA_DOOR = ITEMS.register(DDNames.TALL_BYG_CIKA, () -> new TallDoorItem(DDBlocks.TALL_BYG_CIKA_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_BYG_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_BYG_CYPRESS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_EBONY_DOOR = ITEMS.register(DDNames.TALL_BYG_EBONY, () -> new TallDoorItem(DDBlocks.TALL_BYG_EBONY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_EMBUR_DOOR = ITEMS.register(DDNames.TALL_BYG_EMBUR, () -> new TallDoorItem(DDBlocks.TALL_BYG_EMBUR_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_ETHER_DOOR = ITEMS.register(DDNames.TALL_BYG_ETHER, () -> new TallDoorItem(DDBlocks.TALL_BYG_ETHER_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_FIR_DOOR = ITEMS.register(DDNames.TALL_BYG_FIR, () -> new TallDoorItem(DDBlocks.TALL_BYG_FIR_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_FLORUS_DOOR = ITEMS.register(DDNames.TALL_BYG_FLORUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_FLORUS_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "florus_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_GREEN_ENCHANTED_DOOR = ITEMS.register(DDNames.TALL_BYG_GREEN_ENCHANTED, () -> new TallDoorItem(DDBlocks.TALL_BYG_GREEN_ENCHANTED_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_HOLLY_DOOR = ITEMS.register(DDNames.TALL_BYG_HOLLY, () -> new TallDoorItem(DDBlocks.TALL_BYG_HOLLY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_IMPARIUS_DOOR = ITEMS.register(DDNames.TALL_BYG_IMPARIUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_IMPARIUS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_IRONWOOD_DOOR = ITEMS.register(DDNames.TALL_BYG_IRONWOOD, () -> new TallDoorItem(DDBlocks.TALL_BYG_IRONWOOD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "ironwood_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_BYG_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_BYG_JACARANDA_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_LAMENT_DOOR = ITEMS.register(DDNames.TALL_BYG_LAMENT, () -> new TallDoorItem(DDBlocks.TALL_BYG_LAMENT_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_MAHOGANY_DOOR = ITEMS.register(DDNames.TALL_BYG_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_BYG_MAHOGANY_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_MAPLE_DOOR = ITEMS.register(DDNames.TALL_BYG_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_BYG_MAPLE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_NIGHTSHADE_DOOR = ITEMS.register(DDNames.TALL_BYG_NIGHTSHADE, () -> new TallDoorItem(DDBlocks.TALL_BYG_NIGHTSHADE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_PALM_DOOR = ITEMS.register(DDNames.TALL_BYG_PALM, () -> new TallDoorItem(DDBlocks.TALL_BYG_PALM_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_PINE_DOOR = ITEMS.register(DDNames.TALL_BYG_PINE, () -> new TallDoorItem(DDBlocks.TALL_BYG_PINE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_RAINBOW_EUCALYPTUS_DOOR = ITEMS.register(DDNames.TALL_BYG_RAINBOW_EUCALYPTUS, () -> new TallDoorItem(DDBlocks.TALL_BYG_RAINBOW_EUCALYPTUS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_REDWOOD_DOOR = ITEMS.register(DDNames.TALL_BYG_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_BYG_REDWOOD_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_SKYRIS_DOOR = ITEMS.register(DDNames.TALL_BYG_SKYRIS, () -> new TallDoorItem(DDBlocks.TALL_BYG_SKYRIS_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_SOUL_SHROOM_DOOR = ITEMS.register(DDNames.TALL_BYG_SOUL_SHROOM, () -> new TallDoorItem(DDBlocks.TALL_BYG_SOUL_SHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("byg", "soul_shroom_door"), conditionalTabProperties("byg"))));
    public static final RegistryObject<Item> TALL_BYG_SYTHIAN_DOOR = ITEMS.register(DDNames.TALL_BYG_SYTHIAN, () -> new TallDoorItem(DDBlocks.TALL_BYG_SYTHIAN_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WHITE_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_BYG_WHITE_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_BYG_WHITE_MANGROVE_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WILLOW_DOOR = ITEMS.register(DDNames.TALL_BYG_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BYG_WILLOW_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_WITCH_HAZEL_DOOR = ITEMS.register(DDNames.TALL_BYG_WITCH_HAZEL, () -> new TallDoorItem(DDBlocks.TALL_BYG_WITCH_HAZEL_DOOR.get(), conditionalTabProperties("byg")));
    public static final RegistryObject<Item> TALL_BYG_ZELKOVA_DOOR = ITEMS.register(DDNames.TALL_BYG_ZELKOVA, () -> new TallDoorItem(DDBlocks.TALL_BYG_ZELKOVA_DOOR.get(), conditionalTabProperties("byg")));

    // Prehistoric Fauna
    public static final RegistryObject<Item> TALL_ARAUCARIA_DOOR = ITEMS.register(DDNames.TALL_ARAUCARIA, () -> new TallDoorItem(DDBlocks.TALL_ARAUCARIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_HEIDIPHYLLUM_DOOR = ITEMS.register(DDNames.TALL_HEIDIPHYLLUM, () -> new TallDoorItem(DDBlocks.TALL_HEIDIPHYLLUM_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_LIRIODENDRITES_DOOR = ITEMS.register(DDNames.TALL_LIRIODENDRITES, () -> new TallDoorItem(DDBlocks.TALL_LIRIODENDRITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_METASEQUOIA_DOOR = ITEMS.register(DDNames.TALL_METASEQUOIA, () -> new TallDoorItem(DDBlocks.TALL_METASEQUOIA_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOJUNIPEROXYLON_DOOR = ITEMS.register(DDNames.TALL_PROTOJUNIPEROXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOJUNIPEROXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_PROTOPICEOXYLON_DOOR = ITEMS.register(DDNames.TALL_PROTOPICEOXYLON, () -> new TallDoorItem(DDBlocks.TALL_PROTOPICEOXYLON_DOOR.get(), conditionalTabProperties("prehistoricfauna")));
    public static final RegistryObject<Item> TALL_ZAMITES_DOOR = ITEMS.register(DDNames.TALL_ZAMITES, () -> new TallDoorItem(DDBlocks.TALL_ZAMITES_DOOR.get(), conditionalTabProperties("prehistoricfauna")));

    // Regions Unexplored
    public static final RegistryObject<Item> TALL_RUE_BAOBAB_DOOR = ITEMS.register(DDNames.TALL_RUE_BAOBAB, () -> new TallDoorItem(DDBlocks.TALL_RUE_BAOBAB_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_BLACKWOOD_DOOR = ITEMS.register(DDNames.TALL_RUE_BLACKWOOD, () -> new TallDoorItem(DDBlocks.TALL_RUE_BLACKWOOD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_CHERRY_DOOR = ITEMS.register(DDNames.TALL_RUE_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_RUE_CHERRY_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_RUE_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_RUE_CYPRESS_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_DEAD_DOOR = ITEMS.register(DDNames.TALL_RUE_DEAD, () -> new TallDoorItem(DDBlocks.TALL_RUE_DEAD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_EUCALYPTUS_DOOR = ITEMS.register(DDNames.TALL_RUE_EUCALYPTUS, () -> new TallDoorItem(DDBlocks.TALL_RUE_EUCALYPTUS_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_JOSHUA_DOOR = ITEMS.register(DDNames.TALL_RUE_JOSHUA, () -> new TallDoorItem(DDBlocks.TALL_RUE_JOSHUA_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_LARCH_DOOR = ITEMS.register(DDNames.TALL_RUE_LARCH, () -> new TallDoorItem(DDBlocks.TALL_RUE_LARCH_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_MAPLE_DOOR = ITEMS.register(DDNames.TALL_RUE_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_RUE_MAPLE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_MAUVE_DOOR = ITEMS.register(DDNames.TALL_RUE_MAUVE, () -> new TallDoorItem(DDBlocks.TALL_RUE_MAUVE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_PALM_DOOR = ITEMS.register(DDNames.TALL_RUE_PALM, () -> new TallDoorItem(DDBlocks.TALL_RUE_PALM_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_PINE_DOOR = ITEMS.register(DDNames.TALL_RUE_PINE, () -> new TallDoorItem(DDBlocks.TALL_RUE_PINE_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_REDWOOD_DOOR = ITEMS.register(DDNames.TALL_RUE_REDWOOD, () -> new TallDoorItem(DDBlocks.TALL_RUE_REDWOOD_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    public static final RegistryObject<Item> TALL_RUE_WILLOW_DOOR = ITEMS.register(DDNames.TALL_RUE_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_RUE_WILLOW_DOOR.get(), conditionalTabProperties("regions_unexplored")));
    
    // Twilight Forest
    public static final RegistryObject<Item> TALL_CANOPY_DOOR = ITEMS.register(DDNames.TALL_CANOPY, () -> new TallDoorItem(DDBlocks.TALL_CANOPY_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_DARKWOOD_DOOR = ITEMS.register(DDNames.TALL_DARKWOOD, () -> new TallDoorItem(DDBlocks.TALL_DARKWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_MANGROVE_DOOR = ITEMS.register(DDNames.TALL_TWILIGHT_MANGROVE, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_MANGROVE_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_MINEWOOD_DOOR = ITEMS.register(DDNames.TALL_MINEWOOD, () -> new TallDoorItem(DDBlocks.TALL_MINEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_SORTINGWOOD_DOOR = ITEMS.register(DDNames.TALL_SORTINGWOOD, () -> new TallDoorItem(DDBlocks.TALL_SORTINGWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TIMEWOOD_DOOR = ITEMS.register(DDNames.TALL_TIMEWOOD, () -> new TallDoorItem(DDBlocks.TALL_TIMEWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TRANSWOOD_DOOR = ITEMS.register(DDNames.TALL_TRANSWOOD, () -> new TallDoorItem(DDBlocks.TALL_TRANSWOOD_DOOR.get(), conditionalTabProperties("twilightforest")));
    public static final RegistryObject<Item> TALL_TWILIGHT_OAK_DOOR = ITEMS.register(DDNames.TALL_TWILIGHT_OAK, () -> new TallDoorItem(DDBlocks.TALL_TWILIGHT_OAK_DOOR.get(), conditionalTabProperties("twilightforest")));

    public static final RegistryObject<Item> TALL_TOWERWOOD_DOOR = ITEMS.register(DDNames.TALL_TOWERWOOD, () -> new TallDoorItem(DDBlocks.TALL_TOWERWOOD_DOOR.get(), conditionalTabProperties("tflostblocks")));
    
    // The Abnormals Mods
    public static final RegistryObject<Item> TALL_ASPEN_DOOR = ITEMS.register(DDNames.TALL_ASPEN, () -> new TallDoorItem(DDBlocks.TALL_ASPEN_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_GRIMWOOD_DOOR = ITEMS.register(DDNames.TALL_GRIMWOOD, () -> new TallDoorItem(DDBlocks.TALL_GRIMWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_KOUSA_DOOR = ITEMS.register(DDNames.TALL_KOUSA, () -> new TallDoorItem(DDBlocks.TALL_KOUSA_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_MORADO_DOOR = ITEMS.register(DDNames.TALL_MORADO, () -> new TallDoorItem(DDBlocks.TALL_MORADO_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_ROSEWOOD_DOOR = ITEMS.register(DDNames.TALL_ROSEWOOD, () -> new TallDoorItem(DDBlocks.TALL_ROSEWOOD_DOOR.get(), conditionalTabProperties("atmospheric")));
    public static final RegistryObject<Item> TALL_YUCCA_DOOR = ITEMS.register(DDNames.TALL_YUCCA, () -> new TallDoorItem(DDBlocks.TALL_YUCCA_DOOR.get(), conditionalTabProperties("atmospheric")));
    
    public static final RegistryObject<Item> TALL_MAPLE_DOOR = ITEMS.register(DDNames.TALL_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_MAPLE_DOOR.get(), conditionalTabProperties("autumnity")));

    public static final RegistryObject<Item> TALL_HONEYCOMB_DOOR = ITEMS.register(DDNames.TALL_HONEYCOMB, () -> new TallDoorItem(DDBlocks.TALL_HONEYCOMB_DOOR.get(), conditionalTabProperties("buzzier_bees")));

    public static final RegistryObject<Item> TALL_AZALEA_DOOR = ITEMS.register(DDNames.TALL_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_AZALEA_DOOR.get(), conditionalTabProperties("caverns_and_chasms")));

    public static final RegistryObject<Item> TALL_POISE_DOOR = ITEMS.register(DDNames.TALL_POISE, () -> new TallDoorItem(DDBlocks.TALL_POISE_DOOR.get(), conditionalTabProperties("endergetic")));

    public static final RegistryObject<Item> TALL_CHERRY_DOOR = ITEMS.register(DDNames.TALL_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_CHERRY_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> TALL_WILLOW_DOOR = ITEMS.register(DDNames.TALL_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_WILLOW_DOOR.get(), conditionalTabProperties("environmental")));
    public static final RegistryObject<Item> TALL_WISTERIA_DOOR = ITEMS.register(DDNames.TALL_WISTERIA, () -> new TallDoorItem(DDBlocks.TALL_WISTERIA_DOOR.get(), conditionalTabProperties("environmental")));

    public static final RegistryObject<Item> TALL_DRIFTWOOD_DOOR = ITEMS.register(DDNames.TALL_DRIFTWOOD, () -> new TallDoorItem(DDBlocks.TALL_DRIFTWOOD_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_RIVER_DOOR = ITEMS.register(DDNames.TALL_RIVER, () -> new TallDoorItem(DDBlocks.TALL_RIVER_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_GLASS_DOOR = ITEMS.register(DDNames.TALL_GLASS, () -> new TallDoorItem(DDBlocks.TALL_GLASS_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));
    public static final RegistryObject<Item> TALL_TOOTH_DOOR = ITEMS.register(DDNames.TALL_TOOTH, () -> new TallDoorItem(DDBlocks.TALL_TOOTH_DOOR.get(), conditionalTabProperties("upgrade_aquatic")));

    // Team Aurora Mods
    public static final RegistryObject<Item> TALL_JACARANDA_DOOR = ITEMS.register(DDNames.TALL_JACARANDA, () -> new TallDoorItem(DDBlocks.TALL_JACARANDA_DOOR.get(), conditionalTabProperties("abundance")));
    public static final RegistryObject<Item> TALL_REDBUD_DOOR = ITEMS.register(DDNames.TALL_REDBUD, () -> new TallDoorItem(DDBlocks.TALL_REDBUD_DOOR.get(), conditionalTabProperties("abundance")));

    public static final RegistryObject<Item> TALL_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_CYPRESS_DOOR.get(), conditionalTabProperties("bayou_blues")));

    public static final RegistryObject<Item> TALL_BROWN_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_BROWN_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BROWN_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));
    public static final RegistryObject<Item> TALL_RED_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_RED_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_RED_MUSHROOM_DOOR.get(), conditionalTabProperties("enhanced_mushrooms")));

    // Ad Astra
    public static final RegistryObject<Item> TALL_AERONOS_DOOR = ITEMS.register(DDNames.TALL_AERONOS, () -> new TallDoorItem(DDBlocks.TALL_AERONOS_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> TALL_GLACIAN_DOOR = ITEMS.register(DDNames.TALL_GLACIAN, () -> new TallDoorItem(DDBlocks.TALL_GLACIAN_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> TALL_STROPHAR_DOOR = ITEMS.register(DDNames.TALL_STROPHAR, () -> new TallDoorItem(DDBlocks.TALL_STROPHAR_DOOR.get(), conditionalTabProperties("ad_astra")));
    public static final RegistryObject<Item> TALL_AA_STEEL_DOOR = ITEMS.register(DDNames.TALL_AA_STEEL, () -> new TallDoorItem(DDBlocks.TALL_AA_STEEL_DOOR.get(), conditionalTabProperties("ad_astra")));

    // Abundant Atmosphere
    public static final RegistryObject<Item> TALL_ASH_DOOR = ITEMS.register(DDNames.TALL_ASH, () -> new TallDoorItem(DDBlocks.TALL_ASH_DOOR.get(), conditionalTabProperties("abundant_atmosphere")));    
    
    // Architects Palette
    public static final RegistryObject<Item> TALL_TWISTED_DOOR = ITEMS.register(DDNames.TALL_TWISTED, () -> new TallDoorItem(DDBlocks.TALL_TWISTED_DOOR.get(), conditionalTabProperties("architects_palette")));
    
    // Ars Nouveau
    public static final RegistryObject<Item> TALL_ARCHWOOD_DOOR = ITEMS.register(DDNames.TALL_ARCHWOOD, () -> new TallDoorItem(DDBlocks.TALL_ARCHWOOD_DOOR.get(), conditionalTabProperties("ars_nouveau")));
    
    // Bamboo Everything
    public static final RegistryObject<Item> TALL_BE_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BE_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BE_BAMBOO_DOOR.get(), conditionalTabProperties("bambooeverything")));  
    public static final RegistryObject<Item> TALL_BE_DRY_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BE_DRY_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BE_DRY_BAMBOO_DOOR.get(), conditionalTabProperties("bambooeverything")));  
    
    // Biomancy
    public static final RegistryObject<Item> TALL_FLESH_DOOR = ITEMS.register(DDNames.TALL_FLESH, () -> new TallDoorItem(DDBlocks.TALL_FLESH_DOOR.get(), conditionalTabProperties("biomancy")));  
    public static final RegistryObject<Item> TALL_FULL_FLESH_DOOR = ITEMS.register(DDNames.TALL_FULL_FLESH, () -> new TallDoorItem(DDBlocks.TALL_FULL_FLESH_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("biomancy", "full_flesh_door"), conditionalTabProperties("biomancy"))));
    public static final RegistryObject<Item> TALL_FLESHKIN_DOOR = ITEMS.register(DDNames.TALL_FLESHKIN, () -> new TallDoorItem(DDBlocks.TALL_FLESHKIN_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("biomancy", "fleshkin_door"), conditionalTabProperties("biomancy"))));  
    
    // Biome Makeover
    public static final RegistryObject<Item> TALL_BM_ANCIENT_OAK_DOOR = ITEMS.register(DDNames.TALL_BM_ANCIENT_OAK, () -> new TallDoorItem(DDBlocks.TALL_BM_ANCIENT_OAK_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> TALL_BM_BLIGHTED_BALSA_DOOR = ITEMS.register(DDNames.TALL_BM_BLIGHTED_BALSA, () -> new TallDoorItem(DDBlocks.TALL_BM_BLIGHTED_BALSA_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> TALL_BM_SWAMP_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_BM_SWAMP_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_BM_SWAMP_CYPRESS_DOOR.get(), conditionalTabProperties("biomemakeover")));
    public static final RegistryObject<Item> TALL_BM_WILLOW_DOOR = ITEMS.register(DDNames.TALL_BM_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_BM_WILLOW_DOOR.get(), conditionalTabProperties("biomemakeover")));
    
    // Blocks Plus
    public static final RegistryObject<Item> TALL_BP_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_BP_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_BP_BAMBOO_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_BP_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BP_MUSHROOM_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_COPPER_DOOR = ITEMS.register(DDNames.TALL_BP_COPPER, () -> new TallDoorItem(DDBlocks.TALL_BP_COPPER_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_GOLDEN_DOOR = ITEMS.register(DDNames.TALL_BP_GOLDEN, () -> new TallDoorItem(DDBlocks.TALL_BP_GOLDEN_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_DIAMOND_DOOR = ITEMS.register(DDNames.TALL_BP_DIAMOND, () -> new TallDoorItem(DDBlocks.TALL_BP_DIAMOND_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_EMERALD_DOOR = ITEMS.register(DDNames.TALL_BP_EMERALD, () -> new TallDoorItem(DDBlocks.TALL_BP_EMERALD_DOOR.get(), conditionalTabProperties("blocksplus")));
    public static final RegistryObject<Item> TALL_BP_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_BP_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_BP_NETHERITE_DOOR.get(), conditionalTabProperties("blocksplus").fireResistant()));
    
    // Blue Skies
    public static final RegistryObject<Item> TALL_BS_BLUEBRIGHT_DOOR = ITEMS.register(DDNames.TALL_BS_BLUEBRIGHT, () -> new TallDoorItem(DDBlocks.TALL_BS_BLUEBRIGHT_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_CHERRY_DOOR = ITEMS.register(DDNames.TALL_BS_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_BS_CHERRY_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_CRYSTALLIZED_DOOR = ITEMS.register(DDNames.TALL_BS_CRYSTALLIZED, () -> new TallDoorItem(DDBlocks.TALL_BS_CRYSTALLIZED_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_DUSK_DOOR = ITEMS.register(DDNames.TALL_BS_DUSK, () -> new TallDoorItem(DDBlocks.TALL_BS_DUSK_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_FROSTBRIGHT_DOOR = ITEMS.register(DDNames.TALL_BS_FROSTBRIGHT, () -> new TallDoorItem(DDBlocks.TALL_BS_FROSTBRIGHT_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_LUNAR_DOOR = ITEMS.register(DDNames.TALL_BS_LUNAR, () -> new TallDoorItem(DDBlocks.TALL_BS_LUNAR_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_MAPLE_DOOR = ITEMS.register(DDNames.TALL_BS_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_BS_MAPLE_DOOR.get(), conditionalTabProperties("blue_skies")));
    public static final RegistryObject<Item> TALL_BS_STARLIT_DOOR = ITEMS.register(DDNames.TALL_BS_STARLIT, () -> new TallDoorItem(DDBlocks.TALL_BS_STARLIT_DOOR.get(), conditionalTabProperties("blue_skies")));
    
    // Caupona
    public static final RegistryObject<Item> TALL_WALNUT_DOOR = ITEMS.register(DDNames.TALL_WALNUT, () -> new TallDoorItem(DDBlocks.TALL_WALNUT_DOOR.get(), conditionalTabProperties("caupona")));
    
    // The Ceilands
    public static final RegistryObject<Item> TALL_CEILTRUNK_DOOR = ITEMS.register(DDNames.TALL_CEILTRUNK, () -> new TallDoorItem(DDBlocks.TALL_CEILTRUNK_DOOR.get(), conditionalTabProperties("ceilands")));
    public static final RegistryObject<Item> TALL_LUZAWOOD_DOOR = ITEMS.register(DDNames.TALL_LUZAWOOD, () -> new TallDoorItem(DDBlocks.TALL_LUZAWOOD_DOOR.get(), conditionalTabProperties("ceilands")));
    
    // Colourful Azaleas
    public static final RegistryObject<Item> TALL_AZURE_AZALEA_DOOR = ITEMS.register(DDNames.TALL_AZULE_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_AZULE_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_BRIGHT_AZALEA_DOOR = ITEMS.register(DDNames.TALL_BRIGHT_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_BRIGHT_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_FISS_AZALEA_DOOR = ITEMS.register(DDNames.TALL_FISS_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_FISS_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_ROZE_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ROZE_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ROZE_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_TECAL_AZALEA_DOOR = ITEMS.register(DDNames.TALL_TECAL_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_TECAL_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_TITANIUM_AZALEA_DOOR = ITEMS.register(DDNames.TALL_TITANIUM_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_TITANIUM_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    public static final RegistryObject<Item> TALL_WALNUT_AZALEA_DOOR = ITEMS.register(DDNames.TALL_WALNUT_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_WALNUT_AZALEA_DOOR.get(), conditionalTabProperties("colorfulazaleas")));
    
    // Copper Overhaul
    public static final RegistryObject<Item> TALL_CO_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));
    public static final RegistryObject<Item> TALL_CO_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_CO_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_CO_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("copperoverhaul")));    
    
    // Create: Alloyed
    public static final RegistryObject<Item> TALL_STEEL_DOOR = ITEMS.register(DDNames.TALL_STEEL, () -> new TallDoorItem(DDBlocks.TALL_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    public static final RegistryObject<Item> TALL_LOCKED_STEEL_DOOR = ITEMS.register(DDNames.TALL_LOCKED_STEEL, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_STEEL_DOOR.get(), conditionalTabProperties("alloyed")));
    
    // Create: Deco
    public static final RegistryObject<Item> TALL_ANDESITE_DOOR = ITEMS.register(DDNames.TALL_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_BRASS_DOOR = ITEMS.register(DDNames.TALL_BRASS, () -> new TallDoorItem(DDBlocks.TALL_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_COPPER_DOOR = ITEMS.register(DDNames.TALL_COPPER, () -> new TallDoorItem(DDBlocks.TALL_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_ZINC_DOOR = ITEMS.register(DDNames.TALL_ZINC, () -> new TallDoorItem(DDBlocks.TALL_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ANDESITE_DOOR = ITEMS.register(DDNames.TALL_LOCKED_ANDESITE, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ANDESITE_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_BRASS_DOOR = ITEMS.register(DDNames.TALL_LOCKED_BRASS, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_BRASS_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_COPPER_DOOR = ITEMS.register(DDNames.TALL_LOCKED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_COPPER_DOOR.get(), conditionalTabProperties("createdeco")));
    public static final RegistryObject<Item> TALL_LOCKED_ZINC_DOOR = ITEMS.register(DDNames.TALL_LOCKED_ZINC, () -> new TallDoorItem(DDBlocks.TALL_LOCKED_ZINC_DOOR.get(), conditionalTabProperties("createdeco")));

    // Darker Depths
    public static final RegistryObject<Item> TALL_PETRIFIED_DOOR = ITEMS.register(DDNames.TALL_PETRIFIED, () -> new TallDoorItem(DDBlocks.TALL_PETRIFIED_DOOR.get(), conditionalTabProperties("darkerdepths")));

    // Deeper Darker
    public static final RegistryObject<Item> TALL_ECHO_DOOR = ITEMS.register(DDNames.TALL_ECHO, () -> new TallDoorItem(DDBlocks.TALL_ECHO_DOOR.get(), conditionalTabProperties("deeperdarker")));    
    
    // Dustrial Decor
    public static final RegistryObject<Item> TALL_CARDBOARD_DOOR = ITEMS.register(DDNames.TALL_CARDBOARD, () -> new TallDoorItem(DDBlocks.TALL_CARDBOARD_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_CHAIN_DOOR = ITEMS.register(DDNames.TALL_CHAIN, () -> new TallDoorItem(DDBlocks.TALL_CHAIN_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_INDUSTRIAL_IRON_DOOR = ITEMS.register(DDNames.TALL_INDUSTRIAL_IRON, () -> new TallDoorItem(DDBlocks.TALL_INDUSTRIAL_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_IRON_BAR_DOOR = ITEMS.register(DDNames.TALL_IRON_BAR, () -> new TallDoorItem(DDBlocks.TALL_IRON_BAR_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_PADDED_DOOR = ITEMS.register(DDNames.TALL_PADDED, () -> new TallDoorItem(DDBlocks.TALL_PADDED_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_IRON_DOOR = ITEMS.register(DDNames.TALL_RUSTY_IRON, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_IRON_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_RUSTY_SHEET_METAL_DOOR = ITEMS.register(DDNames.TALL_RUSTY_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_RUSTY_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    public static final RegistryObject<Item> TALL_SHEET_METAL_DOOR = ITEMS.register(DDNames.TALL_SHEET_METAL, () -> new TallDoorItem(DDBlocks.TALL_SHEET_METAL_DOOR.get(), conditionalTabProperties("dustrial_decor")));
    
    // Ecologics
    public static final RegistryObject<Item> TALL_ECO_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ECO_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_FLOWERING_AZALEA_DOOR = ITEMS.register(DDNames.TALL_ECO_FLOWERING_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_ECO_FLOWERING_AZALEA_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_COCONUT_DOOR = ITEMS.register(DDNames.TALL_ECO_COCONUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_COCONUT_DOOR.get(), conditionalTabProperties("ecologics")));
    public static final RegistryObject<Item> TALL_ECO_WALNUT_DOOR = ITEMS.register(DDNames.TALL_ECO_WALNUT, () -> new TallDoorItem(DDBlocks.TALL_ECO_WALNUT_DOOR.get(), conditionalTabProperties("ecologics")));
    
    // End's Phantasm
    public static final RegistryObject<Item> TALL_EBONY_DOOR = ITEMS.register(DDNames.TALL_EBONY, () -> new TallDoorItem(DDBlocks.TALL_EBONY_DOOR.get(), conditionalTabProperties("phantasm")));
    public static final RegistryObject<Item> TALL_PREAM_DOOR = ITEMS.register(DDNames.TALL_PREAM, () -> new TallDoorItem(DDBlocks.TALL_PREAM_DOOR.get(), conditionalTabProperties("phantasm")));
    
    // Enlightened End
    public static final RegistryObject<Item> TALL_CERULEAN_DOOR = ITEMS.register(DDNames.TALL_CERULEAN, () -> new TallDoorItem(DDBlocks.TALL_CERULEAN_DOOR.get(), conditionalTabProperties("nourished_end")));
    public static final RegistryObject<Item> TALL_COSMIC_DOOR = ITEMS.register(DDNames.TALL_COSMIC, () -> new TallDoorItem(DDBlocks.TALL_COSMIC_DOOR.get(), conditionalTabProperties("nourished_end")));
    public static final RegistryObject<Item> TALL_SELDGE_DOOR = ITEMS.register(DDNames.TALL_SELDGE, () -> new TallDoorItem(DDBlocks.TALL_SELDGE_DOOR.get(), conditionalTabProperties("nourished_end")));
    public static final RegistryObject<Item> TALL_STALK_DOOR = ITEMS.register(DDNames.TALL_STALK, () -> new TallDoorItem(DDBlocks.TALL_STALK_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("nourished_end", "stalk_door"), conditionalTabProperties("nourished_end"))));
    public static final RegistryObject<Item> TALL_VERDANT_DOOR = ITEMS.register(DDNames.TALL_VERDANT, () -> new TallDoorItem(DDBlocks.TALL_VERDANT_DOOR.get(), conditionalTabProperties("nourished_end")));
    
    // Everything Copper
    public static final RegistryObject<Item> TALL_EC_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_EXPOSED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_EXPOSED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_EXPOSED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_WEATHERED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_WEATHERED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_WEATHERED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    public static final RegistryObject<Item> TALL_EC_WAXED_OXIDIZED_COPPER_DOOR = ITEMS.register(DDNames.TALL_EC_WAXED_OXIDIZED_COPPER, () -> new TallDoorItem(DDBlocks.TALL_EC_WAXED_OXIDIZED_COPPER_DOOR.get(), conditionalTabProperties("everythingcopper")));
    
    // Extended Mushrooms
    public static final RegistryObject<Item> TALL_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_MUSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> TALL_GLOWSHROOM_DOOR = ITEMS.register(DDNames.TALL_GLOWSHROOM, () -> new TallDoorItem(DDBlocks.TALL_GLOWSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> TALL_POISONOUS_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_POISONOUS_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_POISONOUS_MUSHROOM_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    public static final RegistryObject<Item> TALL_HONEY_FUNGUS_DOOR = ITEMS.register(DDNames.TALL_HONEY_FUNGUS, () -> new TallDoorItem(DDBlocks.TALL_HONEY_FUNGUS_DOOR.get(), conditionalTabProperties("extendedmushrooms")));
    
    // Forbidden & Arcanus
    public static final RegistryObject<Item> TALL_ARCANE_GOLD_DOOR = ITEMS.register(DDNames.TALL_ARCANE_GOLD, () -> new TallDoorItem(DDBlocks.TALL_ARCANE_GOLD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_CHERRYWOOD_DOOR = ITEMS.register(DDNames.TALL_CHERRYWOOD, () -> new TallDoorItem(DDBlocks.TALL_CHERRYWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_EDELWOOD_DOOR = ITEMS.register(DDNames.TALL_EDELWOOD, () -> new TallDoorItem(DDBlocks.TALL_EDELWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_FUNGYSS_DOOR = ITEMS.register(DDNames.TALL_FUNGYSS, () -> new TallDoorItem(DDBlocks.TALL_FUNGYSS_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    public static final RegistryObject<Item> TALL_MYSTERYWOOD_DOOR = ITEMS.register(DDNames.TALL_MYSTERYWOOD, () -> new TallDoorItem(DDBlocks.TALL_MYSTERYWOOD_DOOR.get(), conditionalTabProperties("forbidden_arcanus")));
    
    // Fruit Trees
    public static final RegistryObject<Item> TALL_FT_CHERRY_DOOR = ITEMS.register(DDNames.TALL_FT_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_FT_CHERRY_DOOR.get(), conditionalTabProperties("fruittrees")));
    public static final RegistryObject<Item> TALL_FT_CHERRY_SLIDING_DOOR = ITEMS.register(DDNames.TALL_FT_CHERRY_SLIDING, () -> new TallDoorItem(DDBlocks.TALL_FT_CHERRY_SLIDING_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("fruittrees", "cherry_sliding_door"), conditionalTabProperties("fruittrees"))));
    public static final RegistryObject<Item> TALL_FT_CITRUS_DOOR = ITEMS.register(DDNames.TALL_FT_CITRUS, () -> new TallDoorItem(DDBlocks.TALL_FT_CITRUS_DOOR.get(), conditionalTabProperties("fruittrees")));
        
    // Garden of the Dead
    public static final RegistryObject<Item> TALL_SOULBLIGHT_DOOR = ITEMS.register(DDNames.TALL_SOULBLIGHT, () -> new TallDoorItem(DDBlocks.TALL_SOULBLIGHT_DOOR.get(), conditionalTabProperties("gardens_of_the_dead")));
    public static final RegistryObject<Item> TALL_WHISTLECANE_DOOR = ITEMS.register(DDNames.TALL_WHISTLECANE, () -> new TallDoorItem(DDBlocks.TALL_WHISTLECANE_DOOR.get(), conditionalTabProperties("gardens_of_the_dead")));
    
    // Good Ending
    public static final RegistryObject<Item> TALL_GE_CYPRESS_DOOR = ITEMS.register(DDNames.TALL_GE_CYPRESS, () -> new TallDoorItem(DDBlocks.TALL_GE_CYPRESS_DOOR.get(), conditionalTabProperties("goodending")));
    public static final RegistryObject<Item> TALL_GE_MUDDY_OAK_DOOR = ITEMS.register(DDNames.TALL_GE_MUDDY_OAK, () -> new TallDoorItem(DDBlocks.TALL_GE_MUDDY_OAK_DOOR.get(), conditionalTabProperties("goodending")));
    
    // Graveyard
    public static final RegistryObject<Item> TALL_DARK_IRON_DOOR = ITEMS.register(DDNames.TALL_DARK_IRON, () -> new TallDoorItem(DDBlocks.TALL_DARK_IRON_DOOR.get(), conditionalTabProperties("graveyard")));
    
    // Habitat
    public static final RegistryObject<Item> TALL_FAIRY_RING_MUSHROOM_DOOR = ITEMS.register(DDNames.TALL_FAIRY_RING_MUSHROOM, () -> new TallDoorItem(DDBlocks.TALL_FAIRY_RING_MUSHROOM_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("habitat", "fairy_ring_mushroom_door"), conditionalTabProperties("habitat"))));
    
    // Hexcasting
    public static final RegistryObject<Item> TALL_AKASHIC_DOOR = ITEMS.register(DDNames.TALL_AKASHIC, () -> new TallDoorItem(DDBlocks.TALL_AKASHIC_DOOR.get(), conditionalTabProperties("hexcasting")));
    
    // Hexeri
    public static final RegistryObject<Item> TALL_HEXEREI_MAHOGANY_DOOR = ITEMS.register(DDNames.TALL_HEXEREI_MAHOGANY, () -> new TallDoorItem(DDBlocks.TALL_HEXEREI_MAHOGANY_DOOR.get(), conditionalTabProperties("hexerei")));
    public static final RegistryObject<Item> TALL_HEXEREI_WILLOW_DOOR = ITEMS.register(DDNames.TALL_HEXEREI_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_HEXEREI_WILLOW_DOOR.get(), conditionalTabProperties("hexerei")));
    
    // Integrated Dynamics
    public static final RegistryObject<Item> TALL_MENRIL_DOOR = ITEMS.register(DDNames.TALL_MENRIL, () -> new TallDoorItem(DDBlocks.TALL_MENRIL_DOOR.get(), conditionalTabProperties("integrateddynamics")));    
    
    // Malum
    public static final RegistryObject<Item> TALL_RUNEWOOD_DOOR = ITEMS.register(DDNames.TALL_RUNEWOOD, () -> new TallDoorItem(DDBlocks.TALL_RUNEWOOD_DOOR.get(), conditionalTabProperties("malum")));    
    public static final RegistryObject<Item> TALL_SOULWOOD_DOOR = ITEMS.register(DDNames.TALL_SOULWOOD, () -> new TallDoorItem(DDBlocks.TALL_SOULWOOD_DOOR.get(), conditionalTabProperties("malum")));        
    
    // Mo' Shiz
    public static final RegistryObject<Item> TALL_MS_IRON_BAR_DOOR = ITEMS.register(DDNames.TALL_MS_IRON_BAR, () -> new TallDoorItem(DDBlocks.TALL_MS_IRON_BAR_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_MS_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_MS_BAMBOO_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_CHERRY_DOOR = ITEMS.register(DDNames.TALL_MS_CHERRY, () -> new TallDoorItem(DDBlocks.TALL_MS_CHERRY_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_GLOWOOD_DOOR = ITEMS.register(DDNames.TALL_MS_GLOWOOD, () -> new TallDoorItem(DDBlocks.TALL_MS_GLOWOOD_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_HELLWOOD_DOOR = ITEMS.register(DDNames.TALL_MS_HELLWOOD, () -> new TallDoorItem(DDBlocks.TALL_MS_HELLWOOD_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_MAPLE_DOOR = ITEMS.register(DDNames.TALL_MS_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_MS_MAPLE_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_SILVERBELL_DOOR = ITEMS.register(DDNames.TALL_MS_SILVERBELL, () -> new TallDoorItem(DDBlocks.TALL_MS_SILVERBELL_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_TIGERWOOD_DOOR = ITEMS.register(DDNames.TALL_MS_TIGERWOOD, () -> new TallDoorItem(DDBlocks.TALL_MS_TIGERWOOD_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_WILLOW_DOOR = ITEMS.register(DDNames.TALL_MS_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_MS_WILLOW_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_SOUL_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_SOUL_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_SOUL_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_TINTED_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_TINTED_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_TINTED_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_BLACK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_BLACK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_BLACK_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_GREY_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_GREY_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_GREY_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_LIGHT_GREY_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_LIGHT_GREY_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_LIGHT_GREY_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_WHITE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_WHITE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_WHITE_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_RED_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_RED_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_RED_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_ORANGE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_ORANGE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_ORANGE_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_YELLOW_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_YELLOW_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_YELLOW_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_LIME_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_LIME_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_LIME_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_GREEN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_GREEN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_GREEN_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_CYAN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_CYAN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_CYAN_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_BLUE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_BLUE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_BLUE_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_PURPLE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_PURPLE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_PURPLE_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_MAGENTA_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_MAGENTA_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_MAGENTA_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_PINK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_PINK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_PINK_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_LIGHT_BLUE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_LIGHT_BLUE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_LIGHT_BLUE_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    public static final RegistryObject<Item> TALL_MS_BROWN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MS_BROWN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MS_BROWN_GLASS_DOOR.get(), conditionalTabProperties("ms")));
    
    // Nether's Exoticism
    public static final RegistryObject<Item> TALL_JABOTICABA_DOOR = ITEMS.register(DDNames.TALL_JABOTICABA, () -> new TallDoorItem(DDBlocks.TALL_JABOTICABA_DOOR.get(), conditionalTabProperties("nethers_exoticism")));
    public static final RegistryObject<Item> TALL_RAMBOUTAN_DOOR = ITEMS.register(DDNames.TALL_RAMBOUTAN, () -> new TallDoorItem(DDBlocks.TALL_RAMBOUTAN_DOOR.get(), conditionalTabProperties("nethers_exoticism")));    
    
    // New World
    public static final RegistryObject<Item> TALL_FIR_DOOR = ITEMS.register(DDNames.TALL_FIR, () -> new TallDoorItem(DDBlocks.TALL_FIR_DOOR.get(), conditionalTabProperties("newworld")));
    
    // Outer End
    public static final RegistryObject<Item> TALL_AZURE_DOOR = ITEMS.register(DDNames.TALL_AZURE, () -> new TallDoorItem(DDBlocks.TALL_AZURE_DOOR.get(), conditionalTabProperties("outer_end")));
    
    // Pokecube
    public static final RegistryObject<Item> TALL_POKECUBE_ENIGMA_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_ENIGMA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_ENIGMA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_LEPPA_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_LEPPA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_LEPPA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_NANAB_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_NANAB, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_NANAB_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_ORAN_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_ORAN, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_ORAN_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_PECHA_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_PECHA, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_PECHA_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_SITRUS_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_SITRUS, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_SITRUS_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_AGED_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_AGED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_AGED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_CONCRETE_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_CONCRETE, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_CONCRETE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_CORRUPTED_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_CORRUPTED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_CORRUPTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_DISTORTIC_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_DISTORTIC, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_DISTORTIC_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_INVERTED_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_INVERTED, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_INVERTED_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_MIRAGE_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_MIRAGE, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_MIRAGE_DOOR.get(), conditionalTabProperties("pokecube")));
    public static final RegistryObject<Item> TALL_POKECUBE_TEMPORAL_DOOR = ITEMS.register(DDNames.TALL_POKECUBE_TEMPORAL, () -> new TallDoorItem(DDBlocks.TALL_POKECUBE_TEMPORAL_DOOR.get(), conditionalTabProperties("pokecube")));
    
    // Premium Wood
    public static final RegistryObject<Item> TALL_PW_MAGIC_DOOR = ITEMS.register(DDNames.TALL_PW_MAGIC, () -> new TallDoorItem(DDBlocks.TALL_PW_MAGIC_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_MAPLE_DOOR = ITEMS.register(DDNames.TALL_PW_MAPLE, () -> new TallDoorItem(DDBlocks.TALL_PW_MAPLE_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_PURPLE_HEART_DOOR = ITEMS.register(DDNames.TALL_PW_PURPLE_HEART, () -> new TallDoorItem(DDBlocks.TALL_PW_PURPLE_HEART_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_SILVERBELL_DOOR = ITEMS.register(DDNames.TALL_PW_SILVERBELL, () -> new TallDoorItem(DDBlocks.TALL_PW_SILVERBELL_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_TIGER_DOOR = ITEMS.register(DDNames.TALL_PW_TIGER, () -> new TallDoorItem(DDBlocks.TALL_PW_TIGER_DOOR.get(), conditionalTabProperties("premium_wood")));
    public static final RegistryObject<Item> TALL_PW_WILLOW_DOOR = ITEMS.register(DDNames.TALL_PW_WILLOW, () -> new TallDoorItem(DDBlocks.TALL_PW_WILLOW_DOOR.get(), conditionalTabProperties("premium_wood")));
    
    // Pyromancer
    public static final RegistryObject<Item> TALL_PYROWOOD_DOOR = ITEMS.register(DDNames.TALL_PYROWOOD, () -> new TallDoorItem(DDBlocks.TALL_PYROWOOD_DOOR.get(), conditionalTabProperties("pyromancer")));
    public static final RegistryObject<Item> TALL_ROTTEN_PLANKS_DOOR = ITEMS.register(DDNames.TALL_ROTTEN_PLANKS, () -> new TallDoorItem(DDBlocks.TALL_ROTTEN_PLANKS_DOOR.get(), conditionalTabProperties("pyromancer")));
    
    // Quark
    public static final RegistryObject<Item> TALL_QUARK_AZALEA_DOOR = ITEMS.register(DDNames.TALL_QUARK_AZALEA, () -> new TallDoorItem(DDBlocks.TALL_QUARK_AZALEA_DOOR.get(), conditionalTabProperties("quark")));
    public static final RegistryObject<Item> TALL_QUARK_BLOSSOM_DOOR = ITEMS.register(DDNames.TALL_QUARK_BLOSSOM, () -> new TallDoorItem(DDBlocks.TALL_QUARK_BLOSSOM_DOOR.get(), conditionalTabProperties("quark")));
    
    // Silent Gear
    public static final RegistryObject<Item> TALL_NETHERWOOD_DOOR = ITEMS.register(DDNames.TALL_NETHERWOOD, () -> new TallDoorItem(DDBlocks.TALL_NETHERWOOD_DOOR.get(), conditionalTabProperties("silentgear")));
    
    // Snowy Spirit
    public static final RegistryObject<Item> TALL_GINGERBREAD_DOOR = ITEMS.register(DDNames.TALL_GINGERBREAD, () -> new TallDoorItem(DDBlocks.TALL_GINGERBREAD_DOOR.get(), conditionalTabProperties("snowyspirit")));
    
    // Supplementaries
    public static final RegistryObject<Item> TALL_GOLD_DOOR = ITEMS.register(DDNames.TALL_GOLD, () -> new TallDoorItem(DDBlocks.TALL_GOLD_DOOR.get(), conditionalTabProperties("supplementaries")));
    public static final RegistryObject<Item> TALL_SILVER_DOOR = ITEMS.register(DDNames.TALL_SILVER, () -> new TallDoorItem(DDBlocks.TALL_SILVER_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "silver_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> TALL_LEAD_DOOR = ITEMS.register(DDNames.TALL_LEAD, () -> new TallDoorItem(DDBlocks.TALL_LEAD_DOOR.get(), addIfItemIsAvailable(new ResourceLocation("supplementaries", "lead_door"), conditionalTabProperties("supplementaries"))));
    public static final RegistryObject<Item> TALL_NETHERITE_DOOR = ITEMS.register(DDNames.TALL_NETHERITE, () -> new TallDoorItem(DDBlocks.TALL_NETHERITE_DOOR.get(), conditionalTabProperties("supplementaries").fireResistant()));
    
    // Tinkers Construct
    public static final RegistryObject<Item> TALL_BLOODSHROOM_DOOR = ITEMS.register(DDNames.TALL_BLOODSHROOM, () -> new TallDoorItem(DDBlocks.TALL_BLOODSHROOM_DOOR.get(), conditionalTabProperties("tconstruct")));
    public static final RegistryObject<Item> TALL_GREENHEART_DOOR = ITEMS.register(DDNames.TALL_GREENHEART, () -> new TallDoorItem(DDBlocks.TALL_GREENHEART_DOOR.get(), conditionalTabProperties("tconstruct")));
    public static final RegistryObject<Item> TALL_SKYROOT_DOOR = ITEMS.register(DDNames.TALL_SKYROOT, () -> new TallDoorItem(DDBlocks.TALL_SKYROOT_DOOR.get(), conditionalTabProperties("tconstruct")));
    
    // Twigs
    public static final RegistryObject<Item> TALL_TWIGS_BAMBOO_DOOR = ITEMS.register(DDNames.TALL_TWIGS_BAMBOO, () -> new TallDoorItem(DDBlocks.TALL_TWIGS_BAMBOO_DOOR.get(), conditionalTabProperties("twigs")));
    
    // Undergarden
    public static final RegistryObject<Item> TALL_GRONGLE_DOOR = ITEMS.register(DDNames.TALL_GRONGLE, () -> new TallDoorItem(DDBlocks.TALL_GRONGLE_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_SMOGSTEM_DOOR = ITEMS.register(DDNames.TALL_SMOGSTEM, () -> new TallDoorItem(DDBlocks.TALL_SMOGSTEM_DOOR.get(), conditionalTabProperties("undergarden")));
    public static final RegistryObject<Item> TALL_WIGGLEWOOD_DOOR = ITEMS.register(DDNames.TALL_WIGGLEWOOD, () -> new TallDoorItem(DDBlocks.TALL_WIGGLEWOOD_DOOR.get(), conditionalTabProperties("undergarden")));
    
    // Windswept
    public static final RegistryObject<Item> TALL_GOLDEN_DOOR = ITEMS.register(DDNames.TALL_GOLDEN, () -> new TallDoorItem(DDBlocks.TALL_GOLDEN_DOOR.get(), conditionalTabProperties("windswept")));
    public static final RegistryObject<Item> TALL_CHESTNUT_DOOR = ITEMS.register(DDNames.TALL_CHESTNUT, () -> new TallDoorItem(DDBlocks.TALL_CHESTNUT_DOOR.get(), conditionalTabProperties("windswept")));
    public static final RegistryObject<Item> TALL_HOLLY_DOOR = ITEMS.register(DDNames.TALL_HOLLY, () -> new TallDoorItem(DDBlocks.TALL_HOLLY_DOOR.get(), conditionalTabProperties("windswept")));    
    
    // Chipped
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_OAK_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_OAK_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_OAK_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_SPRUCE_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_SPRUCE_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_SPRUCE_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));

    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_BIRCH_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_BIRCH_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_BIRCH_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));

    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_JUNGLE_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_JUNGLE_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_JUNGLE_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));

    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_ACACIA_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_ACACIA_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_ACACIA_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));

    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_DARK_OAK_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_DARK_OAK_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_DARK_OAK_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));

    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_CRIMSON_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_CRIMSON_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_CRIMSON_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));

    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_01 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_01, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_01.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_02 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_02, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_02.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_03 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_03, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_03.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_04 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_04, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_04.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_05 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_05, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_05.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_06 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_06, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_06.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_07 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_07, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_07.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_08 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_08, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_08.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_09 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_09, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_09.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_10 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_10, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_10.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_11 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_11, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_11.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_12 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_12, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_12.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_13 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_13, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_13.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_14 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_14, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_14.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_15 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_15, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_15.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_16 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_16, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_16.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_17 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_17, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_17.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_18 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_18, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_18.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_19 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_19, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_19.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    public static final RegistryObject<Item> TALL_CHIPPED_WARPED_DOOR_20 = ITEMS.register(DDNames.TALL_CHIPPED_WARPED_20, () -> new TallDoorItem(DDBlocks.TALL_CHIPPED_WARPED_DOOR_20.get(), PROPERTIES.tab(DramaticDoors.CHIPPED_TAB)));
    
    // Macaw
    public static final RegistryObject<Item> TALL_MACAW_JAIL_DOOR = ITEMS.register(DDNames.TALL_MACAW_JAIL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JAIL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_HOSPITAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_HOSPITAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_HOSPITAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_REINFORCED_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_REINFORCED, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_REINFORCED_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_WARNING_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_WARNING, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WARNING_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_METAL_WINDOWED_DOOR = ITEMS.register(DDNames.TALL_MACAW_METAL_WINDOWED, () -> new TallDoorItem(DDBlocks.TALL_MACAW_METAL_WINDOWED_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_BARN_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_BARN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_BARN_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_BARN_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BARN_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_STABLE_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_STABLE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_STABLE_HEAD_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_STABLE_HEAD, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STABLE_HEAD_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BARK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BARK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_STEM_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_STEM_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_STEM_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_STEM_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_STEM_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_STEM_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_GLASS_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_GLASS_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    
    public static final RegistryObject<Item> TALL_MACAW_OAK_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_MODERN_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_MODERN_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_JAPANESE_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_JAPANESE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_JAPANESE2_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_JAPANESE2, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_JAPANESE2_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_CLASSIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_CLASSIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_CLASSIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_COTTAGE_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_COTTAGE, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_COTTAGE_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_PAPER_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_PAPER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_PAPER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_BEACH_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_BEACH, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_BEACH_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_TROPICAL_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_TROPICAL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_TROPICAL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_FOUR_PANEL_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_FOUR_PANEL, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_FOUR_PANEL_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_SWAMP_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_SWAMP, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_SWAMP_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    
    public static final RegistryObject<Item> TALL_MACAW_OAK_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_WARPED_NETHER_DOOR = ITEMS.register(DDNames.TALL_MACAW_WARPED_NETHER, () -> new TallDoorItem(DDBlocks.TALL_MACAW_WARPED_NETHER_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    public static final RegistryObject<Item> TALL_MACAW_OAK_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_OAK_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_OAK_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_SPRUCE_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_SPRUCE_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_SPRUCE_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_BIRCH_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_BIRCH_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_BIRCH_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_JUNGLE_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_JUNGLE_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_JUNGLE_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_ACACIA_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_ACACIA_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_ACACIA_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_DARK_OAK_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_DARK_OAK_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_DARK_OAK_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));
    public static final RegistryObject<Item> TALL_MACAW_CRIMSON_MYSTIC_DOOR = ITEMS.register(DDNames.TALL_MACAW_CRIMSON_MYSTIC, () -> new TallDoorItem(DDBlocks.TALL_MACAW_CRIMSON_MYSTIC_DOOR.get(), conditionalTabProperties("mcwdoors", DramaticDoors.MACAW_TAB)));

    // ManyIdeas Doors
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_BAR_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_BAR, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_BAR_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_BARREL_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_BARREL, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_BARREL_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_BRICK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_BRICK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_BRICK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_CORRUGATED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_CORRUGATED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_CORRUGATED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_FACTORY_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_FACTORY, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_FACTORY_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_MODERN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_MODERN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_MODERN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_SHIP_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_SHIP, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_SHIP_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_SMOOTH_SANDSTONE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_COPPER_STEAMPUNK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_COPPER_STEAMPUNK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_COPPER_STEAMPUNK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_DWARF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_DWARF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_DWARF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_FANTASY_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_FANTASY, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_FANTASY_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_LABORATORY_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_LABORATORY, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_LABORATORY_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_RUSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_RUSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_RUSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_SAFE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_SAFE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_SAFE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_SHIP_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_SHIP, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_SHIP_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_SPACE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_SPACE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_SPACE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_IRON_STONE_BRICK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_IRON_STONE_BRICK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_IRON_STONE_BRICK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_OAK_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_OAK_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_OAK_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_SPRUCE_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_SPRUCE_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_SPRUCE_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_BIRCH_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_BIRCH_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_BIRCH_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_JUNGLE_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_JUNGLE_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_JUNGLE_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_ACACIA_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_ACACIA_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_ACACIA_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_DARK_OAK_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_DARK_OAK_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_DARK_OAK_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_CRIMSON_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_CRIMSON_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_CRIMSON_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_BLANK_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_BLANK, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_BLANK_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_BOOKSHELF_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_BOOKSHELF, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_BOOKSHELF_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_CASSETTE_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_CASSETTE, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_CASSETTE_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_FRENCH_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_FRENCH, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_FRENCH_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_FROSTED_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_FROSTED, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_FROSTED_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_GLASS_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_GLASS_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_HEART_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_HEART, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_HEART_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_ORIGIN_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_ORIGIN, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_ORIGIN_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_RUSTIC_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_RUSTIC, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_RUSTIC_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));
    public static final RegistryObject<Item> TALL_MANYIDEAS_WARPED_SHOJI_DOOR = ITEMS.register(DDNames.TALL_MANYIDEAS_WARPED_SHOJI, () -> new TallDoorItem(DDBlocks.TALL_MANYIDEAS_WARPED_SHOJI_DOOR.get(), conditionalTabProperties("manyideas_doors", DramaticDoors.MANYIDEAS_TAB)));

    //ModernLife with ModernLifePatch
    public static final RegistryObject<Item> TALL_MLP_MODERN_WHITE_DOOR = ITEMS.register(DDNames.TALL_MLP_MODERN_WHITE, () -> new TallDoorItem(DDBlocks.TALL_MLP_MODERN_WHITE_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_CRIMSON_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_CRIMSON_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_CRIMSON_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_JUNGLE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_JUNGLE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_JUNGLE_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_IRON_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_IRON_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_IRON_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_WARPED_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_WARPED_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_WARPED_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_DARK_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_DARK_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_DARK_OAK_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_ACACIA_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_ACACIA_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_ACACIA_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_BIRCH_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_BIRCH_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_BIRCH_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_SPRUCE_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_SPRUCE_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_SPRUCE_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
    public static final RegistryObject<Item> TALL_MLP_OAK_GLASS_DOOR = ITEMS.register(DDNames.TALL_MLP_OAK_GLASS, () -> new TallDoorItem(DDBlocks.TALL_MLP_OAK_GLASS_DOOR.get(), conditionalTabProperties("modernlifepatch")));
	private static Item.Properties conditionalTabProperties(String modid) {
     return conditionalTabProperties(modid, DramaticDoors.MAIN_TAB);
	}
    
    private static Item.Properties conditionalTabProperties(String modid, CreativeModeTab tab) {
    	return ModList.get().isLoaded(modid) ? PROPERTIES.tab(tab) : PROPERTIES.tab(null);
    }
    
    // If a mod conditionally adds doors, only make doors available if the corresponding normal-sized doors are available.
	private static Item.Properties addIfItemIsAvailable(ResourceLocation loc, Item.Properties tabProperties) {
    	if (ForgeRegistries.ITEMS.containsKey(loc)) {
    		Item item = ForgeRegistries.ITEMS.getValue(loc);
	    	if (item.getItemCategory() != null) {
	    		return tabProperties;
	    	}
    	}
    	return PROPERTIES.tab(null);
    }
}
