package com.fizzware.dramaticdoors.client;

import com.fizzware.dramaticdoors.blocks.DramaticDoorsBlocks;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.ModList;

@OnlyIn(Dist.CLIENT)
public class ClientRenderer
{
	public static void setRenderers() {
        // Setup Render Types (mainly for transparent doors like Acacia and Jungle)
        for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.VANILLA_TALL)) {
            ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
        }
        //Conditionally add rendering on where mods are loaded.
        if (ModList.get().isLoaded("atmospheric")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.ATMOSPHERIC_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
        if (ModList.get().isLoaded("autumnity")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.AUTUMNITY_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
        if (ModList.get().isLoaded("bamboo_blocks")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.BAMBOO_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
        if (ModList.get().isLoaded("buzzier_bees")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.BUZZIER_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
        if (ModList.get().isLoaded("endergetic")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.ENDERGETIC_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
        if (ModList.get().isLoaded("environmental")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.ENVIRONMENTAL_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
        if (ModList.get().isLoaded("upgrade_aquatic")) {
            for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.UPGRADE_AQUATIC_TALL)) {
            	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
            }
        }
	    if (ModList.get().isLoaded("abundance")) {
	        for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.ABUNDANCE_TALL)) {
	        	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
	        }
	    }
	    if (ModList.get().isLoaded("bayou_blues")) {
	        for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.BAYOU_BLUES_TALL)) {
	        	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
	        }
	    }
	    if (ModList.get().isLoaded("enhanced_mushrooms")) {
	        for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.ENH_MUSHROOMS_TALL)) {
	        	if (doorBlock.getRegistryName().getPath() == TallDoorBlock.NAME_GLOWSHROOM) {
	        		ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.translucent());
	        	}
	        	else {
	        		ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
	        	}
	        }
	    }
	    if (ModList.get().isLoaded("outer_end")) {
	        for (Block doorBlock : DramaticDoorsBlocks.getBlockList(DramaticDoorsBlocks.DoorSeries.OUTER_END_TALL)) {
	        	ItemBlockRenderTypes.setRenderLayer(doorBlock, RenderType.cutout());
	        }
	    }
	}

}
