package pl.mwmwz;

public class App {
    public static void main(String[] args) {
        System.out.println("Calculator");
        Calculator calculatorPierwszy = new Calculator(12,15);
        Calculator calculatorDrugi = new Calculator(2,3);

        calculatorPierwszy.setA(1);
        pokazWynik(calculatorPierwszy);
        calculatorPierwszy.wprowadz();
        pokazWynik(calculatorPierwszy);

        calculatorDrugi.setA(10);
        pokazWynik(calculatorDrugi);
        calculatorDrugi.wprowadz();
        pokazWynik(calculatorDrugi);

    }

    private static void pokazWynik(Calculator calculator) {
        int wynik;
        wynik = calculator.dodaj();
        System.out.println(wynik);
        wynik = calculator.pomnoz();
        System.out.println(wynik);
    }
}