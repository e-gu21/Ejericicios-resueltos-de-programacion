package tournament;
import java.util.*;
public class ArrayIterator<T>implements Iterator {
    private int count; //Número de elementos en la colección
    private int current; //posicion comun del iterator
    private T[]items;
    
    //Inicializa el iterator usando los items correctos
    public ArrayIterator(T[]collection, int size){
        items=collection;
        count=size;
        current=0;
    }
    //Verifica si hay un elemento siguiente
    public boolean hasNext(){
        return (current < count); //Retorna ToF
    }
    //Retorna el sgt elemento del iterator
    public T next(){
        current++;
        return items[current-1];
    }
    //Remueve la operación si no encaja en la colección
    public void remove(){
        
    }
}
