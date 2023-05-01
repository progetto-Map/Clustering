public class DiscreteAttribute extends Attribute {
    private String values[];

    public DiscreteAttribute(String name, int index, String values[]) {
        super(name, index);
        this.values = new String[values.length];
        System.arraycopy(values, 0, this.values, 0, this.values.length);
    }

    public int getNumberOfDistinctValues() {
        return this.values.length;
    }

    protected String getValue(int i) {
        return values[i];
    }

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
    public static void main(String[] args) {
        Data prova = new Data();
        ArraySet pino = new ArraySet();
        DiscreteAttribute pippo = new DiscreteAttribute("Wind",3,"High");
        frequency(prova,pino,"sunny");
       
    }
    */
}
