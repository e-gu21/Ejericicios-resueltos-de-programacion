
package ejericio2;
//Escribir un programa utilizando arreglos que permita ingresar la edad de N alumnos y luego:
//a) Reportar los datos..........................................................................................h
//b) Reportar los datos de los mayores de edad. Indicar su suma.....................h
//c) Reportar los datos de los menores de edad. Indicar su suma.....................h
//d) Reportar la edad promedio............................................................................h
//e) Reportar las edades mayores a la edad promedio. Indicar susuma............h
//f) Reportar la edad menor..................................................................................h 
import java.io.*;
public class Ejericio2
{static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
{ int ed[]=new int[100];
    int N,i,Smy=0,Smn=0, s=0, ep=0,Sep=0, Em=0, men;	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    	
       do{System.out.println( "Ingrese la cantidad de datos: ");
             N=Integer.parseInt(br.readLine());      
             }while (N<=0||N>100);	
      for (i=0;i<N;i++){
    	do{System.out.println("Ingrese edades ["+i+"]: ");
    	      ed[i]=Integer.parseInt(br.readLine());
    	    }while(ed[i]<0||ed[i]>100);}	    	
      for (i=0;i<N;i++){
    	System.out.println("las edades son: "+ed[i]);}		
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    		
      for (i=0;i<N;i++){
    	if(ed[i]>=18){System.out.println("las edades moyeres son: "+ed[i]);	
    	Smy=Smy+ed[i];	}   
        }System.out.println("La suma de las edades mayores de edad es: "+Smy);	
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    	   
      for (i=0;i<N;i++){
      	if(ed[i]<18){System.out.println("las edades menores son: "+ed[i]);	
      	Smn=Smn+ed[i];	}   
        }System.out.println("La suma de las edades menores de edad es: "+Smn);
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      	
      for(i=0;i<N;i++){
      	s=s+ed[i];
        }
        ep=s/N;
        System.out.println("La edad promedio es: "+ep);  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
      for(i=0;i<N;i++){
      	if(ed[i]>ep){System.out.println("las edades mayores al promedio son: "+ed[i]);
      	Sep=Sep+ed[i];
      	}	  	
      }System.out.println("La suma de las edades mayores a la edad promedio es: "+Sep);  
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      	
    	men=ed[0];
    	for(i=0;i<N;i++){
    	  if(ed[i]<men){men=ed[i];
    	  }
    	  System.out.println("La edad menor es: "+men);  	}		
}}