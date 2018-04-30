package pl.mwmwz;

import java.util.Scanner;

public class Calculator {
    int a = 2;
    int b = 5;

    void wprowadz() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbę A");
        a = scanner.nextInt();
        System.out.println("podaj liczbę B");
        b = scanner.nextInt();
    }


    int dodaj() {
        int wynik;
        wynik = a + b;
        return wynik;
    }

    public int pomnoz() {
        return a * b;
    }
}