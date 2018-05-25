package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPressTest {

    public static void main(String[] args) {
        System.out.println("Ala ma kota - nacisnij 1 lub 2");
        KeyPress nacisnijKlawisz = new KeyPress();
        ArrayList<Option> options = new ArrayList<Option>();
        for (Option o : Option.values()) {
            options.add(o);
        }

        for (Option o : options) {
            o.setGoIn(false);
        }

        for (int i = 0; i < 10; i++) {

            KeyPress nacisnij = new KeyPress();
            Option n = nacisnij.wybor(options);

            for (Option o : Option.values()) {
                System.out.println(o.getGoIn());
            }

            for (Option o : options) {
                o.setGoIn(false);
            }

        }
    }

}


class KeyPress {

    Option wybor(ArrayList<Option> options) {
        Option odpowiedz = null;
        System.out.println("lista opcji");
        System.out.println(options);

        Scanner in = new Scanner(System.in);
        int key = in.nextInt();

        switch (key) {
            case 0:
                odpowiedz = options.get(0);
                Option.PlayAgain.setGoIn(true);
                break;
            case 1:
                odpowiedz = options.get(1);
                Option.Hit.setGoIn(true);
                break;

            case 2:
                odpowiedz = options.get(2);
                Option.Stand.setGoIn(true);
                break;

            case 3:
                odpowiedz = options.get(3);
                Option.Split.setGoIn(true);
                break;

            case 4:
                odpowiedz = options.get(4);
                Option.Insurance.setGoIn(true);
                break;

            default:

                System.out.println("wybrano inny");
                break;

        }
        return odpowiedz;
    }
}