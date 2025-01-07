
import com.recipeapp.datahandler.CSVDataHandler;
import com.recipeapp.datahandler.DataHandler;
import com.recipeapp.datahandler.JSONDataHandler;
import com.recipeapp.ui.RecipeUI;
import java.io.*;
import com.recipeapp.model.Recipe;
import com.recipeapp.model.Ingredient;

public class App {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose the file format:");
            System.out.println("1. CSV");
            System.out.println("2. JSON");
            System.out.print("Select (1/2): ");
            String choice = reader.readLine();
            DataHandler handler;
            //1が入力された場合
            if(choice.equals("1")) {
                handler = new CSVDataHandler();
                RecipeUI recipeUI = new RecipeUI(handler);
                recipeUI.displayMenu();

            }//2が入力された場合
            else if(choice.equals("2")) {
                handler = new JSONDataHandler();
                RecipeUI recipeUI = new RecipeUI(handler);
                recipeUI.displayMenu();
            }else
            //それ以外の場合場合
            {
                handler = new CSVDataHandler();
                RecipeUI recipeUI = new RecipeUI(handler);
                recipeUI.displayMenu();
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
            
        }
    }
}