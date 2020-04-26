/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pizza1;

/**
 *
 * @author Usuario
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Creación de objetos
        
        Pizza p1,p2,p3;
        p1=new Pizza("familiar","funghi",1);
        p2=new Pizza("familiar","cuatro quesos",1);
        p3=new Pizza("mediana","margarita",1);
        
        
        //Pedidos
        p1.pizPed();
        p2.pizPed();
        
        //Servidos 
        p2.pizSer();
        p3.pizSer();
        
        //Informacion y estado de pizzas
        System.out.println("Pizza 1: "+p1.toString());
        System.out.println("\nPizza 2: "+p2.toString());
        System.out.println("\nPizza 3: "+p3.toString());
        
        //Mostrar numero de pedidas y servidas
        System.out.println("\nPizza 1: "+p1.obtEstado());
        System.out.println("\nPizza 2: "+p2.obtEstado());
        System.out.println("\nPizza 3: "+p3.obtEstado());
    }
    
}
