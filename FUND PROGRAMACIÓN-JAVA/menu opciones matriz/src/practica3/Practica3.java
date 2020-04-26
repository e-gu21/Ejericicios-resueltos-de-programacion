
package practica3;
//3.- INGRESAR NÚMEROS ENTEROS A UNA MATRIZ M DE ORDEN n*m:
//a.- reportar la matriz M.
//b.- Colocar en una matriz P los números pares de M. En lugar de los impares colocar"0". Reportar P.
//c.- Calcular la matriz diagonal D. Reportar D.
//d.- Calcular la matriz diagonal superior S. Reportar S.
//e.- Calcular la matriz diagonal inferior I. Reportar I.
//El programa debe verificar que si no se ingresaron los datos se emita un mensaje "No hay datos ingresados".
import java.io.*;
public class Practica3
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public static void main(String [] args)throws IOException
    {int M[][]=new int[10][10];
      int P[][]=new int[10][10];
      int D[][]=new int[10][10];
      int S[][]=new int[10][10];
      int I[][] =new int[10][10];
      int fil, col;
      char resp;
      do{  
            System.out.println("Las filas y columnas deben ser iguales");
            fil=LeerN("filas: ");
            col=LeerN("columnas "); 
            if(fil==col)
            {ingresar(M,fil,col);
             reportar(M,fil,col,"Matriz M");
             pares(M,fil,col,P);
             reportar(P,fil,col,"Matriz P");
             diagonal(M,fil,col,D);
             reportar(D,fil,col,"Matriz D");
             diagonalSuperior(M,fil,col,S);
             reportar(S,fil,col,"Matriz S");
             diagonalInferior(M,fil,col,I);
             reportar(I,fil,col,"Matriz I");
            }
            resp=continuar();	
            
      }while(resp=='S');
    }  
   
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static int LeerN(String mensaje)throws IOException
 { int N;
 
   do { 
       System.out.print( "Ingrese cantidad de: "+mensaje);
        
          N=Integer.parseInt(br.readLine());
        } while (N<=0 || N>10);
        return N;
 }
 ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static char continuar() throws IOException
 { char res;
   do { System.out.print( "Ingrese 'S' si desea continuar, de lo contraio'N'");
          res=br.readLine().toUpperCase().charAt(0);
        } while (res!='S'&& res!='N');
   return res;
 }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void ingresar(int M[][],int fil, int col)throws IOException     	
{int i,j;
  for(i=0;i<fil;i++)
  {for(j=0;j<col;j++)
    {   do { System.out.print( "M["+i+"]["+j+"]: ");
                M[i][j]=Integer.parseInt(br.readLine());
              }while (M[i][j]<=0);
    }
  }
  return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void reportar(int M[][],int fil, int col, String mensaje)throws IOException
{int i,j;
System.out.println("Reporte de datos"+mensaje);
 for(i=0;i<fil;i++){
 	for(j=0;j<col;j++)
 		{System.out.print(M[i][j]+"\t");
 	}
 	System.out.println();
 }
}    
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   	 
static void pares(int M[][],int fil, int col, int P[][])throws IOException
{int i,j;
System.out.println("A\tP");
 for(i=0;i<fil;i++)
 {for(j=0;j<col;j++)
   {
   	if (M[i][j]%2==0)
   	{P[i][j]=M[i][j];
    }
    else
    {P[i][j]=0;
    }
   }
 }
 return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   	 
static void diagonal(int M[][],int fil, int col, int D[][])throws IOException
{int i,j;
System.out.println("A\tD");
 for(i=0; i<fil; i++)
 {for(j=0;j<col;j++)
   {
   	if (i==j)
   	{D[i][j]=M[i][j];
    }
    else
    {D[i][j]=0;
    }
   }
 }
 return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   	 
static void diagonalSuperior(int M[][],int fil, int col, int S[][])throws IOException
{int i,j,D[][];
System.out.println("A\tS");
	for(i=0;i<fil;i++)
 {for(j=0;j<col;j++)
   {
   	if (i<=j)
   	{S[i][j]=M[i][j];
    }
    else
    {S[i][j]=0;
    }
   }
 }
 return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void diagonalInferior(int M[][],int fil, int col, int I[][])throws IOException
{int i,j,D[][];
System.out.println("A\tI");
	for(i=0;i<fil;i++)
 {for(j=0;j<col;j++)
   {
   	if (i>=j)
   	{I[i][j]=M[i][j];
    }
    else
    {I[i][j]=0;
    }
   }
 }
 return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   	 

}