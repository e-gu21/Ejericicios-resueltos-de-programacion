package trabajo6_10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Trabajo6_10 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        ejecutar();
        
    }  
    
    static public void ejecutar() throws IOException{
         
        System.out.println("Ingrese el numero en base 2");
        String numero = br.readLine();     
        
        System.out.println("El numero " +numero+ " en base 10 es: " + Integer.parseInt(numero,2));
    }
}
