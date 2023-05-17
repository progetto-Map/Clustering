abstract class Attribute {
    private String name;
    private int index;
    
    protected  Attribute(String name, int index){
        this.name = name;
        this.index = index;
    }

    protected String getName(){
        return this.name;
    }

    protected int getIndex(){
        return this.index;
    }

    public String toString(){
        return this.name;
    }
}


