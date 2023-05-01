
public class DiscreteItem extends Item {

    DiscreteItem(DiscreteAttribute attribute, String value) {
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
}
