import com.github.cliftonlabs.json_simple.JsonArray;
import com.github.cliftonlabs.json_simple.JsonObject;

public class Database {
    /* TODO
Declare a member variable that can
be EASILY set from the constructor. */

    private JsonObject data;

    public Database(JsonObject data_in){
        /* TODO 
set the memebr variable declared above.*/
        data = data_in;
    }

    public JsonObject getRestaurant(String name){
        //return JSON object
        JsonArray restaurants = (JsonArray)data.get("restaurants"); //get array of restaurants
//        for(Object elem : restaurants) {
        for(int i = 0; i<=restaurants.size(); i++) {
            JsonObject restaurant = (JsonObject) restaurants.get(i);
            if (restaurant.get("name")==name) { //compare "name" with input name
                return restaurant;
            }
        } return new JsonObject();
    }

    public double getAvgReviews(String name){
        JsonObject restaurant = getRestaurant(name);
        JsonArray reviews = (JsonArray) restaurant.get("reviews");
        double ratings = 0;
        for(int i = 0; i<=reviews.size(); i++){
            JsonObject review = (JsonObject) reviews.get(i);
            ratings = ratings+ (Double)review.get("rating");
        }
        return ratings/(reviews.size());
    }
}
