import java.io.IOException;
import java.util.ArrayList;
import Recipe;
public interface DataHandler {
    public String getMode(); //{
        // return null;
    // }

    public ArrayList<Recipe> readData(); {
        try{
            ArrayList<Recipe> recipe = new ArrayList<>();
            // recipe.getIngredients;
            return recipe;
        } catch(IOException e) {
        }
    }

        public void writeData(Recipe recipe);

        public ArrayList<Recipe> searchData(); //{
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
