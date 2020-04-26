package linearnode;
public class BuildLinkedList {
    public static void main(String[] args) {
        LinearNode<Integer> head = null; //SE CREA UNA LISTA VACÍA
        LinearNode<Integer> intNode;
        
        for (int i = 10; i >= 1; i--){ //SE CREA UN FOR PARA LOS 10 NÚMEROS (CREA NODO)
            intNode = new LinearNode<Integer>(new Integer(i));
            intNode.setNext(head); //SE AGREGA AL TOP
            head = intNode;
        }
        LinearNode<Integer> current = head;
        for (int i = 1; i <= 10; i++){ //RECORRE TODA LA LISTA PARA LUEGO REPORTAR
            System.out.println(current.getElement());
            current = current.getNext();
        }
    }

    
}
