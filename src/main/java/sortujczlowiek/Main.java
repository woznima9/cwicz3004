package sortujczlowiek;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        main.program();

    }


    private void program() {
        List<Czlowiek> ludzie = new ArrayList<>();
        ludzie.add(new Czlowiek('K', "Zosia", "Wczorajsza"));
        ludzie.add(new Czlowiek('M', "Marcin", "Borowik"));
        ludzie.add(new Czlowiek('K', "Zosia", "Borowik"));
        ludzie.add(new Czlowiek('K', "Zosia", "Borowik"));
        ludzie.add(new Czlowiek('M', "Juliusz", "Cezar"));
        ludzie.add(new Czlowiek('M', "Robert", "Daszek"));
        ludzie.add(new Czlowiek('M', "Anastazja", "Andrzejewska"));

        for (Czlowiek c : ludzie) {
            System.out.println(c);
        }
        Collections.sort(ludzie);
        System.out.println("posortowana");
        for (Czlowiek c : ludzie) {
            System.out.println(c);
        }

        KomparatorPlec sortujPlec=new KomparatorPlec();
        Collections.sort(ludzie, sortujPlec);
        System.out.println();
        System.out.println("posortowana po plec");
        for (Czlowiek c : ludzie) {
            System.out.println(c);
        }

        String a = "5";
        String b = "4";


        System.out.println(b.compareTo(a));
        System.out.println(a == b);
        System.out.println();
    }


    private class KomparatorPlec implements Comparator<Czlowiek> {

        @Override
        public int compare(Czlowiek o1, Czlowiek o2) {
            int plec = o1.getPlec() - o2.getPlec();
            if (plec==0) {
                return o1.compareTo(o2);
            }
            return plec;
        }
    }
}


