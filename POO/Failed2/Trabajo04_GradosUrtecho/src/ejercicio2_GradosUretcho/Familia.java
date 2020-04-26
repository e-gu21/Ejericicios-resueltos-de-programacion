package ejercicio2_GradosUretcho;
public class Familia extends Persona{
    private String parentesco;

    public Familia(String n,String dni,int t,String p) {
        super(n,dni,t);
        parentesco = p;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String x) {
        parentesco = x;
    }

    @Override
    public String toString() {
        return "Familia: "+super.toString() + "\n\tparentesco: " + parentesco;
    }
    
    
}
