package pl.mwmwz;

import java.util.Scanner;

public class Calculator {
    int a = 2;
    int b = 5;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

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