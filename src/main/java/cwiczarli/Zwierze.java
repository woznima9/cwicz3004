package cwiczarli;

public class Zwierze {
    String name;
    int dlugoscWlosa=10;

    public Zwierze(String name) {
        this.name = name;
    }

    public Zwierze(int dlugoscWlosa) {
        this.dlugoscWlosa = dlugoscWlosa;
    }

    public String getName() {
        return name;
    }

    public void setDlugoscWlosa(int dlugoscWlosa) {
        this.dlugoscWlosa = dlugoscWlosa;
    }

    public int getDlugoscWlosa() {
        return dlugoscWlosa;
    }

    @Override
    public String toString() {
        return "Zwierze{" +
                "name='" + name + '\'' +
                ", dlugoscWlosa=" + dlugoscWlosa +
                '}';
    }

    void voice() {
        System.out.println("Hauuu Hou!!");
    }

    int fryzjer() {
        return dlugoscWlosa-1;
    }
}
