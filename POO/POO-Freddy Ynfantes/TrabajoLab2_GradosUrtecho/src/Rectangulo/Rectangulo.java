
package Rectangulo;

public class Rectangulo {
     private Punto p1,p2,p3,p4;
    
    Rectangulo(Punto a,Punto b, Punto c, Punto d){
        p1=a;
        p2=b;
        p3=c;
        p4=d;
    }
    
    public int calcularArea(){
        int h,b,a;
        b=p2.x-p1.x;
        h=p4.y-p1.y;
        a=b*h;
        return a;
    }
    
    public void desplazar(int x, int y){
        p1.x=p1.x+x;
        p2.x=p2.x+x;
        p3.x=p3.x+x;
        p4.x=p4.x+x;
        p1.y=p1.y+y;
        p2.y=p2.y+y;
        p3.y=p3.y+y;
        p4.y=p4.y+y;
    }   
}
