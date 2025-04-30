package com.fizzware.dramaticdoors.fabric;

import com.fizzware.dramaticdoors.compat.Compats;
//import com.fizzware.dramaticdoors.fabric.compat.CreateFabricCompat;
import com.fizzware.dramaticdoors.config.DDConfigCommon;

import net.fabricmc.api.ModInitializer;

public class DramaticDoorsFabric implements ModInitializer
{
	@Override
	public void onInitialize() {
		DDConfigCommon.initializeConfigs();
		// Register stuff.
		Compats.modChecker = FabricUtils.INSTANCE;
		Compats.registerCompats(FabricUtils.INSTANCE);
		/*if (Compats.isModLoaded("create", FabricUtils.INSTANCE)) {
			CreateFabricCompat.registerCompat();
		}*/
		DDFabricRegistry.registerBlocksItems();
		DDFabricRegistry.registerBlockEntities();
		DDFabricRegistry.registerCreativeTabs();
		DDFabricRegistry.registerFuels();
		DDFabricRegistry.registerWeatherables();
		FabricUtils.assignItemsToTabs();
	}
}
