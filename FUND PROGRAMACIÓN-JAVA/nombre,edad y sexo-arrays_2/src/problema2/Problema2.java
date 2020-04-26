package problema2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Problema2 {
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {
        int n;
        
        System.out.println("Ingresa numero");
        n = Integer.parseInt(br.readLine());
        
        String [] nombres = new String [n];
        int [] edades = new int [n];
        int [] nota = new int [n];
        
        for(int i = 0; i<n;i++){
        System.out.println("Ingrese el "+(i+1)+"° nombre");
        nombres[i]=br.readLine();
        System.out.println("Ingrese la "+(i+1)+"° edad");
        edades[i]=Integer.parseInt(br.readLine());
        System.out.println("Ingrese la "+(i+1)+"° nota");
        nota[i]=Integer.parseInt(br.readLine());
        }
        
        for (int i = 0; i<n; i++) {
            System.out.println(nombres[i]+" "+edades[i]+" "+nota[i]);
        }
        
    }    
}
