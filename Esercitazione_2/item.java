abstract class Item {
    Attribute attribute; // attributo coinvolto nell'item
    Object value; // valore assegnato all'attributo

    /**
     * COMPORTAMENTO: inizializza i valori dei membri attributi
     * 
     * @param attribute
     * @param value
     */
    Item(Attribute attribute, Object value) {
        this.attribute = attribute;
        this.value = value;
    }

    /**
     * COMPORTAMENTO: restituisce attribute
     * 
     * @return attribute
     */
    Attribute getAttribute() {
        return attribute;
    }

    /**
     * COMPORTAMENTO: restituisce value;
     * 
     * @return value
     * 
     */
    Object getValue() {
        return value;
    }

    /**
     * COMPORTAMENTO: restituisce value
     * 
     * @return value.toString()
     */
    public String toString() {
        return this.value.toString();
    }

    /**
     * 
     * VEDERE SE IL METODO è GIUSTO
     * 
     */
    abstract double distance(Object a);

    /**
     * COMPORTAMENTO: Modifica il membro value, assegnandogli il valore restituito
     * da data.computePrototype(clusteredData,attribute);
     * 
     * @param data          Riferimento ad un oggetto della classe Data
     * @param clusteredData insieme di indici delle righe della matrice in data che
     *                      formano il cluster
     */
    void update(Data data, ArraySet clusteredData) {
        this.value = data.computePrototype(clusteredData, attribute);
    }

}