
package practica1;
//1.- ESCRIBIR UN PROGRAMAQUE PRESENTE UN MENÚ DE OPCIONES QUE PERMITA:
//
//
//
//
//
//
//
import java.io.*;
public class Practica1
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String [] args)throws IOException
        {
          String nom[]=new String[50];
                   int ed[]=new int[50];
              char sex[]=new char[50];
          int N=0;
          char opc;
          do{ opc=menu();
          switch (opc)
          {case 'A': N=LeerN();
                         ingresar(nom,ed,sex,N);
                         break;
            case 'B': reportartodo(nom,ed,sex,N);
                         break;
            case 'C': consultar(nom,ed,sex,N);
                         break;
            case 'D': modificar(nom,ed,sex,N);
                         break;
            case 'E': N=eliminar(nom,ed,sex,N);
                         break;   
            case 'F': terminar();
                         break;            	                                                 
          }
        }while(opc!='F');
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static int LeerN()throws IOException
 { int N;
   do { System.out.print( "Ingrese cantidad de datos N= ");
          N=Integer.parseInt(br.readLine());
        } while (N<=0 || N>50);
        return N;
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
 static void ingresar(String nom[],int ed[], char sex[],int N)throws IOException
     {int i;
         for(i=0;i<N;i++)
            {System.out.print("Ingresa el "+(i+1)+"° nombre: ");
                nom[i]=br.readLine().toUpperCase();
                do{System.out.print("Ingresa edad: ");
                    ed[i]=Integer.parseInt(br.readLine());   
                    }while(ed[i]<0 || ed[i]>20);
                do{System.out.print("Ingresa sexo: m: mujer || h: hombre");
                    sex[i]=br.readLine().toUpperCase().charAt(0);
                 }while (sex[i]!='M'&&sex[i]!='H');   
            }
  return ;  
     }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
static void reportartodo(String nom[],int ed[], char sex[],int N)throws IOException   
{int i;
  System.out.println("\nReporte de todos los datos");
  System.out.println("NOMBRE\t\tEDAD\t\tSEXO");
  for(i=0;i<N;i++)
      
  { 
    System.out.println(nom[i]+"\t\t"+ed[i]+"\t\t"+sex[i]);
  }
  return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
static void consultar(String nom[],int ed[], char sex[],int N)throws IOException   
{int i, pos=-1;
 String nomaux; 
  System.out.println("\nBuscar al alumno"); 		
 System.out.print("Ingresa nombre a buscar: ");
 nomaux=br.readLine().toUpperCase();
  for(i=0;i<N;i++)
  {
  	if(nom[i].compareTo(nomaux)==0)
  	{
  		pos=i;
  		i=N;
  }
  }
 if(pos==-1){
 	 System.out.print("Dato no existe");
 }
 else{
        System.out.println("NOMBRE\t\tEDAD\t\tSEXO");
 	System.out.println(nom[pos]+"\t\t"+ed[pos]+"\t\t"+sex[pos]);
 }  
return;
} 	  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void modificar(String nom[],int ed[], char sex[],int N)throws IOException     
{int i, pos=-1;
 String nomaux; 
 System.out.println("\nModificar datos del alumno"); 	
 System.out.print("Ingresa nombre a buscar: ");
 nomaux=br.readLine().toUpperCase();
  for(i=0;i<N;i++)
  {
  	if(nom[i].compareTo(nomaux)==0)
  	{
  		pos=i;
  		i=N;
  }
  }
 if(pos==-1){
 	 System.out.print("Dato no existe");
 }
 else{
 	   System.out.print("Ingresa nuevo nombre: ");
        nom[pos]=br.readLine().toUpperCase();
                do{System.out.print("Ingresa edad: ");
                    ed[pos]=Integer.parseInt(br.readLine());   
                    }while(ed[pos]<0 || ed[pos]>20);
                do{System.out.print("Ingresa sexo: ");
                    sex[pos]=br.readLine().toUpperCase().charAt(0);
                 }while (sex[pos]!='M'&&sex[pos]!='H');   
 }  	
 return;	
}   
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
static int eliminar(String nom[],int ed[], char sex[],int N)throws IOException     
{int i, pos=-1;
 String nomaux; 
 System.out.println("\nEliminar datos del alumno"); 	
 System.out.print("Ingresa nombre a buscar: ");
 nomaux=br.readLine().toUpperCase();
  for(i=0;i<N;i++)
  {
  	if(nom[i].compareTo(nomaux)==0)
  	{
  		pos=i;
  		i=N;
  }
  }
 if(pos==-1){
 	 System.out.print("Dato no existe");
 }
 else{
        nom[pos]=nom[N-1];
        ed[pos]=ed[N-1];  
        sex[pos]=sex[N-1];
        N=N-1;             
 }
 	
 return N;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
static void terminar() throws IOException
{
System.out.print("FIN");
return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
static char menu() throws IOException
{char opc;
   do{
        System.out.println("\nMENÚ");
        System.out.println("a.- Leer N e ingresar datos");
        System.out.println("b.- Reportar datos");
        System.out.println("c.- Consultar");
        System.out.println("d.- Modificar");
        System.out.println("e.- Eliminar");
        System.out.println("f.- Termianr"); 
        opc=br.readLine().toUpperCase().charAt(0);	
        }while(opc<'A'||opc>'F');	
   return opc;     	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
}        
