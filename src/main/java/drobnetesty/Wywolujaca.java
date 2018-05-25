package drobnetesty;

import blackjack.BalcJackPlay;
import blackjack.KeyPressTest;
import blackjack.Player;

public class Wywolujaca {

    public static void main(String[] args) {
        int liczba = 6;
        //String liczbaText = "Jerzy";
        Parzystosc parz = new Parzystosc();
        String liczbaText = parz.isEvenElvisem(liczba);
        System.out.println(liczbaText);

        System.out.println(parz.odpowiedźNiestatycznej(123));
        System.out.println(Parzystosc.odpowieźStatycznej(99));

        System.out.println("Pytanie czy można się odwołać do klasy wewnętrznej *wewnętrzna w parzystości*");
        System.out.println(WewnętrznaWParzystość.napiszęCośJestemZWewnętrznejWParzystość());
        System.out.println("muszę zbudować obiekt Wewnętrznej aby sie dostać do metody niestatycznej");
        WewnętrznaWParzystość wew = new WewnętrznaWParzystość();
        System.out.println(wew.liczbaWTrzeciejWewnętrznej);
        wew.jestemZWewnętrznejParzystościNIESTATYCZNA();
        System.out.println(wew.jestemZWewnętrznejParzystościNIESTATYCZNA());
        System.out.println(wew.liczbaWTrzeciejWewnętrznej);
        System.out.println(WewnętrznaWParzystość.napiszęCośJestemZWewnętrznejWParzystość());
        System.out.println("a na koniec wywołam Black Jacka");
        BalcJackPlay.main(args);
        System.out.println("no to po Black Jacku chyba udało się wrócić do wywołojącej");
        Player player= new Player();
        liczba = player.obliczPunkty();
        System.out.println("i jak byo? obliczone punkty" + liczba);


    }

}
