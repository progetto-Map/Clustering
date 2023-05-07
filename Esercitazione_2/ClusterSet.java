private class ClusterSet {
    Cluster C[];
    int i = 0; // posizione valida per la memorizzazione di un nuovo cluster in C

    /**
     * COMPORTAMENTO: creo l'oggetto array riferito da C
     * 
     * @param k Numero di cluster da generare(k-means)
     */
    ClusterSet(int k) {
        
    }

    /**
     * COMPORTAMENTIO: assegna c a C[i] e incrementa i
     * 
     * @param c
     */
    private void add(Cluster c) {
        C[i] = c;
        i++; 
    }

    private Cluster get(int i){
        return C[i];
    }

    private void initializeCentroids(Data data){
        int centroidIndexes[]=data.sampling(C.length);
        for (int i=0;i<centroidIndexes.length;i++)
        {
            Tuple centroidI=data.getItemSet(centroidIndexes[i]);
            add(new Cluster(centroidI));
        }
    }

    private Cluster nearesCluster(Tuple tuple){

    }

    private Cluster currentCluster(int id){
        for (int i=0;i<C.length;i++){
            if (C[i].contain(id))
            return C[i];
        }
        return null;
    }

    private void updateCentroids(Data data){
        for(int i=0;i<C.lenght;i++){
            C[i].computeCentroid(data);
        }
    }

    public String toString(){
        
    }

    public String toString(Data data){
        String str="";
        for(int i=0;i<C.lenght;i++){
            if (C[i]!=null){
                str+=i+":"+C[i].toString(data)+"\n";
            }
        }
        return str;
    }

    // DA FINIRE TUTTO PERCHè ERA SOLO UN ABBOZZO
}
