
package DocenteyAdministrador;

public class DocenteNombrado extends Docente {
    
    private float sueldo;
    private String comision;
    
    public DocenteNombrado(String i, String n, int e, String es, float s, String c) {
        super(i, n, "Docente Nombrado", e, es);
        sueldo=s;
        comision=c;
    }
    
    public float getSueldo(){
        float s;
        s=sueldo-sueldo*getDescuento()/100;
        return s;
    }
    
    public String toString(){
        return super.toString()+"\t Sueldo: "+sueldo+"\t Comision: "+comision+"\t Sueldo(Total): "+getSueldo();
    }
}
