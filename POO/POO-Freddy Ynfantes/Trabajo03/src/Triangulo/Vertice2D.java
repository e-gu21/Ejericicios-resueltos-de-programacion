
package Triangulo;

public class Vertice2D {
    
    private double x,y;
    
    public Vertice2D(double a,double b){
        x=a;
        y=b;
    }
    
    public double getX(){
        return x;
    }
    
    public double getY(){
        return y;
    }
    
    public String toString(){
        return "("+x+","+y+")";
    }
}
