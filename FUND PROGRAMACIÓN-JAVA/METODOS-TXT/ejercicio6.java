//6.- 
import java.io.*;
public class ejercicio6
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args)throws IOException
  {int N=0,opc,f,s;
  	do{
  	  opc=menu();
  	  if(opc==1){N=LeerN();
  	  }
  	  if(opc==2){
  		f=factorial(N);
  		reportar(N,f);
  	  }
  	  if(opc==3){
  		s=suma(N);
  		reporta(N,s);
  	  }
      if(opc==4){
  		terminar();
  	  }	
  	}while(opc!=4);
  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 static int LeerN()throws IOException
  {int N;
    do{System.out.print ("ingrese N: ");
        N=Integer.parseInt(br.readLine());
       }
       while (N<=0);
       return N;
  }	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static int factorial(int N)	 throws IOException
 {int c, fac=1;
  for (c=1; c<=N; c++)
  	{fac=fac*c;
    }
   return fac; 
 }  
//////////////////////////////////////////////////////////////////////////
static void reportar (int N, int f) throws IOException
 {System.out.print( "El factorial de " +N+" es: "+f );
 return;
 }	 		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 	
static int suma(int N)	 throws IOException
  {int res, sd=0;
   while(N>0){
   	 res=N%10;
   	 sd=sd+res;
   	 N=N/10;
   }
   return sd;
  }
/////////////////////////////////////////////////////////////////////////
static void reporta (int N, int s) throws IOException
 {System.out.print( "La suma de los dígitos de " +N+" es: "+s );
 return;
 }	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 static void terminar () throws IOException	
 {System.out.print( "Fin del programa" );
 return;}
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 static int menu () throws IOException	
 {int op;
 	do{
 	  System.out.print( "MENU" );
 	  System.out.print( "1.- Leer N" );
 	  System.out.print( "2.-Factorial" );
 	  System.out.print( "3.-Suma de dígitos" );
 	  System.out.print( "4.-Terminar" );
 	  System.out.print( "Ingrese opción" );
 	  op=Integer.parseInt(br.readLine());
 	}while(op<1||op>4);
 	return op;
 }
} 	