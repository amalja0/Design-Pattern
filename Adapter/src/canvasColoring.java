public class canvasColoring implements Coloring {
    
    public canvasColoring(){}

    @Override
    public String colorAtCanvas(String Title) {
       return "Coloring " + "'" +Title + "'" +" in canvas";
    }

    @Override
    public String colorAtPaper(String Title) {
        return "";
    }

}