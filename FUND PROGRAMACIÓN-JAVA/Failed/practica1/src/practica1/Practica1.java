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
{ String nom[]=new String [100]; 
   int         ed[]=new int [100];
   double not[]= new double [100];
   char     sex[]= new char[100];
   int N,cm=0,Seh=0,ca=0,ch=0,cd=0,cam=0,Sed=0,i,cmd=0;
   double Snm=0,Sna=0;
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     do{System.out.println( "Ingrese la cantidad de datos: ");
         N=Integer.parseInt(br.readLine());      
         }while (N<=0||N>100);	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
     for(i=0;i<N;i++){
     	      System.out.print("Ingrese nombre ["+i+"]: ");
    	      nom[i]=br.readLine().toUpperCase();
    	      
    	  do{System.out.print("Ingrese edad ["+i+"]: ");
    	       ed[i]=Integer.parseInt(br.readLine());}while(ed[i]<=0);  
    	  
    	  do{System.out.print("Ingrese nota ["+i+"]: ");
    	       not[i]=Double.parseDouble(br.readLine());}while(not[i]<0||not[i]>20) ;     	
    	       	
    	  do{System.out.print("Ingrese sexo ["+i+"]: M. mujer || H: hombre");
    	       sex[i]=br.readLine().toUpperCase().charAt(0);} while (sex[i]!='M' && sex[i]!='H');    	
     }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
System.out.println("\nReporte de los datos");
System.out.println("Nombre\t    Sexo\tEdad\tNota");
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    for(i=0;i<N;i++){
    	  System.out.println(nom[i]+"\t\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
    }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
  System.out.println("Nombre\t    Sexo\tEdad\tNota");
  for(i=0;i<N;i++){
  	if(sex[i]=='M'){
  		System.out.println(nom[i]+"\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
  		cm=cm+1;
  		Snm=Snm+not[i];}
  }
  System.out.println("la cantidad de mujeres: "+cm ); 
  System.out.println("la sumatoria de sus notas: "+Snm);	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
System.out.println("\nNombre\t    Sexo\tEdad\tNota");
for(i=0;i<N;i++){
	if(sex[i]=='H'){
		System.out.println(nom[i]+"\t\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
		ch=ch+1;
		Seh=Seh+ed[i];}
   }
   System.out.println("la cantidad de hombres: "+ch); 
   System.out.println("la sumatoria de sus edades es: "+Seh);	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
System.out.println("\nNombre\t    Sexo\tEdad\tNota");
for(i=0;i<N;i++){
	if(not[i]>10){
	System.out.println(nom[i]+"\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
	ca=ca+1;
	Sna=Sna+not[i];	}
}
System.out.println("Cantidad de aprobados: "+ca);
System.out.println("Suma de las notas aprobadas: "+Sna);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
System.out.println("\nNombre\t    Sexo\tEdad\tNota");
for(i=0;i<N;i++){
	if(not[i]<11){
	System.out.println(nom[i]+"\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
	cd=cd+1;
	Sed=Sed+ed[i];}	
}
System.out.println("Cantidad de desaprobados: "+cd);
System.out.println("Suma de edades de los desaprobados: "+Sed);	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
System.out.println("\nNombre\t    Sexo\tEdad\tNota");
for(i=0;i<N;i++){
	if(not[i]>10&&ed[i]>17){
		System.out.println(nom[i]+"\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
		cam=cam+1;
	}
}
System.out.println ("Cantidad de aprobados mayores de edad: "+cam);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
System.out.println("\nNombre\t    Sexo\tEdad\tNota");
for(i=0;i<N;i++){
  if(sex[i]=='M'&&not[i]<11&&ed[i]<18){
  	System.out.println(nom[i]+"\t"+sex[i]+"\t"+ed[i]+"\t"+not[i]);
  	cmd=cmd+1;
  }
} 
System.out.println ("Cantidad de mujeres menores de edad desaprobadas: "+cam); 
}}