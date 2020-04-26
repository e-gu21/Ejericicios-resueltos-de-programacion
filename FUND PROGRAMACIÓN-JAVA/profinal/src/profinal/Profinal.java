/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package profinal;
import java.io.*;
public class Profinal
{static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    public static void main(String []args)throws IOException      
    {  int n=0,opc,k=1;
        String NameConduc[]=new String [300];
        int IdTaxi[]=new int [300];
        int IdAux[]=new int [300];
        char EstadoTaxi[]=new char [300];
        int NumTotalServ[]=new int [9600];
        double IngrTotalUnid[]=new double [3000];
        String NameClient[]=new String [300];
        String DirecOrigen[]=new String [300];
        double CostServ[]=new double [300];
        
        do{
            opc=sistema();
            
            switch(opc)
            {case 1: if(n==0){n=LeerN();
                           ingresar(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                           }
                           else
                           {System.out.println("");
                             System.out.println("\t¡Ya ingresó datos, astronómico!\t");
                             System.out.println("");
                           }
                           break;
              case 2: if(n!=0)
                          {reportar(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                          }
                          else
                          {System.out.println("");
                            System.out.println("\t¡Ingrese datos, crack!\t");
                            System.out.println("");
                          }
                          break;
              case 3:
                    if(n!=0)
                    {
                        n=agregar(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                       System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 4:
                    if(n!=0)
                    {
                        modificar(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 5:
                    if(n!=0)
                    {
                        n=eliminar(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 6:
                    if(n!=0)
                    {
                        consultar(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 7:
                    if(n!=0)
                    {
                        consultar1(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 8:
                    if(n!=0)
                    {
                        ordenarAlf(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 9:
                    if(n!=0)
                    {
                        ordenarID(NameConduc,IdTaxi,EstadoTaxi,NumTotalServ,IngrTotalUnid,n);
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 10:
                    if(n!=0)
                    {
                       asignar(IdTaxi,IdAux,EstadoTaxi,NumTotalServ,IngrTotalUnid,NameClient,DirecOrigen,CostServ,n,k);
                       k++;
                    }
                    else
                    {
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 11:
                    if(n!=0)
                    {
                        finserv(IdTaxi,IdAux,EstadoTaxi,NumTotalServ,IngrTotalUnid,NameClient,DirecOrigen,CostServ,n,k);
                    }
                    else
                    {   
                        System.out.println("");
                        System.out.println("\t¡Ingrese datos, crack!\t");
                        System.out.println("");
                    }
                    break;
                case 12:
                    terminar();
                    break;
            }
    }while(opc!=12);
    
}   
    
    static void finserv(int IdTaxi[],int IdAux[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],String NameClient[],String DirecOrigen[],double CostServ[],int n,int k)throws IOException
    {
        int i,pos=-1,aux;
        double s=0;
        
        do{
            System.out.println("");
            System.out.print("Ingrese ID para finalizar servicio: ");
            aux=Integer.parseInt(br.readLine());
            System.out.println("");
        }while(aux<=99 || aux>=1000);
        
        for(i=1;i<=n;i++)
        {
            if(IdTaxi[i]==aux)
            {
                pos=i;
                i=n;
            }
        }
        
        if(pos==-1)
        {
            System.out.println("");
            System.out.println("\tID no existe, jopend :v\t");
            System.out.println("");
        }
        else
        {
            System.out.println("**********************************************");
            System.out.println("\tFIN DE SERVICIO A LA UNIDAD\t"+pos);
             System.out.println("**********************************************");
            EstadoTaxi[pos]='L';
        }
        
             System.out.println("");
             System.out.println("**********************************************");
             System.out.println("ACTUALIZACIÓN DE TODOS LOS SERVICIOS REALIZADOS");
             System.out.println("**********************************************");
            
        for(i=1;i<=(k-1);i++)
        {   
            System.out.println("ID de la atención: "+IdAux[i]);
            System.out.println("\t| Nombre del cliente: "+NameClient[i]);
            System.out.println("\t| Dirección de origen: "+DirecOrigen[i]);
            System.out.println("\t| Costo de servicio: "+CostServ[i]);
            System.out.println("");
            s=s+CostServ[i];
        }
        
        System.out.println("");
        System.out.println("\tMonto total recaudado (actualizado): "+s);
        System.out.println("");
        
        
    }
    
    static void asignar(int IdTaxi[],int IdAux[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],String NameClient[],String DirecOrigen[],double CostServ[],int n,int k)throws IOException
    {
        int i,pos=-1,aux;
        
        do{
            System.out.println("");
            System.out.print("Ingrese ID para asignar servicio: ");
            aux=Integer.parseInt(br.readLine());
            System.out.println("");
        }while(aux<=99 || aux>=1000);
        
        for(i=1;i<=n;i++)
        {
            if(IdTaxi[i]==aux)
            {
                pos=i;
                i=n;
            }
        }
        
        if(pos==-1)
        {
            System.out.println("");
            System.out.println("\tID no existe, crack!\t");
            System.out.println("");
        }
        else
        {
            if(EstadoTaxi[pos]=='L')
            {
                System.out.println("**********************************************");
            System.out.println("ASIGNACIÓN DE SERVICIO A LA UNIDAD "+pos);
            System.out.println("**********************************************");
            System.out.print("Ingrese nombre del cliente: ");
            NameClient[k]=br.readLine();
            System.out.print("Ingrese dirección de origen: ");
            DirecOrigen[k]=br.readLine();
            System.out.print("Ingrese costo de servicio: ");
            CostServ[k]=Double.parseDouble(br.readLine());
            EstadoTaxi[pos]='O';
            NumTotalServ[pos]=NumTotalServ[pos]+1;
            IngrTotalUnid[pos]=IngrTotalUnid[pos]+CostServ[k];
            IdAux[k]=IdTaxi[pos];
            System.out.println("");
            }
            else
            {
                System.out.println("");
                System.out.println("\tLa ID está ocupada!\t");
                System.out.println("");
            }
        }
        
    }
    
    static void ordenarID(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
      int i,j; 
       String conducaux;
       int idaux;
       char estadoaux;
       int servaux;
       double ingresaux;
       
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(IdTaxi[j]<IdTaxi[i])
                {
                    conducaux=NameConduc[j];
                    NameConduc[j]=NameConduc[i];
                    NameConduc[i]=conducaux;
                    idaux=IdTaxi[j];
                    IdTaxi[j]=IdTaxi[i];
                    IdTaxi[i]=idaux;
                    estadoaux=EstadoTaxi[j];
                    EstadoTaxi[j]=EstadoTaxi[i];
                    EstadoTaxi[i]=estadoaux;
                    servaux=NumTotalServ[j];
                    NumTotalServ[j]=NumTotalServ[i];
                    NumTotalServ[i]=servaux;
                    ingresaux=IngrTotalUnid[j];
                    IngrTotalUnid[j]=IngrTotalUnid[i];
                    IngrTotalUnid[i]=ingresaux;
                        }
            }
        }
        
        System.out.println("");
        System.out.print("\tDatos ordenados [Seleccione opción 2 para visualizar]\t");
        System.out.println("");
    }
    
    static void ordenarAlf(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
      int i,j; 
       String conducaux;
       int idaux;
       char estadoaux;
       int servaux;
       double ingresaux;
       
        for(i=1;i<=n;i++)
        {
            for(j=i+1;j<=n;j++)
            {
                if(NameConduc[i].compareTo(NameConduc[j])>0)
                {
                    conducaux=NameConduc[j];
                    NameConduc[j]=NameConduc[i];
                    NameConduc[i]=conducaux;
                    idaux=IdTaxi[j];
                    IdTaxi[j]=IdTaxi[i];
                    IdTaxi[i]=idaux;
                    estadoaux=EstadoTaxi[j];
                    EstadoTaxi[j]=EstadoTaxi[i];
                    EstadoTaxi[i]=estadoaux;
                    servaux=NumTotalServ[j];
                    NumTotalServ[j]=NumTotalServ[i];
                    NumTotalServ[i]=servaux;
                    ingresaux=IngrTotalUnid[j];
                    IngrTotalUnid[j]=IngrTotalUnid[i];
                    IngrTotalUnid[i]=ingresaux;
                        }
            }
        }
        
        System.out.println("");
        System.out.print("\tDatos ordenados [Seleccione opción 2 para visualizar]\t");
        System.out.println("");
    }
    
    
    static void consultar1(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i,pos=-1,aux;
        
        do{
            System.out.println("");
            System.out.print("Ingrese ID a consultar: ");
            aux=Integer.parseInt(br.readLine());
            System.out.println("");
        }while(aux<=99 || aux>=1000);
        
        for(i=1;i<=n;i++)
        {
            if(IdTaxi[i]==aux)
            {
                pos=i;
                i=n;
            }
        }
        
        if(pos==-1)
        {
            System.out.println("");
            System.out.println("\tDato no existe, crack!\t");
            System.out.println("");
        }
        else
        {
             System.out.println("");
             System.out.println("*******************************");
            System.out.print("NombreConductor ("+pos+"): "+NameConduc[pos]);
            System.out.println("");
            System.out.print("ID Taxi ("+pos+"): "+IdTaxi[pos]);
            System.out.println("");
            System.out.print("Estado taxi ("+pos+"): "+EstadoTaxi[pos]);
            System.out.println("");
            System.out.print("NumeroTotalDeServicios ("+pos+"): "+NumTotalServ[pos]);
            System.out.println("");
            System.out.println("IngreseTotalPorUnidad ("+pos+"): "+IngrTotalUnid[pos]);
            System.out.println("*******************************");
            System.out.println("");
        }
    }
    
    
    static void consultar(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i,pos=-1;
        String aux;
        
        System.out.println("");
        System.out.print("Ingrese nombre a consultar: ");
        aux=br.readLine();
        System.out.println("");
        
         for(i=1;i<=n;i++)
        {
            if(NameConduc[i].equals(aux))
            {
                pos=i;
                i=n;
            }
        }
        
        if(pos==-1)
        {
            System.out.println("");
            System.out.println("\tDato no existe, crack!\t");
            System.out.println("");
        }
        else
        {   System.out.println("");
        System.out.println("*******************************");  
            System.out.print("NombreConductor ("+pos+"): "+NameConduc[pos]);
            System.out.println("");
            System.out.print("ID Taxi ("+pos+"): "+IdTaxi[pos]);
            System.out.println("");
            System.out.print("Estado taxi ("+pos+"): "+EstadoTaxi[pos]);
            System.out.println("");
            System.out.print("NumeroTotalDeServicios ("+pos+"): "+NumTotalServ[pos]);
            System.out.println("");
            System.out.println("IngreseTotalPorUnidad ("+pos+"): "+IngrTotalUnid[pos]);
            System.out.println("*******************************");
            System.out.println("");
                }
        }
    
    
    
    
    static int eliminar(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i,pos=-1;
        String aux;
        
        System.out.println("");
        System.out.print("Ingrese nombre a eliminar: ");
        aux=br.readLine();
        System.out.println("");
        
        for(i=1;i<=n;i++)
        {
            if(NameConduc[i].equals(aux))
            {
                pos=i;
                i=n;
            }
        }
        
        if(pos==-1)
        {
            System.out.println("");
            System.out.println("\tDato no existe, crack!\t");
            System.out.println("");
        }
        else
        {   if(EstadoTaxi[pos]=='L')
            
             {   NameConduc[pos]=NameConduc[n];
            IdTaxi[pos]=IdTaxi[n];
            EstadoTaxi[pos]=EstadoTaxi[n];
            NumTotalServ[pos]=NumTotalServ[n];
            IngrTotalUnid[pos]=IngrTotalUnid[n];
            System.out.println("\t¡Eliminación realizada!");    
             n=n-1;}
            else
            {
                System.out.println("\t¡Esta unidad está ocupada, eliminación imposible RCTM!");
                }
        }
        
        return n;
    }
    
    static void modificar(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i,pos=-1;
        int id,k,p;
        String aux;
        
        System.out.println("");
        System.out.print("Ingrese nombre a modificar: ");
        aux=br.readLine();
        System.out.println("");
        
        for(i=1;i<=n;i++)
        {
            if(NameConduc[i].equals(aux))
            {
                pos=i;
                i=n;
            }
        }
        
        if(pos==-1)
        {   
            System.out.println("");
            System.out.println("\tDato no existe, crack!\t");
            System.out.println("");
        }
        else
        {
            System.out.print("Ingrese NombreConductor ("+pos+"): ");
            NameConduc[pos]=br.readLine();
            
            //_______________///
            p=0;
        	do{
                System.out.print("Ingrese ID taxi ("+i+"): ");
                id=Integer.parseInt(br.readLine());
                IdTaxi[pos]=0;
                
                
                	for(k=0;k<n;k++)
                	{
                		if(id==IdTaxi[k])
                		{
                			p++;
                		}
                	}
                	if(p==0)
                	{
                		IdTaxi[pos]=id;
                	}
                	else
                	{
                		
                	}
                	p=0;
               
                
        	}while(IdTaxi[pos]<=99 || IdTaxi[pos]>=1000);
            
            //________/////
            
            
                System.out.println("Estado del taxi ("+i+"): "+EstadoTaxi[i]);
                System.out.println("Numero total de servicios ("+i+"): "+NumTotalServ[i]);
                System.out.println("Ingreso total por unidad ("+i+"): "+IngrTotalUnid[i]);
        }
    }
    
    
   static int agregar(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i,k;
        int id,x,p;
        int tot;
        do{
            System.out.println("");
            System.out.print("Ingrese cantidad de datos ha agregar: ");
            k=Integer.parseInt(br.readLine());
            System.out.println("");
        }while(k<=0);
        tot=n+k;
        
        for(i=n+1;i<=tot;i++)
        {   
            EstadoTaxi[i]='L';
            NumTotalServ[i]=0;
            IngrTotalUnid[i]=0.0;
            
             System.out.print("Ingrese NombreConductor ("+i+"): ");
            NameConduc[i]=br.readLine();
            //////__________////
            p=0;
        	do{
                System.out.print("Ingrese ID taxi ("+i+"): ");
                id=Integer.parseInt(br.readLine());
                
                	
                	for(x=0;x<tot;x++)
                	{
                		if(id==IdTaxi[x])
                		{
                			p++;
                		}
                	}
                	if(p==0)
                	{
                		IdTaxi[i]=id;
                	}
                	else
                	{
                		IdTaxi[i]=1;
                	}
                	p=0;
                
                
        	}while(IdTaxi[i]<=99 || IdTaxi[i]>=1000);
            /////________________////
           
                System.out.println("Estado del taxi ("+i+"): "+EstadoTaxi[i]);
                System.out.println("Numero total de servicios ("+i+"): "+NumTotalServ[i]);
                System.out.println("Ingreso total por unidad ("+i+"): "+IngrTotalUnid[i]);
        }
        
        return tot;
    }
    
    
    static void reportar(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i;
        
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("REPORTE DE TODOS LOS DATOS");
        System.out.println("*******************************");
        
        for(i=1;i<=n;i++)
        {   
            System.out.println("");
            System.out.print("NombreConductor ("+i+"): "+NameConduc[i]);
            System.out.println("");
            System.out.print("ID Taxi ("+i+"): "+IdTaxi[i]);
            System.out.println("");
            System.out.print("Estado taxi ("+i+"): "+EstadoTaxi[i]);
            System.out.println("");
            System.out.print("NumeroTotalDeServicios ("+i+"): "+NumTotalServ[i]);
            System.out.println("");
            System.out.print("IngreseTotalPorUnidad ("+i+"): "+IngrTotalUnid[i]);
        }
        
        System.out.println("");
    }
    
    
    static void terminar()throws IOException
    {   
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("PROGRAMA TERMINADO. LEYENDA!!!");
        System.out.println("*******************************");
        System.out.println("");
    }
    
     static void ingresar(String NameConduc[],int IdTaxi[],char EstadoTaxi[],int NumTotalServ[],double IngrTotalUnid[],int n)throws IOException
    {
        int i;
         int id,x,p;
        
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("INGRESO DE DATOS");
        System.out.println("*******************************");
        System.out.println("");
        
        for(i=1;i<=n;i++)
        {   
            EstadoTaxi[i]='L';
            NumTotalServ[i]=0;
            IngrTotalUnid[i]=0.0;
            
            System.out.print("Ingrese NombreConductor ("+i+"): ");
            NameConduc[i]=br.readLine();
           //////__________////
            p=0;
        	do{
                System.out.print("Ingrese ID taxi ("+i+"): ");
                id=Integer.parseInt(br.readLine());
                if(i>0)
                {
                	
                	for(x=0;x<n;x++)
                	{
                		if(id==IdTaxi[x])
                		{
                			p++;
                		}
                	}
                	if(p==0)
                	{
                		IdTaxi[i]=id;
                	}
                	else
                	{
                		IdTaxi[i]=1;
                	}
                	p=0;
                }
                else
                {
                IdTaxi[i]=id;	
                }
                
        	}while(IdTaxi[i]<=99 || IdTaxi[i]>=1000);
            /////________________////
            
            System.out.println("Estado del taxi ("+i+"): "+EstadoTaxi[i]);
                System.out.println("Numero total de servicios ("+i+"): "+NumTotalServ[i]);
                System.out.println("Ingreso total por unidad ("+i+"): "+IngrTotalUnid[i]);
        }
    }
    
    
    static int LeerN()throws IOException
    {
        int n;
        
        do{ System.out.println("");
            System.out.print("Ingrese N: ");
             n=Integer.parseInt(br.readLine());
        }while(n<=0 || n>300);
        
        return n;
    }
    
    
    static int sistema()throws IOException
{
    int opc;
    
    do{
        System.out.println("");
        System.out.println("SISTEMA: ");
        System.out.println("1. Ingrese datos");
        System.out.println("2. Reporte de todos los datos");
        System.out.println("3. Agregar datos");
        System.out.println("4. Modificar datos");
        System.out.println("5. Eliminar datos");
        System.out.println("6. Consultar por nombre conductor");
        System.out.println("7. Consultar por ID de taxi");
        System.out.println("8. Ordenar los datos alfabéticamente en forma ascendente (nombre de conductor)");
        System.out.println("9. Ordenar en forma descendente por ID de taxi");
        System.out.println("10. Aisgnación de servicio de unidad");
        System.out.println("11. Fin de servicio en base al ID de taxi");
        System.out.println("12. Finalizar del programa");
        System.out.print("Seleccione alguna de las opciones[1-12]: ");
        opc=Integer.parseInt(br.readLine());
    }while(opc<1 || opc>12);
    
    return opc;
}
    }