package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PrehistoricFaunaCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AGATHOXYLON, DDNames.SHORT_AGATHOXYLON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "agathoxylon_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ARAUCARIA, DDNames.SHORT_ARAUCARIA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "araucaria_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRACHYPHYLLUM, DDNames.SHORT_BRACHYPHYLLUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "brachyphyllum_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GINKGO, DDNames.SHORT_GINKGO, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "ginkgo_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEIDIPHYLLUM, DDNames.SHORT_HEIDIPHYLLUM, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "heidiphyllum_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIRIODENDRITES, DDNames.SHORT_LIRIODENDRITES, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "liriodendrites_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_METASEQUOIA, DDNames.SHORT_METASEQUOIA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "metasequoia_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NEOCALAMITES, DDNames.SHORT_NEOCALAMITES, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "neocalamites_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROTOJUNIPEROXYLON, DDNames.SHORT_PROTOJUNIPEROXYLON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protojuniperoxylon_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROTOPICEOXYLON, DDNames.SHORT_PROTOPICEOXYLON, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protopiceoxylon_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCHILDERIA, DDNames.SHORT_SCHILDERIA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "schilderia_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TROCHODENDROIDES, DDNames.SHORT_TROCHODENDROIDES, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "trochodendroides_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WOODWORTHIA, DDNames.SHORT_WOODWORTHIA, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "woodworthia_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ZAMITES, DDNames.SHORT_ZAMITES, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "zamites_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AGATHOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "agathoxylon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ARAUCARIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "araucaria_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRACHYPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "brachyphyllum_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GINKGO, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "ginkgo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEIDIPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "heidiphyllum_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIRIODENDRITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "liriodendrites_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_METASEQUOIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "metasequoia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NEOCALAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "neocalamites_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROTOJUNIPEROXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protojuniperoxylon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROTOPICEOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protopiceoxylon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCHILDERIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "schilderia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TROCHODENDROIDES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "trochodendroides_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WOODWORTHIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "woodworthia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ZAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "zamites_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AGATHOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "agathoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ARAUCARIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "araucaria_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRACHYPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "brachyphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GINKGO, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "ginkgo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEIDIPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "heidiphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIRIODENDRITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "liriodendrites_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_METASEQUOIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "metasequoia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NEOCALAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "neocalamites_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROTOJUNIPEROXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protojuniperoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROTOPICEOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protopiceoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCHILDERIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "schilderia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TROCHODENDROIDES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "trochodendroides_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WOODWORTHIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "woodworthia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ZAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "zamites_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AGATHOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "agathoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ARAUCARIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "araucaria_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRACHYPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "brachyphyllum_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GINKGO, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "ginkgo_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEIDIPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "heidiphyllum_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIRIODENDRITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "liriodendrites_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_METASEQUOIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "metasequoia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NEOCALAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "neocalamites_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROTOJUNIPEROXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protojuniperoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROTOPICEOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protopiceoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCHILDERIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "schilderia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TROCHODENDROIDES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "trochodendroides_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WOODWORTHIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "woodworthia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ZAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "zamites_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AGATHOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "agathoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ARAUCARIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "araucaria_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRACHYPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "brachyphyllum_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GINKGO, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "ginkgo_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEIDIPHYLLUM, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "heidiphyllum_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIRIODENDRITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "liriodendrites_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_METASEQUOIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "metasequoia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NEOCALAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "neocalamites_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROTOJUNIPEROXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protojuniperoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROTOPICEOXYLON, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "protopiceoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCHILDERIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "schilderia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TROCHODENDROIDES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "trochodendroides_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WOODWORTHIA, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "woodworthia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ZAMITES, ResourceLocation.fromNamespaceAndPath("prehistoricfauna", "zamites_door"), "tall_pf_wooden_door");
	}
}
