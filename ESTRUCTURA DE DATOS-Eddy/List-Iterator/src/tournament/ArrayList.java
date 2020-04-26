package tournament;
import java.util.Iterator;
public class ArrayList <T>implements ListADT<T>{
    protected final int DEFAULT_CAPACITY = 100;  //Capacidad por defecto
    private final int NOT_FOUND=-1;  //Usado para compaar los elementos y verificar que estén dentro del arreglo
    protected int rear;  //Será la cola
    protected T [] list; //Array -> Será la lista
    
    //SE CREA UNA LISTA VACÍA
    public ArrayList(){
        rear=0; //LA COLA EMPIEZA EN 0
        list=(T[])(new Object [DEFAULT_CAPACITY]); //SE CREARÁ LA LISTA
    }
    
    //CREA UNA LISTA VACÍA USANDO LA CAPACIDAD ESPECIFICADA
    public ArrayList(int initialCapacity){
        rear=0; //La cola empieza en 0
        list=(T[])(new Object [DEFAULT_CAPACITY]); //SE CREARÁ LA LISTA
    }

    //Remueve y retorna el primer elemento de la lista
    public T removeFirst() {
        T result = list[0]; //Variable auxiliar para retornar el resultado
        rear--; //La lista disminuye 
        //Cambia los elementos
        for(int scan=0;scan<rear;scan++)
            list[scan]=list[scan+1];
        
        list[rear]=null;
        return result; //retorna el resultado
    }

    //Remueve y retorna el último elemento de la lista
    public T removeLast() {
      T result; //Auxiliar
      rear--; //Disminuirá la lista
      result=list[rear]; //Resultado será el último elemento de la lista
      list[rear]=null;//El último elemento de la lista se anula´ra
      
      return result; //Retorna el resultado
    }

    //Remueve un elemento específico de la lista
    public T remove(T element) {
       T result; //Auxiliar
       int index = find (element); //Método auxiliar find 
       
       result = list[index];//Resultado será algún elemento de la lista
       rear--;//Disminuirá la lista
       for(int scan=index; scan<rear;scan++)
           list[scan]=list[scan+1];
       
       list[rear]=null;//El último elemento de la lista se anula´ra
       return result; //Retorna el resultado
    }

    //retornal el primer elemento
    public T first() {
        return  list[0]; //Retorna el elemento en la posición 0
    }

    //Retorna el último elemento
    public T last() {
        return  list[rear-1];//Retorna el elemento en la posición final
    }

    //Determina si un elemento en particular está en la lista
    public boolean contains(T target) {
        return (find (target)!=NOT_FOUND);//si lo encuentra es diferente a -1 lo que quiere decir que está en la lista y lo retorna
    }
    //Método auxiliar
    private int find(T target) {
        int scan=0, result = NOT_FOUND;
        boolean found = false;
        if (! isEmpty( ))
            while (! found && scan < rear)
                if (target.equals(list[scan]))
                    found = true;
                else
                    scan++;
        if (found)
            result = scan;
        return result; //Retorna el resultado
    }

    //Verifica si la ñlista está vacía
    public boolean isEmpty() {
        return (rear==0);//retorna T o F 
    }

    @Override
    public int size() {
        return rear; //Retorna el último valor de la lista
    }

    
    //retorna un iterator
    public Iterator<T> iterator() {
        return new ArrayIterator<T>(list,rear);
    }
    
    //Retorna una representación String de la lista
    public String toString(){
        String result ="";
        for(int scan=0;scan<rear;scan++)
            result= result+list[scan].toString()+"\n";
        return result;
    }
    protected void expandCapacity(){
        T[]larger=(T[])(new Object[list.length*2]);
        for(int scan=0; scan<list.length; scan++){
            larger[scan]=list[scan];
        }
        list=larger;
    }

    
}
