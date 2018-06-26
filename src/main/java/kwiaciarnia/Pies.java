package kwiaciarnia;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Objects;

public class Pies  {
    static int index;
    static String nameList = "Burek,Luki,Miłek,Neli,Bąbel,Luki";
    static String[] tabImionPsow = (nameList).split(",");
    String name;
    int kolejny;


    public Pies() {
        this.name = tabImionPsow[index];
        kolejny=index++;
    }


    @Override
    public String toString() {
        return "Pies{" +
                "name='" + name + '\'' +
                ", index=" + index +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pies)) return false;
        Pies pies = (Pies) o;
        return kolejny == pies.kolejny &&
                Objects.equals(name, pies.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, kolejny);
    }
}
