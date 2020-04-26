/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.io.IOException;

/**
 *
 * @author LENOVO
 */
public class Practica2 {
    public static void main(String[] args) throws IOException {
         
        int [] datos = {1,1,3,4,55,55};
        
        int [] c = new int [datos.length];
        
        c = MetodosArreglos.arregloDeNoRepetidos(datos);
         
         for (int i = 0; i<datos.length;i++) {
             System.out.println(c[i]);
         }
    }    
}
