import java.io.*;
public class Cc
{ static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        public static void main(String [] args)throws IOException
        {
          String nom[]=new String[50];
          int not[]=new int[50];
          int N,cap,pro;
          N=LeerN();
          ingresar(nom,not,N);
          reportar(nom,not,N);
          cap=aprobados(nom,not,N);
          reportar2(cap);
          desaprobados(nom,not,N);
          pro=promedio(not,N);
          menoresProm(nom,not,N,pro); 
        }
    static int LeerN()throws IOException
    {
    int N;
    do
            {
                 System.out.print("Ingresa la cantidad de alumnos: ");
              N=Integer.parseInt(br.readLine());
            }while(N<=0 || N>50);
    return N;
    }
     static void ingresar(String nom[],int not[],int N)throws IOException
     {
         int i;
         for(i=0;i<N;i++)
            {
                System.out.print("Ingresa el "+(i+1)+ "° nombre: ");
                nom[i]=br.readLine().toUpperCase();
                
                 do
                {
                    System.out.print("Ingresa Nota: ");
                    not[i]=Integer.parseInt(br.readLine());   
                }while(not[i]<0 || not[i]>20);
       
            }
     
       return ;  
     }
      static void reportar(String nom[],int not[],int N)throws IOException
     {
         int i;
         System.out.println("NOMBRE\tNOTA");
         for(i=0;i<N;i++)
            {
                 System.out.println(nom[i]+"\t"+not[i]);
                
            }
             
     
       return ;  
     }
      
    
     static int aprobados(String nom[],int not[],int N)throws IOException
    {
    int cap=0,i;
          System.out.println("NOMBRE\tNOTA");
          for(i=0;i<N;i++)
            {
                 if(not[i]>10)
                 {
                     cap++;
                     
                     System.out.println(nom[i]+"\t"+not[i]);
                 }
            } 
    return cap;
    }
    
    static void reportar2(int cap)throws IOException
     {
         
         System.out.println("La cantidad de aprobados es:"+cap);
             
     
       return ;  
     }
    
    static void desaprobados(String nom[],int not[],int N)throws IOException
    {
    int sum=0,i;
          System.out.println("NOMBRE\tNOTA");
          for(i=0;i<N;i++)
            {
                 if(not[i]<11)
                 {
                     sum=sum+not[i];
                     
                     System.out.println(nom[i]+"\t"+not[i]);
                 }
            } 
          System.out.println("La suma de notas  de los desaprobados es:"+sum);
    return ;
    }
    
    
     static int promedio(int not[],int N)throws IOException
    {
    int sum=0,i,prom;
          
          for(i=0;i<N;i++)
            {
                sum=sum+not[i];
            } 
          prom=sum/N;
      System.out.println("La  nota promedio es:"+prom);    
          
    return prom;
    }
     
     static void menoresProm(String nom[],int not[],int N,int prom)throws IOException
     {
         int i;
         System.out.println("NOMBRE\tNOTA");
         for(i=0;i<N;i++)
            {
                if(not[i]<prom)
                {
                System.out.println(nom[i]+"\t"+not[i]);
                
                }
                 
                
            }
             
     
       return ;  
     }
    
    
    
    
        }