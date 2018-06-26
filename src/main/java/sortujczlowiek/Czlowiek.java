package sortujczlowiek;

import java.util.Collections;

public class Czlowiek implements Comparable<Czlowiek> {
    private char plec;
    private String imie;
    private String nazwisko;

    public Czlowiek(char plec, String imie, String nazwisko) {
        this.plec = plec;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    @Override
    public String toString() {
        return  nazwisko+" "+imie+ " ("+plec+")";
    }

    @Override
    public int compareTo(Czlowiek o) {
        int porownaneNazwisko=nazwisko.compareTo(o.nazwisko);
        if (porownaneNazwisko==0) {
            return imie.compareTo(o.imie);
        } else {
            return porownaneNazwisko;
        }

    }
}
