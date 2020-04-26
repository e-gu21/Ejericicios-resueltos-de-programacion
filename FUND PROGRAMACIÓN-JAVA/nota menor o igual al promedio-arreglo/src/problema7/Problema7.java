package problema7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Problema7 {
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        int n;
        int suma=0;
        
        System.out.println("Ingrese el numero de cursos");
        n = Integer.parseInt(br.readLine());    
       
        String [] cursos = new String [n];
        int [] notas = new int [n];
        
        
        for (int i = 0; i<n;i++) {            
            System.out.print("Ingrese el nombre del curso: ");
            cursos[i]=br.readLine();       
            do{
                System.out.print("Ingrese la nota del curso: ");
                notas[i]=Integer.parseInt(br.readLine());           
            }while(notas[i]<0 || notas[i]>20);
        }   
        
        for (int i = 0; i<n;i++) {
            suma=suma+notas[i];
        }
        
        double promedio = (double)suma/n;
        
        System.out.println("promedio "+promedio);
        
        for (int i = 0; i<n;i++) {
            if(notas[i]<=promedio){
                System.out.println("********NOTAS MENOSRES O IGUALES AL PROMEDIO********");
                System.out.println("El nombre del curso "+cursos[i]+" La nota es "+notas[i]);
            }
        }
        
        
        
        
        
        
        
        
        
    }
    
}
