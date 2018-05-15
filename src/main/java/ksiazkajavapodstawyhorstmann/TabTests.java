package ksiazkajavapodstawyhorstmann;

import java.util.Arrays;

public class TabTests {

    public static void main(String[] args) {
        int[] luckyNumbers = {2, 3, 5, 7, 11, 13};
        String s = "szczesliwe";

        System.out.println(s + luckyNumbers);
        // szczesliwe[I@4554617c   [ - tab I - liczb całkowitych @42243 - kod mieszający obiektu

        System.out.println(s + Arrays.toString(luckyNumbers));
        // szczesliwe[2, 3, 5, 7, 11, 13]

        int[][] wielowymiarowa = {{1, 1}, {2, 2}, {3, 3}, {4, 4}};
        System.out.println(s + wielowymiarowa);
        System.out.println(s + Arrays.deepToString(wielowymiarowa));

    }
    //psvm
}
