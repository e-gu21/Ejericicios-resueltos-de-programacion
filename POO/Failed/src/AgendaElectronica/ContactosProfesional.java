
package AgendaElectronica;

public class ContactosProfesional extends Persona {
    
    private String profesion;
    
    public ContactosProfesional(String d, String n, String t,String p) {
        super(d, n, t,"Contacto Profesional");
        profesion=p;
    }
    
    public String toString(){
        return super.toString()+"\t Profesion: "+profesion;
    }
}
