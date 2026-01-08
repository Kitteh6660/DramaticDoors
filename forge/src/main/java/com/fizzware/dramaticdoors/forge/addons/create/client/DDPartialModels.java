package com.fizzware.dramaticdoors.forge.addons.create.client;

import java.util.HashMap;
import java.util.Map;

import com.fizzware.dramaticdoors.DramaticDoors;
import dev.engine_room.flywheel.lib.model.baked.PartialModel;

import net.createmod.catnip.data.Couple;
import net.minecraft.resources.ResourceLocation;

@SuppressWarnings("removal")
public class DDPartialModels
{
	public static final Map<ResourceLocation, Couple<PartialModel>> TALL_FOLDING_DOORS = new HashMap<>();
	
	public static void putFoldingDoor(String blockName, String path) {
		TALL_FOLDING_DOORS.put(new ResourceLocation(DramaticDoors.MOD_ID, blockName), Couple.create(block(path + "_fold_left"), block(path + "_fold_right")));
	}
	
	private static PartialModel block(String path) {
		return PartialModel.of(new ResourceLocation(DramaticDoors.MOD_ID, "block/" + path));
	}
}
