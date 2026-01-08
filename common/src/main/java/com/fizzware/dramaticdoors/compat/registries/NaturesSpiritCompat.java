package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class NaturesSpiritCompat
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_ASPEN, DDNames.SHORT_NS_ASPEN, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "aspen_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_CEDAR, DDNames.SHORT_NS_CEDAR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "cedar_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_COCONUT, DDNames.SHORT_NS_COCONUT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "coconut_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_CYPRESS, DDNames.SHORT_NS_CYPRESS, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "cypress_door")), BlockSetType.MANGROVE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_FIR, DDNames.SHORT_NS_FIR, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "fir_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_GHAF, DDNames.SHORT_NS_GHAF, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "ghaf_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_JOSHUA, DDNames.SHORT_NS_JOSHUA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "joshua_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_LARCH, DDNames.SHORT_NS_LARCH, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "larch_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_MAHOGANY, DDNames.SHORT_NS_MAHOGANY, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "mahogany_door")), BlockSetType.JUNGLE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_MAPLE, DDNames.SHORT_NS_MAPLE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "maple_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_OLIVE, DDNames.SHORT_NS_OLIVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "olive_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_PALO_VERDE, DDNames.SHORT_NS_PALO_VERDE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "palo_verde_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_REDWOOD, DDNames.SHORT_NS_REDWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "redwood_door")), BlockSetType.SPRUCE, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_SAXAUL, DDNames.SHORT_NS_SAXAUL, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "saxaul_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_SUGI, DDNames.SHORT_NS_SUGI, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "sugi_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_WILLOW, DDNames.SHORT_NS_WILLOW, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "willow_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_WISTERIA, DDNames.SHORT_NS_WISTERIA, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "wisteria_door")), BlockSetType.OAK, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_PAPER, DDNames.SHORT_NS_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "paper_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_FRAMED_PAPER, DDNames.SHORT_NS_FRAMED_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "framed_paper_door")), BlockSetType.BIRCH, true);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NS_BLOOMING_PAPER, DDNames.SHORT_NS_BLOOMING_PAPER, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("natures_spirit", "blooming_paper_door")), BlockSetType.BIRCH, true);
	}
	
	private static void registerRecipes() {
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_ASPEN, new ResourceLocation("natures_spirit", "aspen_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_CEDAR, new ResourceLocation("natures_spirit", "cedar_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_COCONUT, new ResourceLocation("natures_spirit", "coconut_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_CYPRESS, new ResourceLocation("natures_spirit", "cypress_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_FIR, new ResourceLocation("natures_spirit", "fir_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_GHAF, new ResourceLocation("natures_spirit", "ghaf_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_JOSHUA, new ResourceLocation("natures_spirit", "joshua_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_LARCH, new ResourceLocation("natures_spirit", "larch_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_MAHOGANY, new ResourceLocation("natures_spirit", "mahogany_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_MAPLE, new ResourceLocation("natures_spirit", "maple_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_OLIVE, new ResourceLocation("natures_spirit", "olive_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_PALO_VERDE, new ResourceLocation("natures_spirit", "palo_verde_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_REDWOOD, new ResourceLocation("natures_spirit", "redwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_SAXAUL, new ResourceLocation("natures_spirit", "saxaul_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_SUGI, new ResourceLocation("natures_spirit", "sugi_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_WILLOW, new ResourceLocation("natures_spirit", "willow_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_WISTERIA, new ResourceLocation("natures_spirit", "wisteria_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_PAPER, new ResourceLocation("natures_spirit", "paper_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_FRAMED_PAPER, new ResourceLocation("natures_spirit", "framed_paper_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NS_BLOOMING_PAPER, new ResourceLocation("natures_spirit", "blooming_paper_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_ASPEN, new ResourceLocation("natures_spirit", "aspen_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_CEDAR, new ResourceLocation("natures_spirit", "cedar_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_COCONUT, new ResourceLocation("natures_spirit", "coconut_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_CYPRESS, new ResourceLocation("natures_spirit", "cypress_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_FIR, new ResourceLocation("natures_spirit", "fir_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_GHAF, new ResourceLocation("natures_spirit", "ghaf_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_JOSHUA, new ResourceLocation("natures_spirit", "joshua_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_LARCH, new ResourceLocation("natures_spirit", "larch_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_MAHOGANY, new ResourceLocation("natures_spirit", "mahogany_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_MAPLE, new ResourceLocation("natures_spirit", "maple_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_OLIVE, new ResourceLocation("natures_spirit", "olive_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_PALO_VERDE, new ResourceLocation("natures_spirit", "palo_verde_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_REDWOOD, new ResourceLocation("natures_spirit", "redwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_SAXAUL, new ResourceLocation("natures_spirit", "saxaul_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_SUGI, new ResourceLocation("natures_spirit", "sugi_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_WILLOW, new ResourceLocation("natures_spirit", "willow_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_WISTERIA, new ResourceLocation("natures_spirit", "wisteria_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_PAPER, new ResourceLocation("natures_spirit", "paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_FRAMED_PAPER, new ResourceLocation("natures_spirit", "framed_paper_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NS_BLOOMING_PAPER, new ResourceLocation("natures_spirit", "blooming_paper_door"));
		
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_ASPEN, new ResourceLocation("natures_spirit", "aspen_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_CEDAR, new ResourceLocation("natures_spirit", "cedar_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_COCONUT, new ResourceLocation("natures_spirit", "coconut_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_CYPRESS, new ResourceLocation("natures_spirit", "cypress_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_FIR, new ResourceLocation("natures_spirit", "fir_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_GHAF, new ResourceLocation("natures_spirit", "ghaf_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_JOSHUA, new ResourceLocation("natures_spirit", "joshua_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_LARCH, new ResourceLocation("natures_spirit", "larch_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_MAHOGANY, new ResourceLocation("natures_spirit", "mahogany_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_MAPLE, new ResourceLocation("natures_spirit", "maple_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_OLIVE, new ResourceLocation("natures_spirit", "olive_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_PALO_VERDE, new ResourceLocation("natures_spirit", "palo_verde_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_REDWOOD, new ResourceLocation("natures_spirit", "redwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_SAXAUL, new ResourceLocation("natures_spirit", "saxaul_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_SUGI, new ResourceLocation("natures_spirit", "sugi_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_WILLOW, new ResourceLocation("natures_spirit", "willow_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_WISTERIA, new ResourceLocation("natures_spirit", "wisteria_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_PAPER, new ResourceLocation("natures_spirit", "paper_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_FRAMED_PAPER, new ResourceLocation("natures_spirit", "framed_paper_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NS_BLOOMING_PAPER, new ResourceLocation("natures_spirit", "blooming_paper_door"), true);
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_ASPEN, new ResourceLocation("natures_spirit", "aspen_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_CEDAR, new ResourceLocation("natures_spirit", "cedar_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_COCONUT, new ResourceLocation("natures_spirit", "coconut_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_CYPRESS, new ResourceLocation("natures_spirit", "cypress_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_FIR, new ResourceLocation("natures_spirit", "fir_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_GHAF, new ResourceLocation("natures_spirit", "ghaf_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_JOSHUA, new ResourceLocation("natures_spirit", "joshua_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_LARCH, new ResourceLocation("natures_spirit", "larch_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_MAHOGANY, new ResourceLocation("natures_spirit", "mahogany_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_MAPLE, new ResourceLocation("natures_spirit", "maple_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_OLIVE, new ResourceLocation("natures_spirit", "olive_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_PALO_VERDE, new ResourceLocation("natures_spirit", "palo_verde_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_REDWOOD, new ResourceLocation("natures_spirit", "redwood_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_SAXAUL, new ResourceLocation("natures_spirit", "saxaul_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_SUGI, new ResourceLocation("natures_spirit", "sugi_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_WILLOW, new ResourceLocation("natures_spirit", "willow_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_WISTERIA, new ResourceLocation("natures_spirit", "wisteria_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_PAPER, new ResourceLocation("natures_spirit", "paper_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_FRAMED_PAPER, new ResourceLocation("natures_spirit", "framed_paper_door"), "tall_ns_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NS_BLOOMING_PAPER, new ResourceLocation("natures_spirit", "blooming_paper_door"), "tall_ns_wooden_door");
	}
}
