package blackjack;

import java.util.Scanner;

public class BalcJackPlay {
    public static void main(String[] args) {
        Talia talia = new Talia();
        Player player = new Player();
        Casino casino = new Casino();
        Scanner in = new Scanner(System.in);
        System.out.println("czy rozpoczynamy grę? Tak -1, Nie -0");
        int key = in.nextInt();
        boolean nowaGra = (key == 1) ? true : false;
        int punktyGracza = 0;
        int punktyCasino = 0;
        talia.getTalia();
        talia.podejrzyjTalie();
        talia.potasujTalie();
        talia.podejrzyjTalie();
        while (nowaGra) {
            if (player.playerCards.size()>0 || casino.casinoCards.size()>0) {
                System.out.println("czyszczę karty gracza i kasyna");
                player.playerCards.clear();
                casino.casinoCards.clear();
                talia.talia.clear();
                talia.getTalia();
                talia.podejrzyjTalie();
                talia.potasujTalie();
                talia.podejrzyjTalie();
            }
            player.zagraj(talia);
            casino.zagraj(talia);
            punktyGracza = player.obliczPunkty();
            punktyCasino = casino.obliczPunkty();
            System.out.println("GRACZU Masz karty " + player.playerCards + " " + punktyGracza + " grasz dalej? (Tak -1, Nie -0");
            int decyzja = in.nextInt();
            boolean decisionPlayera = (decyzja == 1) ? true : false;
            while (decisionPlayera) {
                player.zagraj(talia);
                punktyGracza = player.obliczPunkty();
                if (punktyGracza==21) {
                    System.out.println("Masz karty" + player.playerCards + " " + punktyGracza);
                    System.out.println(" Brawo - trafiłeś Oczko - poczekamy co na to kasyno");
                    break;
                }
                if (punktyGracza > 21) {
                    System.out.println("GRZACZ PRZEGRYWA - FURA");
                    System.out.println("Masz karty" + player.playerCards + " " + punktyGracza);
                    break;
                }

                System.out.println("Masz karty" + player.playerCards + " " + punktyGracza + " grasz dalej? (Tak -1, Nie -0");
                decyzja = in.nextInt();
                decisionPlayera = (decyzja == 1) ? true : false;
            }
            if (punktyGracza <= 21) {

                System.out.println("ruch kasyna");
                System.out.println("KASYNO Masz karty " + casino.casinoCards + " " + punktyCasino + " grasz dalej? (Tak -1, Nie -0");
                decyzja = in.nextInt();
                boolean decisionCasina = (decyzja == 1) ? true : false;
                while (decisionCasina) {
                    casino.zagraj(talia);
                    punktyCasino = casino.obliczPunkty();
                    if (punktyCasino==21) {
                        System.out.println("Masz karty" + casino.casinoCards + " " + punktyCasino);
                        System.out.println(" Brawo - trafiłeś Oczko ");
                        break;
                    }
                    if (punktyCasino > 21) {
                        System.out.println("KASYNO Masz karty " + casino.casinoCards + " " + punktyCasino);
                        System.out.println("KASYNO PRZEGRYWA - FURA");
                        break;
                    }
                    System.out.println("KASYNO Masz karty " + casino.casinoCards + " " + punktyCasino + " grasz dalej? (Tak -1, Nie -0");
                    decyzja = in.nextInt();
                    decisionCasina = (decyzja == 1) ? true : false;
                }

                if (punktyCasino<=21) {

                    System.out.println("Wyłonienie zwycięzcy");
                    System.out.println("wynik gracza "+punktyGracza );
                    System.out.println("wynik kasyna " + punktyCasino);
                    if (punktyCasino == punktyGracza) {
                        System.out.println("REMIS");
                    } else if (punktyCasino > punktyGracza) {
                        System.out.println("KASYNO *****Wygrywa*****");
                    } else {
                        System.out.println("GRACZ  WYGRYWA   ");
                    }
                }
            }

            System.out.println("Czy kontynuujemy grę  Tak - 1  Nie -0");
            key = in.nextInt();
            nowaGra = (key == 1) ? true : false;


        }
    }
}
