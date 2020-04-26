package ejercicio2_GradosUretcho;
public class ContactoEstudio extends Persona{
    private String lugarTrabajo,direccion;

    public ContactoEstudio(String n,String dni,int t,String lg, String d) {
        super(n,dni,t);
        lugarTrabajo = lg;
        direccion = d;
    }

    public String getLugarTrabajo() {
        return lugarTrabajo;
    }

    public void setLugarTrabajo(String x) {
        lugarTrabajo = x;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String x) {
        direccion = x;
    }

    @Override
    public String toString() {
        return "Contacto Estudio: " +super.toString()+ "\n\tLugar de trabajo=" + lugarTrabajo + "\n\tDireccion=" + direccion;
    }
    
    
}
