package kwiaciarnia;

import java.util.ArrayList;

public class CollectionData<T> extends ArrayList<T> {
    public CollectionData(Generator<T> gen, int quantity) {
        for (int i = 0; i < quantity; i++) {
            add(gen.next());

        }
    }

    public CollectionData(Pies pies, int quantity) {

    }
}
