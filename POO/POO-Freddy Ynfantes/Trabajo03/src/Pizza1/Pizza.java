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
public class Pizza {
     //Variables de instancia
    private String tamaño,tipo,estado;
    private int cantidad,npizzap=0,npizzas;
    
    //Variable de clase
    private static int Total=0;
    
    //Contructor
    public Pizza(String t,String ti,int c){
        cantidad=c;
        estado="pedido";
        tamaño=t;
        tipo=ti;
        Total++;
        npizzas++;
    }
    
    //Metodo pedido
    public void pizPed(){
        
        estado="Pedido";
        npizzap++;
        
    }
    //Metodo servido en mesa
    public void pizSer(){
        
        estado="Servida";
        npizzas++;
        
    }
    
    public String toString(){
        return "\ntamaño: "+tamaño+"\ntipo: "+tipo+"\ncantidad: "+cantidad+"\nestado: "+estado;
    }
    
    public String obtEstado(){
        return "Cantidad de veces pedida: "+npizzap+"\nCantidad de veces servida: "+npizzas;
    }
}
