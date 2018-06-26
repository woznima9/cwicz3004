package sortowaniexyzcode;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;



public class SortDemo {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("a");
        list.add("BB");
        list.add("z");
        list.add("AAAA");
        list.add("bbb");
        Collections.sort(list);
        System.out.println("Collections.sort with natural order: " + list);

        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Collections.sort(list, comparator);
        System.out.println("Collections.sort with comparator: " + list);

        Comparator<String> comparator2 = (i, j) -> i.length() - j.length();
        Collections.sort(list, comparator2);
        System.out.println("Collections.sort with equivalent comparator2: " + list);

        Comparator<String> comparator3 = Comparator.naturalOrder();
        Collections.sort(list, comparator3);
        System.out.println("The default sort can also be expressed as Comparator.naturalOrder: " + list);

        Collections.shuffle(list);
        System.out.println("shuffled collection: " + list);

        List<String> list2 = list.stream().sorted().collect(Collectors.toList());
        System.out.println("Stream.sorted with natural order: " + list2);
        System.out.println("stream didn't change the original collection: " + list);
        list2 = list.stream().sorted(comparator).collect(Collectors.toList());
        System.out.println("stream sorted with comparator: " + list2);
        System.out.println("stream didn't change the original collection: " + list);
        list2 = list.stream().sorted(comparator2).collect(Collectors.toList());
        System.out.println("stream sorted with equivalent comparator2: " + list2);
        list2 = list.stream().sorted(comparator3).collect(Collectors.toList());
        System.out.println("The default sorted can also be expressed as Comparator.naturalOrder: " + list2);
    }



}
