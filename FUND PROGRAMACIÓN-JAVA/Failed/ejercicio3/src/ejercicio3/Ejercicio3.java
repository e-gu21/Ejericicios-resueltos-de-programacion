
package ejercicio3;
//Escribir un programa utlizando arreglos que permita ingresar edad y nota de N alumnos, luego:
//a) Reportar todos los datos...................................................................................................................h
//b) Reportar los datos de los mayores de edad. Indicar cantidad y suma de sus notas......................h
//c) Reportar los datos de los aprobados. Indicar cuantos son y suma de sus edades.........................h
//d) Reportar los datos de los parobados mayores de edad...................................................................h
//e) Reportar los datos de los aprobados menores de edad...................................................................h
//f) Reportar los datos de los desaprobados menores de edad..............................................................h
//g) Reportar los datos de los desaprobados mayores de edad..............................................................h
import java.io.*;
public class Ejercicio3
{static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
{ int ed[]=new int[100];
   int not[]=new int [100];
   int N,E,i,c,Cmy=0,Sn=0,Cna=0,Se=0;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    

  do{System.out.println( "Ingrese la cantidad de edades: ");
        E=Integer.parseInt(br.readLine());      
        }while (E<=0||E>100);	
  for (i=0;i<E;i++){
     do{System.out.println("Ingrese edades ["+i+"]: ");
    	   ed[i]=Integer.parseInt(br.readLine());
    	   }while(ed[i]<0||ed[i]>100);}	    	
  for (i=0;i<E;i++){
    	System.out.println("las edades son: "+ed[i]);}	
    		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

  do{System.out.println( "Ingrese la cantidad de notas: ");
        N=Integer.parseInt(br.readLine());      
        }while (N<=0||N>100);
  for (c=0;c<N;c++){
     do{System.out.println("Ingrese notas ["+c+"]: ");
    	   not[c]=Integer.parseInt(br.readLine());
    	   }while(not[c]<0||not[c]>20);}	    	
  for (c=0;c<N;c++){
    	System.out.println("las edades son: "+not[c]);}      
    		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  for (i=0;i<E;i++){
  	if(ed[i]>=18){ System.out.println("las edades moyeres son: "+ed[i]);	
    	Cmy=Cmy+1;	
    	Sn=Sn+not[c];	}   
        }System.out.println("La cantidad de las edades mayores de edad es: "+Cmy+ " y la suma de sus notas es: "+Sn);	
  	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
  
  for (c=0;c<N;c++){
  	if(not[c]>=11){ System.out.println("las notas aprobadas son: "+not[c]);	
    	Cna=Cna+1;	
    	Se=Se+ed[i];	}   
        }System.out.println("La cantidad de notas aprobadas es: "+Cna +"y la suma de las edades es: "+Se);	

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  for (c=0;c<N;c++){
  	if(not[c]>=11&&ed[c]>=18){System.out.println("las notas aprobadas y la edad de los mayores son (respectivamente): "+not[c]+" y "+ed[c] );	
  	}}
   
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

  for (c=0;c<N;c++){
  	if(not[c]>=11&&ed[c]<18){System.out.println("las notas aprobadas y la edad de los menores son (respectivamente): " +not[c]+" y "+ed[c]);	
  	}}
  	
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

for (c=0;c<N;c++){
  	if(not[c]<11&&ed[c]<18){System.out.println("las notas desaprobadas y la edad de los menores son (respectivamente): " +not[c]+" y "+ed[c]);	
  	}}
  	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  

for (c=0;c<N;c++){
  	if(not[c]<11&&ed[c]>=18){System.out.println("las notas dcsaprobadas y la edad de los mayores son (respectivamente): " +not[c]+" y "+ed[c]);	
  	}}

		  
}}