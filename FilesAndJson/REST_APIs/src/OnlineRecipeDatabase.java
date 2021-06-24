import  com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;
import java.net.URL;
import java.util.Scanner;

public class OnlineRecipeDatabase {

    String baseUrl = "http://www.recipepuppy.com/api/?";

    public JsonObject getRecipesByIngredients(String ingredients) throws Exception
    {
        //Getting the things ready to connect to the web
        URL url = new URL(baseUrl+"i="+ingredients);
/* TODO 
You have to use the url to retrieve the contents of the website. 
This will be a String, but in JSON format. */
        String contents = "";
        Scanner urlScanner = new Scanner(url.openStream());
        while (urlScanner.hasNextLine()){
            contents += urlScanner.nextLine();
        }
        urlScanner.close();
        JsonObject recipes = (JsonObject)Jsoner.deserialize(contents,new JsonObject());

        return recipes;
    }

    public JsonObject getRecipesByDish(String dish) throws Exception
    {
        //Getting the things ready to connect to the web

       URL url = new URL(baseUrl+"q="+dish);

        String contents = "";
        Scanner urlScanner = new Scanner(url.openStream());
        while (urlScanner.hasNextLine()){
            contents += urlScanner.nextLine();
        }
        urlScanner.close();
        JsonObject recipes = (JsonObject)Jsoner.deserialize(contents,new JsonObject());

        return recipes;

    }


    public String formatRecipeAsString(JsonObject doc){
        String results = "";
        /* TODO 
This should return a String with each recipe in three lines:
Title:the title of the recipe
Link:the link to the recipe
Ingredients:The ingredients of teh recipe.*/
       JsonArray recipes = (JsonArray)doc.get("results"); //get array of restaurants
        for(int i = 0; i<=recipes.size(); i++){
            JsonObject recipe = (JsonObject) recipes.get(i);
            results += "title:" + recipe.get("title") ;
            results += "link:" + recipe.get("href");
            results += "ingredients:" + recipe.get("ingredients");
        }
        return results;
    }

    public void saveRecipes(String text, String outfile) {
        /* TODO
Given a String with some text in it, write that text to a file. 
The name of the file is given in outfile */

        try (PrintWriter out = new PrintWriter(outfile)) {
            out.println(text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.exit(-1);
        }
    }

}
