
package SintomasPaciente_1;

public class Sintomas {
    
    private String descripcion,tipo;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Sintomas(String d,String t){
        descripcion=d;
        tipo=t;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "*Descripcion:\t"+descripcion+"\t*Tipo:\t"+tipo;
    }
}
