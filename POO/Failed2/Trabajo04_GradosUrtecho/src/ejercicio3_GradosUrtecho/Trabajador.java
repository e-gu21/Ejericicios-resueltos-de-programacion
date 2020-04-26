package ejercicio3_GradosUrtecho;
public abstract class Trabajador {
    protected String id, nombre;
    
    Trabajador(String id,String nom){
        this.id=id;
        nombre=nom;
    }
    public String getID(){
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public boolean setID(String x){
        id=x;
        return true;
    }
    public boolean setNombre(String x){
        nombre=x;
        return true;
    }
    
    public String toString(){
       return "\nID: "+id+"\nNombre: "+nombre;
    }
}
