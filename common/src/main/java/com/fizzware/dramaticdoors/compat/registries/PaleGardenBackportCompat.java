package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.CompatChecker;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PaleGardenBackportCompat 
{
	public static void registerCompat(CompatChecker checker) {
		registerBlocksItems();
		registerRecipes(checker);
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PALE_OAK, DDNames.SHORT_PALE_OAK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("minecraft", "pale_oak_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes(CompatChecker checker) {
		if (checker.isModLoaded("earlyupdate_two")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PALE_OAK, new ResourceLocation("earlyupdate_two", "palewood_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PALE_OAK, new ResourceLocation("earlyupdate_two", "palewood_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PALE_OAK, new ResourceLocation("earlyupdate_two", "palewood_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PALE_OAK, new ResourceLocation("earlyupdate_two", "palewood_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("palegardenbackport")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PALE_OAK, new ResourceLocation("palegardenbackport", "pale_oak_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PALE_OAK, new ResourceLocation("palegardenbackport", "pale_oak_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PALE_OAK, new ResourceLocation("palegardenbackport", "pale_oak_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PALE_OAK, new ResourceLocation("palegardenbackport", "pale_oak_door"), "tall_wooden_door");
		}
		if (checker.isModLoaded("vanillabackport")) {
			DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PALE_OAK, new ResourceLocation("minecraft", "pale_oak_door"), true);
			DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PALE_OAK, new ResourceLocation("minecraft", "pale_oak_door"));
			
			DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PALE_OAK, new ResourceLocation("minecraft", "pale_oak_door"), true);
			DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PALE_OAK, new ResourceLocation("minecraft", "pale_oak_door"), "tall_wooden_door");
		}
	}
}
