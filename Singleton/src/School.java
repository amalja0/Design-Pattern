import java.util.jar.Attributes.Name;

public class School {
    private static School mySchool;
    private String Name = "My School";

    private School(){}

    public static School getInstance(){
        if(mySchool == null){
            mySchool = new School();
        }
        return mySchool;
    }   

    public String toString(){
        return this.Name;
    }
}