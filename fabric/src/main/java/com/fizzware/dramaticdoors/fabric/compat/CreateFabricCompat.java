package com.fizzware.dramaticdoors.fabric.compat;

import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.Compats;
import com.fizzware.dramaticdoors.compat.registries.CreateCompat;
import com.fizzware.dramaticdoors.fabric.addons.create.ShortDoorMovingInteraction;
import com.fizzware.dramaticdoors.fabric.addons.create.TallDoorMovingInteraction;
import com.fizzware.dramaticdoors.fabric.addons.create.TallFabricCreateSlidingDoorBlock;
import com.fizzware.dramaticdoors.fabric.addons.create.TallFabricCreateSlidingDoorBlockEntity;
import com.fizzware.dramaticdoors.fabric.addons.create.TallSlidingDoorMovementBehaviour;
import com.fizzware.dramaticdoors.tags.DDBlockTags;
import com.simibubi.create.api.behaviour.interaction.MovingInteractionBehaviour;
import com.simibubi.create.api.behaviour.movement.MovementBehaviour;
import com.simibubi.create.api.registry.SimpleRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CreateFabricCompat
{
	public static BlockEntityType<TallFabricCreateSlidingDoorBlockEntity> TALL_SLIDING_DOOR_BLOCK_ENTITY;

	private static boolean initializedBehaviours = false;
	
	public static void registerCompat() {
		if (!CreateCompat.initialized) {
			CreateCompat.TALL_ANDESITE_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "andesite_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
			CreateCompat.TALL_BRASS_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "brass_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
			CreateCompat.TALL_COPPER_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "copper_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
			CreateCompat.TALL_FRAMED_GLASS_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "framed_glass_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
			CreateCompat.TALL_TRAIN_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("create", "train_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
			if (Compats.isModLoaded("tfmg", Compats.modChecker)) {
				CreateCompat.TALL_ALUMINUM_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tfmg", "aluminum_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
				CreateCompat.TALL_STEEL_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tfmg", "steel_door"), Blocks.IRON_DOOR), BlockSetType.IRON, true);
				CreateCompat.TALL_HEAVY_CASING_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tfmg", "heavy_casing_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);				
				CreateCompat.TALL_HEAVY_PLATED_DOOR = new TallFabricCreateSlidingDoorBlock(DDRegistry.getBlockFromResourceLocation(new ResourceLocation("tfmg", "heavy_plated_door"), Blocks.IRON_DOOR), BlockSetType.IRON, false);
			}
		}
    	CreateCompat.registerCompat(Compats.modChecker);
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
			
			if (Compats.isModLoaded("tfmg", Compats.modChecker)) {
				MovementBehaviour.REGISTRY.register(CreateCompat.TALL_ALUMINUM_DOOR, new TallSlidingDoorMovementBehaviour());
				MovementBehaviour.REGISTRY.register(CreateCompat.TALL_STEEL_DOOR, new TallSlidingDoorMovementBehaviour());
				MovementBehaviour.REGISTRY.register(CreateCompat.TALL_HEAVY_CASING_DOOR, new TallSlidingDoorMovementBehaviour());
				MovementBehaviour.REGISTRY.register(CreateCompat.TALL_HEAVY_PLATED_DOOR, new TallSlidingDoorMovementBehaviour());				
			}
    	}
	}
}
