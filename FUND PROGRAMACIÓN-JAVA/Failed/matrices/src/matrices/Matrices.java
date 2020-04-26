/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrices;
import java.io.*;
public class Matrices
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
   public static void main(String [] args)throws IOException
  {int M[][]=new int [10][10];
    int D[][]=new int [10][10];
    int P[][]=new int [10][10];
    int K[][]=new int [10][10];
    int R[][]=new int [10][10];
    int f,c;
    char res;
    do{   f=LeerN("filas: ");
            c=LeerN("columnas "); 
            if(f==c)
            {ingresar(M,f,c);
             reportar(M,f,c,"Matriz M");
             suma(M,f,c);    
             mayor(M,f,c);
             menor(M,f,c);
             diagonal(M,f,c,D);
             reportar(D,f,c,"Matriz D");
             primos(M,f,c,P);
             reportar(P,f,c,"Matriz P");
             capicúa(M,f,c,K);
             reportar(P,f,c,"Matriz K");
             cantdig(M,f,c,R);
             reportar(R,f,c,"Matriz R");     
            }
            res=continuar();	
      }while(res=='S');  
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
static char continuar() throws IOException
 { char res;
   do { System.out.print( "Ingrese 'S' si desea continuar, de lo contraio'N'");
          res=br.readLine().toUpperCase().charAt(0);
        } while (res!='S'&& res!='N');
   return res;
 }  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
static void ingresar(int M[][],int f, int c)throws IOException     	
{int i,j;
  for(i=0;i<f;i++)
  {for(j=0;j<c;j++)
    {   do { System.out.print( "M["+i+"]["+j+"]: ");
                M[i][j]=Integer.parseInt(br.readLine());
              }while (M[i][j]<=0);
    }
  }
  return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
 static void reportar(int M[][],int f, int c, String mensaje)throws IOException
{int i,j;
System.out.println("Reporte de datos "+mensaje);
 for(i=0;i<f;i++){
 	for(j=0;j<c;j++){
 		System.out.print(M[i][j]+"\t");
 	}
 	System.out.println();
 }
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
static void suma(int M[][], int f, int c) throws IOException 
{int i,j,s=0;
 for(i=0;i<f;i++)
 {for(j=0;j<c;j++)
   {
     s=s+M[i][j];
   }
 }
 System.out.println("La suma es "+s);
 return;	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
static void mayor(int M[][], int f, int c) throws IOException 
{int i,j,max=0;
  max=M[0][0];
  for(i=0;i<f;i++)
  {for(j=0;j<c;j++)
    {if(M[i][j]>max)
    	{max=M[i][j];
        }
    }
  }
 System.out.println("El número mayor es "+max);
 return;
} 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
static void menor(int M[][], int f, int c) throws IOException 
{int i,j,min=0;
  min=M[0][0];
  for(i=0;i<f;i++)
  {for(j=0;j<c;j++)
    {if(M[i][j]<min)
    	{min=M[i][j];
        }
    }
  }
 System.out.println("El número menor es "+min);
 return;
}  
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
 static void primos(int M[][], int f, int c, int P[][]) throws IOException 
 {int i, j, cd=0, b,A=0;
   System.out.println("A\tP");
   for(i=0;i<f;i++)
   {for(j=0;j<c;j++)
   	 {A=M[i][j];
   	   for(b=1;b<=A;b++){
   	     if(A%b==0){
   	   	 cd++;
   	     }
   	   }
   	   if(cd==2){
   	   	P[i][j]=M[i][j];
   	   }
   	   else{
   	   	P[i][j]=0;
   	   }
     }
   }
   return;
 } 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
static void diagonal(int M[][],int f, int c, int D[][])throws IOException
{int i,j;
System.out.println("A\tD");
 for(i=0; i<f; i++)
 {for(j=0;j<c;j++)
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
static void capicúa(int M[][],int f, int c, int K[][])throws IOException
{int i,j,x,ninv,res,z;
 System.out.println("A\tK");
 for(i=0; i<f; i++)
 {for(j=0;j<c;j++){
 	   x=M[i][j];
 	res=0; z=x; ninv=0;
   while(x!=0){
   	res=x%10;
   	ninv=ninv*10+res;
   	x=x/10;
   }
   if(ninv==z){
   	K[i][j]=M[i][j];
   }
   else{
   	K[i][j]=0;
   }
   }
 }
 return;
 }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
static void cantdig(int M[][],int f, int c, int R[][])throws IOException
{int i,j,res=0,coc=0,x,sd=0;
  for(i=0; i<f; i++)
 {for(j=0;j<c;j++){
 	x=M[i][j];
 	while(x>0){
 		res=x%10;
 		coc=x/10;
 		x=coc;
 	}
  R[i][j]=M[i][j];
 }
 }
 return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////     
 
}
