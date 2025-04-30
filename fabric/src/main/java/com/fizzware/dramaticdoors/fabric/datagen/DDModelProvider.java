package com.fizzware.dramaticdoors.fabric.datagen;

import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.registry.DDRegistry;
import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;
import com.google.gson.JsonElement;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.models.BlockModelGenerators;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.blockstates.BlockStateGenerator;
import net.minecraft.data.models.blockstates.MultiVariantGenerator;
import net.minecraft.data.models.blockstates.PropertyDispatch;
import net.minecraft.data.models.blockstates.Variant;
import net.minecraft.data.models.blockstates.VariantProperties;
import net.minecraft.data.models.model.ModelTemplate;
import net.minecraft.data.models.model.ModelTemplates;
import net.minecraft.data.models.model.TextureMapping;
import net.minecraft.data.models.model.TextureSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoorHingeSide;
import oshi.util.tuples.Pair;

public class DDModelProvider extends FabricModelProvider
{
	private BiConsumer<ResourceLocation, Supplier<JsonElement>> modelOutput;
	private Consumer<BlockStateGenerator> blockStateOutput;
	
    public DDModelProvider(FabricDataOutput output) {
		super(output);
	}
    
	@Override
	public void generateBlockStateModels(BlockModelGenerators blockStateModelGenerator) {
		// Set the outputs.
		this.modelOutput = blockStateModelGenerator.modelOutput;
		this.blockStateOutput = blockStateModelGenerator.blockStateOutput;
		// Data-gen the block models as necessary.
		for (Block block : BuiltInRegistries.BLOCK.stream().filter(block -> block instanceof ShortDoorBlock || block instanceof TallDoorBlock).toList()) {
			if (BuiltInRegistries.BLOCK.getKey(block).toString().contains("macaw") || BuiltInRegistries.BLOCK.getKey(block).toString().contains("chipped") || BuiltInRegistries.BLOCK.getKey(block).toString().contains("manyideas")) {
				continue; // May comment out if need to generate models for those three many doors mods.
			}
			if (block instanceof ShortDoorBlock) {
				createShortDoor(block);
			}
			if (block instanceof TallDoorBlock) {
				createTallDoor(block);
			}
		}
	}

	@Override
	public void generateItemModels(ItemModelGenerators itemModelGenerator) {
		for (Pair<String, Item> pair : DDRegistry.DOOR_ITEMS) {
			itemModelGenerator.generateFlatItem(pair.getB(), ModelTemplates.FLAT_ITEM);
		}
	}

    public static final TextureSlot MIDDLE = TextureSlot.create("middle", TextureSlot.SIDE);
    public static final ModelTemplate DOOR_SHORT_LEFT = create("door_short_left", "_left", TextureSlot.TEXTURE);
    public static final ModelTemplate DOOR_SHORT_LEFT_OPEN = create("door_short_left_open", "_left_open", TextureSlot.TEXTURE);
    public static final ModelTemplate DOOR_SHORT_RIGHT = create("door_short_right", "_right", TextureSlot.TEXTURE);
    public static final ModelTemplate DOOR_SHORT_RIGHT_OPEN = create("door_short_right_open", "_right_open", TextureSlot.TEXTURE);
    public static final ModelTemplate DOOR_MIDDLE_LEFT = create("door_middle_left", "_middle_left", TextureSlot.BOTTOM, MIDDLE, TextureSlot.TOP);
    public static final ModelTemplate DOOR_MIDDLE_LEFT_OPEN = create("door_middle_left_open", "_middle_left_open", TextureSlot.BOTTOM, MIDDLE, TextureSlot.TOP);
    public static final ModelTemplate DOOR_MIDDLE_RIGHT = create("door_middle_right", "_middle_right", TextureSlot.BOTTOM, MIDDLE, TextureSlot.TOP);
    public static final ModelTemplate DOOR_MIDDLE_RIGHT_OPEN = create("door_middle_right_open", "_middle_right_open", TextureSlot.BOTTOM, MIDDLE, TextureSlot.TOP);

    private static ModelTemplate create(String blockModelLocation, String suffix, TextureSlot ... requiredSlots) {
        return new ModelTemplate(Optional.of(ResourceLocation.fromNamespaceAndPath("dramaticdoors", "block/" + blockModelLocation)), Optional.of(suffix), requiredSlots);
    }
    
    public void createTallDoor(Block doorBlock) {
        TextureMapping textureMapping = tallDoor(doorBlock);
        ResourceLocation resourceLocation1 = ModelTemplates.DOOR_BOTTOM_LEFT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation2 = ModelTemplates.DOOR_BOTTOM_LEFT_OPEN.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation3 = ModelTemplates.DOOR_BOTTOM_RIGHT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation4 = ModelTemplates.DOOR_BOTTOM_RIGHT_OPEN.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation5 = DOOR_MIDDLE_LEFT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation6 = DOOR_MIDDLE_LEFT_OPEN.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation7 = DOOR_MIDDLE_RIGHT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation8 = DOOR_MIDDLE_RIGHT_OPEN.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation9 = ModelTemplates.DOOR_TOP_LEFT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation10 = ModelTemplates.DOOR_TOP_LEFT_OPEN.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation11 = ModelTemplates.DOOR_TOP_RIGHT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation12 = ModelTemplates.DOOR_TOP_RIGHT_OPEN.create(doorBlock, textureMapping, modelOutput);
        this.blockStateOutput.accept(createTallDoor(doorBlock, resourceLocation1, resourceLocation2, resourceLocation3, resourceLocation4, resourceLocation5, resourceLocation6, resourceLocation7, resourceLocation8, resourceLocation9, resourceLocation10, resourceLocation11, resourceLocation12));
    }
    
    public void createShortDoor(Block doorBlock) {
        TextureMapping textureMapping = shortDoor(doorBlock);
        ResourceLocation resourceLocation = DOOR_SHORT_LEFT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation2 = DOOR_SHORT_LEFT_OPEN.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation3 = DOOR_SHORT_RIGHT.create(doorBlock, textureMapping, modelOutput);
        ResourceLocation resourceLocation4 = DOOR_SHORT_RIGHT_OPEN.create(doorBlock, textureMapping, modelOutput);
        this.blockStateOutput.accept(createShortDoor(doorBlock, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4));
    }
    
    public static TextureMapping tallDoor(Block doorBlock) {
        return new TextureMapping().put(TextureSlot.TOP, TextureMapping.getBlockTexture(doorBlock, "_top")).put(MIDDLE, TextureMapping.getBlockTexture(doorBlock, "_middle")).put(TextureSlot.BOTTOM, TextureMapping.getBlockTexture(doorBlock, "_bottom"));
    }
    public static TextureMapping shortDoor(Block doorBlock) {
        return new TextureMapping().put(TextureSlot.TEXTURE, TextureMapping.getBlockTexture(doorBlock, ""));
    }
    
    public static BlockStateGenerator createTallDoor(Block doorBlock, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4, ResourceLocation resourceLocation5, ResourceLocation resourceLocation6, ResourceLocation resourceLocation7, ResourceLocation resourceLocation8, ResourceLocation resourceLocation9, ResourceLocation resourceLocation10, ResourceLocation resourceLocation11, ResourceLocation resourceLocation12) {
        return MultiVariantGenerator.multiVariant(doorBlock).with(configureDoorThird(configureDoorThird(configureDoorThird(PropertyDispatch.properties(BlockStateProperties.HORIZONTAL_FACING, DDBlockStateProperties.TRIPLE_BLOCK_THIRD, BlockStateProperties.DOOR_HINGE, BlockStateProperties.OPEN), TripleBlockPart.LOWER, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4), TripleBlockPart.MIDDLE, resourceLocation5, resourceLocation6, resourceLocation7, resourceLocation8), TripleBlockPart.UPPER, resourceLocation9, resourceLocation10, resourceLocation11, resourceLocation12));
    }
    
    public static BlockStateGenerator createShortDoor(Block doorBlock, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4) {
        return MultiVariantGenerator.multiVariant(doorBlock).with(configureDoorShort(PropertyDispatch.properties(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.DOOR_HINGE, BlockStateProperties.OPEN), TripleBlockPart.LOWER, resourceLocation, resourceLocation2, resourceLocation3, resourceLocation4));
    }
    
    public static PropertyDispatch.C4<Direction, TripleBlockPart, DoorHingeSide, Boolean> configureDoorThird(PropertyDispatch.C4<Direction, TripleBlockPart, DoorHingeSide, Boolean> c4, TripleBlockPart tripleBlockPart, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4) {
        return c4.select(Direction.EAST, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation))
        		.select(Direction.SOUTH, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.WEST, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
        		.select(Direction.NORTH, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.EAST, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3))
        		.select(Direction.SOUTH, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.WEST, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
        		.select(Direction.NORTH, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.EAST, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.SOUTH, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
        		.select(Direction.WEST, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.NORTH, tripleBlockPart, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2))
        		.select(Direction.EAST, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.SOUTH, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4))
        		.select(Direction.WEST, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.NORTH, tripleBlockPart, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180));
    }
    
    public static PropertyDispatch.C3<Direction, DoorHingeSide, Boolean> configureDoorShort(PropertyDispatch.C3<Direction, DoorHingeSide, Boolean> c3, TripleBlockPart tripleBlockPart, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, ResourceLocation resourceLocation4) {
        return c3.select(Direction.EAST, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation))
        		.select(Direction.SOUTH, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.WEST, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
        		.select(Direction.NORTH, DoorHingeSide.LEFT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.EAST, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3))
        		.select(Direction.SOUTH, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.WEST, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
        		.select(Direction.NORTH, DoorHingeSide.RIGHT, (Boolean)false, Variant.variant().with(VariantProperties.MODEL, resourceLocation3).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.EAST, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.SOUTH, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180))
        		.select(Direction.WEST, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.NORTH, DoorHingeSide.LEFT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation2))
        		.select(Direction.EAST, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R270))
        		.select(Direction.SOUTH, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4))
        		.select(Direction.WEST, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R90))
        		.select(Direction.NORTH, DoorHingeSide.RIGHT, (Boolean)true, Variant.variant().with(VariantProperties.MODEL, resourceLocation4).with(VariantProperties.Y_ROT, VariantProperties.Rotation.R180));
    }

}
