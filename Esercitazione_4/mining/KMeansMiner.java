package mining;
public class KMeansMiner {
    private ClusterSet C; // Riferimento ad un oggetto ClusterSet

    /**
     * COMPORTAMENTO: Crea l'oggetto array riferito da C
     * 
     * @param k Numero di cluster da generare
     */
    public KMeansMiner(int k) {
        C = new ClusterSet(k);
    }

    /**
     * 
     * @return C Riferimento ad un oggetto ClusterSet
     */
    public ClusterSet getC() {
        return C;
    }

    /**
     * COMPORTAMENTO: Esegue l’algoritmo k-means eseguendo i passi dello
     * pseudo-codice:
     * 1. Scelta casuale di centroidi per k clusters
     * 2. Assegnazione di ciascuna riga della matrice in data al cluster avente
     * centroide più vicino all'esempio.
     * 3. Calcolo dei nuovi centroidi per ciascun cluster
     * 4. Ripete i passi 2 e 3. finché due iterazioni consecuitive non restituiscono
     * centroidi uguali .
     * 
     * @param data Riferimento ad un oggetto Data
     * @return Numero di iterazioni eseguite
     */
    private int kmeans(Data data) {
        int numberOfInterations = 0;
        C.initializeCentroids(data);
        boolean changedCluster = false;
        do {
            numberOfInterations++;
            // STEP 2
            changedCluster = false;
            for (int i = 0; i < data.getNumberOfExamples(); i++) {
                Cluster nearestCluster = C.nearestCluster(data.getItemSet(i));
                Cluster oldCluster = C.currentCluster(i);
                boolean currentChange = nearestCluster.addData(i);
                if (currentChange)
                    changedCluster = true;
                // rimuovi la tupla dal vecchio cluster
                if (currentChange && oldCluster != null)
                    // il nodo va rimosso dal suo vecchio cluster
                    oldCluster.removeTuple(i);
            }
            // STEP 3
            C.updateCentroids(data);
        } while (changedCluster);
        return numberOfInterations;
    }

}
