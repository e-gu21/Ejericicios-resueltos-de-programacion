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
public abstract class Boxeador extends Persona implements Interfaces{   
    
    Boxeador(){
        super.nombre="huangal";        
    }
    
    public void salida (){
        System.out.println(super.getNombre());
        imim();
    }
    
    public String getNombrecito(){
        return super.getNombre();
    }
    
    public void imim () {
        System.out.print("weikiwaka");
    }
  
    
}
