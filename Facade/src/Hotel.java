public class Hotel {
    private String hotelName;
    private int hotelCost;

    public Hotel(String hotelName, int hotelCost){
        this.hotelName = hotelName;
        this.hotelCost = hotelCost;
    }

    public String getHotelName(){
        return this.hotelName;
    }

    public int getHotelCost(){
        return this.hotelCost;
    }

    public void hotelReservation(){
        System.out.println("Staying at " + this.hotelName 
                            + "for " + this.hotelCost + " per night");
    }
}