public class oldCustomer implements anObserver{
    private IceCreamParlor myFavoriteTenant;

    public oldCustomer(){
        this.myFavoriteTenant = new IceCreamParlor();
    }

    public void buyIceCream(int order){
        IceCreamParlor a = new IceCreamParlor();
        myFavoriteTenant.Order(order);
        // myFavoriteTenant.printMenu();
    }

    public IceCreamParlor getMyMeal(){
        return this.myFavoriteTenant;
    }
    @Override
    public void update(double price){
        price = price + myFavoriteTenant.getPrice();
        myFavoriteTenant.printMenu();
        System.out.println("Total After tax: " +  price);
    }
}