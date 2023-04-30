public class ContinuosAttribute extends Attribute{
    private double max;
    private double min;

    public ContinuosAttribute(String name, int index, double min,double max){
        super(name,index);
        this.max = max;
        this.min=min;
    }

    private double getScaledValue(double v){
        return (v-this.min)/(this.max-this.min); 
    }
}
