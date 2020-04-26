/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4;
//Escribir un programa que permita leer 2 arreglos de N números enteros positivos Ay B. 
//Reportar ambos arreglos y determinar si son iguales o diferentes.
//Los 2 arreglos serán iguales si ambos tienen los mismos elementos en las misma opciones. 
//Caso contrario son diferentes.
import java.io.*;
public class Ejercicio4
{static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
{int A[]=new int[100];
  int B[]=new int[100];
  int N,i;
  do{System.out.println( "Ingrese la cantidad de números: ");
        N=Integer.parseInt(br.readLine());     
        }while (N<=0||N>3);	
  for (i=0;i<N;i++){
     do{System.out.println("Ingrese A ["+i+"]: ");
    	   A[i]=Integer.parseInt(br.readLine());
    	   }while(A[i]<0||A[i]>100);}	  
   for (i=0;i<N;i++){
     do{System.out.println("Ingrese B ["+i+"]: ");
    	   B[i]=Integer.parseInt(br.readLine());
    	   }while(B[i]<0||B[i]>100);}	  	   	
 for (i=0;i<N;i++){
 	if(A[i]==B[i]){
            System.out.println("A\tB");
            System.out.println(A[i]+"\t"+B[i]+ " son iguales ");
 	}
 	else {
            System.out.println("A\tB");
            System.out.println(A[i]+"\t"+B[i]+" Son diferentes ");
 	}
 }	   	  	
    	   	  	
}}