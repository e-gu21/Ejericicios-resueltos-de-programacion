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
public class Direccion {
    private String nombre;
    private String direccion;
    private String ciudad;
    private String departamento;
    private String pais;
   
    Direccion(String n, String d, String c, String dep, String p ){
        nombre=n;
        direccion=d;
        ciudad=c;
        departamento=dep;
        pais=p;
        
    }
    public String toString(){
      return nombre+"\n"+direccion+"\n"+ciudad+","+departamento+" "+pais+"\n"+"\n";  
    }
}
