package sortujmiasta;

import java.util.Objects;

public class City implements Comparable<City> {
    private String city;
    private int population;

    public City(String city, int population) {
        this.city = city;
        this.population = population;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }


    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", population=" + population +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof City)) return false;
        City city1 = (City) o;
        return Objects.equals(getCity(), city1.getCity());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCity());
    }

    @Override
    public int compareTo(City city) {
        if (this.city.compareToIgnoreCase(city.city) > 1) {
            return 1;
        } else if (this.city.compareToIgnoreCase(city.city) < 1) {
            return -1;
        } else return 0;
    }


//    @Override
//    public int compareTo(City o) {
//        if (this.population < o.population) {
//            return -1;
//        } else if (this.population > o.population) {
//            return 1;
//        } else return 0;
//    }
}
