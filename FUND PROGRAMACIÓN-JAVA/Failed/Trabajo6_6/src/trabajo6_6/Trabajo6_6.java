/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajo6_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Trabajo6_6 {
    static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {
        
        int cantidad = leerCantidad();
       
        int [][] arreglo = leerArreglo(cantidad);        
       
        calcular(arreglo,cantidad);
        
    }    
    
    private static int leerCantidad() throws IOException {
        
        int cantidad;
        System.out.println("Ingrese n/m");
        cantidad = Integer.parseInt(br.readLine());
        
        return cantidad;
    }
    
    private static int[][] leerArreglo(int cantidad) throws IOException {
        
        int [][] arreglo = new int[cantidad][cantidad];
        
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {                
                System.out.println("Ingrese dato "+(i+1)+""+(j+1)+" al arreglo");
                arreglo[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        return arreglo;        
    }
    
    private static void reportarArreglo(int[][] arreglo,int cantidad, int[] columna, int[] fila) throws IOException {

        System.out.println("REPORTANDO ARREGLO:");       
        
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {                  
                System.out.print("\t"+arreglo[i][j]); 
                if(j==cantidad-1){
                    System.out.print("\t\t"+columna[i]);
                    System.out.print("\n");
                    
                }
            }
        }
        
        System.out.print("\n\n");
        for(int i=0; i<cantidad; i++) {
            System.out.print("\t"+fila[i]);
        }
        System.out.print("\n");
    }

    private static void calcular(int[][] arreglo, int cantidad) throws IOException {
        int [] columna = new int [cantidad];
        int [] fila = new int [cantidad];
        int contador=0;
        
        for(int i=0; i<cantidad; i++) {
            
            int suma = 0;
            
            for(int j=0; j<cantidad; j++) {                  
                suma = suma + arreglo[i][j];
            }
            
            columna[contador] = suma ;  
            contador++;
        }
       
        contador=0;
        for(int i=0; i<cantidad; i++) {
            
            int suma = 0;
            
            for(int j=0; j<cantidad; j++) {                  
                suma = suma + arreglo[j][i];
            }
            
            fila[contador] = suma ;  
            contador++;
        }
        
        reportarArreglo(arreglo,cantidad,columna,fila);        
    }
}
