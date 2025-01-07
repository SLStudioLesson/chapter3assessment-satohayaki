package com.recipeapp.datahandler;

// import java.security.Key;
import java.util.ArrayList;
import com.recipeapp.model.Recipe;


public class JSONDataHandler implements DataHandler{
    

    public String getMode() {
        return "JSON";
    }

    public ArrayList<Recipe> readData() {
        return null;
    }

    public void writeData(Recipe recipe) {

    }

    public ArrayList<Recipe> searchData() {
        return null;
    }
}