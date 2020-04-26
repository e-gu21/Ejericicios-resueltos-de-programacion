
package practica2;
//2.- ESCRIBIR UN PROGRAMAQUE PRESENTE UN MENÚ DE OPCIONES QUE PERMITA:
//a.- Ingresa los datos de N alumno (nombre,edad,sexo).
//b.- reportar todos los datos.
//c.- Consultar por los datos de un alumno.
//d.- Modificar los datos de un alumno.
//e.- Eliminar los datos de un alumno.
//f.- Agregar datos.
//g.- Ordenar alfabéticamente nombre por nombre.
//h.-terminar.
//El programa se repite mientras no se desee terminar.
//El programa debe verificar que si no se ingresaron los datos se emita un mensaje "No hay datos ingresados".
//Debe validar que se permita ingresar datos una vez.
import java.io.*;
public class Practica2
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String [] args)throws IOException
        {
          String nom[]=new String[50];
                   int ed[]=new int[50];
          int N=0;
              char sex[]=new char[50];
          char opc;
          
          do{ opc=menu();
          switch (opc)
          {case 'A':if(N==0){N=LeerN();
                         ingresar(nom,ed,sex,N);}
                    	else{System.out.println("Ya se ingresaron datos");}
                         break;
            case 'B':if(N!=0){reportartodo(nom,ed,sex,N);}
                        else{System.out.println("No se ingresaron datos");
                        }
                         break;
            case 'C':if(N!=0){consultar(nom,ed,sex,N);}
                         else{System.out.println("No se ingresaron datos");
                         }
                         break;
            case 'D':if(N!=0){modificar(nom,ed,sex,N);}
                        else{System.out.println("No se ingresaron datos");
                        }
                         break;
            case 'E':if(N!=0){N=eliminar(nom,ed,sex,N);}
                         else{System.out.println("No se ingresaron datos");
                        }
                         break;   
            case 'F':if(N!=0){N=agregar(nom,ed,sex,N);}
                        else{System.out.println("No se ingresaron datos");
                        }
                         break;
            case 'G':if(N!=0){ ordenar(nom,ed,sex,N);}   
            	         else{System.out.println("No se ingresaron datos");
                        }   
            	         break;                    	
            case 'H':terminar();
                         break;            	                                                 
          }
        }while(opc!='F');
        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
static int LeerN()throws IOException
 { int N;
   do { System.out.print( "Ingrese cantidad de datos N=");
          N=Integer.parseInt(br.readLine());
        } while (N<=0 || N>50);
        return N;
 }
 //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
 static void ingresar(String nom[],int ed[], char sex[],int N)throws IOException
     {int i;
         for(i=0;i<N;i++)
            {System.out.print("Ingresa el nombre: ");
                nom[i]=br.readLine().toUpperCase();
                do{System.out.print("Ingresa edad: ");
                    ed[i]=Integer.parseInt(br.readLine());   
                    }while(ed[i]<0 || ed[i]>20);
                do{System.out.print("Ingresa sexo: ");
                    sex[i]=br.readLine().toUpperCase().charAt(0);
                 }while (sex[i]!='M'&&sex[i]!='H');   
            }
  return ;  
     }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
static void reportartodo(String nom[],int ed[], char sex[],int N)throws IOException   
{int i;
  System.out.println("Reporte de todos los datos");
  for(i=0;i<N;i++)
  {System.out.println(nom[i]+"\t\t"+ed[i]+"\t\t"+sex[i]);
  }
  return;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////   
static void consultar(String nom[],int ed[], char sex[],int N)throws IOException   
{int i, pos=-1;
 String nomaux; 
  System.out.print("Buscar al alumno"); 		
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
 	System.out.println(nom[pos]+"\t\t"+ed[pos]+"\t\t"+sex[pos]);
 }  
return;
} 	  
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
static void modificar(String nom[],int ed[], char sex[],int N)throws IOException     
{int i, pos=-1;
 String nomaux; 
 System.out.print("Modificar datos del alumno"); 	
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
                 }while (sex[pos]!='M'||sex[pos]!='H');   
 }  	
 return;	
}   
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
static int eliminar(String nom[],int ed[], char sex[],int N)throws IOException     
{int i, pos=-1;
 String nomaux; 
 	
 System.out.print("Modificar datos del alumno"); 	
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
static int agregar(String nom[],int ed[], char sex[],int N)throws IOException     
{
 if(N<50){
 	 System.out.print("Ingresa el nombre: ");
     nom[N]=br.readLine().toUpperCase();
         do{System.out.print("Ingresa edad: ");
         ed[N]=Integer.parseInt(br.readLine());   
           }while(ed[N]<0 || ed[N]>20);
        do{System.out.print("Ingresa sexo: ");
        sex[N]=br.readLine().toUpperCase().charAt(0);
       }while (sex[N]!='M'&&sex[N]!='H');  
       	N++;
       }
 else{
 	System.out.print("Arreglo lleno, no se puede agregar más datos");
 }
return N;
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
static void ordenar(String nom[],int ed[], char sex[],int N)throws IOException   
{int i,j, edaux; 
  char sexaux;
  String nomaux;
  for(i=0;i<N;i++)
  {
  	for(j=i+1;j<N;j++)
    {
      if(nom[i].compareTo(nom[j])>0)
      {
      	nomaux=nom[i];
      	nom[i]=nom[j];
      	nom[j]=nomaux;
      	edaux=ed[i];
      	ed[i]=ed[j];
      	ed[j]=edaux;
      	sexaux=sex[i];
      	sex[i]=sex[j];
      	sex[j]=sexaux;
      }	
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
static char menu() throws IOException
{char opc;
   do{
        System.out.println("MENÚ");
        System.out.println("a.- Leer N e ingresar datos");
        System.out.println("b.- Reportar datos");
        System.out.println("c.- Consultar");
        System.out.println("d.- Modificar");
        System.out.println("e.- Eliminar");  
        System.out.println("f.- Agregar");
        System.out.println("g.- Ordenar alfabeticamente nombre por nombre");    	
        System.out.println("h.- Termianr"); 
        opc=br.readLine().toUpperCase().charAt(0);	
        }while(opc<'A'||opc>'H');	
   return opc;     	
}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////      
}        
        