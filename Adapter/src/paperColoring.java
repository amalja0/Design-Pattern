public class paperColoring implements Coloring{
 
    public paperColoring(){}
    
    @Override
    public String colorAtCanvas(String Title) {
        return "";
    }
    
    @Override
    public String colorAtPaper(String Title) {
        return "Coloring " + "'" + Title + "'" +" in paper";
    }
}