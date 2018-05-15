package cwiczarli;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class ArrayListPreJDK15Test {

    public static void main(String[] args) {
        List lst = new ArrayList();  // lista Stringów
        lst.add("alpha");
        lst.add("beta");
        lst.add("charlie");
        System.out.println(lst);

        Iterator iterator = lst.iterator();
        while (iterator.hasNext()) {
            String string = (String) iterator.next();
            System.out.println(string);

        }

        List lstcyf = new ArrayList();  //lista Intów
        lstcyf.add(2);
        lstcyf.add(3);
        lstcyf.add(5);
        lstcyf.add(9);
        System.out.println(lstcyf);

        Iterator iterator1 = lstcyf.iterator();
        while (iterator1.hasNext()) {
            int cyf = (Integer) iterator1.next();
            System.out.println(cyf);
            int wynik = cyf + 10;
            System.out.println(wynik);

        }

        String text = "Pon Wto Sro Czwa Piat Sob";
        StringTokenizer textTok = new StringTokenizer(text);
        List tydzien = new ArrayList();
        StringBuilder sb = new StringBuilder();
        while (textTok.hasMoreTokens()) {

            tydzien.add(textTok.nextToken());
            System.out.println(tydzien);
            sb.append(textTok.nextToken());
            System.out.println(sb);
        }
        System.out.println(tydzien);
        System.out.println(tydzien.size());
        int index = tydzien.size();
        System.out.println(tydzien.contains("Piat"));
        System.out.println(tydzien.get(index - 1));

        Zwierze burek = new Zwierze("BUrek");
        burek.voice();

        Zwierze luki = new Zwierze("LUki");
        luki.voice();
        System.out.println(luki.getDlugoscWlosa());
        System.out.println(luki.fryzjer());
        luki.setDlugoscWlosa(20);
        System.out.println(luki.fryzjer());


        Zwierze fikus = new Zwierze("FIkus");
        System.out.println("Fikus");
        System.out.println(fikus.getName());
        fikus.voice();
        int grzywa = fikus.fryzjer();
        System.out.println(grzywa);

        List<Zwierze> stadko = new ArrayList<>();
        stadko.add(fikus);
        stadko.add(burek);
        stadko.add(luki);
        System.out.println(stadko);
        System.out.println("Stadko przedstawcie się:");
        for (int i = 0; i < stadko.size(); i++) {

            System.out.println(stadko.get(i).getName());
        }
        System.out.println("jaką macie długość sierści?");
        for (int i = 0; i < stadko.size(); i++) {
            System.out.println(stadko.get(i).name + "  mam włoś " + stadko.get(i).dlugoscWlosa);
        }
        System.out.println("W stadzie jest nas " + stadko.size());

        Zwierze kotek = new Kot("KOtek");
        System.out.println("Cześć jestem KOT " + kotek.getName());
        kotek.voice();
// tu nie wiem dlaczego kotek szczeka i miałczy TODO
        stadko.add(kotek);

        System.out.println("Stadko przedstawcie się:");
        for (int i = 0; i < stadko.size(); i++) {

            System.out.println(stadko.get(i).getName());
        }

        Iterator<Zwierze> iterZwierz = stadko.iterator();
        System.out.print("Nasze stadko z iteratora teraz ma ");
        while (iterZwierz.hasNext()) {
            String imie=(String)iterZwierz.next().getName();
            System.out.print(imie+" ");

        }

        for (Zwierze item:stadko) {
            System.out.println(item);
            System.out.println(item.getName());
        }


    }
// tu się kończy main

}
