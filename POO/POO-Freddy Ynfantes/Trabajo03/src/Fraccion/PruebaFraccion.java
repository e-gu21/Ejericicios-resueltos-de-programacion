package Fraccion;

import java.io.*;
public class PruebaFraccion {
    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        Fraccion f1=new Fraccion();
        Fraccion f2=new Fraccion(5,2);
        
        int n,d;
        
        System.out.print("Ingrese un valor para numerador de fraccion 1: ");
        n=Integer.parseInt(br.readLine());
        f1.setNum(n);
        System.out.print("Ingrese un valor para denominador de fraccion 1: ");
        d=Integer.parseInt(br.readLine());
        f1.setDem(d);
        
        System.out.println("Fraccion 1: "+f1.reporte());
        System.out.println("Fraccion 2: "+f2.reporte());
        System.out.println("Suma: "+f1.sumar(f2.getNum(),f2.getDem()));
        System.out.println("Resta: "+f1.restar(f2.getNum(),f2.getDem()));
        System.out.println("Producto: "+f1.multiplicar(f2.getNum(),f2.getDem()));
        System.out.println("Division: "+f1.dividir(f2.getNum(),f2.getDem()));
        System.out.println("Comparación: "+f1.reporte()+f1.comparar(f2.getNum(),f2.getDem())+f2.reporte());
    }
    
}
