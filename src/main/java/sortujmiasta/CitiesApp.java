package sortujmiasta;

import java.io.IOException;

public class CitiesApp {

    public static void main(String[] args) throws IOException {

        Menu menu = new Menu();

      while (menu.executeFunction());
            System.out.println("Wyjście z programu");
    }
}