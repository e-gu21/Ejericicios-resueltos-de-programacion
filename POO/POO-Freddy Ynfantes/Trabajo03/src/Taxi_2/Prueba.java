
package Taxi_2;

import java.io.*;
public class Prueba {
    
    static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args)throws IOException {
        
        /// IMPLEMENTACION DE ARREGLOS ///
        
        Taxi t[]= new Taxi[2];
        Chofer ch[]= new Chofer[3];
        
        /// VARIABLES A USAR ///
        
        String s1,s2,s3;
        int m,mm;
        
        /// CREACION DE CHOFERES (3) ///
        
        for( int i=1;i<=3;i++)
        {
            System.out.println("CHOFER: "+i+":");
            System.out.print("Ingrese DNI: ");
            s1=br.readLine();
            
            System.out.print("Ingrese Nombres: ");
            s2=br.readLine();
            
            System.out.print("Ingrese Numero de brevete: ");
            s3=br.readLine();
            
            ch[i-1]=new Chofer(s1,s2,s3);
        }
        
        /// CREACION DE TAXIS (2) ///
        
        for( int i=1;i<=2;i++)
        {
            System.out.println("\nTAXI "+i+":");
            System.out.print("Ingrese Placa: ");
            s1=br.readLine();
            
            System.out.print("Ingrese Marca: ");
            s2=br.readLine();
            
            System.out.print("Ingrese Modelo: ");
            s3=br.readLine();
            
            do{
            System.out.println("Escoja Chofer para el Taxi: ");
            System.out.println("1. "+ch[0].getNombre());
            System.out.println("2. "+ch[1].getNombre());
            System.out.println("3. "+ch[2].getNombre());
            m=Integer.parseInt(br.readLine());
            }while(m<1||m>3);
            
            t[i-1]= new Taxi(s1,s2,s3,ch[m-1]);
        }
        
        /// REPORTE POR TOSTRING ///
        
        for( int i=0;i<2;i++)
        {
            System.out.println(t[i].toString());
        }
        
        /// CAMBIO DE CHOFER A UN TAXI ///
        
        System.out.println("Escoja Taxi a cambiar Chofer:");
        System.out.println("1. "+t[0].getPlaca());
        System.out.println("2. "+t[1].getPlaca());
        do{
            m=Integer.parseInt(br.readLine());
        }while(m<1||m>2);
        
        System.out.println("Escoja Chofer para el Taxi: ");
        System.out.println("1. "+ch[0].getNombre());
        System.out.println("2. "+ch[1].getNombre());
        System.out.println("3. "+ch[2].getNombre());
        do{
            mm=Integer.parseInt(br.readLine());
        }while(mm<1||mm>3);
        
        t[m-1].setChofer(ch[mm-1]);
        
        /// REPORTE CON TOSTRING ///
        
        for( int i=0;i<2;i++)
        {
            System.out.println(t[i].toString());
        }
    }
    
}
