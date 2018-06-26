package cwicztablice;

import java.util.Random;

public class Butelka implements Comparable<Butelka> {
    private static int counter = 0;
    int pojemnosc;
    int cena;
    String name;
    private int idButelki;

    public Butelka(String name) {
        idButelki += counter++;
        this.name = name + idButelki;
        Random random = new Random();
        pojemnosc = random.nextInt(50);
        cena = random.nextInt(200);

    }

    @Override
    public String toString() {
        return name;
    }

    public int getPojemnosc() {
        return pojemnosc;
    }

    public String getName() {

        return name;

    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public int compareTo(Butelka o) {
        if (o.cena > this.cena) {
            return 1;
        }
        return -1;
    }
}
