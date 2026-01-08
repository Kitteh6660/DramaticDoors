package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class PrehistoricFaunaCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_AGATHOXYLON, DDNames.SHORT_AGATHOXYLON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "agathoxylon_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ARAUCARIA, DDNames.SHORT_ARAUCARIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "araucaria_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_BRACHYPHYLLUM, DDNames.SHORT_BRACHYPHYLLUM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "brachyphyllum_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GINKGO, DDNames.SHORT_GINKGO, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "ginkgo_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEIDIPHYLLUM, DDNames.SHORT_HEIDIPHYLLUM, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "heidiphyllum_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_LIRIODENDRITES, DDNames.SHORT_LIRIODENDRITES, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "liriodendrites_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_METASEQUOIA, DDNames.SHORT_METASEQUOIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "metasequoia_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NEOCALAMITES, DDNames.SHORT_NEOCALAMITES, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "neocalamites_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROTOJUNIPEROXYLON, DDNames.SHORT_PROTOJUNIPEROXYLON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_PROTOPICEOXYLON, DDNames.SHORT_PROTOPICEOXYLON, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "protopiceoxylon_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCHILDERIA, DDNames.SHORT_SCHILDERIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "schilderia_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_TROCHODENDROIDES, DDNames.SHORT_TROCHODENDROIDES, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "trochodendroides_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WOODWORTHIA, DDNames.SHORT_WOODWORTHIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "woodworthia_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ZAMITES, DDNames.SHORT_ZAMITES, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("prehistoricfauna", "zamites_door")), BlockSetType.JUNGLE, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_AGATHOXYLON, new ResourceLocation("prehistoricfauna", "agathoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ARAUCARIA, new ResourceLocation("prehistoricfauna", "araucaria_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_BRACHYPHYLLUM, new ResourceLocation("prehistoricfauna", "brachyphyllum_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GINKGO, new ResourceLocation("prehistoricfauna", "ginkgo_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEIDIPHYLLUM, new ResourceLocation("prehistoricfauna", "heidiphyllum_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_LIRIODENDRITES, new ResourceLocation("prehistoricfauna", "liriodendrites_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_METASEQUOIA, new ResourceLocation("prehistoricfauna", "metasequoia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NEOCALAMITES, new ResourceLocation("prehistoricfauna", "neocalamites_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROTOJUNIPEROXYLON, new ResourceLocation("prehistoricfauna", "protojuniperoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_PROTOPICEOXYLON, new ResourceLocation("prehistoricfauna", "protopiceoxylon_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCHILDERIA, new ResourceLocation("prehistoricfauna", "schilderia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_TROCHODENDROIDES, new ResourceLocation("prehistoricfauna", "trochodendroides_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WOODWORTHIA, new ResourceLocation("prehistoricfauna", "woodworthia_door"), "tall_pf_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ZAMITES, new ResourceLocation("prehistoricfauna", "zamites_door"), "tall_pf_wooden_door");
	}
}
