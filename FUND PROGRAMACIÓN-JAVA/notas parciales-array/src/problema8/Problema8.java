package problema8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Problema8 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
       
        int n;
        System.out.println("Ingrese cantidad de alumnos");
        n=Integer.parseInt(br.readLine());
        String [] nombre = new String [n];
        int [] parcial1= new int [n];
        int [] parcial2= new int [n];
        int [] parcial3 = new int [n];
        
        for (int i =0;i<n;i++) {
            System.out.print("Ingrese "+(i+1) + "° nombre: ");
            nombre[i]=br.readLine();
            do{
            System.out.print("Ingrese nota parcial 1: ");
            parcial1[i]=Integer.parseInt(br.readLine());}while(parcial1[i]<0 || parcial1[i]>20);
            do{
            System.out.print("Ingrese nota parcial 2: ");
            parcial2[i]=Integer.parseInt(br.readLine());}while(parcial2[i]<0 || parcial2[i]>20);
            do{
            System.out.print("Ingrese nota parcial 3: ");
            parcial3[i]=Integer.parseInt(br.readLine());}while(parcial3[i]<0 || parcial3[i]>20);
             
            
        }
        
        System.out.print("\nIngrese el nombre a buscar ");
        String name = br.readLine();
        
        for (int i = 0; i<n;i++) {
            if(name.equals(nombre[i])){
                System.out.println("Nombre "+nombre[i]+" \np1: "+parcial1[i]+" \np2: "+parcial2[i]+ " \np3: "+parcial3[i]);
            }
        }
        
        
    }    
}
