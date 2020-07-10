public class Activity {
    private String Name;
    private int cost;

    public Activity(String activityName, int Cost){
        this.Name = activityName;
        this.cost = Cost;
    }

    public String getActivityName(){
        return this.Name;
    }

    public int getActivityCost(){
        return this.cost;
    }

    public void activityReservation(){
        System.out.println( this.Name + "for " + this.cost + " per activity");
    }
    
}