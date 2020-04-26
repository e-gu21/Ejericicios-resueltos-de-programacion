package lab005_gradosurtechoeduardo;
public class LinearNode <E>{
    private LinearNode<E> next;
    private E element;
    
    //SE CREA UN NODO VACÍO:
    public LinearNode(){
        next = null;
        element = null;
    }
    
    //NODO QUE ESPECIFICA EL ELEMENTO:
    public LinearNode (E elem){
        next = null;
        element = elem;
    }
    
    //RETORNA EL NODO QUE SIGUE A ESTE
    public LinearNode<E> getNext(){
        return next;
    }
    
    //MODIFICA EL NODO QUE SIGUE
    public void setNext (LinearNode<E> node){
        next = node;
    }
    
    //RETORNA EL ELEMENTO ALMACENADO EN EL NODO
    public E getElement(){
        return element;
    }
    
    //MODIFICA EL ELEMENTO QUE SE ALMACENA EN EL NODO
    public void setElement (E elem){
        element = elem;
    }
}
