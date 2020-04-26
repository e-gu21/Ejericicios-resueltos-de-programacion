package histograma;
import java.io.*;
public class Histograma{
	
	static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
	public static void main (String[]args)throws IOException{
		
	char X[]= new char [100];
		
	int N,E,B,R,M,P;
	
	N=LeerN();
	ingresar(X,N);
	E=contador(N,X,'E');
	B=contador(N,X,'B');
	R=contador(N,X,'R');
	M=contador(N,X,'M');
	P=contador(N,X,'P');
	reporte(E,"E: ");
	reporte(B,"B: ");
	reporte(R,"R: ");
	reporte(M,"M: ");
	reporte(P,"P: ");
}

////////////////////////////////////////////////////


	static int LeerN()throws IOException{
		
		int N;
		do{
			System.out.print("Ingrese cantidad de datos a llenar: ");
			N=Integer.parseInt(br.readLine());
		}while(N<=0||N>100);
		
		return N;
	}
	
	//////////////////////////////////////
	
	static void ingresar(char X[],int N)throws IOException{
                System.out.println("solo puede ingresar: E, B, R, M, P");
		
		int i;
		for(i=0;i<N;i++)
		{
			do{
			System.out.print("Ingrese Repuesta["+i+"]: ");
			X[i]=br.readLine().toUpperCase().charAt(0);
			}while(X[i]!='E'&&X[i]!='B'&&X[i]!='R'&&X[i]!='M'&&X[i]!='P');
		}
		return;
	}
	
	////////////////////////////////////////
	
	static int contador(int N,char X[],char M)throws IOException{
		
		int i,c=0;
		for(i=0;i<N;i++)
		{
			if(X[i]==M)
			{
				c++;
			}
		}
		return c;
	}
	
	////////////////////////////////////////
	
	static void reporte(int M,String mensaje)throws IOException{
		
		int i;
		System.out.print(mensaje+M+"\t"+mensaje);
		for(i=1;i<=M;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		return;
	}
}