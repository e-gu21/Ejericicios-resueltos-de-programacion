package futbol;
public class Jugador {
    private String nombre,posicion, tipo, equipo;
    private int dorsal;
    public Jugador(String n, int d, String p, String t, String e){
        nombre=n;
        dorsal=d;
        posicion=p;
        tipo=t;
        equipo=e;
    }
    public String getNombre()   {
        return nombre;
    }
    public String getTipo()   {
        return tipo;
    }
    @Override
    public String toString(){
        return "\nNombre: "+nombre+"\nDorsal: "+dorsal+"\nposicion: "+posicion+"\nTipo: "+tipo+"\nEquipo: "+equipo;
    }
}
