package randomzenum;

import java.util.ArrayList;

public class SizeTest {
    public static void main(String[] args) {
        Enum rozmiar;

        rozmiar = Size.SMALL;
        String string = Size.SMALL.getAbbreviation();
        int numeracja = Size.MEDIUM.getNumer();
        System.out.println(rozmiar + " " + string + " " + numeracja);

        numeracja += 10;
        Size.MEDIUM.setNumer(numeracja);
        System.out.println(rozmiar + " " + string + " " + numeracja);

        ArrayList<Size> sizes = new ArrayList<>();
        for (Size s : Size.values()) {
            sizes.add(s);
        }

        System.out.println(sizes);
        System.out.println(sizes.get(2).getAbbreviation());
        int suma = 0;
        StringBuilder allSizes= new StringBuilder();
        for (Size element : sizes) {
            suma += element.getNumer();
            allSizes.append(element.getAbbreviation());
        }
        System.out.println(suma+" length: "+allSizes.length());
        int iloscRozmiarow = Size.values().length;
        System.out.println(iloscRozmiarow);


    }
}
