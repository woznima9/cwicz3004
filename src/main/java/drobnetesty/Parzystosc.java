package drobnetesty;

public class Parzystosc {


    static String isEven(int x) {
        String response;
        if (x % 2 == 0) {
            response = "parzysta";
        } else {
            response = "nieparzysta";
        }
        return response;
    }

    static String isEvenElvisem2(int x) {

        return x % 2 == 0 ? "TAKKK" : "NIEEE";
    }

    protected static String odpowieźStatycznej(int liczba) {
        String zwrotka;
        System.out.println(" odpowiem statycznie na pytanie dotyczace liczby " + liczba);
        if (liczba > 100) {
            zwrotka = "Odpowiada Statyczna :Podana liczba jest większa od 100";
        } else {
            zwrotka = "Hallo tu statyczna : podana lliczba jest mniejsza lub równa 100";
        }
        return zwrotka;
    }

    public static void main(String[] args) {
        int doZbadania = -6;
        String odpowiedz;

        System.out.println("liczba " + doZbadania);
        int wartosc = doZbadania % 4;
        System.out.println(wartosc);
        odpowiedz = isEven(doZbadania);
        System.out.println(odpowiedz);
        // System.out.println("Elvisem " + isEvenElvisem(12));   // nie mogę wywołać bo wołam ze statycznego niestateczne
        System.out.println("Elwisem2 " + isEvenElvisem2(wartosc));
        System.out.println(KlasaTrzecia.odpowiadaTrzecia());
        KlasaTrzecia obiektTrzeciej = new KlasaTrzecia(555);
        String napisZTrzeciej = obiektTrzeciej.jakasMetodaZKlasyTrzeciej();
        System.out.println("Wywołany napis z trzeciej --->" + napisZTrzeciej);
        napisZTrzeciej = KlasaTrzecia.odpowiadaTrzecia();
        System.out.println("Wywołany napis z trzeciej statycznej --->" + napisZTrzeciej);


    }

    String isEvenElvisem(int x) {
        String response;
        System.out.println("Odpowiem na pytanie czy liczba " + x + " jest parzysta czy nie ");
        response = x % 2 == 0 ? "TAK" : "NIE";
        return response;
    }

    String odpowiedźNiestatycznej(int liczba) {

        return "To jest moja odpowiedź";
    }

}

class WewnętrznaWParzystość {
    static int liczbaStatycznaWTrzeciejWewnętrznej = 8;
    int liczbaWTrzeciejWewnętrznej;

    static String napiszęCośJestemZWewnętrznejWParzystość() {
        return "napiszę coś bo jestem z wewnętrznej w Parzystość " + liczbaStatycznaWTrzeciejWewnętrznej;
    }

    String jestemZWewnętrznejParzystościNIESTATYCZNA() {
        liczbaWTrzeciejWewnętrznej = 14;
        liczbaStatycznaWTrzeciejWewnętrznej = 10;
        return "przybywam z Wewnętrznej w parzystości i zdefiniowałam  liczbę liczbaWTrzeciejWewnętrznej na 14 oraz statyczną na 10";
    }

}