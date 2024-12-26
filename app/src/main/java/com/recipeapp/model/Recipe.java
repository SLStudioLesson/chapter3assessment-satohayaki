import java.util.ArrayList;

public class Recipe {
    private String name;
    private ArrayList<Ingredient> ingredients = new ArrayList<>();

    public Recipe() {
        
    }

    public Recipe(String name, ArrayList<Ingredient> ingredients) {

    }

    public String getName() {
        return name;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
}
