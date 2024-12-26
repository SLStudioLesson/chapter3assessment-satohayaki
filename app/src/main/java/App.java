import com.recipeapp.datahandler.CSVDataHandler;
import com.recipeapp.datahandler.DataHandler;
import com.recipeapp.datahandler.JSONDataHandler;
import com.recipeapp.ui.RecipeUI;
import java.io.*;

public class App {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Choose the file format:");
            System.out.println("1. CSV");
            System.out.println("2. JSON");
            System.out.print("Select (1/2): ");
            String choice = reader.readLine();
            String extension;
            DataHandler handler;
            if(choice.equals("1")) {
                handler = new CSVDataHandler();
                RecipeUI recipeUI = new RecipeUI(handler);
                recipeUI.displayMenu();
                //extension = csvDataHandler.getMode().toLowerCase();
            }else if(choice.equals("2")) {
                handler = new JSONDataHandler();
                RecipeUI recipeUI = new RecipeUI(handler);
                recipeUI.displayMenu();
                //extension = jsonDataHandler.getMode().toLowerCase();
            }else {
                handler = new CSVDataHandler();
                RecipeUI recipeUI = new RecipeUI(handler);
                recipeUI.displayMenu();
                //extension = csvDataHandler.getMode().toLowerCase();
            }
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            
        }
    }
}