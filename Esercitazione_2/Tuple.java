
public class Tuple {
    private Item[] tuple;

    Tuple(int size) {
        Item[] tuple = new Item[size];
    }

    private int getLenght() {
        return tuple.length;
    }

    private Item get(int i) {
        return tuple[i];
    }

    private void add(Item c, int i) {
        tuple[i] = c;
    }

    private double getDistance(Tuple obj) {

    }

}
