public class bedRoom implements room{
    private int area;

    public bedRoom(int area){
        this.area = area;
    }
    
    @Override
    public String getRoomType(){
        return "Bed room";
    }

    @Override
    public int getArea(){
        return this.area;
    }

    @Override
    public void printDescription(){
        System.out.println(this.area + "m2 old bed room");
    }
    
}