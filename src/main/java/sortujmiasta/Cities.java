package sortujmiasta;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cities {
    static String CITI_FILE = "ala_ma_kota.csv";
    List<City> cities = new ArrayList<>();


    public List<City> getCities() {
        return cities;
    }


    void loadDataFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(ClassLoader.getSystemResourceAsStream(CITI_FILE)));
        String lineFile = br.readLine();

        while (lineFile != null) {
            String [] splittedLine=lineFile.split(";");
            cities.add(new City(splittedLine[0],Integer.parseInt(splittedLine[1]) ));
            lineFile = br.readLine();
        }


//        cities.add(new City("Kłodzko", 1234));
//        cities.add(new City("Lublin", 10000));
//        cities.add(new City("Anatolin", 3000));
//        cities.add(new City("Warszawa", 1000000));
        System.out.println("dane załadowane");
    }

    void sortCities() {
        Collections.sort(cities);
    }

    void printCities() {
        System.out.println("Wydruk miast");
        for (City c : cities) {
            System.out.println(c.getCity() + " " + c.getPopulation());
        }

    }

    int allPopulation() {
        int citizens = 0;
        for (City city : cities) {
            citizens += city.getPopulation();
        }
        return citizens;
    }


    @Override
    public String toString() {
        return "Cities{" +
                "cities=" + cities +
                '}';
    }
}
