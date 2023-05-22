
public class Tuple {
    private Item[] tuple; // tupla come sequenza di coppie attributo-valore

    /**
     * COMPORTAMENTO: costruisce l'oggetto riferito da tuple
     * 
     * @param size Numero di item che costituirà la tupla
     */
    public Tuple(int size) {
        tuple = new Item[size];
    }

    /**
     * 
     * @return tuple.lenght Restiuisce questo attributo
     */
    public int getLength() {
        return tuple.length;
    }

    /**
     * 
     * @param i parametro di tipo intero
     * @return tuple[i] Restituisce lo item in posizione i
     */
    public Item get(int i) {
        return tuple[i];
    }

    /**
     * COMPORTAMENTO: memorizza c in tuple[i]
     * 
     * @param c parametro di tipo Item
     * @param i parametro di tipo intero
     */
    public void add(Item c, int i) {
        tuple[i] = c;
    }

    /**
     * COMPORTAMENTO: determina la distanza tra la tupla riferita da obj e la tupla
     * corrente (riferita da this). La distanza è ottenuta come la somma delle
     * distanze tra gli item in posizioni eguali nelle due tuple. Fare uso di double
     * distance(Object a) di Item
     * 
     * @param obj parametro di tipo obj
     * @return Mi restiuisce la distanza tra la tupla obj e quella corrente
     */
    public double getDistance(Tuple obj) {
            double distance = 0.00;
            for (int i = 0; i < tuple.length; i++){
                distance += tuple[i].distance(obj.get(i).getValue());
            }
            return distance;

    }

    /**
     * COMPORTAMENTO: Restituisce la media delle distanze tra la tupla corrente e
     * quelle ottenibili dalle righe della matrice in data aventi indice in
     * clusteredData.
     * 
     * @param data        Parametro di tipo Data
     * @param clusterData array di interi
     * @return p Sarebbe la media delle distanze tra la tupla corrente e quelle
     *         ottenibili
     */
    public double avgDistance(Data data, int clusterData[]) {
        double p = 0.0, sumD = 0.0;
        for (int i = 0; i < clusterData.length; i++) {
            double d = getDistance(data.getItemSet(clusterData[i]));
            sumD += d;
        }
        p = sumD / clusterData.length;
        return p;
    }

}
