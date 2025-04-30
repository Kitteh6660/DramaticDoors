package com.fizzware.dramaticdoors.config;

import oshi.util.tuples.Pair;

public class DDConfigCommon 
{
	public static final String CATEGORY_EXPERIMENTAL = "Experimental";
	public static final String CATEGORY_MIXINS = "Mixins";
	
	public static final String CONFIG_DEV_MODE = "dev_mode";
	public static final String CONFIG_WATERLOGGABLE_DOORS = "waterloggable_doors";
	public static final String CONFIG_WATERLOGGABLE_GATES = "waterloggable_fence_gates";
	
	private static ModConfigProvider configProvider;
	public static SimpleConfig CONFIG;
	
	public static boolean devMode = false;
	public static boolean waterloggableDoors = true;
	public static boolean waterloggableFenceGates = true;
	
	public static void initializeConfigs() {
		configProvider = new ModConfigProvider();
		createConfigs();

		CONFIG = SimpleConfig.of("dramaticdoors-startup").provider(configProvider).request();
		assignConfigs();
	}

	private static void createConfigs() {
		configProvider.addComment("Dramatic Doors");
		configProvider.addCategory(DDConfigCommon.CATEGORY_EXPERIMENTAL);
		configProvider.addKeyValuePair(new Pair<>(DDConfigCommon.CONFIG_DEV_MODE, false), "Development mode ensures that all compat doors are always registered regardless of whether mods are installed or not, for development purposes.");
		configProvider.addNewLine();
		configProvider.addCategory(DDConfigCommon.CATEGORY_MIXINS);
		configProvider.addKeyValuePair(new Pair<>(DDConfigCommon.CONFIG_WATERLOGGABLE_DOORS, true), "Allows doors to be waterlogged. Enable to allow waterlogging, disable for compatibility with certain mods.  Requires restart after changing.");
		configProvider.addKeyValuePair(new Pair<>(DDConfigCommon.CONFIG_WATERLOGGABLE_GATES, true), "Allows fence gates to be waterlogged. Enable to allow waterlogging, disable for compatibility with certain mods.  Requires restart after changing.");
	}

	private static void assignConfigs() {
		devMode = CONFIG.getOrDefault(DDConfigCommon.CONFIG_DEV_MODE, false);
		waterloggableDoors = CONFIG.getOrDefault(DDConfigCommon.CONFIG_WATERLOGGABLE_DOORS, true);
		waterloggableFenceGates = CONFIG.getOrDefault(DDConfigCommon.CONFIG_WATERLOGGABLE_GATES, true);
	}
}
