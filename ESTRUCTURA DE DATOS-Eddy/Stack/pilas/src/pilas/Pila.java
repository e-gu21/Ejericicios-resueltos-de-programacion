package pilas;
public class Pila {
    public static void main(String[] args) {
        MiPila laPila = new MiPila(10); // Crea la pila
        laPila.push(20);                //Se agrega valor (0)
        laPila.push(40);                //Se agrega item  (1)    
        laPila.push(60);                //Se agrega item  (2)
        laPila.push(80);                //Se agrega item  (3)
        while( !laPila.isEmpty() )      //Recorre al pila
        {
        long value = laPila.pop();      //Elimina calor del top 
        System.out.print(value);
        System.out.print(" ");
        } 
        System.out.println(" ");
    }
    
}
