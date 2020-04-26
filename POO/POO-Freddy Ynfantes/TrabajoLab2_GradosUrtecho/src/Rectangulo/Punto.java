
package Rectangulo;


public class Punto {
     protected int x,y;
    
    Punto(){
        x=0;
        y=0;
    }
    
    Punto(int a, int b){
        x=a;
        y=b;
    }
    
    public String toString(){
        return "("+x+" ; "+y+")";
    }   
}
