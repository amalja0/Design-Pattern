public class Main {
    public static void main(String[] args) {
        Hotel myHotel = new Hotel("Aman Jiwo", 3000);
        Train myTrain = new Train("Argo Wilis", 40);
        Activity myActivity = new Activity("Strollong around", 500);
        Vacation myVacation = new Vacation(myHotel, myTrain, myActivity);

        myVacation.GO();
    }
    
}