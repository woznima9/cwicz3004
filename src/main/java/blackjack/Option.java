package blackjack;

import java.util.ArrayList;

public enum Option {
    PlayAgain(1,false,"Rozpoczęcie nowej gry"),
    Hit(2,false,"Dobieranie karty"),
    Stand(3,false,"pozostanie przy dwóch kartach"),
    DoubleDown(4,false,"Podwojenie stawki - mozliwe jedynie po otrzymaniu drugiej karty"),
    Split(4,false,"Rozdwojenie na dwie gry jeśli dwie pierwsze karty są takie same"),
    Insurance(5,false, "Kiedy pierwsza karta krupiera jest Asem to można zadeklarować połowę stawki na wypadek trafionego OCZKA przez Krupiera. Gdy trafi kasyno wypłaca dodatkowe 1/2, ale stawka za zakład przepada. Grach wychodzi na zero ");

    int keyBoardNumber;
    boolean goIn;
    String description;

    ArrayList<Option>  options = new ArrayList<>();

    Option(int keyBoardNumber, boolean goIn, String description) {
        this.keyBoardNumber = keyBoardNumber;
        this.goIn = goIn;
        this.description = description;
    }

    public int getKeyBoardNumber() {
        return keyBoardNumber;
    }

    public void setKeyBoardNumber(int keyBoardNumber) {
        this.keyBoardNumber = keyBoardNumber;
    }

    public boolean getGoIn() {
        return goIn;
    }

    public void setGoIn(boolean goIn) {
        this.goIn = goIn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Option> getOptions() {
        return options;
    }

    public void setOptions(ArrayList<Option> options) {
        this.options = options;
    }

    @Override
    public String toString() {
        return "Option{" +
                "keyBoardNumber=" + keyBoardNumber +
                ", goIn=" + goIn +
                ", options="+ options+
                '}';
    }
}




