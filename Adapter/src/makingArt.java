public class makingArt implements Drawing {
    artAdapter adapter;

    @Override
    public void drawing(String Media, String drawingTitle) {
        adapter = new artAdapter(Media);
        adapter.drawing(Media, drawingTitle);
    }
}