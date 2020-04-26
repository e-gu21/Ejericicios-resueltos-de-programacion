package Triangulo;
import java.io.*;
import java.util.*;
public class PruebaTriangulo {
     static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     public static void main(String[] args)throws IOException  {
         int n;
         double x1,x2,x3,y1,y2,y3;
        ArrayList<Triangulo2D> triangulos = new ArrayList();
        System.out.println("Ingrese cantidad de triángulos que desea crear");
        n=Integer.parseInt(br.readLine());
        
        for(int i=0;i<=n;i++){
            System.out.println("TRIÁNGULO"+i+": ");
            System.out.println("VÉRTICE 1 ");
            System.out.print("Posición en X: ");
            x1=Double.parseDouble(br.readLine());
            System.out.print("Posición en Y: ");
            y1=Double.parseDouble(br.readLine());
            Vertice2D v1=new Vertice2D(x1,y1);
            
            System.out.println("TRIÁNGULO"+i+": ");
            System.out.println("VÉRTICE 2 ");
            System.out.print("Posición en X: ");
            x2=Double.parseDouble(br.readLine());
            System.out.print("Posición en Y: ");
            y2=Double.parseDouble(br.readLine());
            Vertice2D v2=new Vertice2D(x2,y2);
            
            System.out.println("TRIÁNGULO"+i+": ");
            System.out.println("VÉRTICE 3 ");
            System.out.print("Posición en X: ");
            x3=Double.parseDouble(br.readLine());
            System.out.print("Posición en Y: ");
            y3=Double.parseDouble(br.readLine());
            Vertice2D v3=new Vertice2D(x3,y3);
            
            Triangulo2D t=new Triangulo2D(v1,v2,v3);
            triangulos.add(t);
        }
        System.out.println("\nPERIMETRO DE TRIANGULO");
        for(int i=0;i<triangulos.size();i++){
            System.out.println("Perimetro de Triangulo "+(i+1)+": "+triangulos.get(i).Perimetro());
        }
        System.out.println("\nTIPOS DE TRIÁNGULO");
        for(int i=0;i<triangulos.size();i++){
            System.out.println("Tipo de triángulo"+(i+1)+":"+triangulos.get(i).TipTriangulo());
        }
        
        System.out.println("\nNumero de Triangulos creados: "+triangulos.size());
        
        for(int i=0;i<triangulos.size();i++){
            System.out.println("Triangulo "+(i+1)+": "+triangulos.get(i));
        }
        
    }
    
}
