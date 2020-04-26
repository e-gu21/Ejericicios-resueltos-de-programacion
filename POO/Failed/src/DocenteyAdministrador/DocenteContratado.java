
package DocenteyAdministrador;

public class DocenteContratado extends Docente{
    
    private int nHoras;
    private float pagoHora;
    private float pagoExtra;
    
    public DocenteContratado(String i, String n, int e, String es, int nh, float ph, float pe) {
        super(i, n, "Docente Contratado", e, es);
        nHoras=nh;
        pagoHora=ph;
        pagoExtra=pe;
    }
    
    public float getSueldo(){
        float s;
        s=pagoExtra+(nHoras*pagoHora)-(nHoras*pagoHora)*getDescuento()/100;
        return s;
    }
    
    public String toString(){
        return super.toString()+"\t Horas por Semana: "+nHoras+"\t Pago por Hora: "+pagoHora+"\t Pago Extra: "+pagoExtra+"\t Sueldo(Total): "+getSueldo();
    }
}
