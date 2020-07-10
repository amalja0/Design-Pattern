public class Main {
    public static void main(String[] args) {
        room myBedRoom = new bedRoom(10);
        room myLivingRoom = new livingRoom(18);

        room myBedRoomNewDesign = new design1(myBedRoom);
        room myLivingRoomNewDesign = new design1(myLivingRoom);

        myBedRoom.printDescription();
        myBedRoomNewDesign.printDescription();
        System.out.println("--------------------------");
        myLivingRoom.printDescription();
        myLivingRoomNewDesign.printDescription();
    }
}