
package AgendaElectronica;

public class Familia extends Persona {
    
    private String parentesco;
    
    public Familia(String d, String n, String t,String p) {
        super(d, n, t,"Familia");
        parentesco=p;
    }
    
    public String toString(){
        return super.toString()+"\t Parentesco: "+parentesco;
    }
}
