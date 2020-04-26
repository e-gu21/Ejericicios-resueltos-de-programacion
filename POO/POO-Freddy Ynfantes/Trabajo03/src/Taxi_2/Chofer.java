
package Taxi_2;

public class Chofer {
    
    private String dni,nombre,nbrevete;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Chofer(String d,String n,String b){
        dni=d;
        nombre=n;
        nbrevete=b;
    }
    
    /// METODO GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "DNI:\t"+dni+"\nNombres:\t"+nombre+"\nNumero de brevete:\t"+nbrevete;
    }
}
