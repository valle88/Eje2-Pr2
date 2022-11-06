public class Pila {

    CustomCollection collection = new CustomCollection();

    public void push(Integer valor){
        collection.insert(valor,0);
    }
    public Integer pop(){
        return collection.delete(0);
    }
}
