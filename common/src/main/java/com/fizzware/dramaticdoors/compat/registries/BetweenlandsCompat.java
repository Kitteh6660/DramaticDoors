package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import com.fizzware.dramaticdoors.registry.DDNames;
import com.fizzware.dramaticdoors.registry.DDRegistry;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BetweenlandsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GIANT_ROOT, DDNames.SHORT_GIANT_ROOT, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GIANT_ROOT_TREATED, DDNames.SHORT_GIANT_ROOT_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEARTHGROVE, DDNames.SHORT_HEARTHGROVE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEARTHGROVE_TREATED, DDNames.SHORT_HEARTHGROVE_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NIBBLETWIG, DDNames.SHORT_NIBBLETWIG, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NIBBLETWIG_TREATED, DDNames.SHORT_NIBBLETWIG_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN_WOOD, DDNames.SHORT_ROTTEN_WOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN_WOOD_TREATED, DDNames.SHORT_ROTTEN_WOOD_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_wood_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_TREE_PLANK, DDNames.SHORT_RUBBER_TREE_PLANK, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_TREE_PLANK_TREATED, DDNames.SHORT_RUBBER_TREE_PLANK_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WEEDWOOD, DDNames.SHORT_WEEDWOOD, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WEEDWOOD_TREATED, DDNames.SHORT_WEEDWOOD_TREATED, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCABYST, DDNames.SHORT_SCABYST, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "scabyst_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SYRMORITE, DDNames.SHORT_SYRMORITE, DDRegistry.getBlockFromResourceLocation(ResourceLocation.fromNamespaceAndPath("thebetweenlands", "syrmorite_door")), BlockSetType.IRON, false);
	}
	
	private static void registerRecipes() {
		/*DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GIANT_ROOT, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GIANT_ROOT_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEARTHGROVE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEARTHGROVE_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NIBBLETWIG, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NIBBLETWIG_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROTTEN_WOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROTTEN_WOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_TREE_PLANK, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_TREE_PLANK_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEEDWOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEEDWOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCABYST, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "scabyst_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SYRMORITE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "syrmorite_door_item"));*/
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GIANT_ROOT, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GIANT_ROOT_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEARTHGROVE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEARTHGROVE_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NIBBLETWIG, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NIBBLETWIG_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROTTEN_WOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROTTEN_WOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_TREE_PLANK, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_TREE_PLANK_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEEDWOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEEDWOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_treated_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCABYST, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "scabyst_door_item"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SYRMORITE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "syrmorite_door_item"));
		
		/*DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GIANT_ROOT, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GIANT_ROOT_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_treated_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEARTHGROVE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEARTHGROVE_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_treated_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NIBBLETWIG, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NIBBLETWIG_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_treated_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROTTEN_WOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROTTEN_WOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_treated_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_TREE_PLANK, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_TREE_PLANK_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_treated_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEEDWOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEEDWOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_treated_item"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCABYST, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "scabyst_door_item"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SYRMORITE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "syrmorite_door_item"), false);*/
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GIANT_ROOT, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GIANT_ROOT_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "giant_root_door_treated_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEARTHGROVE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEARTHGROVE_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "hearthgrove_door_treated_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NIBBLETWIG, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NIBBLETWIG_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "nibbletwig_door_treated_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROTTEN_WOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROTTEN_WOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rotten_plank_door_treated_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_TREE_PLANK, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_TREE_PLANK_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "rubber_tree_plank_door_treated_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEEDWOOD, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEEDWOOD_TREATED, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "weedwood_door_treated_item"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCABYST, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "scabyst_door_item"), "tall_bl_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SYRMORITE, ResourceLocation.fromNamespaceAndPath("thebetweenlands", "syrmorite_door_item"), "tall_bl_metal_door");
	}
}
