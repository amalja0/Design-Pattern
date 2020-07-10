import java.util.ArrayList;

public class newIngredients implements Ingredients {
    private ArrayList<String> ingredients;

    public newIngredients(ArrayList<String> ingredientsNeeded){
        this.ingredients = ingredientsNeeded;
    }

    @Override
    public ArrayList<String> processIngredients(String a, String b) {
        ingredients.add(a);
        ingredients.add(b);
        return ingredients;
    }
    
}