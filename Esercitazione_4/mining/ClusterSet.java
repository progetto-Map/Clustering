package mining;

import java.util.HashSet;
import java.util.Set;
import Data.Data;
import Data.Tuple;


public class ClusterSet {
    Cluster C[];
    int i = 0; // posizione valida per la memorizzazione di un nuovo cluster in C

    /**
     * COMPORTAMENTO: creo l'oggetto array riferito da C
     * 
     * @param k Numero di cluster da generare(k-means)
     */
    ClusterSet(int k) {
        C = new Cluster[k];
    }

    /**
     * COMPORTAMENTIO: assegna c a C[i] e incrementa i
     * 
     * @param c Oggetto di Cluster
     */
    public void add(Cluster c) {
        C[i] = c;
        i++;
    }

    /**
     * COMPORTAMENTO: restituisce C[i]
     * 
     * @param i parametro di tipo intero
     * @return C[i]
     */
    private Cluster get(int i) {
        return C[i];
    }

    /**
     * COMPORTAMENTO: sceglie i centroidi, crea un cluster per ogni centroide e lo
     * memorizza in C
     * 
     * @param data Oggetto di Data
     */
    public void initializeCentroids(Data data) {
        int centroidIndexes[] = data.sampling(C.length);
        for (int i = 0; i < centroidIndexes.length; i++) {
            Tuple centroidI = data.getItemSet(centroidIndexes[i]);
            add(new Cluster(centroidI));
        }
    }

    /**
     * COMPORTAMENTO: Calcola la distanza tra la tupla riferita da tuple ed il
     * centroide di ciascun cluster in C e restituisce il cluster più vicino (fare
     * uso del metodo getDistance() della classe Tuple).
     * 
     * @param tuple Riferimento ad un oggetto Tuple
     * @return nearestCluster Cluster più “vicino” alla tupla passata
     */
    public Cluster nearestCluster(Tuple tuple) {
        double minDistance = Double.MAX_VALUE;
        Cluster nearestCluster = null;
        for (int i = 1; i < C.length; i++) {
            double distance = tuple.getDistance(C[i].getCentroid());
            if (distance < minDistance) {
                minDistance = distance;
                nearestCluster = C[i];
            }
        }
        return nearestCluster;
    }

    /**
     * COMPORTAMENTO: Identifica e restituisce il cluster a cui la tupla
     * rappresentate l'esempio identificato da id. Se la tupla non è inclusa in
     * nessun cluster restituisce null (fare uso del metodo contain() della classe
     * Cluster).
     * 
     * @param id Indice di una riga nella matrice in Data
     * @return C[i] Se esso contiene int id.
     * @return null Se non lo contiene
     */
    public Cluster currentCluster(int id) {
        for (int i = 0; i < C.length; i++) {
            if (C[i].contain(id))
                return C[i];
        }
        return null;
    }

    /**
     * COMPORTAMENTO: calcola il nuovo centroide per ciascun cluster in C (fare uso
     * del metodo computeCentroid() della classe Cluster)
     * 
     * @param data Riferimento ad un oggetto
     */
    public void updateCentroids(Data data) {
        for (int i = 0; i < C.length; i++) {
            C[i].computeCentroid(data);
        }
    }

    public String toString() {
        String str = "";
        for (int i = 0; i < C.length; i++) {
            if (C[i] != null) {
                str += i + ":" + C[i].toString() + "\n";
            }
        }
        return str;
    }

    /**
     * COMPORTAMENTO: Restituisce una stringa che descriva lo stato di ciascun
     * cluster in C.
     * 
     * @param data Riferimento ad un oggetto Data
     * @return str Stringa
     */
    public String toString(Data data) {
        String str = "";
        for (int i = 0; i < C.length; i++) {
            if (C[i] != null) {
                str += i + ":" + C[i].toString(data) + "\n";
            }
        }
        return str;
    }

}
