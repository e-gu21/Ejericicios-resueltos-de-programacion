package pruebas;

public class Abogado extends Persona implements Interfaces{
    
    String nombre = "chafloque";
    
    Abogado(){
        super();
    }
    
    
    public String getNombre(){
        return this.nombre;
    }
    
    @Override
    public void correr() {
        System.out.println("Estoy corriendo");
    }
    
    
}
