public class Task {
    public static void main(String[] args){
        OnlineRecipeDatabase ord = new OnlineRecipeDatabase();
        try {
            String omelette = ord.formatRecipeAsString(ord.getRecipesByDish("omelette"));
            String gotRice = ord.formatRecipeAsString(ord.getRecipesByIngredients("rice,onions"));
            System.out.println(omelette);
            System.out.println(gotRice);
            ord.saveRecipes(gotRice,"rice.txt");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}