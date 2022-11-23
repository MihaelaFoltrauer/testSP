public class Video implements Element {
    private final String videoTitle;
    private final double videoSize;

    public Video(String videoTitle, double videoSize) {
        this.videoTitle = videoTitle;
        this.videoSize = videoSize;
    }

    public String getVideoTitle() {
        return videoTitle;
    }

    public double getVideoSize() {
        return videoSize;
    }

    @Override
    public void add(Element element) {

    }
}