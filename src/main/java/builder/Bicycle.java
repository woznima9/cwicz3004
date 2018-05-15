package builder;


import lombok.*;

@Getter
@Setter
//@ToString
//@AllArgsConstructor
public abstract class Bicycle {
    private String type;
    private int size;
    private String color;
    private double price;
    private String ownerName;

    public Bicycle(String type, int size, String color, double price, String ownerName) {
        this.type = type;
        this.size = size;
        this.color = color;
        this.price = price;
        this.ownerName = ownerName;
    }
}
