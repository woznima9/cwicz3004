package somepractice;

import java.util.ArrayList;
import java.util.HashMap;

public class Olimpic {
    public static void main(String[] args) {

        ArrayList<String> olympicSports = new ArrayList<String>();
        olympicSports.add("Archery");
        olympicSports.add("Boxing");
        olympicSports.add("Cricket");
        olympicSports.add("Diving");
        System.out.println("There are " + olympicSports.size() + " items on the Array list - They are" + olympicSports);
        for (String sport : olympicSports) {
            System.out.println(sport);
        }

        // host cities and the year they hosted the summer Olympics

        HashMap<String, Integer> hostCities = new HashMap<>();
        hostCities.put("Beijing", 2008);
        hostCities.put("London", 2012);
        hostCities.put("Rio de Janeiro", 2016);

        for (String city : hostCities.keySet()) {
            if (hostCities.get(city) < 2016) {
                System.out.println((city + " hosted the summer Olympic in " + hostCities.get(city)));
            } else {
                System.out.println(city + " will host the summer Olympics in" + hostCities.get(city));
            }
        }
    }
}


