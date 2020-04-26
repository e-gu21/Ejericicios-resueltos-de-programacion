package pruebas;

/**
 *
 * @author LENOVO
 */
public class Persona {
    protected String nombre;
    protected String dni;
    
    public Persona(){
        nombre = "Pedro";
        dni="46891110";
    }    
          
    public String getNombre(){
        return nombre;
    }
    
    public String getDni(){
        return dni;
    }
    
    public final void sobreescrito () {
        System.out.println("sobreescrito");
    }
    
    public void setNombre(String n){
        this.nombre = n;
    }
    
    public void setDni(String n){
        this.dni = n;
    }
}
