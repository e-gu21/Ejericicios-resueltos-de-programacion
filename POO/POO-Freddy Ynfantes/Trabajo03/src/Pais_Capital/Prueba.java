
package Pais_Capital;

import java.io.*;
public class Prueba {
    
    static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args)throws IOException {
        
        /// IMPLEMENTACION DE ARREGLOS ///
        
        Capital cap[]=new Capital[5];
        Pais p[]= new Pais[3];
        
        /// VARIABLES A UTILIZAR EN EL PROCESO ///
        
        String co,n,al,id;
        long po;
        int m,mm;
        
        /// CREACION DE LAS CAPITALES (5) ///
        
        for( int i=1;i<=5;i++)
        {
            System.out.println("CAPITAL "+i+":");    
            System.out.print("Ingrese Codigo Postal: ");
            co=br.readLine();
            
            System.out.print("Ingrese Nombre: ");
            n=br.readLine();
            
            System.out.print("Ingrese Alcalde: ");
            al=br.readLine();
            
            cap[i-1]=new Capital(co,n,al);
            System.out.println("\n");
        }
        
        /// CREACION DE PAISES (3) ///
        
        for( int i=1;i<=3;i++)
        {
            System.out.println("PAÍS "+i+":");
            System.out.print("Ingrese Nombre: ");
            n=br.readLine();
            
            System.out.print("Ingrese Moneda: ");
            co=br.readLine();
            
            System.out.print("Ingrese Idioma: ");
            id=br.readLine();
            
            System.out.print("Ingrese Presidente: ");
            al=br.readLine();
            
            do{
            System.out.print("Ingrese Poblacion: ");
            po=Long.parseLong(br.readLine());
            }while(po<1000);
            
            do{
            System.out.println("Escoja capital para el Pais: ");
            System.out.println("1. "+cap[0].getNombre());
            System.out.println("2. "+cap[1].getNombre());
            System.out.println("3. "+cap[2].getNombre());
            System.out.println("4. "+cap[3].getNombre());
            System.out.println("5. "+cap[4].getNombre());
            m=Integer.parseInt(br.readLine());
            }while(m<1||m>5);
            
            p[i-1]=new Pais(n,co,id,al,po,cap[m-1]);
        }
        
        /// REPORTE CON TOSTRING ///
        
        for( int i=0;i<3;i++)
        {
            System.out.println(p[i].toString());
        }
            
            
        /// CAMBIO DE CAPITAL A UN PAIS ///
        
        System.out.println("¿A que pais desea cambiar la Capital?:");
        System.out.println("1. "+p[0].getNombre());
        System.out.println("2. "+p[1].getNombre());
        System.out.println("3. "+p[2].getNombre());
        do{
            m=Integer.parseInt(br.readLine());
        }while(m<1||m>3);
        
        System.out.println("¿Que Capital quisiera ponerle?:");
        System.out.println("1. "+cap[0].getNombre());
        System.out.println("2. "+cap[1].getNombre());
        System.out.println("3. "+cap[2].getNombre());
        System.out.println("4. "+cap[3].getNombre());
        System.out.println("5. "+cap[4].getNombre());
        
        do{
            mm=Integer.parseInt(br.readLine());
        }while(mm<1||mm>5);
        
        p[m-1].setCapital(cap[mm-1]);
        
        /// REPORTE CON TOSTRING ///
        
        for( int i=0;i<3;i++)
        {
            System.out.println(p[i].toString());
        }
    }
    
}
