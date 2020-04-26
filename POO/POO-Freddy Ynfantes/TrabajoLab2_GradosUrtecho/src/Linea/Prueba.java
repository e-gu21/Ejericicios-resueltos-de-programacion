/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linea;

/**
 *
 * @author Usuario
 */
public class Prueba {
        public static void main(String[] args){
        
        double n;
        
        Punto p1 = new Punto(0,0);
        Punto p2 = new Punto(5,0);
        
        Linea l1 = new Linea();
        Linea l2 = new Linea(p1,p2);
        
        n=5;
        System.out.println("Se movio a la derecha (Linea 2): "+n);
        l2.mueveDerecha(n);
        
        n=3;
        System.out.println("Se movio a la izquierda (Linea 2): "+n);
        l2.mueveIzquierda(n);
        
        n=4;
        System.out.println("Se movio a la arriba (Linea 2): "+n);
        l2.mueveArriba(n);
        
        n=2;
        System.out.println("Se movio a la abajo (Linea 2): "+n);
        l2.mueveAbajo(n);
        
        System.out.println("Linea 1\n"+l1.toString());
        System.out.println("Linea 2\n"+l2.toString());
    }
}
