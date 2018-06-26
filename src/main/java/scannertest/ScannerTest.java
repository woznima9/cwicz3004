package scannertest;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        boolean run = true;
        boolean cos = true;

        Scanner scanner = new Scanner(System.in);
        while (run) {
            System.out.println("podaj liczbę rzeczywistą (mniejsza niż -5  przerywa wprowadzanie)");
            while (!scanner.hasNextDouble()) {
                scanner.next();
                System.out.println("Podaj jeszcze raz: ");
            }

            double givenDoubleNumber = scanner.nextDouble();
            run = (givenDoubleNumber < -5) ? false : true;
            if (run) {
                System.out.println("Podałeś : " + givenDoubleNumber);
            } else {
                System.out.println("Wychodzimy");
            }
        }
        System.out.println("teraz podaj inta");
        while (!(scanner.hasNextInt())) {
            System.out.println("czekam na inta");
            scanner.next();
            System.out.println("Podaj tego inta");

        }
        System.out.println("czekałem");
        int zmienna = scanner.nextInt();
        System.out.println("następna int " + zmienna);
        scanner.close();
    }
}

// można z klawiatury wprowadzić np: 7 8 100 -8 g e 6  - co kończy program