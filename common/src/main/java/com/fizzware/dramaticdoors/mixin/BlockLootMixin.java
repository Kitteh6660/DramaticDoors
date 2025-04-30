package com.fizzware.dramaticdoors.mixin;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.fizzware.dramaticdoors.DramaticDoors;
import com.fizzware.dramaticdoors.blocks.ShortDoorBlock;
import com.fizzware.dramaticdoors.blocks.TallDoorBlock;
import com.fizzware.dramaticdoors.state.properties.DDBlockStateProperties;
import com.fizzware.dramaticdoors.state.properties.TripleBlockPart;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.storage.loot.LootParams;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraft.world.level.storage.loot.parameters.LootContextParams;

@Mixin(BlockBehaviour.class)
public abstract class BlockLootMixin
{
	@Shadow 
	public abstract Item asItem();
	
	@Inject(method = "getDrops(Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/storage/loot/LootParams$Builder;)Ljava/util/List;", cancellable = true, at = @At(value = "INVOKE", target = "Lnet/minecraft/world/level/storage/loot/LootTable;getRandomItems(Lnet/minecraft/world/level/storage/loot/LootParams;)Lit/unimi/dsi/fastutil/objects/ObjectArrayList;"))    
	public void alterDrops(BlockState state, LootParams.Builder builder, CallbackInfoReturnable<List<ItemStack>> cir) {
		if ((state.getBlock() instanceof TallDoorBlock || state.getBlock() instanceof ShortDoorBlock) && BuiltInRegistries.BLOCK.getKey(state.getBlock()).getNamespace().equals(DramaticDoors.MOD_ID)) {
			LootParams lootparams = builder.withParameter(LootContextParams.BLOCK_STATE, state).create(LootContextParamSets.BLOCK);
			LootTable loottable = lootparams.getLevel().getServer().reloadableRegistries().getLootTable(((BlockBehaviour)(Object)this).getLootTable());
			if (loottable != LootTable.EMPTY) {
				return;
			}
			if (state.getBlock() instanceof TallDoorBlock && state.hasProperty(DDBlockStateProperties.TRIPLE_BLOCK_THIRD) && state.getValue(DDBlockStateProperties.TRIPLE_BLOCK_THIRD) == TripleBlockPart.LOWER) {
				cir.setReturnValue(List.of(this.asItem().getDefaultInstance()));
			}
			else if (state.getBlock() instanceof ShortDoorBlock) {
				cir.setReturnValue(List.of(this.asItem().getDefaultInstance()));
			}
		}
    }
}
