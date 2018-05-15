package builder;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Turistic extends Bicycle {
    private int wheelSize;
    private double laod;

    @Builder
    private Turistic(String type, int size, String color, double price, String ownerName, int wheelSize, double load) {
        super(type, size, color, price, ownerName);
        this.wheelSize = wheelSize;
        this.laod = load;
    }
}
