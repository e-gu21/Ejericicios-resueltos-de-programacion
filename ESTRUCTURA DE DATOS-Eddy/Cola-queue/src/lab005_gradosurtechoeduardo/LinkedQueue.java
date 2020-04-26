package lab005_gradosurtechoeduardo;
public class LinkedQueue<T>implements QueueADT<T> { //la calse QueueADT es implementada en LinkedQueue
    private int count;                              //Se crea un contador 
    private LinearNode<T> front, rear;              //Toda cola tiene un frente un trasero 
    public LinkedQueue(){                           //Constructor
        count=0;                                    //Contador empeiza de 0
        front=rear=null;                            //Frente y trasero vacío
    }

    @Override
    public void enqueue(T element) {                 //Se añade un elemento al final de la cola 
        LinearNode<T> node=new LinearNode<T>(element);//Se crea un nuevo nodo 
        if(isEmpty())                                 //Condición si la cola está vacía
            front=node;                               //Entonces el frente es el nuevo nodo 
        else                                          //Condición de lo contrario
            rear.setNext(node);                       //modifica al nodo después del final
        rear=node;                                    //Entonces el final sería el nuevo nodo     
        count++;                                      //Contador aumenta
    }

    @Override
    public T dequeue(){                             //Se quita un elemento al frente de la cola 
       T result=front.getElement();                 //el frente obtiene un elemento
       front=front.getNext();                       //el frente obtiene al siguiente elemento  
       count--;                                     //Se disminuye el contador 
       return result;                               //Retorna el rsultado
    }

    @Override
    public T first() {                              //Examina al elemento al frente de la cola
        return front.getElement();
    }

    @Override
    public boolean isEmpty() {                      //Determina el número de elemento sne la cola 
        return (count==0);
     }

    @Override
    public int size() {                              //Determina el tamaño de la cola
      return count;
    }
}
