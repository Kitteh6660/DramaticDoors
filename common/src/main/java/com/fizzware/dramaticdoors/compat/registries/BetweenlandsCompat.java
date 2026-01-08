package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BetweenlandsCompat 
{
	public static void registerCompat() {
		registerBlocksItems();
		registerRecipes();
	}
	
	private static void registerBlocksItems() {
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GIANT_ROOT, DDNames.SHORT_GIANT_ROOT, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "giant_root_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_GIANT_ROOT_TREATED, DDNames.SHORT_GIANT_ROOT_TREATED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "giant_root_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEARTHGROVE, DDNames.SHORT_HEARTHGROVE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "hearthgrove_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_HEARTHGROVE_TREATED, DDNames.SHORT_HEARTHGROVE_TREATED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "hearthgrove_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NIBBLETWIG, DDNames.SHORT_NIBBLETWIG, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "nibbletwig_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_NIBBLETWIG_TREATED, DDNames.SHORT_NIBBLETWIG_TREATED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "nibbletwig_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN_WOOD, DDNames.SHORT_ROTTEN_WOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "rotten_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_ROTTEN_WOOD_TREATED, DDNames.SHORT_ROTTEN_WOOD_TREATED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "rotten_wood_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_TREE_PLANK, DDNames.SHORT_RUBBER_TREE_PLANK, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "rubber_tree_plank_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_RUBBER_TREE_PLANK_TREATED, DDNames.SHORT_RUBBER_TREE_PLANK_TREATED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "rubber_tree_plank_door")), BlockSetType.MANGROVE, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WEEDWOOD, DDNames.SHORT_WEEDWOOD, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "weedwood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_WEEDWOOD_TREATED, DDNames.SHORT_WEEDWOOD_TREATED, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "weedwood_door")), BlockSetType.OAK, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SCABYST, DDNames.SHORT_SCABYST, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "scabyst_door")), BlockSetType.IRON, false);
		DDRegistry.registerDoorBlockAndItem(DDNames.TALL_SYRMORITE, DDNames.SHORT_SYRMORITE, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("thebetweenlands", "syrmorite_door")), BlockSetType.IRON, false);
	}
	
	private static void registerRecipes() {
		/*DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GIANT_ROOT, new ResourceLocation("thebetweenlands", "giant_root_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_GIANT_ROOT_TREATED, new ResourceLocation("thebetweenlands", "giant_root_treated_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEARTHGROVE, new ResourceLocation("thebetweenlands", "hearthgrove_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_HEARTHGROVE_TREATED, new ResourceLocation("thebetweenlands", "hearthgrove_treated_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NIBBLETWIG, new ResourceLocation("thebetweenlands", "nibbletwig_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_NIBBLETWIG_TREATED, new ResourceLocation("thebetweenlands", "nibbletwig_treated_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROTTEN_WOOD, new ResourceLocation("thebetweenlands", "rotten_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_ROTTEN_WOOD_TREATED, new ResourceLocation("thebetweenlands", "treated_rotten_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_TREE_PLANK, new ResourceLocation("thebetweenlands", "rubber_tree_plank_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_RUBBER_TREE_PLANK_TREATED, new ResourceLocation("thebetweenlands", "rubber_tree_plank_treated_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEEDWOOD, new ResourceLocation("thebetweenlands", "weedwood_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_WEEDWOOD_TREATED, new ResourceLocation("thebetweenlands", "weedwood_treated_door"), true);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SCABYST, new ResourceLocation("thebetweenlands", "scabyst_door"), false);
		DDCompatAdvancement.createRecipeAdvancement(DDNames.SHORT_SYRMORITE, new ResourceLocation("thebetweenlands", "syrmorite_door"), false);*/
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GIANT_ROOT, new ResourceLocation("thebetweenlands", "giant_root_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_GIANT_ROOT_TREATED, new ResourceLocation("thebetweenlands", "giant_root_treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEARTHGROVE, new ResourceLocation("thebetweenlands", "hearthgrove_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_HEARTHGROVE_TREATED, new ResourceLocation("thebetweenlands", "hearthgrove_treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NIBBLETWIG, new ResourceLocation("thebetweenlands", "nibbletwig_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_NIBBLETWIG_TREATED, new ResourceLocation("thebetweenlands", "nibbletwig_treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROTTEN_WOOD, new ResourceLocation("thebetweenlands", "rotten_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_ROTTEN_WOOD_TREATED, new ResourceLocation("thebetweenlands", "treated_rotten_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_TREE_PLANK, new ResourceLocation("thebetweenlands", "rubber_tree_plank_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_RUBBER_TREE_PLANK_TREATED, new ResourceLocation("thebetweenlands", "rubber_tree_plank_treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEEDWOOD, new ResourceLocation("thebetweenlands", "weedwood_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_WEEDWOOD_TREATED, new ResourceLocation("thebetweenlands", "weedwood_treated_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SCABYST, new ResourceLocation("thebetweenlands", "scabyst_door"));
		DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_SYRMORITE, new ResourceLocation("thebetweenlands", "syrmorite_door"));
		
		/*DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GIANT_ROOT, new ResourceLocation("thebetweenlands", "giant_root_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_GIANT_ROOT_TREATED, new ResourceLocation("thebetweenlands", "giant_root_treated_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEARTHGROVE, new ResourceLocation("thebetweenlands", "hearthgrove_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_HEARTHGROVE_TREATED, new ResourceLocation("thebetweenlands", "hearthgrove_treated_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NIBBLETWIG, new ResourceLocation("thebetweenlands", "nibbletwig_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_NIBBLETWIG_TREATED, new ResourceLocation("thebetweenlands", "nibbletwig_treated_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROTTEN_WOOD, new ResourceLocation("thebetweenlands", "rotten_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_ROTTEN_WOOD_TREATED, new ResourceLocation("thebetweenlands", "treated_rotten_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_TREE_PLANK, new ResourceLocation("thebetweenlands", "rubber_tree_plank_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_RUBBER_TREE_PLANK_TREATED, new ResourceLocation("thebetweenlands", "rubber_tree_plank_treated_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEEDWOOD, new ResourceLocation("thebetweenlands", "weedwood_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_WEEDWOOD_TREATED, new ResourceLocation("thebetweenlands", "weedwood_treated_door"), true);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SCABYST, new ResourceLocation("thebetweenlands", "scabyst_door"), false);
		DDCompatRecipe.createShortDoorRecipe(DDNames.SHORT_SYRMORITE, new ResourceLocation("thebetweenlands", "syrmorite_door"), false);*/
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GIANT_ROOT, new ResourceLocation("thebetweenlands", "giant_root_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_GIANT_ROOT_TREATED, new ResourceLocation("thebetweenlands", "giant_root_treated_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEARTHGROVE, new ResourceLocation("thebetweenlands", "hearthgrove_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_HEARTHGROVE_TREATED, new ResourceLocation("thebetweenlands", "hearthgrove_treated_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NIBBLETWIG, new ResourceLocation("thebetweenlands", "nibbletwig_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_NIBBLETWIG_TREATED, new ResourceLocation("thebetweenlands", "nibbletwig_treated_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROTTEN_WOOD, new ResourceLocation("thebetweenlands", "rotten_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_ROTTEN_WOOD_TREATED, new ResourceLocation("thebetweenlands", "treated_rotten_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_TREE_PLANK, new ResourceLocation("thebetweenlands", "rubber_tree_plank_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_RUBBER_TREE_PLANK_TREATED, new ResourceLocation("thebetweenlands", "rubber_tree_plank_treated_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEEDWOOD, new ResourceLocation("thebetweenlands", "weedwood_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_WEEDWOOD_TREATED, new ResourceLocation("thebetweenlands", "weedwood_treated_door"), "tall_bl_wooden_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SCABYST, new ResourceLocation("thebetweenlands", "scabyst_door"), "tall_bl_metal_door");
		DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_SYRMORITE, new ResourceLocation("thebetweenlands", "syrmorite_door"), "tall_bl_metal_door");
	}
}
