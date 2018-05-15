package blackjack;

import java.util.ArrayList;

public class Casino {
    ArrayList<Card> casinoCards = new ArrayList<>();

    void zagraj(Talia talia) {
        casinoCards.add(talia.getCardfromTalia());
    }

    void podejrzyjKartyCasino() {
        System.out.println(casinoCards);
    }

    int  obliczPunkty() {
        int suma=0;
        for (Card card:casinoCards) {
        suma=suma+card.getScore();
        }
        return suma;
    }


}
