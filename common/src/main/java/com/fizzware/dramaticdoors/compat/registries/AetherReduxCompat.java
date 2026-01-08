package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class AetherReduxCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BLIGHTWILLOW, DDNames.SHORT_BLIGHTWILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "blightwillow_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CLOUDCAP, DDNames.SHORT_CLOUDCAP, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "cloudcap_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_CRYSTAL, DDNames.SHORT_CRYSTAL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "crystal_door")), BlockSetType.STONE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FIELDSPROUT, DDNames.SHORT_FIELDSPROUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "fieldsproot_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GLACIA, DDNames.SHORT_GLACIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "glacia_door")), BlockSetType.CRIMSON, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SPRINGSHROOM, DDNames.SHORT_SPRINGSHROOM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("aether_redux", "jellyshroom_door")), BlockSetType.CRIMSON, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsproot_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "jellyshroom_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsproot_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "jellyshroom_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsproot_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SPRINGSHROOM, new ResourceLocation("aether_redux", "jellyshroom_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BLIGHTWILLOW, new ResourceLocation("aether_redux", "blightwillow_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CLOUDCAP, new ResourceLocation("aether_redux", "cloudcap_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_CRYSTAL, new ResourceLocation("aether_redux", "crystal_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FIELDSPROUT, new ResourceLocation("aether_redux", "fieldsproot_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GLACIA, new ResourceLocation("aether_redux", "glacia_door"), "tall_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SPRINGSHROOM, new ResourceLocation("aether_redux", "jellyshroom_door"), "tall_wooden_door");
	}
}
