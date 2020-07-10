import java.util.ArrayList;

public class Menu {
    private ArrayList<String> setMenu;

    public Menu(){
        this.setMenu = new ArrayList<>();
    }

    public ArrayList<String> getMenu(){
        return this.setMenu;
    }
    public void chooseSetA(){
        this.setMenu.add("Chocomint Ice Cream");
        this.setMenu.add("Waffle");

    }

    public void chooseSetB(){
        this.setMenu.add("Strawberry Ice Cream");
        this.setMenu.add("Large Ice Cream Cake");
        this.setMenu.add("Special Waffle");

    }

}