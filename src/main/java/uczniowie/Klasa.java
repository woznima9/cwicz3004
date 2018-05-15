package uczniowie;

import java.util.*;

public class Klasa {
    public static void main(String[] args) {
        Uczen jasio = new Uczen("Jasio");
        Uczen malgosia = new Uczen("Małgosia", 23, "1c");
        Uczen krzysio = new Uczen("Krzysio", 24, "2b");
        Uczen rysio = new Uczen("Rysio");

        List<Uczen> klasa = new ArrayList<Uczen>();
        klasa.add(krzysio);
        klasa.add(jasio);
        klasa.add(rysio);
        klasa.add(malgosia);

        przedstawKlase(klasa);

        for (Uczen uczen : klasa) {
            if (uczen.getWiek() == 0) {
                System.out.println("Uzupełnij brakujący wiek ucznia " + uczen.getName());
                Scanner in = new Scanner(System.in);
                uczen.setWiek(in.nextInt());
                in.close();
            }
        }
        przedstawKlase(klasa);
        Uczen tabKlasa[] = new Uczen[klasa.size()];
        for (int i = 0; i < klasa.size(); i++) {
            tabKlasa[i] = klasa.get(i);
        }

        List<Uczen> sortKlasy = Arrays.asList(tabKlasa);
        Collections.sort(sortKlasy);


        Collections.sort(klasa);
        System.out.println(klasa);
        przedstawKlase(klasa);

    }

    private static void przedstawKlase(List<Uczen> klasa) {
        for (Uczen uczen : klasa) {
            System.out.println("Uczeń " + uczen + " ma " + uczen.getWiek() + " lat");
        }
    }
    //main
}
