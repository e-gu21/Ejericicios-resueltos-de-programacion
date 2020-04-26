/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionCuadratica;

import java.util.*;
public class PruebaCuadratica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuadratica scd=new Cuadratica();
        for(int i=0;i<2;i++){
        System.out.println("SOLUCIÓN DE UNA ECUACIÓN CUADRÁTICA");
        System.out.println("ax2+bx+c");
        
        Scanner console=new Scanner(System.in);
        
        System.out.print("Ingrese el valor de a: ");
        double a = console.nextDouble();
        scd.setA(a);
        
        System.out.print("Ingrese el valor de b: ");
        double b = console.nextDouble();
        scd.setB(b);
        
        System.out.print("Ingrese el valor de c: ");
        double c = console.nextDouble();
        scd.setC(c);
        
        System.out.println(scd);
    }
    }
}
