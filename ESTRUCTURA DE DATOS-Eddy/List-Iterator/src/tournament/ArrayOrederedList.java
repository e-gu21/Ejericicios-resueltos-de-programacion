package tournament;



public class ArrayOrederedList<T>extends ArrayList<T> 
implements OrderedListADT<T>{

    //Implementa una lista vacía usando el default capacity
    public ArrayOrederedList(){
        super();
    }
    //Implementa una lista vacía usando el specifed capacity
    public ArrayOrederedList(int initialCapacity){
        super(initialCapacity);
    }
        

//Añade elementos a la lista
     public void add(T element) {
       if(size()==list.length)
           expandCapacity();
       Comparable<T> temp=(Comparable<T>)element;
       int scan=0;
         while(scan <rear&&temp.compareTo(list[scan])>0)
             scan++;
         for(int scan2=rear;scan2>scan;scan2-- )
             list[scan2]=list[scan2-1];
         list[scan]=element;
         rear++;
         
    }
    
}
