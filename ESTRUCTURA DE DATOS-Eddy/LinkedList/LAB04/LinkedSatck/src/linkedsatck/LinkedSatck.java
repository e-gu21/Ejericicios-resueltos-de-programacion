package linkedsatck;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

public class LinkedSatck <T>implements StackADT<T> {
   private LinearNode<T> top;                       
   private int c; 
   
   public LinkedSatck( ){
       top= null;
       c=0;
   }  
   
    @Override
    public void push(T element) {
      LinearNode<T> stack= new LinearNode<T>(element); //Crea y recibe un elemento
      stack.getNext();
      top=stack; 
      c--;
    }

    @Override
    public T pop() {
      T stack = top.getElement();
      top.getNext();
      c++;
      return stack;
    }

    @Override
    public T peek() {
 
    }

    @Override
    public boolean isEmpty() {
      
    }

    @Override
    public int size() {
 
    }


}
