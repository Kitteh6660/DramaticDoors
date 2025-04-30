package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ColorfulAzaleasCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AZULE_AZALEA, DDNames.SHORT_AZULE_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "azule_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRIGHT_AZALEA, DDNames.SHORT_BRIGHT_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "bright_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_FISS_AZALEA, DDNames.SHORT_FISS_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "fiss_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROZE_AZALEA, DDNames.SHORT_ROZE_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "roze_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TECAL_AZALEA, DDNames.SHORT_TECAL_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "tecal_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TITANIUM_AZALEA, DDNames.SHORT_TITANIUM_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "titanium_azalea_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WALNUT_AZALEA, DDNames.SHORT_WALNUT_AZALEA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "walnut_azalea_door")), BlockSetType.OAK, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AZULE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "azule_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRIGHT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "bright_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_FISS_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "fiss_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROZE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "roze_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TECAL_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "tecal_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TITANIUM_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "titanium_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WALNUT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "walnut_azalea_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AZULE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "azule_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRIGHT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "bright_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_FISS_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "fiss_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROZE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "roze_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TECAL_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "tecal_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TITANIUM_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "titanium_azalea_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WALNUT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "walnut_azalea_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AZULE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "azule_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRIGHT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "bright_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_FISS_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "fiss_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROZE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "roze_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TECAL_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "tecal_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TITANIUM_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "titanium_azalea_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WALNUT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "walnut_azalea_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AZULE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "azule_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRIGHT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "bright_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_FISS_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "fiss_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROZE_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "roze_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TECAL_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "tecal_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TITANIUM_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "titanium_azalea_door"), "tall_ca_azalea_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WALNUT_AZALEA, ResourceLocation.fromNamespaceAndPath("colorfulazaleas", "walnut_azalea_door"), "tall_ca_azalea_door");
	}
}
