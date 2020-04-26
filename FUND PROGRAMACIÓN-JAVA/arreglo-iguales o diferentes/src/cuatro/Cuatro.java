
package cuatro;
import java.io.*;
public class Cuatro
{static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
public static void main (String[]args)throws IOException
{int         A[]=new int [100];
  int        B[]=new int [100];
  int N,i,a=0;

         do{System.out.println( "Ingrese la cantidad de datos: ");
         N=Integer.parseInt(br.readLine());      
         }while (N<=0||N>100);
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
  System.out.println("\nValores del arreglo A"); 
  for(i=0;i<N;i++){
      	do{System.out.print("Ingrese A ["+i+"]: ");
    	A[i]=Integer.parseInt(br.readLine());}while(A[i]<=0);  }
  
  System.out.println("\nValores del arreglo B");     	
    for(i=0;i<N;i++){  			
    	 do{System.out.print("Ingrese B ["+i+"]: ");
 	     B[i]=Integer.parseInt(br.readLine());}while (B[i]<=0);	
  }
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
//IGUALES O DIFERENTES UNA SOLA VEZ:
for (i=0;i<N;i++){
	if(A[i]==B[i]){a++;
	}
}
if(a==N){ System.out.println("\nIguales ");
}
else{ System.out.println("\nDiferente");
}
}}  