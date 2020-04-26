package Taxi_1;
import java.io.*;
public class Prueba {
    public static void main(String[] args)throws IOException  {
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        //CONDUCTOR:
        Conductor c1, c2;
        c1=new Conductor("Pedro","78654321","12234");
        c2=new Conductor("Jorge","73457394","22143");
        
        //TAXI:
        Taxi t1,t2;
        t1=new Taxi("N2Q-234","Toyota","Rava",c1);
        t2=new Taxi("P3R-036","Hyundai","Elantra",c2);
        
        //REPORTANDO:
        System.out.println("\n\tTaxi 1: "+t1.toString());
        System.out.println("\n\tTaxi 2: "+t2.toString());
        
        // Se realiza la modificación y se termian el ejercicio.
        System.out.println("\nCAMBIO DE CHOFER: ");
        t2.setConductor(c1);
        System.out.println(t2.toString());

     
        
    }
    
}
