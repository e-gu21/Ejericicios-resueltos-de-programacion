package examen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Examen {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        char resp='s';
        String respuesta;
        int n;
        int contador=0;   
       
        do{
        System.out.println("Ingrese numero");
        n=Integer.parseInt(br.readLine());
        
        contador=contador+determinarDigitos(n);           
        
        System.out.println("Desea seguir ingresando numeros? s: Sí || n: No");
        respuesta=br.readLine();
        respuesta=respuesta.toLowerCase();
        resp=respuesta.charAt(0);        
        }while(resp=='s');
        
        reportarDigitos(contador);
    
    }
    
    static int determinarDigitos(int n){
        int contador=0;
        while(n>=10){
            n=n/10;
            contador++;
        }        
        contador++;
        
        return contador;
    }
    
    static void reportarDigitos(int contador){
        System.out.println("El numero total de digitos es "+contador);
    }
}
