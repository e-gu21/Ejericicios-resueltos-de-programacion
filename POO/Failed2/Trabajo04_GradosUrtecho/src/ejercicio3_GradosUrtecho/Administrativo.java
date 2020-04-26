package ejercicio3_GradosUrtecho;
public class Administrativo extends Trabajador {
    private String escuela, labor;
    private float sueldo;
    
    public Administrativo(String id,String n,String e,String l,float s ){
        super(id,n);
        escuela=e;
        labor=l;
        sueldo=s;
    }
     public String getEscuela(){
        return escuela;
    }
    public String getLabor(){
        return labor;
    }
    public float getSueldo(){
        return sueldo;
    }
    public void setEscuela(String x){
        escuela=x;
    }
    public void setLabor(String x){
        labor=x;
    }
    public void setSueldo(float x){
        sueldo=x;
    }
     public float calcularSueldoAdministrativos(){
        float des,tot;
        des=(sueldo*15)/100;
        tot=sueldo-des;
        return tot;
    }
    public String toString(){
        return super.toString()+"\nLabor: "+getLabor()+"\nEscuela: "+getEscuela()+"\nSueldo: "+
               getSueldo();
    } 
}
