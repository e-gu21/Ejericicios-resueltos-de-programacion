/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcuacionCuadratica;

/**
 *
 * @author Usuario
 */
public class Cuadratica {
    private double a;
    private double b;
    private double c;
    
   public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }
    
    public String toString(){
        double d=((b*b)-(4*a*c));
        if(d<0){
            d=((4*a*c)-(b*b));            
            return "\nLa Solución es: "+a+"x^2 + "+b+"x + "+c+"\nX1: "+((-b)/(2*a))+"+"+((Math.sqrt(d))/(2*a))+"i"+"\tX2: "+((-b)/(2*a))+"-"+((Math.sqrt(d))/(2*a))+"i";
        }
        else{
            return "\nLa Solución de la Ecuación es: "+a+"x^2 + "+b+"x + "+c+"\nX1: "+((-b+Math.sqrt(d))/(2*a))+"\tX2: "+((-b-Math.sqrt(d))/(2*a));
        }
    }        
}
