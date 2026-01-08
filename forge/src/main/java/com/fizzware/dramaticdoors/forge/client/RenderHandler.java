package com.fizzware.dramaticdoors.forge.client;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.client.SpecialDoorRenderList;
import com.fizzware.dramaticdoors.forge.ForgeUtils;
import com.fizzware.dramaticdoors.forge.addons.create.client.TallSlidingDoorBlockRenderer;
import com.fizzware.dramaticdoors.forge.addons.framedblocks.client.DDFramedBlocksClient;
import com.fizzware.dramaticdoors.forge.compat.CreateForgeCompat;

//import com.fizzware.dramaticdoors.forge.compat.ExtraDetailsForgeCompat;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import oshi.util.tuples.Pair;

public class RenderHandler
{
	@SuppressWarnings("removal")
	public static void onInitializeClient() {
		for (Pair<String, Block> pair : DDRegistry.DOOR_BLOCKS_TO_REGISTER) {
			if (SpecialDoorRenderList.TRANSLUCENT_DOORS.contains(pair.getA())) {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.translucent());
			}
			else {
				ItemBlockRenderTypes.setRenderLayer(pair.getB(), RenderType.cutout());
			}
		}
		if (ForgeUtils.INSTANCE.isModLoaded("create")) {
			BlockEntityRenderers.register(CreateForgeCompat.TALL_SLIDING_DOOR_BLOCK_ENTITY, TallSlidingDoorBlockRenderer::new);
		}
		/*if (ForgeUtils.INSTANCE.isModLoaded("extra_details")) {
			ExtraDetailsForgeCompat.registerCompat();
		}*/
	}
	
    @SubscribeEvent
    public static void onModelsLoaded(final ModelEvent.ModifyBakingResult event)
    {
    	if (ForgeUtils.INSTANCE.isModLoaded("framedblocks")) {
    		DDFramedBlocksClient.loadModels(event);
    	}
    }
}
