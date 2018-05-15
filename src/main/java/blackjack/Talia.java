package blackjack;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Talia {
    ArrayList<Card> talia = new ArrayList<>();

    void getTalia() {

        for (Card c : Card.values()) {
            talia.add(c);
        }
    }

    void potasujTalie() {
        Random random = new Random();
        for (int i = 0; i < 100 ; i++) {
            talia.add(random.nextInt(talia.size()), talia.remove(random.nextInt(talia.size())));
        }
    }
    void podejrzyjTalie(){
        System.out.println(talia);
    }

    Card getCardfromTalia () {
        Card pobrana;
        pobrana=talia.remove(0);
        return pobrana;
    }

    @Override
    public String toString() {
        return "Talia{" +
                "talia=" + talia +
                '}';
    }
}
