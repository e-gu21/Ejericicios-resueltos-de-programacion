/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafigura;

/**
 *
 * @author Sistemas
 */
public abstract class figura2D  {
    protected float dim1;
    protected float dim2;
    
    
    figura2D(float d1,float d2){
    dim1=d1;
    dim2=d2;
}
   public abstract float area();
   public String toString(){
       return "\nd1 = "+dim1+"\nd2 = "+dim2+"\nel area es: "+area();
        
    }
}
