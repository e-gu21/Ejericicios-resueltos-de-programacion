//Ingresar N números positivos a un arreglo A. Luego:
//a.- Reportar el arreglo A;
//b.- En un arrgelo B copiar el arreglo A invertido. Reportar B.
//c.- en un arreglo D, en cada posición i colocar una letra C si A[i] es capicúa, sino una N. reportar D. 
//d.- En un arreglo F, en cada posición i colocar 'es primo' si A[i] es primo, sino colocar 'No es primo'. Reportar F.
//e.- En un arreglo G, en cada posición i, almacenar la suma de los dígitos A[i]. Reportar G.
package ejercicio4;
import java.io.*;

public class Ejercicio4
{static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
  public static void main (String[]args) throws IOException
  {int A[]= new int [50];
    int B[]= new int [50];
    char D[]= new char [50];
    String F[]= new String [50];
    int G[]= new int [50];
    int N;
    N=LeerN();
    ingresar (A,N);
    reportar(A,N);
    invertido(A,N,B);
    capicúa(A,N, D);
    primo(A,N,F);   
    suma(A,N,G);   
  }
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static int LeerN() throws IOException
{int N;
 do { System.out.print( "Ingrese cantidad de datos N= ");
          N=Integer.parseInt(br.readLine());
        } while (N<=0 || N>50);
        return N;
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void  ingresar(int A[], int N) throws IOException
{int i;
System.out.println ("\nIngresa valores de A");
    System.out.println("Números entre 0-199");
//System.out.println("A");
for(i=0;i<N;i++){
	do{System.out.print( "Ingrese los valores de A: ");
          A[i]=Integer.parseInt(br.readLine());
}while (A[i]<=0||A[i]>200);
}}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void reportar(int A[], int N) throws IOException
{int i;
    System.out.println("\nValores de A:");  
  System.out.println("A");
    for(i=0;i<N;i++){System.out.println(A[i]); 
    }
   return ;  
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void invertido(int A[], int N, int B[]) throws IOException
{int i;
 System.out.println ("\nInvertido de A");
System.out.println("A\t\tB");
for(i=0;i<N;i++){
	B[i]=A[N-1-i];
	System.out.println(A[i]+"\t\t"+B[i]);
}
return;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void capicúa(int A[], int N, char D[]) throws IOException
{int i,Ninv=0,res=0,M;
 System.out.println ("\nCapicúa de A");
    System.out.println("C: capicúa || N: no capicúa");
 System.out.println("A\t\tD");
 for(i=0;i<N;i++){
 	M=A[i];
 	while (M>0){
 		res=M%10;
 		Ninv=Ninv*10+res;
 		M=M/10;
 	}
 	if(Ninv==A[i]){
 		D[i]= 'C';
 	}
 	else{D[i]= 'N';
 	}
 	Ninv=0;	
   System.out.println(A[i]+"\t\t"+D[i]);	
 }
 return;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void primo(int A[], int N, String F[]) throws IOException
{int i, M,c,cd;
 System.out.println ("\nPrimo de A");
 System.out.println("A\t\tF");
  for(i=0;i<N;i++){
  	M=A[i];
  	cd=0;
  	for(c=1;c<=M;c++){
   if(M%c==0){
   	cd++;
   }
  }
  if(cd<=2){F[i]="Es primo";
  }	
  else{F[i]="No es primo";
  }
   System.out.println(A[i]+"\t\t"+F[i]);
  }
  return;
}
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void suma(int A[], int N, int G[]) throws IOException
{int i, res, coc, sd,M;
 System.out.println ("\nSuma de dígitos de A");
 System.out.println("A\t\tG");
 for (i=0;i<N;i++){
 	sd=0;
 	M=A[i];
 	while(M>0){
 		res=M%10;
 		sd=sd+res;
 		coc=M/10;
 		M=coc;
 	}
 	G[i]=sd;
 	System.out.println(A[i]+"\t\t"+G[i]);
 }
 return;
}

}