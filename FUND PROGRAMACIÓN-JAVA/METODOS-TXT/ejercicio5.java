//5.- 
import java.io.*;
public class ejercicio5
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args)throws IOException
  {int N,f, res;
  	do{
    N=LeerN();
    f=factorial(N);
    reportar (N,f);
    res=continuar();
  	} while(res=='S');
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
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 	
  static char continuar() throws IOException
  {char re;
   do{
   	System.out.print( "¿Desea continuar?");
   	System.out.print ("S para sí, N para no: ");
    re=br.readLine().toUpperCase().charAt(0);	
   }while(re!='S'&&re!='N');
    return re;
  }
}  