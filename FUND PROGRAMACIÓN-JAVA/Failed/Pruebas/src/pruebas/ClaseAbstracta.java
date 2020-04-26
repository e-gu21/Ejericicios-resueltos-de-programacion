/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author LENOVO
 */
public abstract class ClaseAbstracta  implements Interfaces{
    
    String alma;
    String ki;
    
    ClaseAbstracta(String alma, String ki){
        this.alma = alma;
        this.ki = ki;
    }
    
    public String getAlma(){
        return this.alma;
    }
    
    public String getKi(){
        return this.ki;
    }
    
    
    public abstract void imprimir();
    
}
