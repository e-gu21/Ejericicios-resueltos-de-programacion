/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Arreglo6 {
    static BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {      
        int n=4;
        int [] numeros = new int [100];
        int [] cuadrados = new int [100];
        int i=0;
               

        do{
            System.out.println("Ingrese numero: ");
            numeros[i] = Integer.parseInt(br.readLine());            
            i=i+1;  
        }while(numeros[i-1]!=0);                       
     
        i=i-1;           
        
        for (int y = 0; y < i; y++){
            System.out.println(numeros[y]);
        }
        
        System.out.println("La cantidad de datos del arreglo es :"+i);
        
        System.out.println("Los numeros positivos son:");        
        
        for (int z = 0;z < i; z++){
            if(numeros [z] > 0){
               System.out.println("\t"+numeros[z]);
            }
        }
        
        System.out.println("Los numeros negativos son:");        
        
        for (int z = 0;z < i; z++){
            if(numeros [z] < 0){
               System.out.println("\t"+numeros[z]);
            }
        }
        
        for (int z = 0; z < i; z++){
            cuadrados[z] = numeros[z]*numeros[z];
        }  
        
        System.out.println("Los arreglos son:");
        System.out.println("\tA"+"\tB");
        
        for (int z = 0; z < i; z++){
            System.out.println("\t"+numeros[z]+"\t"+cuadrados[z]);
        }
        
      
}

}
