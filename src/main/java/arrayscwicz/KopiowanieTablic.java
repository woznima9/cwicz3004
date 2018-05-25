package arrayscwicz;

import java.util.Arrays;
import java.util.Scanner;

public class KopiowanieTablic {
    public static void main(String[] args) {
        int dlugoscIksow = 18;
        int vector = 5;
        int key = 1;


        System.out.println("klawisze 1- przesuń figurę w lewo        2- przesuń w prawo    inny numer - Exit");
        Scanner scanner = new Scanner(System.in);
        while (!(key == 1 && key == 2)) {

            switch (key) {
                case 1: {
                    vector -= 1;
                    rysuj(dlugoscIksow, vector);
                    break;
                }
                case 2: {
                    vector += 1;
                    rysuj(dlugoscIksow, vector);
                    break;
                }
                default: {
                    return;
                }
            }
            key = scanner.nextInt();
        }
        scanner.close();
    }


    private static void rysuj(int dlugoscIksow, int vector) {
        char[] iksy = new char[dlugoscIksow];
        Arrays.fill(iksy, '.');
        for (int i = 0, j = 4 + vector, k = 1; i < 5; i++, j--, k += 2) {
            char[] gwiazdki = new char[k];
            Arrays.fill(gwiazdki, '*');
            System.arraycopy(gwiazdki, 0, iksy, j, k);
            System.out.println(iksy);
        }
        for (int i = 0, j = vector, k = 9; i < 5; i++, j++, k -= 2) {
            Arrays.fill(iksy, '.');
            char[] gwiazdki = new char[k];
            Arrays.fill(gwiazdki, '*');
            System.arraycopy(gwiazdki, 0, iksy, j, k);
            System.out.println(iksy);
        }
    }
}
