public class design1 extends roomDecorator{
    room roomToDecorate;
    int cost = 300;

    public design1(room Room){
        super(Room);
        roomToDecorate = Room;
    }

    @Override
    public int getArea(){
        return this.roomToDecorate.getArea();
    }
    @Override
    public String getRoomType(){
        return this.roomToDecorate.getRoomType();
    }

    @Override
    public void printDescription(){
        this.cost *= getArea();
        System.out.println(getRoomType() +" is decorated");
        System.out.println("Total cost : " + cost);
    }
}