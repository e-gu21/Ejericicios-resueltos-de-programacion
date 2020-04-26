package DoncenteSueldo;

public class Docente {
    
    private String codigo;
    private String nombre;
    private double sueldo;
    private int nrh;
    
    public Docente(){
        codigo=null;
        nombre=null;
        sueldo=0;
        nrh=0;
    }
    public Docente(String c,String nom,double s,int nh){
        codigo=c;
        nombre=nom;
        sueldo=s;
        nrh=nh;
    }
    
    public void modificar(String c,String nom,double s,int nh){
        codigo=c;
        nombre=nom;
        sueldo=s;
        nrh=nh;
    }

    public void sueldobruto(){

       int j=100,d=150;
       double su,x;
       su=sueldo*0.14;
       x=su*12+(j+d);
       sueldo=x;
    }

    public String toString(){
        return "\n\tCodigo:" +codigo+ "\n\tNombre:" +nombre+ "\n\tSueldo Bruto:" +sueldo+ "\n\tN° de horas:" +nrh;
    }
}
