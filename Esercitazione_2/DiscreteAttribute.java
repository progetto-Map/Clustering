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

    private int frequency(Data data, ArraySet idList, String v){
       int a = 0;
        for(a = 0; a < data.numberOfExamples; a++){
            idList.toArray();
        }
        return a;
    } 
}
