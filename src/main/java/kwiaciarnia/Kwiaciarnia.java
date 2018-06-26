package kwiaciarnia;

import javax.jws.Oneway;
import java.util.*;

public class Kwiaciarnia {

    public static void main(String[] args) {

     //   Pies pies = new Pies();
     //   System.out.println(pies.name);

        Collection<Pies> pieski = new ArrayList<>();
        for (int i = 0; i < Pies.tabImionPsow.length; i++) {

            pieski.add(new Pies());
        }
        System.out.println("Kolekcja piesków" + pieski);

// Collections.sort(pieski);

        Iterator<Pies> iteratorTablicyPsów = pieski.iterator();
        while (iteratorTablicyPsów.hasNext())
            System.out.println(iteratorTablicyPsów.next().name);
// Collections.sort(iteratorTablicyPsów);

        Set<Pies> hordaPsow = new LinkedHashSet<Pies>(pieski);
        System.out.println("Horda psów " + hordaPsow);

        Iterator<Pies> linkedHaszSetuPsów = hordaPsow.iterator();
        System.out.println("linkedHaszSety     " + linkedHaszSetuPsów);
        while (linkedHaszSetuPsów.hasNext()) {
            Pies ktoryPiesek = linkedHaszSetuPsów.next();
            System.out.println("kolejny pies " + ktoryPiesek.name + "  " + ktoryPiesek.kolejny);
        }





        Collection<String> kolekcjaKwiatków = new CollectionData(new Kwiatek(), 5);
        Set<String> zestaw = new LinkedHashSet<String>(kolekcjaKwiatków);
        Iterator<String> iteratorKolekcjiKwiatkow = kolekcjaKwiatków.iterator();
        while (iteratorKolekcjiKwiatkow.hasNext()) {
            System.out.println(kolekcjaKwiatków);
            System.out.println(iteratorKolekcjiKwiatkow.next());
        }

        System.out.println(" ");

    }


    // kwiaciarnia
}
