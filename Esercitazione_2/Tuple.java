
public class Tuple {
    private Item[] tuple;

    public Tuple(int size) {
        Item[] tuple = new Item[size];
    }

    private int getLength() {
        return tuple.length;
    }

    private Item get(int i) {
        return tuple[i];
    }

    public void add(Item c, int i) {
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

    /**
     * COMPORTAMENTO: Restituisce la media delle distanze tra la tupla corrente e
     * quelle ottenibili dalle righe della matrice in data aventi indice in
     * clusteredData.
     * 
     * @param data
     * @param clusterData
     * @return p Sarebbe la media delle distanze tra la tupla corrente e quelle
     *         ottenibili
     */
    protected double avgDistance(Data data, int clusterData[]) {
        double p = 0.0, sumD = 0.0;
        for (int i = 0; i < clusterData.length; i++) {
            double d = getDistance(data.getItemSet(clusterData[i]));
            sumD += d;
        }
        p = sumD / clusterData.length;
        return p;
    }

}
