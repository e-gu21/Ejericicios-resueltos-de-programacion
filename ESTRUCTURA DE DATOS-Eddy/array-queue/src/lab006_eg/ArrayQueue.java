package lab006_eg;
public class ArrayQueue<T>implements QueueADT<T> {
    private final int DEFAULT_CAPACITY = 100;
    private int rear;
    private T[] queue; 
    
    public ArrayQueue(){
        rear = 0;
        queue = (T[])(new Object[DEFAULT_CAPACITY]);
    }
    public ArrayQueue (int initialCapacity){
        rear = 0;
        queue = (T[])(new Object[initialCapacity]);
    }
    private void expandCapacity( ){
        T[ ] larger = (T[ ]) (new Object[queue.length*2]);
        for (int index=0; index < queue.length; index++)
            larger[index] = queue[index];
        queue = larger;
    } 

    public void enqueue(T element) {
        if (size() == queue.length)
            expandCapacity( );
       queue[rear] = element;
       rear++;
    }

    public T dequeue() {
        T result = queue[0];
        rear--;
        for (int i = 0; i < rear; i++)
            queue[i] = queue[i+1];
        queue[rear] = null;
        return result;
    }

    public T first() {
         return queue[rear];
    }

    public boolean isEmpty() {
        return (rear==0);
    }

    public int size() {
        return rear;
    }
    
}
