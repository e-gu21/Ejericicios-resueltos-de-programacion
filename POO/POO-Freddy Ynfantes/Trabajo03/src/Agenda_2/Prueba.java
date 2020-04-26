
package Agenda_2;

import java.io.*;
public class Prueba {

    static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args)throws IOException {
        
        /// IMPLEMENTACION DE ARREGLO ///
        
        Agenda ag[]= new Agenda[2];
        
        /// VARIABLES A USAR ///
        
        String s1,s2;
        int e;
        long l;
        
        /// CREACION DE EMPLEADOS (AGENDAS)(2) ///
        
        /*for( int i=1;i<=2;i++){
            System.out.println("EMPLEADO "+i+":");
            System.out.print("Ingrese DNI: ");
            s1=br.readLine();
            
            System.out.print("Ingrese Nombre: ");
            s2=br.readLine();
            
            ag[i-1]= new Agenda(s1,s2);
        }*/
        
        /// CREACION DE CONTACTOS (2 por agenda) ///
        
        for(int i=1;i<=2;i++){
            System.out.println("EMPLEADO "+i+":");
            System.out.print("Ingrese DNI: ");
            s1=br.readLine();          
            System.out.print("Ingrese Nombre: ");
            s2=br.readLine();
            
            ag[i-1]= new Agenda(s1,s2);
            for(int j=1;j<=2;j++){
                System.out.println("CONTACTO "+j+" DEL  EMPLEADO "+i);
                System.out.print("Ingrese Nombre de Contacto: ");
                s1=br.readLine();
                
                System.out.print("Ingrese Telefono de Contacto: ");
                l=Long.parseLong(br.readLine());
                
                System.out.print("Ingrese Direccion de Contacto: ");
                s2=br.readLine();
                
                ag[i-1].agregarContacto(new Contacto(s1,l,s2));
            }
            System.out.println("\n");
        }
        
        /// REPORTE CON TOSTRING Y EL METODO LISTACONTACTO() ///
        
        for(int i=0;i<2;i++){
        System.out.println(ag[i].toString());
        ag[i].listaContacto();
        }
        
        /// BUSCAR CONTACTO POR NOMBRE ///
        
        System.out.println("Agenda del Empledo donde desea buscar: ");
        System.out.println("1. "+ag[0].getNombre());
        System.out.println("2. "+ag[1].getNombre());
        do{
        e=Integer.parseInt(br.readLine());
        }while(e<0||e>2);
        
        System.out.print("Ingrese nombre a buscar: ");
        s1=br.readLine();
        
        System.out.println(ag[e-1].buscarContacto(s1));
    }
    
}
