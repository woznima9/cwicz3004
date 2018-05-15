package blackjack;

import java.util.Scanner;

public class BalcJackPlay {
    public static void main(String[] args) {
        Talia talia = new Talia();
        Player player = new Player();
        Casino casino = new Casino();
        talia.getTalia();
        talia.potasujTalie();
        Scanner in = new Scanner(System.in);
        System.out.println("czy rozpoczynamy grę? Tak -1, Nie -0");
        int key = in.nextInt();
        boolean graWToku = (key==1) ? true : false;
        player.zagraj(talia);
        casino.zagraj(talia);
        int punktyGracza=player.obliczPunkty();
        int punktyCasino=casino.obliczPunkty();
        while (graWToku) {

            System.out.println("GRACZU Masz karty "+player.playerCards +" "+ punktyGracza + " grasz dalej? (Tak -1, Nie -0");
            int decyzja = in.nextInt();
            boolean decisionPlayera = (decyzja == 1) ? true : false;
            while (decisionPlayera) {
                player.zagraj(talia);
                punktyGracza = player.obliczPunkty();
                System.out.println("Masz karty" + player.playerCards + " " + punktyGracza + " grasz dalej? (Tak -1, Nie -0");
                decyzja = in.nextInt();
                decisionPlayera = (decyzja == 1) ? true : false;
            }


            System.out.println("ruch kasyna");
            System.out.println("KASYNO Masz karty "+casino.casinoCards+" " + punktyCasino + " grasz dalej? (Tak -1, Nie -0");
            decyzja = in.nextInt();
            boolean decisionCasina = (decyzja == 1) ? true : false;
            while (decisionCasina) {
                casino.zagraj(talia);
                punktyCasino = casino.obliczPunkty();
                System.out.println("KASYNO Masz karty "+casino.casinoCards+" " + punktyCasino + " grasz dalej? (Tak -1, Nie -0");
                decyzja = in.nextInt();
                decisionCasina = (decyzja == 1) ? true : false;
            }
            System.out.println("Czy kontynuujemy grę  Tak - 1  Nie -0");
            key = in.nextInt();
            graWToku = (key==1) ? true : false;
        }
    }
}
