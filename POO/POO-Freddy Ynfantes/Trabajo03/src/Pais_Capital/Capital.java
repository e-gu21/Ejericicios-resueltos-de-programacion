
package Pais_Capital;

public class Capital {
    
    private String codigo,nombre,alcalde;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Capital(String c,String n,String a){
        codigo=c;
        nombre=n;
        alcalde=a;
    }
    
    /// METODO GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "Codigo:\t"+codigo+"\nNombre:\t"+nombre+"\nAlcalde:\t"+alcalde+"\n";
    }
}
