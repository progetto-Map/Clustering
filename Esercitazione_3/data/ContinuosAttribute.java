public class ContinuosAttribute extends Attribute {
    private double max;
    private double min;
    // rappresentano gli estremi dell'intervallo di valori (dominio) che l'attributo
    // può realmente assumere

    /**
     * COMPORTAMENTO: Invoca il costruttore della classe madre e inizializza i
     * membri aggiunti per estensione
     * 
     * @param name  nome
     * @param index identificativo numerico
     * @param min   valore minimo
     * @param max   valore massimo
     */
    public ContinuosAttribute(String name, int index, double min, double max) {
        super(name, index);
        this.max = max;
        this.min = min;
    }

    /**
     * COMPORTAMENTO: Calcola e restituisce il valore normalizzato del parametro
     * passato in input. La normalizzazione ha come codominio lo intervallo [0,1].
     * La normalizzazione di v è quindi calcolata come segue:
     * v'=(v-min)/(max-min)
     * 
     * @param v valore dell'attributo da normalizzare
     * 
     */
    private double getScaledValue(double v) {
        return (v - this.min) / (this.max - this.min);
    }
}
