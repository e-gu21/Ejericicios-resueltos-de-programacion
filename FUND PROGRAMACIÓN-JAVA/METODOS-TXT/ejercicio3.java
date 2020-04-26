//3.- 
import java.io.*;
public class ejercicio3
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args)throws IOException
  {int N,s,f;
    N=LeerN();
    if (N%2==0){
	f=factorial(N);
    reportar1 (N,f);
    }
    else{
       s=suma(N);
       reportar2 (N,s);
       }
  }
  static int LeerN() throws IOException 
  {int N;
      do{System.out.print ("ingrese N: ");
        N=Integer.parseInt(br.readLine());
       }
       while (N<=0);
       return N;
  }

 ///////////////////////////////////////////////////
	static int factorial(int N)	 throws IOException
  {int c, fac=1;
    for (c=1; c<=N; c++)
  	{fac=fac*c;
    }
   return fac; 
  }
  ///////////////////////////////////////////////////
  static void reportar1 (int N, int f) throws IOException
 {System.out.print( "El factorial de " +N+" es: "+f );
  return;
 }	

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    ///////////////////////////////////////////////////
static int suma(int N)	 throws IOException
   {int res, sd=0;
   while(N>0){
   	 res=N%10;
   	 sd=sd+res;
   	 N=N/10;
    }
    return sd;
   }
///////////////////////////////////////////////////
static void reportar2 (int N, int s) throws IOException
 {System.out.print( "La suma de los dígitos de " +N+" es: "+s );
 return;
 }	
}