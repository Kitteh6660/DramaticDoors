package com.fizzware.dramaticdoors.compat;

import java.util.ArrayList;
import java.util.List;

import org.jetbrains.annotations.Nullable;

import com.google.common.collect.Lists;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import net.minecraft.resources.ResourceLocation;

public class DDCompatRecipe
{
	// The list of recipes that will be filled out.
	public static List<JsonObject> SHORT_DOOR_RECIPES = new ArrayList<JsonObject>();
	public static List<JsonObject> TALL_DOOR_RECIPES = new ArrayList<JsonObject>();
	
	public static final String WOODWORKS_SAWMILL = "woodworks:sawmill";
	public static final String UNIVERSAL_SAWMILL = "sawmill:woodcutting";
	public static final String AURORASDECO_SAWMILL = "aurorasdeco:woodcutting";
	
	public static JsonObject createShortDoorRecipe(String recipeID, ResourceLocation baseDoor) {
		JsonObject json = createStonecutterRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID));
		SHORT_DOOR_RECIPES.add(json);
		return json;
	}
	
	public static void createShortDoorRecipe(String recipeID, ResourceLocation baseDoor, boolean isWood) {
		JsonObject json;
		if (isWood) {
			if (Compats.isModLoaded("woodworks", Compats.modChecker) || Compats.isModLoaded("aurorasdeco", Compats.modChecker) || Compats.isModLoaded("sawmill", Compats.modChecker)) {
				//Woodworks
				if (Compats.isModLoaded("woodworks", Compats.modChecker)) {
					json = createSawmillRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID), WOODWORKS_SAWMILL);
					SHORT_DOOR_RECIPES.add(json);
				}
				//Universal Sawmill
				if (Compats.isModLoaded("sawmill", Compats.modChecker)) {
					json = createSawmillRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID), UNIVERSAL_SAWMILL);
					SHORT_DOOR_RECIPES.add(json);
				}
				//Aurora's Decorations
				if (Compats.isModLoaded("aurorasdeco", Compats.modChecker)) {
					json = createSawmillRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID), AURORASDECO_SAWMILL);
					SHORT_DOOR_RECIPES.add(json);
				}
			}
			else {
				json = createStonecutterRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID));
				SHORT_DOOR_RECIPES.add(json);
			}
		}
		else {
			json = createStonecutterRecipeJson(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath()), new ResourceLocation("dramaticdoors:" + recipeID));
			SHORT_DOOR_RECIPES.add(json);
		}
	}
	
	public static void createTallDoorRecipe(String recipeID, ResourceLocation baseDoor, @Nullable String group) {
		JsonObject json = createShapedRecipeJson(Lists.newArrayList('#'), // The keys we are using for the input items/tags.
				Lists.newArrayList(new ResourceLocation(baseDoor.getNamespace(), baseDoor.getPath())), // The items/tags we are using as input.
				Lists.newArrayList("item"), // Whether the input we provided is a tag or an item.
				Lists.newArrayList("#", "#", "#"), // The crafting pattern.
				new ResourceLocation("dramaticdoors:" + recipeID), group // The crafting output
		);
		TALL_DOOR_RECIPES.add(json);
	}

    public static JsonObject createShapedRecipeJson(ArrayList<Character> keys, ArrayList<ResourceLocation> items, ArrayList<String> type, ArrayList<String> pattern, ResourceLocation output, @Nullable String group) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a shaped recipe.
        json.addProperty("type", "minecraft:crafting_shaped");
        //This creates:
        //"type": "minecraft:crafting_shaped"
         if (group != null) {
        	json.addProperty("group", group);
        }
        //We create a new Json Element, and add our crafting pattern to it.
        JsonArray jsonArray = new JsonArray();
        jsonArray.add(pattern.get(0));
        jsonArray.add(pattern.get(1));
        jsonArray.add(pattern.get(2));
        //Then we add the pattern to our json object.
        json.add("pattern", jsonArray);
 
        //Next we need to define what the keys in the pattern are. For this we need different JsonObjects per key definition, and one main JsonObject that will contain all of the defined keys.
        JsonObject individualKey; //Individual key
        JsonObject keyList = new JsonObject(); //The main key object, containing all the keys
 
        for (int i = 0; i < keys.size(); ++i) {
            individualKey = new JsonObject();
            individualKey.addProperty(type.get(i), items.get(i).toString()); //This will create a key in the form "type": "input", where type is either "item" or "tag", and input is our input item.
            keyList.add(keys.get(i) + "", individualKey); //Then we add this key to the main key object.
        }
 
        json.add("key", keyList);
        //Finally, we define our result object
        JsonObject result = new JsonObject();
        result.addProperty("item", output.toString());
        result.addProperty("count", 2);
        json.add("result", result);
 
        return json;
    }
    
    public static JsonObject createStonecutterRecipeJson(ResourceLocation input, ResourceLocation output) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a stonecutting recipe.
        json.addProperty("type", "minecraft:stonecutting");
        //Add ingredients that will be the input.
        JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input.toString());
        json.add("ingredient", ingredient);
        //Add output.
        json.addProperty("result", output.toString());
        json.addProperty("count", 2);
        return json;
    }
    
    public static JsonObject createSawmillRecipeJson(ResourceLocation input, ResourceLocation output, String recipeType) {
        //Creating a new json object, where we will store our recipe.
        JsonObject json = new JsonObject();
        //The "type" of the recipe we are creating. In this case, a sawmill recipe.
        json.addProperty("type", recipeType);
        //Add ingredients that will be the input.
        JsonObject ingredient = new JsonObject();
        ingredient.addProperty("item", input.toString());
        json.add("ingredient", ingredient);
        //Add output.
        json.addProperty("result", output.toString());
        json.addProperty("count", 2);
        return json;
    }
}
