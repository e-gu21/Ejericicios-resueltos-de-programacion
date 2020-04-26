package ejercicio3_GradosUrtecho;
public class Docente extends Trabajador {
    protected String especialidad;
    protected int edad;
    protected Docente director;
    
    public Docente(String id, String nom,int ed,String es) {
        super(id, nom);
        edad=ed;
        especialidad=es;
    }
    public String getEspecialidad(){
    return especialidad;
    }
    public int getEdad(){
        return edad;
    }
    public void setEspecialidad(String x){
        especialidad=x;
    }
    public void setEdad(int x){
        edad=x;
    }
    public void convertirDirector(Docente x){
    director=x;
    }
    public Docente mostrarDirector(){
        return director;
    }
    public String toString(){
    return super.toString()+"\nEspecialidad: "+especialidad+"\nEdad: "+edad;
    }
}
