package tournament;

import java.util.Iterator;
public interface ListADT<T> {
    public T removeFirst();                 //Elimina y retorna el primer elmento de la lista
    public T removeLast(); //Elimina y retorna el último elmento de la lista
    public T remove (T element); //Elimina y retorna un elmento de la lista
    public T first(); //retorna una referencia del primer elmento de la lista
    public T last(); //retorna una referencia del último elmento de la lista
    public boolean contains (T target); //Determina si hay un elemento específico en la lista
    public boolean isEmpty( ); //Determina si la lista está vacía
    public int size(); //Determina el tamaño de la lista
    public Iterator <T> iterator(); //Retorna un iterator de la lista de elementos
    public String toString(); //Retorna una representación String de la lista
}
