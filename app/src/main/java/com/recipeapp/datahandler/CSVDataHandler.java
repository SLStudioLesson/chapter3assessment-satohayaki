import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import Ingredient;

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
                //1行を、","で分けた配列recipeを作る
                String[] recipe = line.split(",");
                //Ingredient型のArrayList,ingredientsを作成
                ArrayList<Ingredient> ingredients = new ArrayList<>();
                //recipe[0]を除いた全て(材料)をingredientsに追加
                for(int i = 1 ; i < recipe.length; i++) {
                    Ingredient ingredient = new Ingredient(recipe[i]);
                    ingredients.add(ingredient);
                }
                //レシピの名前recipe[0],ingredientを引数とした、Recipe型の変数recipe2を宣言
                Recipe recipe2 = new Recipe(recipe[0],ingredients);
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
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true))) {
            writer.write(recipe.getName());
            ArrayList<Ingredient> ingredients = new ArrayList<>();
            ingredients = recipe.getIngredients();
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
