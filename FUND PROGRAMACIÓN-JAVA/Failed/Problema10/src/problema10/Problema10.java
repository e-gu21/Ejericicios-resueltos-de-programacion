/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Problema10 {
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
     
        int n;
        int numero;
        int contador;
        int c=0;
     
        System.out.println("Ingrese numero");
        n = Integer.parseInt(br.readLine());
        
        int [] A = new int [n];
        int [] B = new int [n];
        int [] C = new int [n];
        
       
        
        for(int i = 0;i<n;i++ ){       
        System.out.println("Ingrese el dato");
        A [i] = Integer.parseInt(br.readLine());        
        }    
        
         
        for(int i = 0;i<n;i++) {
            B[i]=A[i];
            
        }
        
        for (int i = 0;i<n;i++) {
            numero=A[i];    
            if (numero<999) {
                contador =0;
                for(int j=0;j<n;j++) {
                    if(numero==A[j]){
                        contador++;
                        if(contador>1){
                            A[j]=999;
                        }
                    }
                }
            }
        }
        
        for (int i=0;i<n;i++) {
            if(A[i]<999){
                C[c]=A[i];
                c++;
            }
        }
           
        
        for(int i=0;i<n;i++){
             
              System.out.println("B "+B[i]);
        }
        
        for(int i=0;i<n;i++){
            
              System.out.println("C "+C[i]);
        }
        

    }}