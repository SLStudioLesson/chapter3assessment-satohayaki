package com.recipeapp.model;

import java.util.ArrayList;
import com.recipeapp.model.Ingredient;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Recipe(String name, ArrayList<Ingredient> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
