/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionescuentamiercoles;

/**
 *
 * @author Sistemas
 */
public class Cliente {
    
    //Atributos
    private String nombre;
    private String dni;
    public static int numeroClientes;
    
    //Metodos
    public Cliente(String nombre,String dni){
        numeroClientes++;
    this.nombre=nombre;
    this.dni=dni;
  
    }
    public static int obtenerNumeroCleintes(){
    return numeroClientes;}
   
    @Override
    public String toString(){
       return "Nombre:" +nombre+"\nDNI:"+dni;
    }
}



