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
public class Abogado extends Persona implements Interfaces{
    
    String nombre = "chafloque";
    
    Abogado(){
        super();
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public void correr() {
        System.out.println("Estoy corriendo");
    }
    
    
}
