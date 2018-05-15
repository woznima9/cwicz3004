package kwiaciarnia;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class Kwiaciarnia {

    public static void main(String[] args) {

        Pies pies = new Pies("Luki");
        System.out.println(pies.name);

        Collection<Pies> pieski = new CollectionData<>(new Pies("Piegus") ,2);

        System.out.println(pieski);


        Collection<String> kolekcjaKwiatków = new CollectionData(new Kwiatek(), 5);
        Set<String> zestaw = new LinkedHashSet<String>(kolekcjaKwiatków);
        System.out.println(" ");

    }


    // kwiaciarnia
}
