package Agenda_1;
import java.io.*;
public class Prueba {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String dni1,dni2,nmb1,nmb2,nc1,nc2,nc3,nc4,t1,t2,t3,t4,d1,d2,d3,d4,x1,x2;
        System.out.println("EMPLEADO 1: ");
        System.out.print("DNI: ");
        dni1=br.readLine();
        System.out.print("Nombre: ");
        nmb1=br.readLine();
        
        System.out.println("EMPLEADO 2: ");
        System.out.print("DNI: ");
        dni2=br.readLine();
        System.out.print("Nombre: ");
        nmb2=br.readLine();
        
        //CREACIÓN DE OBJETOS:
        Empleado e1,e2;
        e1=new Empleado(dni1,nmb1);
        e2=new Empleado(dni2,nmb2);
        
        //INGRESO DE DATOS:
        System.out.println("\nEMPLEADO 1: ");
        //PRIMER CONTACTO:
        System.out.println("CONTACTO 1: ");
        System.out.print("\tNombre: ");
        nc1=br.readLine();
        System.out.print("\tTeléfono: ");
        t1=br.readLine();
        System.out.print("\tDirección: ");
        d1=br.readLine();       
        //SEGUNDO CONTACTO:
        System.out.println("CONTACTO 2: ");
        System.out.print("\tNombre: ");
        nc2=br.readLine();
        System.out.print("\tTeléfono: ");
        t2=br.readLine();
        System.out.print("\tDirección: ");
        d2=br.readLine();
        System.out.println("EMPLEADO 2: ");
        //PRIMER CONTACTO:
        System.out.println("CONTACTO 1: ");
        System.out.print("\tNombre: ");
        nc3=br.readLine();
        System.out.print("\tTeléfono: ");
        t3=br.readLine();
        System.out.print("\tDirección: ");
        d3=br.readLine();       
        //SEGUNDO CONTACTO:
        System.out.println("CONTACTO 2: ");
        System.out.print("\tNombre: ");
        nc4=br.readLine();
        System.out.print("\tTeléfono: ");
        t4=br.readLine();
        System.out.print("\tDirección: ");
        d4=br.readLine();
    //CREACIÓN DE CONTACTOS:
        Contactos c1,c2,c3,c4;
        c1=new Contactos(nc1,t1,d1);
        c2=new Contactos(nc2,t2,d2);
        c3=new Contactos(nc3,t3,d3);
        c4=new Contactos(nc4,t4,d4);    
    //CREACIÓN DE AGENDAS:
        Agenda a1,a2;
        a1=new Agenda(e1);
        a2=new Agenda(e2);
    //AGRGAR CONTACTOS:
        a1.agregarContacto(c1);
        a1.agregarContacto(c2);
        a2.agregarContacto(c3);
        a2.agregarContacto(c4);
     //REPORTAR:
        System.out.println("AGENDA 1: \n"+a1.toString()+a1.listaContactos());
        System.out.println("AGENDA 2: \n"+a2.toString()+a2.listaContactos());
     //BUSCAR CONTACTOS:
     System.out.println("\nBÚSQUEDA DE NOMBRES: ");
        System.out.print("Nombre a buscar en AGENDA1: ");
        x1=br.readLine();
        System.out.println("RESULTADO: "+a1.buscar(x1));
        System.out.print("Nombre a buscar en AGENDA2: ");
        x2=br.readLine();
        System.out.println("\nRESULTADO: "+a2.buscar(x2));
    }
    
}