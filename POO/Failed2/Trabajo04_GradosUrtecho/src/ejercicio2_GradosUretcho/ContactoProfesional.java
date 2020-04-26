package ejercicio2_GradosUretcho;
public class ContactoProfesional extends Persona {
    private String profesion;

    public ContactoProfesional(String n,String dni,int t,String p) {
        super(n,dni,t);
        profesion = p;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String x) {
        profesion = x;
    }

    @Override
    public String toString() {
        return "Contacto Profesional: "+super.toString() + "\n\tProfesion: " + profesion;
    }
}
