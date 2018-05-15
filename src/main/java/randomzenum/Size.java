package randomzenum;

public enum Size {
    SMALL("S",41),
    MEDIUM("M",44),
    LARGE("L", 52),
    EXTRA_LARGE("XL", 56);

    private String abbreviation;
    private int numer;

    Size(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    Size(int numer) {
        this.numer = numer;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        this.numer = numer;
    }

    Size(String abbreviation, int numer) {
        this.abbreviation = abbreviation;
        this.numer = numer;

    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
        this.numer = numer;

    }


}
