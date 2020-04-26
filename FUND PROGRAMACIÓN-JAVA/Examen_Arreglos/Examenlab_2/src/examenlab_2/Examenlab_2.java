/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenlab_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Examenlab_2 {
    static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {        
        
       int cantidad = leerCantidad();
       
       int [][] arreglo1 = leerArreglo(cantidad);
       int [][] arreglo2 = leerArreglo(cantidad);
       
       reportarArreglos(arreglo1,arreglo2,cantidad);
       
       calcularSuma(arreglo1,arreglo2,cantidad);
       
       calcularProducto(arreglo1,arreglo2,cantidad);
       
       calcularTranspuesta(arreglo1,arreglo2,cantidad);
    }    

    private static int leerCantidad() throws IOException {
        
        int cantidad;
        System.out.println("Ingrese cantidad n/m (filas y columnas)");
        cantidad = Integer.parseInt(br.readLine());
        
        return cantidad;
    }
    
    private static int[][] leerArreglo(int cantidad) throws IOException {
        
        int [][] arreglo = new int[cantidad][cantidad];
        
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {
                System.out.println("Ingrese Columna "+(i+1)+" Fila: "+(j+1)+" al arreglo: ");
                arreglo[i][j] = Integer.parseInt(br.readLine());
            }
        }
        
        return arreglo;        
    }

    private static void calcularSuma(int[][] arreglo1, int[][] arreglo2, int cantidad) {
        
        System.out.println("ARREGLO SUMA:");
        
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {
                System.out.print("\t"+(arreglo1[i][j]+arreglo2[i][j]));
                if(j == cantidad-1) {
                    System.out.print("\n");
                }
            }
        }
    }

    private static void calcularProducto(int[][] arreglo1, int[][] arreglo2, int cantidad) {
        
        System.out.println("ARREGLO PRODUCTO:");
        
        int [][] multiplicacion = new int [cantidad][cantidad];
               
        for (int x=0; x<cantidad; x++) {
            for (int y=0; y<cantidad; y++) {
                for (int z=0; z<cantidad; z++) {
                    multiplicacion [x][y] = multiplicacion [x][y] + (arreglo1[x][z]*arreglo2[z][y]); 
                }
            }
        }
            
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {
                System.out.print("\t"+multiplicacion[i][j]);
                if(j == cantidad-1) {
                    System.out.print("\n");
                }
            }
        }       
    }   

    private static void reportarArreglos(int[][] arreglo1, int[][] arreglo2, int cantidad) {
        
        System.out.println("ARREGLO M1:");
        
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {
                System.out.print("\t"+arreglo1[i][j]);
                if(j == cantidad-1) {
                    System.out.print("\n");
                }
            }
        }
        
        System.out.println("ARREGLO M2:");
        
        for(int i=0; i<cantidad; i++) {
            for(int j=0; j<cantidad; j++) {
                System.out.print("\t"+arreglo2[i][j]);
                if(j == cantidad-1) {
                    System.out.print("\n");
                }
            }
        }
    }

    private static void calcularTranspuesta(int[][] arreglo1, int[][] arreglo2, int cantidad) {
        
        System.out.println("MATRIZ TRANSPUESTA DE M1:");
        
        int [][] transpuesta1 = new int[cantidad][cantidad];
        
        
            for (int x=0; x < cantidad; x++) {
                for (int y=0; y < cantidad; y++) {
                  transpuesta1[y][x] = arreglo1[x][y];
                }
            }
            
            for(int i=0; i<cantidad; i++) {
                for(int j=0; j<cantidad; j++) {
                    System.out.print("\t"+transpuesta1[i][j]);
                    if(j == cantidad-1) {
                        System.out.print("\n");
                    }
                }
            }
       
        System.out.println("MATRIZ TRANSPUESTA DE M2:");
        
        int [][] transpuesta2 = new int[cantidad][cantidad];
        
        
            for (int x=0; x < cantidad; x++) {
                for (int y=0; y < cantidad; y++) {
                  transpuesta2[y][x] = arreglo2[x][y];
                }
            }
            
            for(int i=0; i<cantidad; i++) {
                for(int j=0; j<cantidad; j++) {
                    System.out.print("\t"+transpuesta2[i][j]);
                    if(j == cantidad-1) {
                        System.out.print("\n");
                    }
                }
            }
            
    }    
}
