public class employeeAccess implements financeReport {
    private String bulan;
    private String personInCharge;
    private int Money;
    private boolean isImportant;
    private stakeHolderAccess stakeHolder;

    public employeeAccess(String month, String personInCharge, int money, boolean important) {
        this.bulan = month;
        this.personInCharge = personInCharge;
        this.Money = money;
        this.isImportant = isImportant;
    }

    @Override
    public String getMonth() {
        return this.bulan;
    }

    @Override
    public int getTotalMoney() {
        return this.Money;
    }

    @Override
    public String getpersonInCharge() {
        return this.personInCharge;
    }

    @Override
    public void printReport() {
        if(!this.isImportant){
            stakeHolder = new stakeHolderAccess(this.bulan, this.Money, this.personInCharge);
            stakeHolder.printReport();
        }
        else{
            System.out.println(this.bulan + " Monthly Report");
            System.out.println("Total deposit is : " + this.Money);
            System.out.println("Person that write this report : " + this.personInCharge);
        }
    }
    
}