
package Agenda_2;

public class Contacto {
    
    private String nombre,direccion;
    private long telefono;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Contacto(String n,long t,String d){
        nombre=n;
        telefono=t;
        direccion=d;
    }
    
    /// METODO GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "*\nNombre:"+nombre+"\n\t*Telefono: "+telefono+"\n\t*Direccion: "+direccion;
    }
}
