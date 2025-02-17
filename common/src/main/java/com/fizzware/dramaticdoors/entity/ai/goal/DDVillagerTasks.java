package com.fizzware.dramaticdoors.entity.ai.goal;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;

import net.minecraft.world.entity.ai.behavior.BehaviorControl;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerProfession;

public class DDVillagerTasks
{
    public static ImmutableList<Pair<Integer, ? extends BehaviorControl<? super Villager>>> createTallDoorTasks(VillagerProfession profession, float speed) {
        return ImmutableList.of(Pair.of(0, OpenTallDoorsTask.create()));
    }
    
    public static ImmutableList<Pair<Integer, ? extends BehaviorControl<? super Villager>>> createShortDoorTasks(VillagerProfession profession, float speed) {
        return ImmutableList.of(Pair.of(0, OpenShortDoorsTask.create()));
    }
}
