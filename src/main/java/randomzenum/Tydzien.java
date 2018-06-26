package randomzenum;

public enum Tydzien {
    Pon("dobry początek ", 10),
    Wto("drugi dzień ", 22),
    Sro("trzeci", 33),
    Czw("w czwartek bez bartek", 44),
    Pia("piętek piąteczek", 55),
    Sob("Sobota bez kota", 66),
    Nie("Niedziela bez handlu", 77);

    private String przyslowie;
    private int poziom;

    Tydzien(String przyslowie, int poziom) {
        this.przyslowie = przyslowie;
        this.poziom = poziom;
    }

    public String getPrzyslowie() {
        return przyslowie;
    }

    public void setPrzyslowie(String przyslowie) {
        this.przyslowie = przyslowie;
    }

    public int getPoziom() {
        return poziom;
    }

    public void setPoziom(int poziom) {
        this.poziom = poziom;
    }



}
