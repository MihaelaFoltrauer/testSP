public class Song implements Element {
    private final String songTitle;
    private final double songSize;
    public Song(String songTitle, double songSize) {
        this.songTitle = songTitle;
        this.songSize = songSize;
    }

    @Override
    public void add(Element element) {

    }

    public String getSongTitle() {
        return songTitle;
    }

    public double getSongSize() {
        return songSize;
    }
}
