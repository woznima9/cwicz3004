package cwiczarli;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class PrimitiveCollectionPreJDK15 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Random random = new Random(1);
        for (int i = 0; i < 10; i++) {
            list.add(new Integer(random.nextInt(10)));

        }

        List<Integer> listInt = new ArrayList<Integer>();
        for (int i = 0 ; i<10; i++){

            listInt.add(new Integer(random.nextInt(10)) );

        }

        System.out.println(list);
        Iterator iterator= list.iterator();
        while (iterator.hasNext()) {

            int a = ((Integer)iterator.next());
            System.out.println(a);
            System.out.println(">>> " + a*3);
            int i = ((Integer) iterator.next()).intValue();  //
            System.out.print(i+"*5= "+ " ###"+ a);
            int wynik = i*5;
            System.out.println("GGG "+wynik);
        }
        Iterator<Integer> iterator1 = list.iterator();
        while (iterator1.hasNext()) {
            int i = iterator1.next();
            System.out.println("iteracje "+i);
        }


        System.out.println(" Można zastosować w pętli FOR");
        for (Iterator<Integer> it = iterator1; it.hasNext(); ) {
            int element = it.next();
            System.out.println(element);

        }

        for (Integer item:listInt) {
            int wynik =item*3;
            System.out.println(item +"  "+wynik);
        }
    }
//main

}
