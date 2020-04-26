/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Arreglos4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        int [] primero;
        int [] segundo;
        int cantidad;
        int contador=0;
        
        System.out.print("Ingrese la cantidad de numeros a ingresar: ");
        cantidad=Integer.parseInt(br.readLine());
        
        primero = new int [cantidad];
        segundo = new int [cantidad];
        
        for(int i=0;i<primero.length;i++){
            do{
                System.out.print("Ingrese el "+(i+1)+"° numero para el primer arreglo: ");
                primero[i]=Integer.parseInt(br.readLine());
            }while(primero[i]<=0);            
        }
        
        for(int i=0;i<segundo.length;i++){
            do{
                System.out.print("Ingrese el "+(i+1)+"° numero para el segundo arreglo: ");
                segundo[i]=Integer.parseInt(br.readLine());
            }while(segundo[i]<=0);
        }
        
        System.out.println("Los datos del primer arreglo son");
        for(int i=0;i<primero.length;i++){
            System.out.print(primero[i]+"\t");
        }
        System.out.print("\n");
        System.out.println("Los datos del segundo arreglo son");
        for(int i=0;i<segundo.length;i++){
            System.out.print(segundo[i]+"\t");
        }
        System.out.print("\n");
        
        for(int i=0;i<segundo.length;i++){
            if(primero[i]==segundo[i]){
                contador++;
            }
        }
        
        if(contador==segundo.length){
            System.out.println("Los arreglos son iguales");
        }else {
            System.out.println("Los arreglos no son iguales");
        }
        
    }    
}