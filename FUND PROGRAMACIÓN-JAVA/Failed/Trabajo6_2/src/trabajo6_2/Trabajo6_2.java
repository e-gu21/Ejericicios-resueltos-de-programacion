/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo6_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Trabajo6_2 {   
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int cantidad = ingreseCantidad();
       
        int [] arreglo1 = new int[cantidad];
        int [] arreglo2 = new int[cantidad];
        
        arreglo1 = declararArreglo(cantidad);
        arreglo2 = declararArreglo(cantidad);
       
        verificar(arreglo1,arreglo2,cantidad);        
    }   
    
    static public int ingreseCantidad() throws IOException {
        
        int cantidad;
        
        System.out.println("Ingrese la cantidad de datos");
        cantidad = Integer.parseInt(br.readLine());
        
        return cantidad;
    }
    
    static public int [] declararArreglo(int cantidad) throws IOException {
        
        int [] arreglo = new int[cantidad];
        
        for(int i=0; i<cantidad; i++) {
            System.out.println("Ingrese el "+(i+1)+"° dato");
            arreglo[i] = Integer.parseInt(br.readLine());
        }
        
        return arreglo;
    }

    private static void verificar(int[] arreglo1, int[] arreglo2, int cantidad) {
        
        int numero = 0;
        int contador = 0;
        int cont999 = 0;
        
        for (int i = 0;i<cantidad;i++) {
            numero=arreglo1[i];   
            contador = 0;
            
            for(int j=0;j<cantidad;j++) {
                    if(numero==arreglo2[j]){
                        if(contador == 0){
                            arreglo2[j] = 999;
                        }
                    }
            }            
        }        
                
        for (int i = 0; i<cantidad;i++) {
            if(arreglo2[i]==999){
                cont999++;
            }
        }
        
        if (cont999==cantidad) {
            System.out.println("iguales");
        }else {
            System.out.println("diferentes");
        }
    }
}
