public class Vacation {
    private Hotel hotel;
    private Train train;
    private Activity activity;

    public Vacation(Hotel hotel, Train train, Activity activity){
        this.hotel = hotel;
        this.train = train;
        this.activity = activity;
    }

    public void GO(){
        int total = hotel.getHotelCost() + train.getTrainCost() + activity.getActivityCost();
        hotel.hotelReservation();
        train.trainReservation();
        activity.activityReservation();
        System.out.println("This vacation at least needs: " + total);
    }
    
}