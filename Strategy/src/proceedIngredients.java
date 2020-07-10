import java.util.ArrayList;

public class proceedIngredients {
    private Ingredients bahan;

    public proceedIngredients(Ingredients ingredients){
        this.bahan = ingredients;
    }

    public ArrayList<String> proceedingBahan(String a, String b){
        return bahan.processIngredients(a, b);
    }
}