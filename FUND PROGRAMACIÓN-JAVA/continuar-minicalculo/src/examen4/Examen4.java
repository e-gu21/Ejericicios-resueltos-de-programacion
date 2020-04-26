package examen4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Examen4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        char resp='s';
        int n;
        String respuesta;
        do{
            do{
                System.out.println("Ingrese un numero");
                n=Integer.parseInt(br.readLine()); 
            }while(n<=0);
            
           if(capicua(n)==1){
               determinarDigitos(n);
           }else{
               reves(n);
           }
                       
            System.out.println("Desea continuar? s: sí || n: no");
            respuesta=br.readLine();
            respuesta=respuesta.toLowerCase();
            resp=respuesta.charAt(0);             
        }while(resp=='s');
       
    }
    
    static int capicua(int numero){
        int respuesta;
         int falta=numero, ninvertido=0, resto=0;
        while(falta!=0){
            resto=falta%10;
            ninvertido=ninvertido*10+resto;
            falta=falta/10;
        }
        
        if(ninvertido==numero)
            respuesta=1;
        else
            respuesta=0;
        
        return respuesta;
    }
    
    static void determinarDigitos(int n){
        int suma=0;
        
        while(n>=10){
            n=n/10;
            suma=suma+n%10;
            
        }       
        
        suma=suma+n;
        System.out.println("\nLa suma de sus digitos es "+suma);
        
       
    }
    
    static void reves(int numero){
        
        int falta=numero, ninvertido=0, resto=0;
        while(falta!=0){
            resto=falta%10;
            ninvertido=ninvertido*10+resto;
            falta=falta/10;
        }
              
        
        System.out.println("\nEl numero invertido es "+ninvertido);
    }
    
}
