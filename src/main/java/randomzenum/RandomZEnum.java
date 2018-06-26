package randomzenum;

import java.util.Scanner;


public class RandomZEnum {
    public static void main(String[] args) {
        boolean run = true;

        for (Tydzien day : Tydzien.values()) {
            System.out.print(day.ordinal() + 1 + " ");
            System.out.println(day);
        }

        Scanner in = new Scanner(System.in);
        int petla = 1;

        while (run) {
            System.out.println("Jaki dzień wybrać?");
            Tydzien tydzien = Tydzien.values()[in.nextInt() - 1];
            switch (tydzien) {

                case Pon:
                    System.out.println("poniedz");
                    System.out.println(tydzien.getPrzyslowie());
                    tydzien.setPrzyslowie("zaraz będzie wtorek " + petla);
                    break;

                case Wto:
                    System.out.println("wtorek");
                    break;

                case Sro:
                    System.out.println("sroda");
                    break;

                case Czw:
                    System.out.println("czartek");
                    break;

                case Pia:
                    System.out.println("piątek");
                    break;

                case Sob:
                    System.out.println("sobota");
                    break;

                case Nie:
                    System.out.println("niedziela");
                    break;


                default:

                    break;

            }
            petla++;
        }
    }


}



