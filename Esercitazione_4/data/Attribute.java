abstract class Attribute {
    private String name; // nome simbolico dell'attributo
    private int index; // indentificativo numerico dell'attributo

    /**
     * COMPORTAMENTO: inizializza i valori dei membri name, index
     * 
     * @param name  nome dell'attributo
     * @param index identificativo numerico dell'attributo (primo, secondo ...
     *              attributo della tupla)
     */
    protected Attribute(String name, int index) {
        this.name = name;
        this.index = index;
    }

    /**
     * COMPORTAMENTO: restituisce name
     * 
     * @return NAME nome dell'attributo
     */
    protected String getName() {
        return this.name;
    }

    /**
     * COMPORTAMENTO: restituisce index;
     * 
     * @return INDEX identificativo numerico dell'attributo
     */
    protected int getIndex() {
        return this.index;
    }

    /**
     * COMPORTAMENTO: restiruisce name
     * 
     * @return NAME sovrascrive metodo ereditato dalla superclasse e restuisce la
     *         stringa rappresentante lo stato dell'oggetto
     */
    public String toString() {
        return this.name;
    }
}
