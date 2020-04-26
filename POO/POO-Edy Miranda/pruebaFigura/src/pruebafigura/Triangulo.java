
package pruebafigura;


public class Triangulo extends figura2D {
 
    Triangulo (float b,float h){
        super(b,h); 
    }
    public float area(){
        return dim1*dim2/2;
    }

    public String toString(){
        return "\nTriángulo: "+ super.toString();
        }
    }
