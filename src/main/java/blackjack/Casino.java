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

    int obliczPunkty() {
        int suma = 0;
        for (Card card : casinoCards) {
            suma = suma + card.getStrenght();
            if (suma > 21 && (card == Card.AsCaro || card == Card.AsKier || card == Card.AsPik || card == Card.AsTrefl)) {
                suma = suma - 10;
            }
        }
        return suma;
    }


}
