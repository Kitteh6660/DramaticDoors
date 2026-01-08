package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CozyFoodsCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LYCHEE, DDNames.SHORT_LYCHEE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("cozyfoods", "lychee_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MANGO, DDNames.SHORT_MANGO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("cozyfoods", "mango_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LYCHEE, new ResourceLocation("cozyfoods", "lychee_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_MANGO, new ResourceLocation("cozyfoods", "mango_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LYCHEE, new ResourceLocation("cozyfoods", "lychee_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MANGO, new ResourceLocation("cozyfoods", "mango_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LYCHEE, new ResourceLocation("cozyfoods", "lychee_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_MANGO, new ResourceLocation("cozyfoods", "mango_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LYCHEE, new ResourceLocation("cozyfoods", "lychee_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MANGO, new ResourceLocation("cozyfoods", "mango_door"), "tall_wooden_door");
	}
}
