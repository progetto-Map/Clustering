public class DiscreteAttribute extends Attribute{
    private String values[];

    public DiscreteAttribute(String name,int index,String values[]){
        super(name,index);
        this.values = new String[values.length];
        System.arraycopy(values, 0, this.values, 0, this.values.length); 
    }

    public int getNumberOfDistinctValues(){
        return this.values.length;
    }

    protected String getValue(int i){
        return values[i];
    }
}
