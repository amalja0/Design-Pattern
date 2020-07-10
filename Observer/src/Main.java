public class Main {
    public static void main(String[] args) {
        oldCustomer customer1 = new oldCustomer();
        customer1.buyIceCream(1);

        IceCreamParlor tenantA = new IceCreamParlor();
        tenantA.addObserver(customer1);
        
        tenantA.raisePrice(20);
    }
}