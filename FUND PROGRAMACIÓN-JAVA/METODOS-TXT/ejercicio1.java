//1.- Leer el factorial de un número N entero positivo, calcular el factorial y reportar N y el factorial.
import java.io.*;
public class ejercicio1
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args)throws IOException
  {int N,f;
    N=LeerN();
    f=factorial(N);
    reportar (N,f);
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void reportar (int N, int f) throws IOException
 {System.out.print( "El factorial de " +N+" es: "+f );
 return;
 }	
}