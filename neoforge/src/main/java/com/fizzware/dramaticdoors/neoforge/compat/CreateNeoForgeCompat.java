package com.fizzware.dramaticdoors.neoforge.compat;

import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.neoforge.addons.create.ShortDoorMovingInteraction;
import com.fizzware.dramaticdoors.neoforge.addons.create.TallDoorMovingInteraction;
import com.fizzware.dramaticdoors.neoforge.addons.create.TallNeoForgeCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.neoforge.addons.create.TallNeoForgeCreateSlidingDoorBlockEntity;
import com.fizzware.dramaticdoors.neoforge.addons.create.TallSlidingDoorMovementBehaviour;
import com.fizzware.dramaticdoors.neoforge.addons.create.client.DDPartialModels;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;
import com.fizzware.dramaticdoors.tags.DDBlockTags;
import com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour;
import com.simibubi.create.api.behaviour.movement.MovementBehaviour;
import com.simibubi.create.api.registry.SimpleRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.fml.loading.FMLEnvironment;

public class CreateNeoForgeCompat
{
	public static BlockEntityType<TallNeoForgeCreateSlidingDoorBlockEntity> TALL_SLIDING_DOOR_BLOCK_ENTITY;

	private static boolean initializedBehaviours = false;
	
	public static void registerCompat() {
		if (!CreateCompat.initialized) {
			CreateCompat.TALL_ANDESITE_DOOR = new TallNeoForgeCreateSlidingDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("create", "andesite_door"), Blocks.IRON_DOOR), true);
			CreateCompat.TALL_BRASS_DOOR = new TallNeoForgeCreateSlidingDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("create", "brass_door"), Blocks.IRON_DOOR), false);
			CreateCompat.TALL_COPPER_DOOR = new TallNeoForgeCreateSlidingDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("create", "copper_door"), Blocks.IRON_DOOR), true);
			CreateCompat.TALL_FRAMED_GLASS_DOOR = new TallNeoForgeCreateSlidingDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("create", "framed_glass_door"), Blocks.IRON_DOOR), false);
			CreateCompat.TALL_TRAIN_DOOR = new TallNeoForgeCreateSlidingDoorBlock(BlockSetType.IRON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("create", "train_door"), Blocks.IRON_DOOR), false);
		}
		if (FMLEnvironment.dist == Dist.CLIENT) {
	    	DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_ANDESITE, "create/tall_andesite_door");
	    	DDPartialModels.putFoldingDoor(DDNames.TALL_CREATE_COPPER, "create/tall_copper_door");
		}
		CreateCompat.registerCompat();
    	if (!initializedBehaviours) {
    		initializedBehaviours = true;
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.SHORT_WOODEN_DOORS, new ShortDoorMovingInteraction()));
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.MOB_INTERACTABLE_SHORT_DOORS, new ShortDoorMovingInteraction()));
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.TALL_WOODEN_DOORS, new TallDoorMovingInteraction()));
			MovingInteractionBehaviour.REGISTRY.registerProvider(SimpleRegistry.Provider.forBlockTag(DDBlockTags.MOB_INTERACTABLE_TALL_DOORS, new TallDoorMovingInteraction()));
			
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_ANDESITE_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_BRASS_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_COPPER_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_FRAMED_GLASS_DOOR, new TallSlidingDoorMovementBehaviour());
			MovementBehaviour.REGISTRY.register(CreateCompat.TALL_TRAIN_DOOR, new TallSlidingDoorMovementBehaviour());
    	}
	}
}
