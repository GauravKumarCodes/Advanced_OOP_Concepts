import com.github.cliftonlabs.json_simple.JsonObject;
import com.github.cliftonlabs.json_simple.Jsoner;

import java.io.*;

public class Task {
    public static void main(String[] args){
        Task t = new Task();
        JsonObject doc = t.readJson("./resources/restaurant-data.json");
        Database db = new Database(doc);
        System.out.println(db.getRestaurant("Hometown BBQ"));
        System.out.println(db.getAvgReviews("Casa Enrique"));
    }
    public String readFile(String filename) {
        String contents = ""; //delete this later 

        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filename));
            byte[] buffer = new byte[1024];
            int lengthRead;
            while ((lengthRead = in.read(buffer)) > 0) {
                contents = contents + buffer.toString();
            }
            in.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();

            System.exit(-1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return contents;
    }
    public JsonObject readJson(String filename){
       String test = readFile(filename);
       JsonObject document = (JsonObject)Jsoner.deserialize(test,new JsonObject());
        return document;
    }
}
