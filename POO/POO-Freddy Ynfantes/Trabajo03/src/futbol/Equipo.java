
package futbol;

public class Equipo {
    
    private String nombre;
    private Jugador jugador[];
    private int c=0;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Equipo(String n){
        nombre=n;
        jugador= new Jugador[15];
    }
    
    /// METODO PARA AGREGAR JUGADORES ///
    
    public void agregarJugador(Jugador n){
        if(c<15){
            jugador[c]=n;
            c++;
        }
    }
    
    /// METODO PARA BUSCAR AL JUGADOR POR NOMBRE ///
    
    public String buscarJugador(String n){
        int p=-1;
        for(int i=0;i<c;i++)
        {
            if(n.equals(jugador[i].getNombre())){
                return jugador[i].toString();
            }
        }
        if(p==-1){
            return "No se encontraron datos";
        }
        return "";
    }
    
    /// METODO PARA REPORTAR LA LISTA DE LOS JUGADORES ///
    
    public void listaJugador(){
        for(int i=0;i<c;i++){
            System.out.println(jugador[i].toString());
        }
    }
    
    /// METODO GET ///
    
    public String getEquipo(){
        return nombre;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "\n***Equipo***\nNombre:\t"+nombre+"\n***LISTA DE JUGADORES***";
    }
}
