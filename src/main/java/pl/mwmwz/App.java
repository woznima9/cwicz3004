package pl.mwmwz;

public class App {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Calculator calculator = new Calculator();
        pokazWynik(calculator);
        calculator.wprowadz();
        pokazWynik(calculator);

    }

    private static void pokazWynik(Calculator calculator) {
        int wynik;
        wynik = calculator.dodaj();
        System.out.println(wynik);
        wynik = calculator.pomnoz();
        System.out.println(wynik);
    }
}