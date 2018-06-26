package inicjacja;

public class InitOrder {
    private static final int C;
    private static int s = 100;
    private static int k = 123;

    static {
        System.out.println("tu mozemy obliczyć");
        k = s * 2;
        C = 101; //opóźniona inicjacja stałej
        report("Statyczny blok inicjacyjny, zmenna s=", s, k, C, s);
    }

    int a = 1;
    private int b = 2;

    {
        report("Blok inicjacyjny: s,C,a=", s, C, a);
    }

    InitOrder() {
        report("Konstruktor: s,C,a,b mają wartości :", s, C, a, b);

    }

    private static void report(String msg, int... args) {
        System.out.println(msg + " ");
        for (int i : args) {
            System.out.print(i + " ");
        }
        System.out.println();


    }


}

