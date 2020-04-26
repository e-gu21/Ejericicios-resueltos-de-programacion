package ejercicio1_GradosUrtecho;
public class Capital {
 //ATRIBUTOS DE INSTANCIA:   
    private String Codigo;
    private String NombreAl;
    private String NomCap;
    
 //CONSTRUCTOR CON PARÁMETROS:
    public Capital(String c, String na, String nc){
        Codigo=c;
        NombreAl=na;
        NomCap=nc;
    }
 //MÉTODOS SET:   
    public void setCapital(String c, String na, String nc){
        Codigo=c;
        NombreAl=na;
        NomCap=nc;
    }

 //REPORTAR:
    public String toString(){
        return "\nNombre: "+NomCap+"\nAlcalde: "+NombreAl+"\nCódigo postal: "+Codigo;
    }
}
