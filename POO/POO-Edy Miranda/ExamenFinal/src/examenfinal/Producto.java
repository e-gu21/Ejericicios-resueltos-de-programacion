/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenfinal;

/**
 *
 * @author Sistemas
 */
public class Producto {
    //Atributos
    public String nombre;
    //Constructor
    public Producto(String n) {
        nombre = n;
    }
    @Override
    public String toString() {
        return nombre;
    }
}