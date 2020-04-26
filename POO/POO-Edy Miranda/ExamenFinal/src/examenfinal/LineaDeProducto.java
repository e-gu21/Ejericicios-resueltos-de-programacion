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
public class LineaDeProducto {
    private int cantidad;
    Producto product;
    private float precio;
    
    LineaDeProducto(Producto p, int cant, float pre){
        product=p;
        cantidad=cant;
        precio=pre;
    } 
    float total(){
    return cantidad*precio;
    }
    @Override
    public String toString(){
    return "Descripción :" +product + "    Precio: " + precio + "  cantidad " + cantidad +"     Total : "+total()+"\n";
            
    }
    
}
