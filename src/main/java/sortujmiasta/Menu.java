package sortujmiasta;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);
    Cities cities = new Cities();



    boolean executeFunction() throws IOException {

        printMenu();
        switch (chosePositionFromMenu()) {
            case Data_Import:
                System.out.println("Importowanie danych");
                cities.loadDataFromFile();
                break;
            case Show_Imported_Data:
                cities.printCities();
                break;
            case Sort_Cities:
                System.out.println("Sortowanie po miastach");
                cities.sortCities();

                break;
            case Sort_Populations:
                System.out.println("Sortowanie po populacji");
                break;

         //   case Add_City:
         //       System.out.println("Dodawanie miasta");
         //       break;

            case All_Population:
                System.out.println("Sortowanie po populacji");
                int citizens= cities.allPopulation();
                System.out.println("Suma mieszkańców wszystkich miast to "+citizens);
                break;

            case EXIT:
                return false;
            default:
                System.out.println("*** opcja w budowie - jeszcze nie dostępna ***");
        }
        return true;
    }


    MenuPositions chosePositionFromMenu() {
        MenuPositions menuPosition;
        int numberPress = scanner.nextInt();
        int max = MenuPositions.values().length-1;
        int key = (numberPress >= 0 && numberPress <= max) ? numberPress : max;
        menuPosition = MenuPositions.values()[key];
        return menuPosition;
    }

    void printMenu() {
        int licznik = 0;
        System.out.println("----     Dostępne opcje programu    -----");
        for (MenuPositions e : MenuPositions.values()) {
            System.out.println(licznik++ + " :  " + e.getOpis());
        }
    }
}
