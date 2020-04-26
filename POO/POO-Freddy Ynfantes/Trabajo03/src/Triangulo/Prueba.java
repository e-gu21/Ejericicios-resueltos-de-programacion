
package Triangulo;

import java.io.*;
import java.util.*;

public class Prueba {
    
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        ArrayList<Triangulo2D> triangulos = new ArrayList();
        
        System.out.print("Cuantos Triangulos desea hacer?: ");
        int n=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++)
        {   System.out.println("TRIÁNGULO "+i+":");
            System.out.println("Vértice 1:");
            System.out.print("Posición en X: ");
            double ax=Double.parseDouble(br.readLine());         
            System.out.print("Posición en Y: ");
            double ay=Double.parseDouble(br.readLine());
            
            Vertice2D v1= new Vertice2D(ax,ay);
            System.out.println("Vértice 2");
            System.out.print("Posición en X: ");
            double bx=Double.parseDouble(br.readLine());            
            System.out.print("Posición en Y: ");
            double by=Double.parseDouble(br.readLine());
           
            Vertice2D v2= new Vertice2D(bx,by);    
            System.out.println("Vértice 3: ");
            System.out.print("Posición en X: ");
            double cx=Double.parseDouble(br.readLine());           
            System.out.print("Posición en Y: ");
            double cy=Double.parseDouble(br.readLine());
            
            Vertice2D v3= new Vertice2D(cx,cy);
            
            Triangulo2D t= new Triangulo2D(v1,v2,v3);
            
            triangulos.add(t);
            System.out.println("\n");
        }
        
        ///////////////////////
        
        System.out.println("***TIPOS DE TRIANGULO***");
        for(int i=0;i<triangulos.size();i++){
            System.out.println("Tipo de Triangulo "+(i+1)+": "+triangulos.get(i).devolverTipoTriangulo());
        }
        System.out.println("\n");
        ///////////////////////
        
        System.out.println("***PERIMETRO DE TRIANGULO***");
        for(int i=0;i<triangulos.size();i++){
            System.out.println("Perimetro de Triangulo "+(i+1)+": "+triangulos.get(i).calcularPerimetro());
        }
        System.out.println("\n");
        System.out.println("***Numero de Triangulos creados: "+triangulos.size());
        
        for(int i=0;i<triangulos.size();i++){
            System.out.println("Triangulo "+(i+1)+": "+triangulos.get(i));
        }
    }
    
}
