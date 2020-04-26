
package futbol;

public class Jugador {
    
    private String nombre,posicion,tipo;
    private int dorsal;
    private Equipo equipo;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Jugador(String n,int d,String p,String t,Equipo e){
        nombre=n;
        dorsal=d;
        posicion=p;
        tipo=t;
        equipo=e;
    }
    
    /// METODO GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "*Nombre:\t"+nombre+"\t*Dorsal:\t"+dorsal+"\t*Posicion:\t"+posicion+"\t*Tipo:\t"+tipo+"\t*Equipo:\t"+equipo.getEquipo();
    }
}
