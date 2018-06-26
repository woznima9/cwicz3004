package blackjack;

public enum Card {
    AsPik("AP", 11),
    AsKier("AK", 11),
    AsCaro("AC", 11),
    AsTrefl("AT", 11),

    KrolPik("KP", 10),
    KrolKier("KK", 10),
    KrolCaro("KC", 10),
    KrolTrefl("KT", 10),

    DamaPik("DP", 10),
    DamaKier("DK", 10),
    DamaCaro("DC", 10),
    DamaTrefl("DT", 10),

    WaletPik("JP", 10),
    WaletKier("JK", 10),
    WaletCaro("JC", 10),
    WaletTrefl("JT", 10),

    _10Pik("0P", 10),
    _10Kier("0K", 10),
    _10Caro("0C", 10),
    _10Trefl("0T", 10),

    _9Pik("9P", 9),
    _9Kier("9K", 9),
    _9Caro("9C", 9),
    _9Trefl("9T", 9),

    _8Pik("8P", 8),
    _8Kier("8K", 8),
    _8Caro("8C", 8),
    _8Trefl("8T", 8),

    _7Pik("7P", 7),
    _7Kier("7K", 7),
    _7Caro("7C", 7),
    _7Trefl("7T", 7),

    _6Pik("6P", 6),
    _6Kier("6K", 6),
    _6Caro("6C", 6),
    _6Trefl("6T", 6),

    _5Pik("5P", 5),
    _5Kier("5K", 5),
    _5Caro("5C", 5),
    _5Trefl("5T", 5),

    _4Pik("4P", 4),
    _4Kier("4K", 4),
    _4Caro("4C", 4),
    _4Trefl("4T", 4),

    _3Pik("3P", 3),
    _3Kier("3K", 3),
    _3Caro("3C", 3),
    _3Trefl("3T", 3),

    _2Pik("2P", 2),
    _2Kier("2K", 2),
    _2Caro("2C", 2),
    _2Trefl("2T", 2);

    private String abbreviation;
    private int strenght;

    Card(String abbreviation, int strenght) {
        this.abbreviation = abbreviation;
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }


    @Override
    public String toString() {
        return abbreviation;
    }
}
