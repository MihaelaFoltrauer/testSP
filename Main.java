/*Compania pentru care lucrati v-a ales sa dezvoltati o aplicatie de tip media player care sa poata rula diverse playlist-uri, care pot fi alcatuite din videoclipuri, gif-uri, melodii sau alte playlist-uri.
Fiecare dintre elementele precizate anterior are ca si parametru dimensiunea in Kb si un titlu.

Se doreste implementarea unui set de operatii care calculeaza dimensiunea totala a fiecarei categorii de element redabil in parte, cat si dimensiunea totala a playlist-ului curent.
Implementati un model de date care sa permita combinarea diferitelor elemente redabile, cat si pentru suportarea operatiei cerute.

static void main()
{
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in Caraibe", 20000));
        p.add(new Song("Simple things", 4000));
        p.add(new Gif("sunglasses", 500));
        m.add(p);

        Visitor v = new MediaSizeVisitor();
        m.accept(v);
        v.printSizes();
}
        */



public class Main {
    public static void main(String[] args) {
        MediaPlayer m = new MediaPlayer("Winamp");
        Playlist p = new Playlist("Chill");
        p.add(new Song("BudaBar", 3000));
        p.add(new Video("Waves in Caraibe", 20000));
        p.add(new Song("Simple things", 4000));
        p.add(new Gif("sunglasses", 500));
        m.add(p);

    }
}