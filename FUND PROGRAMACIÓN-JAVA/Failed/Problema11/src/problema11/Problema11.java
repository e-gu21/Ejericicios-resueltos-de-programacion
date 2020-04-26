/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Problema11 {
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
       
        int n;
        int numero;
        int contador;
        int c=0;
        int f=0;
        int cont999=0;
        System.out.println("Ingrese numero");
        n = Integer.parseInt(br.readLine());
        
        int [] A = new int [n];
        int [] B = new int [n]; 
        
       
        
        for(int i = 0;i<n;i++ ){       
        System.out.println("Ingrese el dato A");
        A [i] = Integer.parseInt(br.readLine());        
        }    
        
        for(int i = 0;i<n;i++ ){       
        System.out.println("Ingrese el dato B");
        B [i] = Integer.parseInt(br.readLine());        
        }         
            
        
        for (int i = 0;i<n;i++) {
            numero=A[i];   
            contador = 0;
            
            for(int j=0;j<n;j++) {
                    if(numero==B[j]){
                        if(contador == 0){
                            B[j] = 999;
                        }
                    }
            }
            
        }
        
                
        for (int i = 0; i<n;i++) {
            if(B[i]==999){
                cont999++;
            }
        }
        
        if (cont999==n) {
            System.out.println("iguales");
        }else {
            System.out.println("diferentes");
        }
        
    }
    
}
