public class stakeHolderAccess implements financeReport {
    private String month;
    private int money;
    private String personInCharge;

    public stakeHolderAccess(String month, int money, String personInCharge){
        this.month = month;
        this.money = money; 
        this.personInCharge = personInCharge;
        giveDetails();
    }

    private void giveDetails(){
        System.out.println("To access some details please open the file attached in the last page. Enter '836AB' for password");
    }

    @Override
    public String getMonth() {
        return this.month;
    }

    @Override
    public int getTotalMoney() {
        return this.money;
    }

    @Override
    public String getpersonInCharge() {
        return this.personInCharge;
    }

    @Override
    public void printReport() {
        System.out.println("This is an internal report containing private details");
        System.out.println(this.month + " Monthly Report");
        System.out.println("Total deposit is : " + this.money);
        System.out.println("Person that write this report : " + this.personInCharge);
    }

    
}