import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVDataHandler implements DataHandler{
    private String filePath;

    public CSVDataHandler() {
        filePath = "app/src/main/resources/recipes.csv";
    }

    public DataHandler(String filePath) {
        this.filePath = filePath;
    }

    public getMode() {
        return "CSV";
    }

    public ArrayList<Recipe> readData() {
        
            try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
                String line;
                ArrayList<Recipe> recipes = new ArrayList<>();
            while ((line = reader.readLine()) != null) {
                recipes.add(line);
            }

            return recipes;
            // Recipe recipe = new Recipe();
            // // recipe.getIngredients;
            // return recipe;
        } catch(IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void writeData(Recipe recipe) {
        try{
            recipe.add(recipe);
            }catch (IOException e) {
            }
    }

    public searchData(String keyword) {
        try {
                Recipe recipe = new Recipe();
                // recipes.getIngredients;
                for(Recipe recipe1 : recipes)
                if((String)recipe.equals(keyword)){
                    System.out.println(re);
                }
            } catch (IOException e) {

            }
        return null;
    }
}
