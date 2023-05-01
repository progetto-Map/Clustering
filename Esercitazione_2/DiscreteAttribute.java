public class DiscreteAttribute extends Attribute {
    private String values[]; // Array di oggetti String, uno per ciascun valore del dominio discreto.
                             // I valori del dominio sono memorizzati in values seguendo un ordine
                             // lessicografico.

    /**
     * COMPORTAMENTO: inovca il costruttore della classe madre e inizializza il
     * membro values con il parametro di input
     * 
     * @param name     nome dell'attributo
     * @param index    identificativo numerico dell'attributo
     * @param values[] array di stringhe rappresentanti il dominio dell'attributo
     */
    public DiscreteAttribute(String name, int index, String values[]) {
        super(name, index);
        this.values = new String[values.length];
        System.arraycopy(values, 0, this.values, 0, this.values.length);
    }

    /**
     * COMPORTAMENTO: Restituisce la dimensione di values
     * 
     * @return LENGHT DI NumberOfDistinctValues numero di valori discreti nel
     *         dominio dell'attributo
     */
    public int getNumberOfDistinctValues() {
        return this.values.length;
    }

    /**
     * COMPORTAMENTO: Restituisce values[i]
     * 
     * @param i posizione di un valore in values
     * @return values[i] Valore discreto in posizione "i" di values
     */
    protected String getValue(int i) {
        return values[i];
    }

    /**
     * COMPORTAMENTO: Determina il numero di volte che il valore v compare in
     * corrispondenza dell'attributo corrente (indice di colonna) negli esempi
     * memorizzati in data e indicizzate (per riga) da idList
     * 
     * @param data   Riferimento ad un oggetto Data
     * @param idList Riferimento ad un oggetto ArraySet (che mantiene l'insieme
     *               degli indici di riga di alcune tuple memorizzate in data)
     * @param v      Valore discreto
     * @return count Numero di occorrenze del valore discreto (intero)
     */
    private int frequency(Data data, ArraySet idList, String v) {
        int vet[] = idList.toArray();
        int count = 0;
        for (int i = 0; i < vet.length; i++) {
            if ((boolean) data.getAttributeValue(vet[i], this.getIndex()).equals(v)) {
                count++;
            }
        }
        return count;
    }
    /*
     * public static void main(String[] args) {
     * Data prova = new Data();
     * ArraySet pino = new ArraySet();
     * DiscreteAttribute pippo = new DiscreteAttribute("Wind",3,"High");
     * frequency(prova,pino,"sunny");
     * 
     * }
     */
}
