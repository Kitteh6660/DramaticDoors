package com.fizzware.dramaticdoors.compat.registries;

import com.fizzware.dramaticdoors.DDNames;
import com.fizzware.dramaticdoors.DDRegistry;
import com.fizzware.dramaticdoors.compat.DDCompatAdvancement;
import com.fizzware.dramaticdoors.compat.DDCompatRecipe;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class ModernLifeCompat {
    public static void registerCompat() {
        registerBlocksItems();
        registerRecipes();
    }
    private static void registerBlocksItems() {
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_OAK_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "oak_glass_door")), BlockSetType.OAK, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_SPRUCE_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "spruce_glass_door")), BlockSetType.SPRUCE, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_BIRCH_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "birch_glass_door")), BlockSetType.BIRCH, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_JUNGLE_GLASS,null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "jungle_glass_door")), BlockSetType.JUNGLE, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_ACACIA_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "warped_glass_door")), BlockSetType.ACACIA, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_DARK_OAK_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "dark_oak_glass_door")), BlockSetType.DARK_OAK, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_CRIMSON_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "crimson_glass_door")), BlockSetType.CRIMSON, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_WARPED_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "warped_glass_door")), BlockSetType.WARPED, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_MODERN_WHITE, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "modern_white_door")), BlockSetType.OAK, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_IRON_GLASS, null, DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "iron_glass_door")), BlockSetType.IRON, false);
        DDRegistry.registerDoorBlockAndItem(DDNames.TALL_MLP_GLASS, null , DDRegistry.getBlockFromResourceLocation(new ResourceLocation("modernlife", "glass_door")), BlockSetType.BAMBOO, false);
    }
    private static void registerRecipes() {
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_MODERN_WHITE,new ResourceLocation("modernlife", "modern_white_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_ACACIA_GLASS, new ResourceLocation("modernlife", "acacia_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_CRIMSON_GLASS, new ResourceLocation("modernlife", "crimson_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_JUNGLE_GLASS, new ResourceLocation("modernlife", "jungle_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_IRON_GLASS, new ResourceLocation("modernlife", "iron_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_WARPED_GLASS, new ResourceLocation("modernlife", "warped_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_DARK_OAK_GLASS, new ResourceLocation("modernlife", "dark_oak_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_BIRCH_GLASS, new ResourceLocation("modernlife", "birch_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_SPRUCE_GLASS, new ResourceLocation("modernlife", "spruce_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_OAK_GLASS, new ResourceLocation("modernlife", "oak_glass_door"));
        DDCompatAdvancement.createRecipeAdvancement(DDNames.TALL_MLP_GLASS, new ResourceLocation("modernlife", "glass_door"));

        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_MODERN_WHITE,new ResourceLocation("modernlife", "modern_white_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_ACACIA_GLASS, new ResourceLocation("modernlife", "acacia_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_CRIMSON_GLASS, new ResourceLocation("modernlife", "crimson_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_JUNGLE_GLASS, new ResourceLocation("modernlife", "jungle_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_IRON_GLASS, new ResourceLocation("modernlife", "iron_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_WARPED_GLASS, new ResourceLocation("modernlife", "warped_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_DARK_OAK_GLASS, new ResourceLocation("modernlife", "dark_oak_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_BIRCH_GLASS, new ResourceLocation("modernlife", "birch_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_SPRUCE_GLASS, new ResourceLocation("modernlife", "spruce_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_OAK_GLASS, new ResourceLocation("modernlife", "oak_glass_door"), "tall_modernlifepatch_door");
        DDCompatRecipe.createTallDoorRecipe(DDNames.TALL_MLP_GLASS, new ResourceLocation("modernlife", "glass_door"), "tall_modernlifepatch_door");
    }
}
