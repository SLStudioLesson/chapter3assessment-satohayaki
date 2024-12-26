package com.recipeapp.ui;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import main.java.com.recipeapp.datahandler.CSVDataHandler;
import main.java.com.recipeapp.datahandler.DataHandler;

public class RecipeUI {
    private BufferedReader reader;
    private DataHandler dataHandler;

    public RecipeUI(DataHandler dataHandler) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        this.dataHandler = dataHandler;
    }
    
    public void displayMenu() {

        System.out.println("Current mode: " + dataHandler.getMode());

        while (true) {
            try {
                System.out.println();
                System.out.println("Main Menu:");
                System.out.println("1: Display Recipes");
                System.out.println("2: Add New Recipe");
                System.out.println("3: Search Recipe");
                System.out.println("4: Exit Application");
                System.out.print("Please choose an option: ");

                String choice = reader.readLine();

                switch (choice) {
                    case "1":
                    CSVDataHandler csvData1 = new CSVDataHandler();
                RecipeUI recipeUI = new RecipeUI(csvData1);
                recipeUI.displayMenu();
                csvData1.getMode();
                csvData1.readData();

                        break;
                    case "2":
                    JSONDataHandler jsonData = new JSONDataHandler();
                RecipeUI recipeUI2 = new RecipeUI(jsonData);
                recipeUI2.displayMenu();
                        break;
                    case "3":
                    CSVDataHandler csvData2 = new CSVDataHandler();
                RecipeUI recipeUI3 = new RecipeUI(csvData2);
                recipeUI3.displayMenu();
                        break;
                    case "4":
                        System.out.println("Exiting the application.");
                        return;
                    default:
                        System.out.println("Invalid choice. Please select again.");
                        break;
                }
            } catch (IOException e) {
                System.out.println("Error reading input from user: " + e.getMessage());
            }
        }
    }

    private void displayRecipes() {
        try {
            DataHandler dataHandler = new DataHandler();
            
        } catch(IOException e) {
            System.out.println("Error reading file: " + e.printStackTrace().toString);
        }
    }
}

