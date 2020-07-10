import java.util.ArrayList;

import javax.swing.plaf.basic.BasicSplitPaneUI.BasicHorizontalLayoutManager;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> bahanYangAda = new ArrayList<String>();
        bahanYangAda.add("Coffee");
        bahanYangAda.add("Cereal");
        bahanYangAda.add("Pudding");
        bahanYangAda.add("Vanilla Extract");

        System.out.println("List Bahan Tersedia setelah ke supermarket");
        proceedIngredients bahan1 = new proceedIngredients(new newIngredients(bahanYangAda));
        for(String a: bahan1.proceedingBahan("Candy", "Sprinkels")){
            System.out.println(a);
        }
        System.out.println("--------------------------------------------");
        System.out.println("List Bahan Tersedia setelah membuat makanan");
        proceedIngredients bahan2 = new proceedIngredients(new cookedIngredients(bahanYangAda));
        for(String a: bahan2.proceedingBahan("Pudding", "Vanilla Extract")){
            System.out.println(a);
        }
    }
}