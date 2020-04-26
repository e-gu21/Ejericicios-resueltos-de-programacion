
package matrices2;
//Ingresar 2 matrices de NxN.
//Reportar los datos.
//Transpuesta de cada uno.
//Suma de las matrices.
//Producto de las matrices.
import java.io.*;
public class Matrices2
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public static void main(String [] args)throws IOException
   { int A[][]=new int[10][10];
     int B[][]=new int[10][10];
     int T1[][]=new int[10][10];
     int T2[][]=new int[10][10];
     int S[][]=new int[10][10];
     int P[][]=new int[10][10];
     int f=0,c=0;
     char opc;
   do{
   	opc=menu();
   	switch (opc)
   	  {case 'a':f=LeerN("FILAS ");
   	                c=LeerN("COLUMNAS ");
   	                ingresar(A,f,c);
   	                ingresar(B,f,c);
  	                break;
  	    case 'b': if(f!=0&&c!=0){
  	    	        reportar(A,f,c,"Matriz A");     
                    reportar(B,f,c,"Matriz B");}
                    else{System.out.println("No se ingresaron datos");}     	    	
  	                break;
  	    case 'c':if(f!=0&&c!=0){ 
  	    	        suma(A,B,f,c,S); 
  	    	        reportar(S,f,c,"Matriz S"); } 
  	    	        else{System.out.println("No se ingresaron datos");}   	            
                    break;
        case 'd':if(f!=0&&c!=0){ 
        	        transpuesta(A,f,c,T1);
        	        reportar(T1,c,f,"Mtariz T1");
        	        transpuesta(B,f,c,T2);
        	        reportar(T2,c,f,"Mtariz T2");}
        	        else{System.out.println("No se ingresaron datos");}   
                    break;
        case 'e':if(f!=0&&c!=0){ 
        	        producto(A,B,f,c,P);
        	        reportar(P,f,c,"Matriz P"); }
        	        else{System.out.println("No se ingresaron datos");}   
        	        break;		   
        case 'f': terminar();
                    break;                         
  	  }		
   }while(opc!='f');
  }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static int LeerN(String mensaje)throws IOException
 { int N;
   do { System.out.print( "Ingrese cantidad de "+mensaje);
          N=Integer.parseInt(br.readLine());
        } while (N<=0 || N>10);
        return N;
 }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static char menu() throws IOException
{char opc;
   do{
        System.out.println("MENÚ");
        System.out.println("ELIGE UNA OPCIÓN");
        System.out.println("a.- Leer N e ingresar datos");
        System.out.println("b.- Reportar datos");
        System.out.println("c.- Suma de matrices");
        System.out.println("d.- Transpuesta");
        System.out.println("e.- Producto");   	
        System.out.println("f.- Terminar"); 
        opc=br.readLine().toLowerCase().charAt(0);	
        }while(opc<'a'||opc>'f');	
   return opc;     	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void ingresar(int A[][],int f, int c)throws IOException     	
{int i,j;
  for(i=0;i<f;i++)
  {for(j=0;j<c;j++)
    {   do { System.out.print( "A["+i+"]["+j+"]: ");
                A[i][j]=Integer.parseInt(br.readLine());
              }while (A[i][j]<=0);
    }
  }
  return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
 static void reportar(int A[][],int f, int c, String mensaje)throws IOException
{int i,j;
System.out.println("Reporte de datos "+mensaje);
 for(i=0;i<f;i++){
 	for(j=0;j<c;j++){
 		System.out.print(A[i][j]+"\t");
 	}
 	System.out.println();
 }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void suma(int A[][], int B[][], int f, int c, int S[][]) throws IOException 
{int i,j;
 for(i=0;i<f;i++)
 {for(j=0;j<c;j++)
   {
     S[i][j]=A[i][j]+B[i][j];
   }
 }
 return;	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void transpuesta(int A[][], int f, int c, int T[][]) throws IOException 
{int i,j;
 for(i=0;i<f;i++)
 {
 	for(j=0;j<c;j++)
   {
     T[i][j]=A[j][i];
   }
 }
 return;	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
static void producto(int A[][], int B[][], int f, int c, int P[][]) throws IOException 
{int i,j,k;
 for( i=0;i<f;i++)
 {for( j=0;j<c;j++)
   {for( k=0;k<c;k++)
     P[i][j]=P[i][j]+A[i][k]*B[k][j];
   }
 }
 return;	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static void terminar() throws IOException
{
System.out.print("FIN");
return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
   }	