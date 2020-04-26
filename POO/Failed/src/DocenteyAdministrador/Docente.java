
package DocenteyAdministrador;

public class Docente extends Persona{
    
    private int edad;
    private String especialidad;
    
    public Docente(String i, String n, String t, int e, String es) {
        super(i, n, 5, t);
        edad=e;
        especialidad=es;
    }
    
    public int getEdad(){
        return edad;
    }
    
    public String toString(){
        return super.toString()+"\n * Edad: "+edad+"\t Especialidad: "+especialidad;
    }
}
