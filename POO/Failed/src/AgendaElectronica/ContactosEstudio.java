
package AgendaElectronica;

public class ContactosEstudio extends Persona{
    
    private String lugarTrabajo;
    private String direccion;
    
    public ContactosEstudio(String d, String n, String t, String l, String di) {
        super(d, n, t,"Contacto de Estudio");
        lugarTrabajo=l;
        direccion=di;
    }
    
    public void setDireccion(String di){
        direccion=di;
    }
    
    public String toString(){
        return super.toString()+"\t Lugar de Trabajo: "+lugarTrabajo+"\t Direccion: "+direccion;
    }
}
