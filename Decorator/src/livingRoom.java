public class livingRoom implements room{
    private int area;

    public livingRoom(int area){
        this.area = area;
    }

    public String getRoomType(){
        return "Living room";
    }

    @Override
    public int getArea(){
        return this.area;
    }

    @Override
    public void printDescription(){
        System.out.println("a " + this.area + " m2 living room");
    }
    
}