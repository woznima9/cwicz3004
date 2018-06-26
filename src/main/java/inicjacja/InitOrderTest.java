package inicjacja;

public class InitOrderTest {

    public static void main(String[] args) {
        System.out.println();
        InitOrder io = new InitOrder();
        int pierwszy = io.a;
        String komunikat = "Wyciągam zmienną cos=";
        System.out.println(komunikat + pierwszy);
        // report("Wywołanie metody main", s, C);
        InitOrder drugi = new InitOrder();
        System.out.println("drugi" + drugi);
        int dlugKomunikatu = komunikat.length();
        System.out.println(dlugKomunikatu);
    }
}