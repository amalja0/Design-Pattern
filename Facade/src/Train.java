public class Train {
    private String train;
    private int Cost;

    public Train(String train, int Cost){
        this.train = train;
        this.Cost = Cost;
    }

    public String getTrainName(){
        return this.train;
    }

    public int getTrainCost(){
        return this.Cost;
    }

    public void trainReservation(){
        System.out.println("Using " + this.train + " train "
                            + "for " + this.Cost + " per route");
    }
}