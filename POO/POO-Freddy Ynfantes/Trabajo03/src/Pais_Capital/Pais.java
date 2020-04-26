
package Pais_Capital;

public class Pais {
    
    private String nombre,moneda,presidente,idioma;
    private long poblacion;
    private Capital cap;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Pais(String n,String m,String i,String pr,long po,Capital c){
        nombre=n;
        moneda=m;
        presidente=pr;
        idioma=i;
        poblacion=po;
        cap=c;
    }
    
    /// METODOS SET Y GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    public void setCapital(Capital n){
        cap=n;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "***PAIS***\nNombre:\t"+nombre+"\nMoneda:\t"+moneda+"\nIdioma:\t"+idioma+"\nPresidente:\t"+presidente+"\nPoblacion:\t"+poblacion+"\n***CAPITAL***\n"+cap;
    }
}
