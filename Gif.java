public class Gif implements Element {
    private final String gifTitle;
    private final double gifDimension;

    public Gif(String gifTitle, double gifDimension) {
        this.gifTitle = gifTitle;
        this.gifDimension = gifDimension;
    }

    public String getGifTitle() {
        return gifTitle;
    }

    public double getGifDimension() {
        return gifDimension;
    }

    @Override
    public void add(Element element) {

    }
}