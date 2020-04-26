package SintomasPaciente_2;
import java.io.*;
public class Prueba {
    public static void main(String[] args)throws IOException {
       BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
       String n1,dni1,n2,dni2,n3,dni3,n4,dni4,n5,dni5,n6,dni6,n7,dni7,n8,dni8,n9,dni9,n10,dni10;
       String m1,m2,m3,t1,t2,t3; 
    //INGRESO DE SÍNTOMAS:
       System.out.print("\nSÍNTOMAS:");
       System.out.print("\nSíntoma 1: ");
       m1=br.readLine();
       System.out.print("Tipo: ");
       t1=br.readLine();
       System.out.print("\nSíntoma 2:");
       m2=br.readLine();
       System.out.print("Tipo: ");
       t2=br.readLine();
       System.out.print("\nSíntoma 3:");
       m3=br.readLine();
       System.out.print("Tipo: ");
       t3=br.readLine();
    //CREACIÓN DE OBJETOS:
       sintomas s1,s2,s3,s4,s5;
        s1=new sintomas(m1,t1);
        s2=new sintomas(m2,t2);
        s3=new sintomas(m3,t3);
    //INGRESO DE LOS 10 PACIENTES:
        System.out.println("\nDATOS DE PACIENTES:");
        System.out.println("\nPACIENTE 1: ");
        System.out.print("\tNombre: ");
        n1=br.readLine();
        System.out.print("\tDNI: ");
        dni1=br.readLine();

        System.out.println("\nPACIENTE 2: ");
        System.out.print("\tNombre: ");
        n2=br.readLine();
        System.out.print("\tDNI: ");
        dni2=br.readLine();
        
        System.out.println("\nPACIENTE 3: ");
        System.out.print("\tNombre: ");
        n3=br.readLine();
        System.out.print("\tDNI: ");
        dni3=br.readLine();
        
        System.out.println("\nPACIENTE 4: ");
        System.out.print("\tNombre: ");
        n4=br.readLine();
        System.out.print("\tDNI: ");
        dni4=br.readLine();
        
        System.out.println("\nPACIENTE 5: ");
        System.out.print("\tNombre: ");
        n5=br.readLine();
        System.out.print("\tDNI: ");
        dni5=br.readLine();
        
        System.out.println("\nPACIENTE 6: ");
        System.out.print("\tNombre: ");
        n6=br.readLine();
        System.out.print("\tDNI: ");
        dni6=br.readLine();
        
        System.out.println("\nPACIENTE 7: ");
        System.out.print("\tNombre: ");
        n7=br.readLine();
        System.out.print("\tDNI: ");
        dni7=br.readLine();
        
        System.out.println("\nPACIENTE 8: ");
        System.out.print("\tNombre: ");
        n8=br.readLine();
        System.out.print("\tDNI: ");
        dni8=br.readLine();
        
        System.out.println("\nPACIENTE 9: ");
        System.out.print("\tNombre: ");
        n9=br.readLine();
        System.out.print("\tDNI: ");
        dni9=br.readLine();
        
        System.out.println("\nPACIENTE 10: ");
        System.out.print("\tNombre: ");
        n10=br.readLine();
        System.out.print("\tDNI: ");
        dni10=br.readLine();
     //CREACIÓN DE OBJETOS:  
        pacientes p1=new pacientes(n1,dni1);
        pacientes p2=new pacientes(n2,dni2);
        pacientes p3=new pacientes(n3,dni3);
        pacientes p4=new pacientes(n4,dni4);
        pacientes p5=new pacientes(n5,dni5);
        pacientes p6=new pacientes(n6,dni6);
        pacientes p7=new pacientes(n7,dni7);
        pacientes p8=new pacientes(n8,dni8);
        pacientes p9=new pacientes(n9,dni9);
        pacientes p10=new pacientes(n10,dni10);
    //VER SÍNTOMAS:
        p1.ASintomas(s1);
        p2.ASintomas(s2);
        p3.ASintomas(s3);
        p4.ASintomas(s2);
        p5.ASintomas(s3);
        p6.ASintomas(s1);
        p7.ASintomas(s2);
        p8.ASintomas(s3);
        p9.ASintomas(s3);
        p10.ASintomas(s2);
        
    //REPORTAR SÍNTOMAS Y DATOS DEL PACIENTE:
        System.out.println("DATOS PACIENTE 1: "+p1.verSintomas());
        System.out.println("DATOS PACIENTE 2: "+p2.verSintomas());
        System.out.println("DATOS PACIENTE 3: "+p3.verSintomas());
        System.out.println("DATOS PACIENTE 4: "+p4.verSintomas());
        System.out.println("DATOS PACIENTE 5: "+p5.verSintomas());
        System.out.println("DATOS PACIENTE 6: "+p6.verSintomas());
        System.out.println("DATOS PACIENTE 7: "+p7.verSintomas());
        System.out.println("DATOS PACIENTE 8: "+p8.verSintomas());
        System.out.println("DATOS PACIENTE 9: "+p9.verSintomas());
        System.out.println("DATOS PACIENTE 10: "+p10.verSintomas());
    }
    
}
