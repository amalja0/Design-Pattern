import java.util.ArrayList;

public class cookedIngredients implements Ingredients{
    private ArrayList<String> ingredients;

    public cookedIngredients(ArrayList<String> usedIngredients){
        ingredients = usedIngredients;
    }

    @Override
    public ArrayList<String> processIngredients(String a, String b) {
        ingredients.remove(a);
        ingredients.remove(b);
        return ingredients;
    }
    
}