package ejercicio2_GradosUretcho;
public abstract class Persona  {
    private String DNI,nombre;
    private int telefono;
    
    public Persona(String n,String dni,int t){
        
        nombre=n;
        DNI=dni;
        telefono=t;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String x) {
        DNI = x;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String x) {
        nombre = x;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int x) {
        telefono = x;
    }

    @Override
    public String toString() {
        return "\nContacto: " +  "\n\tnombre=" + nombre +"\n\tDNI=" + DNI + "\n\ttelefono=" + telefono ;
    }
    
}
