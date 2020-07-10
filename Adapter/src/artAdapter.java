public class artAdapter implements Drawing {
    Coloring myColoringArt;

    public artAdapter(String media) {
        if (media.equals("canvas")) {
            myColoringArt = new canvasColoring();
        } else if (media.equals("paper")) {
            myColoringArt = new paperColoring();
        }
    }

    @Override
    public void drawing(String Media, String drawingTitle) {
        
        if(Media.equals("canvas")){
            System.out.println("Drawing and " + myColoringArt.colorAtCanvas(drawingTitle)); 
        }
        else if(Media.equals("paper")){
            System.out.println("Drawing and " + myColoringArt.colorAtPaper(drawingTitle)); 
        }

    }
}