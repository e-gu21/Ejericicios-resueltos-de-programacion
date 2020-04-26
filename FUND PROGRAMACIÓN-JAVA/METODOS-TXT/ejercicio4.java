//4.- 
import java.io.*;
public class ejercicio4
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args)throws IOException
  {int N,x,f,c;
    x=LeerN();
    for(c=1; c<=x; c++){
  	  N=LeerN();
  	  f=factorial(N);
    	reportar(N,f);
    }	
  }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static int LeerN() throws IOException 
  {int N;
      System.out.print ("ingrese N: ");
        N=Integer.parseInt(br.readLine());
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
 {System.out.println( "El factorial de " +N+" es: "+f );
 return;
 }		
}