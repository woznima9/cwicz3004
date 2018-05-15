package arrayscwicz;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class NameIterator {
    public static void main(String[] args) {
        Map<Integer, String> names = new TreeMap<>();
        names.put(8, "Jan Kowalski - 35");
        names.put(3, "Anna Adamiak - 21");
        names.put(10, "Adam Zaręba - 17");
        names.put(6, "Karol Piotrowski -42");
        names.put(-3, "Michalina Borowska - 15");
        names.put(77, "Monika Cłapa - 15");

        Iterator<String> valuesIterator = names.values().iterator();
        while (valuesIterator.hasNext()) {
            System.out.println(valuesIterator.next());


        }
        String nazwisko = names.get(-3);
        System.out.println("Wybraniec " + nazwisko);

        Set <Integer> imieNazwisko = names.keySet();
        Iterator<Integer> iteratorImieNazwisko = imieNazwisko.iterator();
        while (iteratorImieNazwisko.hasNext()){

            System.out.println(iteratorImieNazwisko.next());
        }
        System.out.println(imieNazwisko.size());



    }


}
