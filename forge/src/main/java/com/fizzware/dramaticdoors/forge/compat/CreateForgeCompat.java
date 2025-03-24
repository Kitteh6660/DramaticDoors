package com.fizzware.dramaticdoors.forge.compat;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.forge.addons.create.ShortDoorMovingInteraction;
import com.fizzware.dramaticdoors.forge.addons.create.TallDoorMovingInteraction;
import com.fizzware.dramaticdoors.forge.addons.create.TallForgeCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.forge.addons.create.TallForgeCreateSlidingDoorBlockEntity;
import com.fizzware.dramaticdoors.forge.addons.create.TallSlidingDoorMovementBehaviour;
import com.fizzware.dramaticdoors.forge.addons.create.client.DDPartialModels;
import com.fizzware.dramaticdoors.tags.DDBlockTags;
import com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour;
import com.simibubi.create.api.behaviour.movement.MovementBehaviour;
import com.simibubi.create.api.registry.SimpleRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.loading.FMLEnvironment;

public class CreateForgeCompat
{
	public static BlockEntityType<TallForgeCreateSlidingDoorBlockEntity> TALL_SLIDING_DOOR_BLOCK_ENTITY;

	private static boolean initializedBehaviours = false;
	
	public static void registerCompat() {
		if (!CreateCompat.initialized) {
			CreateCompat.TALL_ANDESITE_DOOR = new TallForgeCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "andesite_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
			CreateCompat.TALL_BRASS_DOOR = new TallForgeCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "brass_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
			CreateCompat.TALL_COPPER_DOOR = new TallForgeCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
			CreateCompat.TALL_FRAMED_GLASS_DOOR = new TallForgeCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "framed_glass_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
			CreateCompat.TALL_TRAIN_DOOR = new TallForgeCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "train_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
		}
		if (FMLEnvironment.dist == Dist.CLIENT) {
	    	DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_ANDESITE, "create/tall_andesite_door");
	    	DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_COPPER, "create/tall_copper_door");
		}
		CreateCompat.registerCompat();
    	if (!initializedBehaviours) {
    		initializedBehaviours = true;
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.SHORT_WOODEN_DOORS, new ShortDoorMovingInteraction()));
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.HAND_OPENABLE_SHORT_METAL_DOORS, new ShortDoorMovingInteraction()));
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.TALL_WOODEN_DOORS, new TallDoorMovingInteraction()));
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.HAND_OPENABLE_TALL_METAL_DOORS, new TallDoorMovingInteraction()));
			
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_ANDESITE_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_BRASS_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_COPPER_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_FRAMED_GLASS_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_TRAIN_DOOR, new TallSlidingDoorMovementBehaviour());
    	}
	}
}
