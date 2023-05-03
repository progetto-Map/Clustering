
public class Tuple {
    private Item[] tuple;

    private Tuple(int size) {
        Item[] tuple = new Item[size];
    }

    private int getLength() {
        return tuple.length;
    }

    private Item get(int i) {
        return tuple[i];
    }

    private void add(Item c, int i) {
        tuple[i] = c;
    }

    private double getDistance(Tuple obj) {
        try {
            double distance = 0;
            for (int i = 0; i < tuple.length; i++){
                distance += tuple.distance[i](obj.get[i].getValue());
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        

    }

}
