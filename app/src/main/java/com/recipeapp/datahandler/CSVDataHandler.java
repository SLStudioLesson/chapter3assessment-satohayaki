package com.recipeapp.datahandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import com.recipeapp.model.Recipe;
import com.recipeapp.model.Ingredient;


public class CSVDataHandler implements DataHandler{
    private String filePath;

    public CSVDataHandler() {
        filePath = "app/src/main/resource/recipes.csv";
    }

    public CSVDataHandler(String filePath) {
        this.filePath = filePath;
    }

    public String getMode() {
        return "CSV";
    }

    public ArrayList<Recipe> readData() {
        //Recipe型のArrayListをあらかじめ作る
        ArrayList<Recipe> recipes = new ArrayList<>();
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                //行がなくなるまで読み取る
            while ((line = reader.readLine()) != null) {
                //1行を、","で分けた配列strを作る
                String[] str = line.split(",");
                //Ingredient型のArrayList,ingredientsを作成
                ArrayList<Ingredient> ingredients = new ArrayList<>();
                //str[0]を除いた全て(材料)をingredientsに追加
                for(int i = 1 ; i < str.length; i++) {
                    Ingredient ingredient = new Ingredient(str[i]);
                    ingredients.add(ingredient);
                }
                //レシピの名前str[0],ingredientを引数とした、Recipe型の変数recipe2を宣言
                Recipe recipe2 = new Recipe(str[0],ingredients);
                //あらかじめ作っておいたrecipesにrecipe2を追加
                recipes.add(recipe2);
                //これを行が読み取れなくなるまで繰り返す
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
         //recipesを返す
        return recipes;
    }

    public void writeData(Recipe recipe) {
        //trueにすることで中身を追記するように
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            //引数にしたレシピの料理名をgetNameで取り出す
            writer.write(recipe.getName());
            //材料のingredientsリストを作成
            ArrayList<Ingredient> ingredients = new ArrayList<>();
            //ingredientsに引数recipeからgetIngredientsで材料のリストを取り出す。
            ingredients = recipe.getIngredients();
            //取り出した中身を拡張for文で全て取り出し、書きこむ
            for(Ingredient ingredient : ingredients) {
                writer.write("," + ingredient.getName());
            }
            writer.newLine(); // 書き込み後に改行する
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public ArrayList<Recipe> searchData() {
        // try {
        //         Recipe recipe = new Recipe();
        //         // recipes.getIngredients;
        //         for(Recipe recipe1 : recipes)
        //         if((String)recipe.equals(keyword)){
        //             System.out.println(re);
        //         }
        //     } catch (IOException e) {
        //         e.printStackTrace();
        //     }
        return null;
    }
}
