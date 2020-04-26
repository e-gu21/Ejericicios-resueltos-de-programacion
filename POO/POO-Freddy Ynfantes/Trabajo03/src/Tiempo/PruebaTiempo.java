package Tiempo;
public class PruebaTiempo {

    public static void main(String[] args) {
        Tiempo t1,t2;
        t1= new Tiempo(1,30,40);
        t2= new Tiempo(1,30,40);
        
        System.out.println("Timpo actual: ");
        System.out.println("Tiempo 1: "+t1.Reporte());
        System.out.println("Tiempo 2: "+t2.Reporte());
        
        System.out.println("\nTiempo aumentado y disminuido:");
        t1.suma(3, 34, 25);
        System.out.println("Tiempo: "+t1.Reporte());
        
        t2.resta(0, 25, 40);
        System.out.println("Tiempo: "+t2.Reporte());
        
    }
}

