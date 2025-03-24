package com.fizzware.dramaticdoors.forge.mixin;

import java.util.List;

import org.mtr.mapping.mapper.BlockHelper;
import org.mtr.mapping.mapper.DoorBlockExtension;
import org.mtr.mapping.tool.HolderBase;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import org.mtr.mapping.holder.Property;

@Mixin(value = DoorBlockExtension.class, remap = false)
public class DoorBlockExtensionMixin implements BlockHelper
{
	@Inject(at = @At("TAIL"), method = "addBlockProperties(Ljava/util/List;)V")
	protected void injectBlockStateDefinition(List<HolderBase<?>> properties, CallbackInfo callback) {
		properties.add(new Property<>(BlockStateProperties.WATERLOGGED));
	}
}
