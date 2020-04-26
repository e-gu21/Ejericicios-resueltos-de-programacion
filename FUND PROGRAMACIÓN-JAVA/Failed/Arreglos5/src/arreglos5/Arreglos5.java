/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Arreglos5 {

    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int n;
        int [] datos = new int [5];
        int i = 0;
        double promedio=0;
        int suma = 0;
        char resp='s';
        String respuesta;
        double r;
        
        
        do{
            
            System.out.print("Ingresa numeros al arreglo: ");
            datos [i] = Integer.parseInt(br.readLine());
            i++;     
            
            System.out.println("Deseas continuar agregando datos? ");
            respuesta = br.readLine();
            respuesta = respuesta.toLowerCase();
            resp = respuesta.charAt(0);
            
            if (i == datos.length-3) {
                resp = 'n';
            }
            
          
        }while (resp=='s');
            
       
        
        System.out.println("Los datos del arreglo son:");
        for (int x = 0; x<i; x++) {
            
            System.out.print("\t"+datos[x]);
        }
        
        for (int y = 0; y < i; y++ ) {
            suma = suma + datos[y];
        }
        promedio = (double) suma/i;
        System.out.print("\n");
        
        System.out.println("Las diferencias con respecto al promedio son:");
        
        for (int z = 0; z<i; z++) {
            r = (double)datos[z]-promedio;
            System.out.print("\t"+r);
        }
        
        System.out.print("\n");
        
        
        System.out.print("");
        
        
       
    }    
}
