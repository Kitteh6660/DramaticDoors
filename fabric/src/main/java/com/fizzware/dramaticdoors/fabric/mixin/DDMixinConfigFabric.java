package com.fizzware.dramaticdoors.fabric.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.config.DDConfigCommon;

import net.fabricmc.loader.api.FabricLoader;

public class DDMixinConfigFabric implements IMixinConfigPlugin
{
	@Override
	public void onLoad(String mixinPackage) {
		DDConfigCommon.initializeConfigs();
	}

	@Override
	public String getRefMapperConfig() {
		return null;
	}

	@Override
	public boolean shouldApplyMixin(String targetClassName, String mixinClassName) {
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.DoorBlockMixin")) {
			return DDConfigCommon.waterloggableDoors && !FabricLoader.getInstance().isModLoaded("fluidlogged");
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.fabric.mixin.JapaneseDoorBlockMixinFabric")) {
			return DDConfigCommon.waterloggableDoors && FabricLoader.getInstance().isModLoaded("mcwdoors");
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.FenceGateBlockMixin")) {
			return DDConfigCommon.waterloggableFenceGates && !FabricLoader.getInstance().isModLoaded("fluidlogged");
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {
	}

	@Override
	public List<String> getMixins() {
		return null;
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
	}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {
	}

}
