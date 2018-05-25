package drobnetesty;

public class KlasaTrzecia {

    static int liczbaStatycznaZTrzeciej = 44;
    int liczbaZTrzeciej = 77;


    KlasaTrzecia(int liczbaZTrzeciej) {
        this.liczbaZTrzeciej = liczbaZTrzeciej;
    }

    static String odpowiadaTrzecia() {
        return "Hallo - jestem statyczna z Klasy Trzeciej " + liczbaStatycznaZTrzeciej;
    }

    String jakasMetodaZKlasyTrzeciej() {

        return "Jestem z Trzeciej i dodałam dwie liczby statyczną i niestatyczną z Trzeciej" + liczbaStatycznaZTrzeciej + liczbaZTrzeciej;
    }

}
