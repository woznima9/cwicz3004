package kwiaciarnia;


public class Kwiatek implements Generator<String> {
    String kwiatki = "Róża,Goździk,Fijołek,Bratek,Tulipan,Ogórek";
    String[] kwiatkiTablica = (kwiatki).split(",");
    private int index;

    public String next() {
        return kwiatkiTablica[index++];
    }

}
