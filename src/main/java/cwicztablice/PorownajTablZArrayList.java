package cwicztablice;

import javax.jws.Oneway;
import java.lang.reflect.Array;
import java.util.*;

class BudowanyObiekt {
    private static int counter = 10;
    private final int id = counter++;
    private int wartosc = 3 * id;

    public String toString() {
        return "skonstruowano obiekt nr " + id;
    }

    public int getWartosc() {
        return wartosc;
    }

    public int getId() {
        return id;
    }
}


public class PorownajTablZArrayList {
    public static void main(String[] args) {
        BudowanyObiekt rysio = new BudowanyObiekt();

        BudowanyObiekt[] tablicaZBudowlami = new BudowanyObiekt[10];
        for (int i = 0; i < 5; i++) {
            tablicaZBudowlami[i] = new BudowanyObiekt();
        }
        System.out.println(rysio);
        System.out.println(tablicaZBudowlami);

        List<BudowanyObiekt> listaZBudowlami = new ArrayList<BudowanyObiekt>();
        for (int i = 0; i < 5; i++) {
            listaZBudowlami.add(new BudowanyObiekt());
        }
        for (int i = 0; i < tablicaZBudowlami.length; i++) {
            System.out.println(tablicaZBudowlami[i]);
        }
        System.out.println(listaZBudowlami);

        int[] tabliczkaZintami = {2, 3, 4, 5, 6, 7};
        for (int i = 0; i < tabliczkaZintami.length; i++) {
            System.out.println(tabliczkaZintami[i]);
        }
// przejście z tablicy na listę i na arrayListę
        int mojaTablicaZintami[] = {3, 6, 88};

        List asList = Arrays.asList(mojaTablicaZintami);


        List<Integer> listeczkaZintami = new ArrayList<Integer>(asList);
        List<Integer> listeczkaZintami2 = new ArrayList<Integer>(Arrays.asList(0, 1, 2, 3, 4, 5));


        System.out.println("Sprawdzam dodawanko:");
        System.out.println(rysio.getWartosc());
        System.out.println(tablicaZBudowlami[3].getWartosc());
        System.out.println(listaZBudowlami.get(4).getWartosc());
        int result = rysio.getWartosc() + tablicaZBudowlami[3].getWartosc() + listaZBudowlami.get(4).getWartosc() + tabliczkaZintami[0];
        System.out.println(result);


        String[] piesekName = new String[5];
        piesekName[0] = "Felek";
        piesekName[1] = "Leluś";
        piesekName[2] = "Kartofelek";
        piesekName[3] = "Anaterek";

        List listPiesekName = Arrays.asList(piesekName);
        List tablListPiesekName = new ArrayList(listPiesekName);
        System.out.println(tablListPiesekName);
        for (Object e : tablListPiesekName) {
            System.out.println(e);
        }

        Butelka butelka = new Butelka("Butelka_Do_Mleka");
        Butelka butelka1 = new Butelka("Butelka_Do_CoCaColi");
        Butelka butelka2 = new Butelka("Butelka_Do_Wina");

        List<Butelka> butelki = new ArrayList<Butelka>();

        butelki.add(butelka);
        butelki.add(butelka1);
        butelki.add(butelka2);
        System.out.println(butelki);

        Butelka[] kontenerek= new Butelka[10];
        for (int i = 0; i < kontenerek.length; i++) {
            kontenerek[i]= new Butelka("Numer_Butelki");
        }
        for (Butelka e:kontenerek) {
            System.out.println(e+" o pojemności "+e.getPojemnosc());
        }

        System.out.println("ilość butelek w kontenerku"+kontenerek.length);

        for (Butelka e:kontenerek) {
            System.out.println(e+" o pojemności "+e.getPojemnosc());
        }
        List <Butelka> sortButelki;//
        sortButelki=Arrays.asList(kontenerek);


        Collections.sort(sortButelki);

        System.out.println(sortButelki);

        for (Butelka e:kontenerek) {
            System.out.println(e+" o pojemności "+e.getPojemnosc()+" mająca cenę "+e.cena);
        }
// nie wiem jak ja to zrobiłem
        System.out.println(" ");
    }
//KM

}
