package buildkrowa;

import com.sun.org.apache.xpath.internal.functions.FuncSubstring;

public class Krowa {
    private String imie;
    private int waga;

    public Krowa(String imie, int waga) {
        this.imie = imie;
        this.waga = waga;
    }

    @Override
    public String toString() {
        return "Krowa{" +
                "imie='" + imie + '\'' +
                ", waga=" + waga +
                '}';
    }

    public static class KrowaBuilder {
        private String imie;
        private int waga;

        public static KrowaBuilder builder(){
            return new KrowaBuilder();
        }

        public KrowaBuilder imie (String imie){
            this.imie=imie;
            return this;
        }

        public KrowaBuilder waga (int waga) {
            this.waga = waga;
            return this;
        }

        public Krowa build() {
            return new Krowa(imie,waga );
        }



    }


}


