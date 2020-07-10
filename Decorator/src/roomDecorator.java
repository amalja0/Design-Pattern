public class roomDecorator implements room{
    protected room decorateThisRoom;

    public roomDecorator(room theRoom){
        this.decorateThisRoom = theRoom;
    }

    @Override
    public int getArea(){
        return decorateThisRoom.getArea();
    }

    @Override
    public void printDescription(){
        decorateThisRoom.printDescription();
    }

    @Override
    public String getRoomType(){
        return this.decorateThisRoom.getRoomType();
    }
}