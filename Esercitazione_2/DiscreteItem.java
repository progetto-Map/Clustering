
public class DiscreteItem extends Item {

    /**
     * COMPORTAMENTO: inizializza i valori dei membri attributi
     * 
     * @param attribute
     * @param value
     */
    DiscreteItem(Attribute attribute, Object value) {
        super(attribute, value);
    }

    /**
     * COMPORTAMENTO: Restituisce 0 se (getValue().equals(a)), 1 altrimenti
     * 
     * @param a
     * @return 1 o 0
     */
    double distance(Object a) {
        if (getValue().equals(a)) {
            return 0;
        } else {
            return 1;
        }
    }

    #make a method that returns the frequency of a value in a column
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
