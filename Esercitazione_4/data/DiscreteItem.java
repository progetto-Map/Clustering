package Data; 

public class DiscreteItem extends Item {

    /**
     * COMPORTAMENTO: inizializza i valori dei membri attributi
     * 
     * @param attribute // attributo coinvolto nell'item
     * @param value     // valore assegnato all'attributo
     */
    
    protected DiscreteItem(Attribute attribute, Object value) {
        super(attribute, value);
    }

    /**
     * COMPORTAMENTO: Restituisce 0 se (getValue().equals(a)), 1 altrimenti
     * 
     * @param a
     * @return 1 o 0
     */
    public double distance(Object a) {
        if (getValue().equals(a)) {
            return 0;
        } else {
            return 1;
        }
    }
}
