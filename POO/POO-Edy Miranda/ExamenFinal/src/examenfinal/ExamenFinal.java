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
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Direccion d1= new Direccion("SODIMAC S.A.C","AV PROGRESO 176","TRUJILLO","LA LIBERTAD","PERU");
        Producto p1= new Producto("Celular");
        LineaDeProducto l1= new LineaDeProducto(p1,1,200);
        Recibo r1= new Recibo(d1,l1);
        System.out.println("               RECIBO               ");
        System.out.println(r1);
    }
    
}
