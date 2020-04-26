
package entidades;

public class ClienteJuridico extends Cliente {
    
    private String personaDeContacto;

    public ClienteJuridico(String codigo, String nombre, String telefono, String direccion, String correo, String personaDeContacto) {
        super(codigo, nombre, telefono, direccion, correo);
        this.personaDeContacto=personaDeContacto;
    }

    public String getPersonaDeContacto() {
        return personaDeContacto;
    }

    public void setPersonaDeContacto(String personaDeContacto) {
        this.personaDeContacto = personaDeContacto;
    }
    
    @Override
    public String toString(){
        return "RUC: "+super.toString()+"\tPersona de Contacto: "+personaDeContacto;
    }
}
