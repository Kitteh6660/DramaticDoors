package com.fizzware.dramaticdoors.neoforge.mixin;

import java.util.List;
import java.util.Set;

import org.objectweb.asm.tree.ClassNode;
import org.spongepowered.asm.mixin.extensibility.IMixinConfigPlugin;
import org.spongepowered.asm.mixin.extensibility.IMixinInfo;

import com.fizzware.dramaticdoors.config.DDConfigCommon;

import net.neoforged.fml.loading.LoadingModList;

public class DDMixinConfigNeoForge implements IMixinConfigPlugin
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
			return DDConfigCommon.waterloggableDoors;
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.neoforge.mixin.JapaneseDoorBlockMixinNeoForge")) {
			return DDConfigCommon.waterloggableDoors && LoadingModList.get().getModFileById("mcwdoors") != null;
		}
		if (mixinClassName.equals("com.fizzware.dramaticdoors.mixin.FenceGateBlockMixin")) {
			return DDConfigCommon.waterloggableFenceGates;
		}
		return true;
	}

	@Override
	public void acceptTargets(Set<String> myTargets, Set<String> otherTargets) {}

	@Override
	public List<String> getMixins() {
		return null; 
	}

	@Override
	public void preApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

	@Override
	public void postApply(String targetClassName, ClassNode targetClass, String mixinClassName, IMixinInfo mixinInfo) {}

}
