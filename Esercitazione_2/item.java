abstract class item{
    Attribute attribute;
    object value;


    item(Attribute attribute, object value){
        this.attribute = attribute;
        this.value = value;
}

Attribute getAttribute(){
    return attribute;
}
Object getValue() {
    return value;
}
public String toString(){
    return this.value.TosString();
}

abstract double distance(Object a);

void update(Data data,ArraySet clusteredData){
    this.value=data.computerPrototype(clusteredData,attribute);
}

}