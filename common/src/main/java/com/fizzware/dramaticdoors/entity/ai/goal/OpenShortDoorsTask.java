package com.fizzware.dramaticdoors.entity.ai.goal;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

import org.apache.commons.lang3.mutable.MutableInt;
import org.apache.commons.lang3.mutable.MutableObject;

import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.tags.DDBlockTags;

import net.minecraft.core.BlockPos;
import net.minecraft.core.GlobalPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.behavior.BehaviorControl;
import net.minecraft.world.entity.ai.behavior.InteractWithDoor;
import net.minecraft.world.entity.ai.behavior.declarative.BehaviorBuilder;
import net.minecraft.world.entity.ai.memory.MemoryModuleType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.pathfinder.Node;
import net.minecraft.world.level.pathfinder.Path;

public class OpenShortDoorsTask
{
    private static final int RUN_TIME = 20;
    
    public static BehaviorControl<LivingEntity> create() {
        MutableObject<Object> mutableObject = new MutableObject<Object>(null);
        MutableInt mutableInt = new MutableInt(0);
        return BehaviorBuilder.create(context -> context.group(context.present(MemoryModuleType.PATH), context.registered(MemoryModuleType.DOORS_TO_CLOSE), context.registered(MemoryModuleType.NEAREST_LIVING_ENTITIES)).apply(context, (pathRaw, doorsToClose, mobs) -> (world, entity, time) -> {
            ShortDoorBlock doorBlock2;
            BlockPos blockPos2;
            BlockState blockState2;
            Path path = (Path)context.get(pathRaw);
            Optional<Set<GlobalPos>> optional = context.tryGet(doorsToClose);
            if (path.notStarted() || path.isDone()) {
                return false;
            }
            if (Objects.equals(mutableObject.getValue(), path.getNextNode())) {
                mutableInt.setValue(RUN_TIME);
            } else if (mutableInt.decrementAndGet() > 0) {
                return false;
            }
            mutableObject.setValue(path.getNextNode());
            Node pathNode = path.getPreviousNode();
            Node pathNode2 = path.getNextNode();
            BlockPos blockPos = pathNode.asBlockPos();
            BlockState blockState = world.getBlockState(blockPos);
            if (blockState.is(DDBlockTags.SHORT_WOODEN_DOORS, state -> state.getBlock() instanceof ShortDoorBlock)) {
                ShortDoorBlock doorBlock = (ShortDoorBlock)blockState.getBlock();
                if (!doorBlock.isOpen(blockState)) {
                    doorBlock.setOpen(entity, world, blockState, blockPos, true);
                }
                optional = InteractWithDoor.rememberDoorToClose(doorsToClose, optional, world, blockPos);
            }
            if ((blockState2 = world.getBlockState(blockPos2 = pathNode2.asBlockPos())).is(DDBlockTags.SHORT_WOODEN_DOORS, state -> state.getBlock() instanceof ShortDoorBlock) && !(doorBlock2 = (ShortDoorBlock)blockState2.getBlock()).isOpen(blockState2)) {
                doorBlock2.setOpen(entity, world, blockState2, blockPos2, true);
                optional = InteractWithDoor.rememberDoorToClose(doorsToClose, optional, world, blockPos2);
            }
            optional.ifPresent(doors -> InteractWithDoor.closeDoorsThatIHaveOpenedOrPassedThrough(world, entity, pathNode, pathNode2, doors, context.tryGet(mobs)));
            return true;
        }));
    }
}
