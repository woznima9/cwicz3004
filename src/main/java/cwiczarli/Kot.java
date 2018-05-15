package cwiczarli;

public class Kot extends Zwierze {
    public Kot(String name) {
        super(name);
    }

    public Kot(int dlugoscWlosa) {
        super(dlugoscWlosa);
    }

    @Override
    void voice() {
        super.voice();
        System.out.println("Miauu miau");
    }

    @Override
    int fryzjer() {
        return super.fryzjer();
    }
}
