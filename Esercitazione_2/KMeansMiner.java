public class KMeansMiner {
    private ClusterSet C;

    private KMeansMiner(int k){
        C = new ClusterSet(k);
    }

    private ClusterSet getC(){
        return C;
    }

    private int kmeans(Data data){
        int numberOfInterations = 0;
        C.initializeCentroids(data);
        boolean changedCluster = false;
        do{
            numberOfInterations++;
            //STEP 2
            changedCluster = false;
            for(int i = 0; i<data.getNumberOfExamples();i++){
                Cluster nearestCluster = C.nearestCluster(data.getItemSet(i));
                Cluster oldCluster = C.currentCluster(i);
                boolean currentChange = nearestCluster.addData(i);
                if(currentChange)
                    changedCluster=true;
                //rimuovi la tupla dal vecchio cluster
                if(currentChange && oldCluster!=null)
                    //il nodo va rimosso dal suo vecchio cluster
                    oldCluster.removeTuple(i);
            }
            //STEP 3
            C.updateCentroids(data);
        }
        while(changedCluster);
        return numberOfInterations;
    }
    
}
