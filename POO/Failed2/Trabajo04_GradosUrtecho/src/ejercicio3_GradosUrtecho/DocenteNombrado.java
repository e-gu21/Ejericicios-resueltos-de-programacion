package ejercicio3_GradosUrtecho;
public class DocenteNombrado extends Docente{
    private float sueldo;
    private String comision;
    
    public DocenteNombrado(String id, String nom, int ed, String es,float suel,String com) {
        super(id, nom, ed, es);
        sueldo=suel;
        comision=com;
    }
    public float getSueldo(){
       return sueldo;
    }
    public String getComision(){
        return comision;
    }
    public void setSueldo(float x){
        sueldo=x;
    }
    public void setComision(String x){
        comision=x;
    }
    public float calcularSueldoNombrado(){
        float des,tot;
        des=(sueldo*18)/100;
        tot=sueldo-des;
        return tot;
    }
        public String toString(){
        return super.toString()+"\nSueldo: "+sueldo+"\nComision: "+comision;
    }
}
