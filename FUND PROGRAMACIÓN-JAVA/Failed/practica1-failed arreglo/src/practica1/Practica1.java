/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;
import java.io.*;
public class Practica1
{static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
{int         A[]=new int [100];
  int         B[]=new int [100];
  int         C[]=new int [100];
  int N, p=1,i;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       do{System.out.print( "Ingrese la cantidad de datos: ");
         N=Integer.parseInt(br.readLine());      
         }while (N<=0||N>100);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
   System.out.println("\nIngreso de datos del arreglo A");
  for(i=0;i<N;i++){
      	do{System.out.print("Ingrese A ["+i+"]: ");
    	A[i]=Integer.parseInt(br.readLine());}while(A[i]<=0);  	
  }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
System.out.println("\nReporte de los datos del arreglo A");
System.out.println("A");
for(i=0;i<N;i++){
     System.out.print(A[i]); }  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
 System.out.println("\nReporte de los datos del arreglo B");
 System.out.println("A\tB");
for(i=0;i<N;i++){
     B[i]=A[i]*A[i];}  
for(i=0;i<N;i++){System.out.println(A[i]+"\t"+B[i]);}        
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      	
 System.out.println("\nReporte de los datos del arreglo C");
 System.out.println("A\tC");   
 for(i=0;i<N;i++){System.out.println(A[i]+"\t"+C[i]);} 	 	
 for(i=0;i<N;i++){System.out.println(A[i]+"\t"+C[i]);
     C[i]=A[N-1-i];}  	
 for(i=0;i<N;i++){
     System.out.println("Los valores de A: "+A[i]); } 
for(i=0;i<N;i++){
     System.out.println("Los valores de B: "+C[i]); }	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 System.out.println("\nReporte producto de los datos del arreglo A");    	
    for(i=0;i<N;i++){
     p=p*A[i];}   	
     		      	  
}}