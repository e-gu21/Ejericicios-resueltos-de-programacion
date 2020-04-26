
package DocenteyAdministrador;

public class Administrativo extends Persona {
    
    private String escuela;
    private String labor;
    private float sueldo;
    
    public Administrativo(String i, String n, String e, String l, float s) {
        super(i, n, 11, "Administrativo");
        escuela=e;
        labor=l;
        sueldo=s;
    }
    
    public float getSueldo(){
        float s;
        s=sueldo-sueldo*getDescuento()/100;
        return s;
    }
    
    public String toString(){
        return super.toString()+"\n * Escuela Asignada: "+escuela+"\t Labor: "+labor+"\t Sueldo(Total): "+getSueldo();
    }
}
