import java.util.ArrayList;
import java.util.List;

public class MediaPlayer implements Element {
    private final String mediaPlayer;
    private final List<Element> listaElemente;

    public MediaPlayer(String mediaPlayer) {
        this.mediaPlayer = mediaPlayer;
        this.listaElemente = new ArrayList<>();
    }

    @Override
    public void add(Element element) {
        listaElemente.add(element);
    }

    public String getMediaPlayer() {
        return mediaPlayer;
    }

    public List<Element> getListaElemente() {
        return listaElemente;
    }
}