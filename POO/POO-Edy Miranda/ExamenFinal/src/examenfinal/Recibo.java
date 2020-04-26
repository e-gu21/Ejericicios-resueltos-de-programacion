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
public class Recibo {
    Direccion di;
    LineaDeProducto lp;
    
    Recibo(Direccion d, LineaDeProducto lin ){
        di=d;
        lp=lin;
      
    }
    public String toString(){
        return ""+di+""+ lp; 
            }
    
}
