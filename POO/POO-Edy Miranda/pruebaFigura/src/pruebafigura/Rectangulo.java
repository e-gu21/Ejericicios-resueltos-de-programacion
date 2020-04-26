
package pruebafigura;

public class Rectangulo extends figura2D {
 
    
    Rectangulo (float b,float h){
        super(b,h); 
    }
    public float area(){
        return dim1*dim2;
    }

    public String toString(){
        return "Rectángulo: "+ super.toString();
        }
    }   
    
