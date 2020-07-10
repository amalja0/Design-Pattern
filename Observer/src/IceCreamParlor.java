import java.util.ArrayList;

public class IceCreamParlor implements aSubject{
    private ArrayList<anObserver> observers;

    private double price;
    // private double discount;
    private Menu menu;
    // private ArrayList<String> toppigs;

    public IceCreamParlor(){
        observers = new ArrayList<>();
        menu = new Menu();
    }

    public IceCreamParlor Order(int chooseMenu){
        if(chooseMenu == 1){
            this.menu.chooseSetA();
            this.price = 60;
        }else{
            this.menu.chooseSetB();
            this.price = 100;
        }
        return this;
    }
    public void raisePrice(double tax){
        this.price += tax;
        notifyAllObservant();
    }
    
    public double getPrice(){
        return this.price;
    }
    
    public void printMenu(){
        System.out.println("This is your receipt:");
        System.out.println("Your meal: ");
        for(String element: menu.getMenu()){
            System.out.println(element);
        }
        System.out.println("Total: "  + this.price);
    }

    @Override
    public void addObserver(anObserver observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(anObserver observer){
        int index = observers.indexOf(observer);
        if(index >= 0){
            observers.remove(observer);
        }
    }

    @Override
    public void notifyAllObservant(){
        for(int i = 0; i < observers.size(); i++ ){
            observers.get(i).update(this.price);
        }
    }

}