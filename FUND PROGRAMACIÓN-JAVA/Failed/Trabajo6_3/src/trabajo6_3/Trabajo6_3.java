/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo6_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Trabajo6_3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {
       
        int cantidad;
        
        cantidad = leerCantidad();
        
        String [] cadena1 = leerCadena(cantidad,1);
        String [] cadena2 = leerCadena(cantidad,2);
               
        procesar(cadena1,cadena2,cantidad);
    }    

    static private String[] leerCadena(int cantidad, int n) throws IOException {
        
        String [] cadena = new String[cantidad];
        
        for(int i=0; i<cantidad; i++) {
            System.out.println("Ingrese la "+(i+1)+"° cadena del arreglo "+n+":");
            cadena[i] = br.readLine();
        }      
        
        return cadena;
    }

    private static int leerCantidad() throws IOException {
        
        int cantidad;
        
        System.out.println("Ingrese la cantidad");
        cantidad = Integer.parseInt(br.readLine());
        
        return cantidad;
    }

    private static void procesar(String[] cadena1, String[] cadena2, int cantidad) {
        
        String [] cadena3 = new String[cantidad];
        
        for(int i=0; i<cantidad; i++){
            cadena3[i] = mezclar(cadena1[i],cadena2[i]);
        }
        
        for(int i=0; i<cantidad; i++){
            System.out.println(cadena3[i]);
        }
    }

    private static String mezclar(String cadena1, String cadena2) {
        
        int tope;
        int cantidadMayor;
        String cadenaMayor = "";
        
        String cadena = "";
        
        if(cadena1.length()>cadena2.length()) {
            tope = cadena2.length();
            cadenaMayor = cadena1;
            cantidadMayor = cadena1.length();
        }else if(cadena2.length()>cadena1.length()) {
            tope = cadena1.length();
            cadenaMayor = cadena2;
            cantidadMayor = cadena2.length();
        }else {
            tope = cadena1.length();
            cantidadMayor = cadena2.length();
        }
        
        for(int i=0; i<tope; i++){            
            cadena = cadena + comprobarChar(cadena1.charAt(i))+ comprobarChar(cadena2.charAt(i));               
        }
        
        int diferencia = cantidadMayor - tope;
        
        if(diferencia>0) {            
            for(int i=0; i<diferencia;i++) {
                cadena = cadena + comprobarChar(cadenaMayor.charAt(i+tope));
            }
        }
        
        return cadena;
    }
    
    static private char comprobarChar(char caracter) {        
        
        char resp = caracter;
        
        if(caracter==' ') {
            resp = '\u0000';
        }
        
        return resp;
    }
}
