/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Trabajo6 {
    static BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {
       char [] datos = new char [20];         
       
       System.out.println("Empieza el proceso de calificación");            
       
       datos = calificaciones();
       
       proceso(datos);      
    }    
    
    static public char[] calificaciones() throws IOException {
    
        char [] datos = new char [20];  
        
        for(int i = 0; i<20; i++) {
           System.out.println("Empieza a calificar persona "+(i+1));
           datos[i] = br.readLine().toLowerCase().charAt(0);
        }
        
        return datos;
    }
    
    static public void proceso(char [] datos) {
        int contadorE = 0;
        int contadorB = 0;
        int contadorR = 0;
        int contadorM = 0;
        int contadorP = 0;
        for(int i = 0; i<20; i++) {
           if(datos[i] == 'e') {
               contadorE = contadorE + 1;
           }else if(datos[i] == 'b') {
               contadorB = contadorB + 1;
           }else if(datos[i] == 'r') {
               contadorR = contadorR + 1;
           }else if(datos[i] == 'm') {
               contadorM = contadorM + 1;
           }else {
               contadorP = contadorP + 1; 
           }
       }
       
       System.out.println("E: "+contadorE+"\tE: "+cantidadAsteriscos(contadorE));
       System.out.println("B: "+contadorB+"\tB: "+cantidadAsteriscos(contadorB));
       System.out.println("R: "+contadorR+"\tR: "+cantidadAsteriscos(contadorR));
       System.out.println("M: "+contadorM+"\tM: "+cantidadAsteriscos(contadorM));
       System.out.println("P: "+contadorP+"\tP: "+cantidadAsteriscos(contadorP));
    
    }    
    
    static public String cantidadAsteriscos(int cantidad) {
        
        String cadena = "";
        
        for(int i=0; i<cantidad; i++ ) {
            cadena = cadena + "*";
        }
        return cadena;
    }
}
