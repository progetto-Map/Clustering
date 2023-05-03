class Data {
    // Le visibilità di classi , attributi e metodi devono essere decise dagli
    // studenti
    Object data[][]; // una matrice nXm di tipo Object dove ogni riga modella una transazione
    int numberOfExamples; // cardinalità dell'insieme di transazioni (numero di righe in data)
    Attribute attributeSet[]; // un vettore degli attributi in ciascuna tupla (schema della tabella di dati)

    /*
     * COMPORTAMENTO: Inizializza la matrice data [][] con transazioni di esempio
     * (in questo momento, 14 esempi e 5 attributi come riportato nella tabella
     * sottostante);
     * Inizializza attributeSet creando cinque oggetti di tipo DiscreteAttribute,
     * uno per ciascun attributo (nella tabella sottostante). Attenzione a modellare
     * correttamente, nome, indice e dominio di ciascun attributo.
     * Inizializza numberOfExamples
     */
    Data() {

        // data

        data = new Object[14][5];

        data[0][0] = new String("sunny");
        data[1][0] = new String("sunny");
        data[2][0] = new String("sunny");
        data[3][0] = new String("rain");
        data[4][0] = new String("rain");
        data[5][0] = new String("rain");
        data[6][0] = new String("rain");
        data[7][0] = new String("rain");
        data[8][0] = new String("rain");
        data[9][0] = new String("rain");
        data[10][0] = new String("overcast");
        data[11][0] = new String("overcast");
        data[12][0] = new String("overcast");
        data[13][0] = new String("overcast");

        data[0][1] = new String("hot");
        data[1][1] = new String("hot");
        data[2][1] = new String("hot");
        data[3][1] = new String("mild");
        data[4][1] = new String("mild");
        data[5][1] = new String("mild");
        data[6][1] = new String("mild");
        data[7][1] = new String("mild");
        data[8][1] = new String("mild");
        data[9][1] = new String("mild");
        data[10][1] = new String("cold");
        data[11][1] = new String("cold");
        data[12][1] = new String("cold");
        data[13][1] = new String("cold");

        data[0][2] = new String("high");
        data[1][2] = new String("high");
        data[2][2] = new String("high");
        data[3][2] = new String("normal");
        data[4][2] = new String("normal");
        data[5][2] = new String("normal");
        data[6][2] = new String("normal");
        data[7][2] = new String("normal");
        data[8][2] = new String("normal");
        data[9][2] = new String("normal");
        data[10][2] = new String("high");
        data[11][2] = new String("high");
        data[12][2] = new String("high");
        data[13][2] = new String("high");

        data[0][3] = new String("weak");
        data[1][3] = new String("weak");
        data[2][3] = new String("weak");
        data[3][3] = new String("strong");
        data[4][3] = new String("strong");
        data[5][3] = new String("strong");
        data[6][3] = new String("strong");
        data[7][3] = new String("strong");
        data[8][3] = new String("strong");
        data[9][3] = new String("strong");
        data[10][3] = new String("strong");
        data[11][3] = new String("strong");
        data[12][3] = new String("strong");
        data[13][3] = new String("strong");

        data[0][4] = new String("no");
        data[1][4] = new String("no");
        data[2][4] = new String("no");
        data[3][4] = new String("yes");
        data[4][4] = new String("yes");
        data[5][4] = new String("yes");
        data[6][4] = new String("yes");
        data[7][4] = new String("yes");
        data[8][4] = new String("yes");
        data[9][4] = new String("yes");
        data[10][4] = new String("yes");
        data[11][4] = new String("yes");
        data[12][4] = new String("yes");
        data[13][4] = new String("yes");

        data[0][0] = new String("sunny");
        data[1][0] = new String("sunny");
        data[2][0] = new String("overcast");
        data[3][0] = new String("rain");
        data[4][0] = new String("rain");
        data[5][0] = new String("rain");
        data[6][0] = new String("overcast");
        data[7][0] = new String("sunny");
        data[8][0] = new String("sunny");
        data[9][0] = new String("rain");
        data[10][0] = new String("sunny");
        data[11][0] = new String("overcast");
        data[12][0] = new String("overcast");
        data[13][0] = new String("rain");

        data[0][1] = new String("hot");
        data[1][1] = new String("hot");
        data[2][1] = new String("hot");
        data[3][1] = new String("mild");
        data[4][1] = new String("cool");
        data[5][1] = new String("cool");
        data[6][1] = new String("cool");
        data[7][1] = new String("mild");
        data[8][1] = new String("cool");
        data[9][1] = new String("mild");
        data[10][1] = new String("mild");
        data[11][1] = new String("mild");
        data[12][1] = new String("hot");
        data[13][1] = new String("mild");

        data[0][2] = new String("high");
        data[1][2] = new String("high");
        data[2][2] = new String("high");
        data[3][2] = new String("high");
        data[4][2] = new String("normal");
        data[5][2] = new String("normal");
        data[6][2] = new String("normal");
        data[7][2] = new String("high");
        data[8][2] = new String("normal");
        data[9][2] = new String("normal");
        data[10][2] = new String("normal");
        data[11][2] = new String("high");
        data[12][2] = new String("normal");
        data[13][2] = new String("high");

        data[0][3] = new String("weak");
        data[1][3] = new String("strong");
        data[2][3] = new String("weak");
        data[3][3] = new String("weak");
        data[4][3] = new String("weak");
        data[5][3] = new String("strong");
        data[6][3] = new String("strong");
        data[7][3] = new String("weak");
        data[8][3] = new String("weak");
        data[9][3] = new String("weak");
        data[10][3] = new String("strong");
        data[11][3] = new String("strong");
        data[12][3] = new String("weak");
        data[13][3] = new String("strong");

        data[0][4] = new String("no");
        data[1][4] = new String("no");
        data[2][4] = new String("yes");
        data[3][4] = new String("yes");
        data[4][4] = new String("yes");
        data[5][4] = new String("no");
        data[6][4] = new String("yes");
        data[7][4] = new String("no");
        data[8][4] = new String("yes");
        data[9][4] = new String("yes");
        data[10][4] = new String("yes");
        data[11][4] = new String("yes");
        data[12][4] = new String("yes");
        data[13][4] = new String("no");

        // numberOfExamples

        numberOfExamples = 14;

        // explanatory Set

        attributeSet = new Attribute[5];

        // TO DO : avvalorare ciascune elemento di attributeSet con un oggetto della
        // classe DiscreteAttribute che modella il corrispondente attributo (e.g.
        // outlook, temperature,etc)
        // nel seguito si fornisce l'esempio per outlook

        String outLookValues[] = new String[3];
        outLookValues[0] = "overcast";
        outLookValues[1] = "rain";
        outLookValues[2] = "sunny";
        attributeSet[0] = new DiscreteAttribute("Outlook", 0, outLookValues);

        String temperatureValues[] = new String[3];
        temperatureValues[0] = "Hot";
        temperatureValues[1] = "Mild";
        temperatureValues[2] = "Cool";
        attributeSet[1] = new DiscreteAttribute("Temperature", 1, temperatureValues);

        String humidityValues[] = new String[2];
        humidityValues[0] = "High";
        humidityValues[1] = "Normal";
        attributeSet[2] = new DiscreteAttribute("Humidity", 2, humidityValues);

        String windValues[] = new String[2];
        windValues[0] = "Weak";
        windValues[1] = "Strong";
        attributeSet[3] = new DiscreteAttribute("Wind", 3, windValues);

        String playTennisValues[] = new String[2];
        playTennisValues[0] = "No";
        playTennisValues[1] = "Yes";
        attributeSet[4] = new DiscreteAttribute("PlayTennis", 4, playTennisValues);

    }

    /**
     * COMPORTAMENTO: restituisce numberOfExamples
     * 
     * @return numberOfExamples Cardinalità dell'insieme di transazioni
     */
    int getNumberOfExamples() {
        return numberOfExamples;
    }

    /**
     * COMPORTAMENTO: restituisce la dimensione di attributeSet
     * 
     * @return attributeSet.lengh Cardinalità dell'insieme degli attributi
     */
    int getNumberOfAttributes() {
        return attributeSet.length;
    }

    /**
     * COMPORTAMENTO: restituisce attributeSet
     * 
     * @param exampleIndex   indice di riga
     * @param attributeIndex indice di colonna in riferimento alla matrice
     *                       memorizzata in data
     * @return data[exampleIndex][attributeIndex] Restituisce lo schema dei dati
     * 
     * 
     *         SUL PDF STA SCRITTO CHE QUESTI COMMENTI SI RIFERISCONO AL METODO
     *         getAttributeSchema()
     */
    Object getAttributeValue(int exampleIndex, int attributeIndex) {
        return data[exampleIndex][attributeIndex];
    }

    /**
     * 
     * @param index
     * @return attributeSet[index]
     */
    Attribute getAttribute(int index) {
        return attributeSet[index];
    }

    /**
     * COMPORTAMENTO: crea una stringa in cui memorizza lo schema della tabella
     * (vedi attributeSet) e le transazioni memorizzate in data, opportunamente
     * enumerate. Restituisce tale stringa
     * 
     * @return s Stringa che modella lo stato dell'oggetto
     */
    public String toString() {
        String s = "";
        for (int a = 0; a < attributeSet.length; a++) {
            s = s + attributeSet[a].getName() + ",";

        }
        s = s + "\n";
        for (int b = 0; b < numberOfExamples; b++) {
            s = s + (b + 1) + ":";
            for (int c = 0; c < attributeSet.length; c++) {
                s = s + data[b][c] + ",";
            }
            s = s + "\n";
        }

        return s;
    }

    /**
     * COMPORTAMENTO: Crea e restituisce un oggetto di Tuple che modella come
     * sequenza di coppie Attributo-valore la i-esima riga in data.
     * 
     * @param index indice di riga
     * @return tuple;
     */
    protected Tuple getItemSet(int index) {
        Tuple tuple = new Tuple(explanatorySet.length);
        for (int i = 0; i < explanatorySet.length; i++) {
            tuple.add(new DiscreteItem(attributeSet[i]), ((String) data[index][i]), i);
        }
    }


    /**
     * COMPORTAMENTO: 
     * @param k array di interi rappresentanti gli indici di riga in data per le tuple inizialmente scelte come centroidi (passo 1 del k-means)
     * @return centroidIndexes
     */
    protected int[] sampling(int k) {
        int centroidIndexes[] = new int[k];
        //choose k random different centroids in data.
        Random rand = new Random();
        rand.setSeed(System.currentTimeMillis());
        for (int i = 0; i < k; i++) {
            boolean found = false;
            int c;
            do{
                found = false;
                c = rand.nextInt (getNumberOfExamples());
                //verify that centroid[c] is not equal to a centroide already stored in CentroidIndexes
                for (int j=0; j<i; j++){
                    if (compare(centroidIndexes[j], c)){
                        found = true;
                        break;
                    }
                //la prof non ha chiuso il for, non so se bisogna chiuderlo qui
                

            }
        }
    }

    /**
     * COMPORTAMENTO: restituisce computePrototype(idList,
     * (DiscreteAttribute)attribute)
     * 
     * @param idList    insieme di indici di riga
     * @param attribute attributo rispetto al quale calcolare il prototipo
     *                  (centroide)
     * @return valore centroide rispetto ad attribute
     */
    protected Object computePrototype(ArraySet idList, Attribute attribute) {
        return computePrototype(idList, (DiscreteAttribute) attribute);
    }

    public static void main(String args[]) {
        Data trainingSet = new Data();
        System.out.println(trainingSet.toString());

    }

}
