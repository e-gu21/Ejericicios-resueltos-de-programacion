//2.- Leer un #N entero positivo. Calcular la suma de sus dígitos y reportar N y sus dígitos.
import java.io.*;
public class ejercicio2
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args)throws IOException
  {int N,s;
    N=LeerN();
    s=suma(N);
    reportar (N,s);
  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
static int LeerN() throws IOException 
  {int N;
      do{System.out.print ("ingrese N: ");
        N=Integer.parseInt(br.readLine());
       }
       while (N<=0);
       return N;
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
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void reportar (int N, int s) throws IOException
 {System.out.print( "La suma de los dígitos de " +N+" es: "+s );
 return;
 }	
}