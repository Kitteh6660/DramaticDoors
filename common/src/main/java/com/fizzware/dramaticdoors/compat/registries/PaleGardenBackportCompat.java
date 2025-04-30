package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PaleGardenBackportCompat 
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PALE_OAK, DDNames.SHORT_PALE_OAK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("minecraft", "pale_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes(CompatChecker checker) {
		if (checker.isModLoaded("earlyupdate_two")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PALE_OAK, ResourceLocation.fromNamespaceAndPath("earlyupdate_two", "palewood_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PALE_OAK, ResourceLocation.fromNamespaceAndPath("earlyupdate_two", "palewood_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PALE_OAK, ResourceLocation.fromNamespaceAndPath("earlyupdate_two", "palewood_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PALE_OAK, ResourceLocation.fromNamespaceAndPath("earlyupdate_two", "palewood_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("palegardenbackport")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PALE_OAK, ResourceLocation.fromNamespaceAndPath("palegardenbackport", "pale_oak_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PALE_OAK, ResourceLocation.fromNamespaceAndPath("palegardenbackport", "pale_oak_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PALE_OAK, ResourceLocation.fromNamespaceAndPath("palegardenbackport", "pale_oak_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PALE_OAK, ResourceLocation.fromNamespaceAndPath("palegardenbackport", "pale_oak_door"), "tall_wooden_door");
		}
	}
}
