package blackjack;

import java.util.ArrayList;

public class Player {
    ArrayList<Card> playerCards = new ArrayList<>();

    void zagraj(Talia talia) {
        playerCards.add(talia.getCardfromTalia());
    }

    void podejrzyjKartyPlayera() {
        System.out.println(playerCards);
    }

    int obliczPunkty() {
        int suma=0;
        for (Card card: playerCards ) {
            suma=suma+card.getScore();
        }
        return suma;
    }


}
