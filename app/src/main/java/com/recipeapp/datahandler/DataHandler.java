import java.io.IOException;
import java.util.ArrayList;
import Recipe;
public interface DataHandler {
    
    public String getMode();

    public ArrayList<Recipe> readData();

    public void writeData(Recipe recipe);

    public ArrayList<Recipe> searchData(String keyword);
            // try {
                // ArrayList<Recipe> recipes = new ArrayList<>();
                // recipes.getIngredients;
                // for(Recipe resipe : recipes)
                // if((String)recipe.equals(keyword)){
                    // System.out.println(re);
                // }
            // } catch (IOException e) {

            // }
        // }
    // }
}
