abstract class Item {
    Attribute attribute; // attributo coinvolto nell'item
    Object value; // valore assegnato all'attributo

    Item(Attribute attribute, Object value) {
        this.attribute = attribute;
        this.value = value;
    }

    /**
     * COMPORTAMENTO: inizializza i valori dei membri attributi;
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

    public String toString() {
        return this.value.toString();
    }

    abstract double distance(Object a);

    void update(Data data, ArraySet clusteredData) {
        this.value = data.computerPrototype(clusteredData, attribute);
    }

}