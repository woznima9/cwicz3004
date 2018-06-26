package sortujmiasta;

public enum MenuPositions {

    Data_Import("importowanie danych z pliku tekstowego"),
    Show_Imported_Data("wydruk zaimportowanych danych"),
    Sort_Cities("sortowanie danych po miastach"),
    Sort_Populations("sortowanie danych po liczebności mieszkańców"),
   // Add_City("dodawanie miasta"),
    All_Population("suma mieszkańców wszystkich miast"),
    Kolejna_Opcja("kolejna nieznana opcja"),
    EXIT("Exit - wyjście z tego menu (lub każda inna liczba spoza zakresu)");
private String opis;

    MenuPositions(String opis) {
        this.opis = opis;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }
}
