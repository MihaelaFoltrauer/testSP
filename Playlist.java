import java.util.ArrayList;
import java.util.List;

public class Playlist implements Element {
    private String titluPlaylist;
    private final List<Element> listaElemente;
    public Playlist(String titluPlaylist) {
        this.titluPlaylist = titluPlaylist;
        listaElemente = new ArrayList<>();
    }

    public String getTitluPlaylist() {
        return titluPlaylist;
    }

    public void setTitluPlaylist(String titluPlaylist) {
        this.titluPlaylist = titluPlaylist;
    }

    @Override
    public void add(Element element) {
        listaElemente.add(element);
    }
}