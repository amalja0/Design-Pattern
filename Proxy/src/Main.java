public class Main{
    public static void main(String[] args) {
        String month = "June";
        String personIncharge = "Audy White";
        int money = 20000;
        boolean penting = true;
        
        financeReport b = new employeeAccess(month, personIncharge, money, penting);
        b.printReport();

    }
}