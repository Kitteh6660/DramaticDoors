package com.fizzware.dramaticdoors.forge.client;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.forge.ForgeUtils;
import com.fizzware.dramaticdoors.forge.addons.create.client.TallSlidingDoorBlockRenderer;
import com.fizzware.dramaticdoors.forge.addons.framedblocks.client.DDFramedBlocksClient;
import com.fizzware.dramaticdoors.forge.compat.CreateForgeCompat;
import com.fizzware.dramaticdoors.forge.compat.ExtraDetailsForgeCompat;
import com.fizzware.dramaticdoors.DDNames;
import com.google.common.collect.ImmutableList;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import oshi.util.tuples.Pair;

public class RenderHandler
{
	public static final ImmutableList<String> TRANSLUCENT_DOORS = ImmutableList.of(DDNames.SHORT_BYG_EMBUR, DDNames.SHORT_BYG_ETHER, DDNames.SHORT_BYG_MAPLE, DDNames.SHORT_BYG_REDWOOD, DDNames.SHORT_BYG_SKYRIS, DDNames.SHORT_BYG_SOUL_SHROOM, DDNames.SHORT_BOP_MAGIC, DDNames.SHORT_MORECRAFT_GLASS, DDNames.SHORT_MORECRAFT_SOUL_GLASS,
			DDNames.SHORT_MS_GLASS, DDNames.SHORT_MS_SOUL_GLASS, DDNames.SHORT_MS_TINTED_GLASS, DDNames.SHORT_MS_BLACK_GLASS, DDNames.SHORT_MS_GREY_GLASS, DDNames.SHORT_MS_LIGHT_GREY_GLASS, DDNames.SHORT_MS_WHITE_GLASS, DDNames.SHORT_MS_RED_GLASS, DDNames.SHORT_MS_ORANGE_GLASS, DDNames.SHORT_MS_YELLOW_GLASS, DDNames.SHORT_MS_LIME_GLASS, DDNames.SHORT_MS_GREEN_GLASS, DDNames.SHORT_MS_CYAN_GLASS, DDNames.SHORT_MS_BLUE_GLASS, DDNames.SHORT_MS_PURPLE_GLASS, DDNames.SHORT_MS_MAGENTA_GLASS, DDNames.SHORT_MS_PINK_GLASS, DDNames.SHORT_MS_LIGHT_BLUE_GLASS, DDNames.SHORT_MS_BROWN_GLASS, 
			DDNames.SHORT_MD_CALCITE, DDNames.SHORT_MD_ICE, DDNames.SHORT_MD_GLASS, DDNames.SHORT_MD_TINTED_GLASS, DDNames.SHORT_MD_BLACK_STAINED_GLASS, DDNames.SHORT_MD_GRAY_STAINED_GLASS, DDNames.SHORT_MD_LIGHT_GRAY_STAINED_GLASS, DDNames.SHORT_MD_WHITE_STAINED_GLASS, DDNames.SHORT_MD_RED_STAINED_GLASS, DDNames.SHORT_MD_ORANGE_STAINED_GLASS, DDNames.SHORT_MD_YELLOW_STAINED_GLASS, DDNames.SHORT_MD_LIME_STAINED_GLASS, DDNames.SHORT_MD_GREEN_STAINED_GLASS, DDNames.SHORT_MD_CYAN_STAINED_GLASS, DDNames.SHORT_MD_BLUE_STAINED_GLASS, DDNames.SHORT_MD_PURPLE_STAINED_GLASS, DDNames.SHORT_MD_MAGENTA_STAINED_GLASS, DDNames.SHORT_MD_PINK_STAINED_GLASS, DDNames.SHORT_MD_LIGHT_BLUE_STAINED_GLASS, DDNames.SHORT_MD_BROWN_STAINED_GLASS, 
			DDNames.TALL_BYG_EMBUR, DDNames.TALL_BYG_ETHER, DDNames.TALL_BYG_MAPLE, DDNames.TALL_BYG_REDWOOD, DDNames.TALL_BYG_SKYRIS, DDNames.TALL_BYG_SOUL_SHROOM, DDNames.TALL_BOP_MAGIC, DDNames.TALL_MORECRAFT_GLASS, DDNames.TALL_MORECRAFT_SOUL_GLASS, 
			DDNames.TALL_MS_GLASS, DDNames.TALL_MS_SOUL_GLASS, DDNames.TALL_MS_TINTED_GLASS, DDNames.TALL_MS_BLACK_GLASS, DDNames.TALL_MS_GREY_GLASS, DDNames.TALL_MS_LIGHT_GREY_GLASS, DDNames.TALL_MS_WHITE_GLASS, DDNames.TALL_MS_RED_GLASS, DDNames.TALL_MS_ORANGE_GLASS, DDNames.TALL_MS_YELLOW_GLASS, DDNames.TALL_MS_LIME_GLASS, DDNames.TALL_MS_GREEN_GLASS, DDNames.TALL_MS_CYAN_GLASS, DDNames.TALL_MS_BLUE_GLASS, DDNames.TALL_MS_PURPLE_GLASS, DDNames.TALL_MS_MAGENTA_GLASS, DDNames.TALL_MS_PINK_GLASS, DDNames.TALL_MS_LIGHT_BLUE_GLASS, DDNames.TALL_MS_BROWN_GLASS,
			DDNames.TALL_MD_CALCITE, DDNames.TALL_MD_ICE, DDNames.TALL_MD_GLASS, DDNames.TALL_MD_TINTED_GLASS, DDNames.TALL_MD_BLACK_STAINED_GLASS, DDNames.TALL_MD_GRAY_STAINED_GLASS, DDNames.TALL_MD_LIGHT_GRAY_STAINED_GLASS, DDNames.TALL_MD_WHITE_STAINED_GLASS, DDNames.TALL_MD_RED_STAINED_GLASS, DDNames.TALL_MD_ORANGE_STAINED_GLASS, DDNames.TALL_MD_YELLOW_STAINED_GLASS, DDNames.TALL_MD_LIME_STAINED_GLASS, DDNames.TALL_MD_GREEN_STAINED_GLASS, DDNames.TALL_MD_CYAN_STAINED_GLASS, DDNames.TALL_MD_BLUE_STAINED_GLASS, DDNames.TALL_MD_PURPLE_STAINED_GLASS, DDNames.TALL_MD_MAGENTA_STAINED_GLASS, DDNames.TALL_MD_PINK_STAINED_GLASS, DDNames.TALL_MD_LIGHT_BLUE_STAINED_GLASS, DDNames.TALL_MD_BROWN_STAINED_GLASS);
	
	@SuppressWarnings("deprecation")
	public static void onInitializeClient() {
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (TRANSLUCENT_DOORS.contains(pair.getA())) {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.translucent());
			}
			else {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.cutout());
			}
		}
		if (ForgeUtils.INSTANCE.isModLoaded("create")) {
			BlockEntityRenderers.register(CreateForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, TallSlidingDoorBlockRenderer::new);
		}
		if (ForgeUtils.INSTANCE.isModLoaded("extra_details")) {
			ExtraDetailsForgeCompat.registerCompat();
		}
	}
	
    @SubscribeEvent
    public static void onModelsLoaded(final ModelEvent.ModifyBakingResult event)
    {
    	if (ForgeUtils.INSTANCE.isModLoaded("framedblocks")) {
    		DDFramedBlocksClient.loadModels(event);
    	}
    }
}
