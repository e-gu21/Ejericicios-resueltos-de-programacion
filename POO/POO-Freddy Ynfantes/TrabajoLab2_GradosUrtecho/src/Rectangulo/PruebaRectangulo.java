
package Rectangulo;
import java.io.*;
public class PruebaRectangulo {
    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int x,y;
        
        //// CREACION DE PUNTOS ////
        
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(10,0);
        Punto p3 = new Punto(10,5);
        Punto p4 = new Punto(0,5);
        
        //// CREACION DE RECTANGULO ////
        
        Rectangulo r = new Rectangulo(p1,p2,p3,p4);
        
        //// AREA ////
        
        System.out.println("Area: "+r.calcularArea());
        
        //// DESPLAZAR RECTANGULO ////
        
        System.out.print("Cuanto se movera en x: ");
        x=Integer.parseInt(br.readLine());
        
        System.out.print("Cuanto se movera en y: ");
        y=Integer.parseInt(br.readLine());
        
        r.desplazar(x, y);
        
        //// REPORTE DE PUNTOS ////
        
        System.out.println("Punto 1: "+p1.toString());
        System.out.println("Punto 2: "+p2.toString());
        System.out.println("Punto 3: "+p3.toString());
        System.out.println("Punto 4: "+p4.toString());
    }
}
