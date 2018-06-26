package buildkrowa;
import static buildkrowa.Krowa.*;
import static buildkrowa.Car.*;


public class KrowaApp {
    public static void main(String[] args) {
        Krowa krasulka = KrowaBuilder.builder().imie("Mućka").build();
        System.out.println(krasulka);

        Car truck = CarBuilder.builder().year(2012).build();
        System.out.println(truck);


    }
}
