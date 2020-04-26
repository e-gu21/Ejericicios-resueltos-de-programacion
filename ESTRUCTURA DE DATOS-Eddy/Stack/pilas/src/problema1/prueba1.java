package problema1;
public class prueba1 {
    public static void main(String[] args) {
    ArrayStack pila=new ArrayStack();
        pila.push(20);                
        pila.push(40);                    
        pila.push(60);                
        pila.push(80);  
        
        System.out.println("El tamaño de la pila es: "+pila.size());
        
        while( !pila.isEmpty() ){
        int value = pila.pop();      
        System.out.print(value);
        System.out.print(" ");
        }
        
        System.out.println(" ");
    }
    
}
