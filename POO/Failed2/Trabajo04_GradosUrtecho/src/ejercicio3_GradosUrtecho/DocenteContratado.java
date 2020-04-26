package ejercicio3_GradosUrtecho;
public class DocenteContratado extends Docente {
    private int numHorasxSemana;
    private float pagoxHora,pagoExtra;
    
    public DocenteContratado(String id, String nom, int ed, String es,int hxs,float pah,float pae) {
        super(id, nom, ed, es);
        numHorasxSemana=hxs;
        pagoxHora=pah;
        pagoExtra=pae;
    }
     public int getnumHorasxSemana(){
        return numHorasxSemana;
    }
    public float getPagoxHora(){
        return pagoxHora;
    }
    public float getPagoExtra(){
        return pagoExtra;
    }
    public void setnumHorasxSemana(int x){
        numHorasxSemana=x;
    } 
    public void setPagoxHora(float x){
        pagoxHora=x;
    }
    public void setPagoExtra(float x){
        pagoExtra=x;
    }
        public float calcularSueldoContratado(){
        float p,pm,des,tot;
        p=pagoxHora*numHorasxSemana;
        pm=p*4;
        des=(pm*18)/100;
        tot=p-des;
        return tot;
    }
    public String toString(){
        return super.toString()+"\nHoras por semana: "+numHorasxSemana+"\nPago por Hora: "+pagoxHora+
                "\nPago Extra: "+pagoExtra;
    }    
}
