package uczniowie;

public class Uczen implements Comparable<Uczen> {
    String name;
    int wiek;
    String klasa;

    public Uczen(String name, int wiek, String klasa) {
        this.name = name;
        this.wiek = wiek;
        this.klasa = klasa;
    }

    public Uczen(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getKlasa() {
        return klasa;
    }

    public void setKlasa(String klasa) {
        this.klasa = klasa;
    }

    @Override
    public int compareTo(Uczen o) {
        if (o.getWiek()>this.wiek) {
            return -1;
        }

        return 1;
    }
}
