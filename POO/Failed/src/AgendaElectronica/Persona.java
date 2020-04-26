
package AgendaElectronica;

public abstract class Persona {
    
    private String dni;
    private String nombres;
    private String telefono;
    private String tipo;
    
    public Persona(String d,String n, String t,String tipo){
        dni=d;
        nombres=n;
        telefono=t;
        this.tipo=tipo;
    }
    
    public String getDNI(){
        return dni;
    }
    
    public String getNombre(){
        return nombres;
    }
    
    public void setTelefono(String n){
        telefono=n;
    }
    
    public String toString(){
        return "Tipo de Contacto: "+tipo+"\t DNI: "+dni+"\t Nombres: "+nombres+"\t Telefono: "+telefono;
    }
}
