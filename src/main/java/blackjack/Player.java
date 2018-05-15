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
        int suma = 0;
        for (Card card : playerCards) {
            suma = suma + card.getStrenght();
            if (suma > 21 && (card == Card.AsCaro || card == Card.AsKier || card == Card.AsPik || card == Card.AsTrefl)) {
                suma = suma - 10;
            }
        }
        return suma;
    }


}
