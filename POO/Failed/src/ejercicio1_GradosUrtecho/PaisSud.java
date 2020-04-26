package ejercicio1_GradosUrtecho;
public class PaisSud {
    private String Nombre;
    private String Moneda;
    private String Presidente;
    private String Idioma;
    private double Poblacion;
    private Capital cap;
    
  //CONSTRUCTOR:  
    PaisSud(String n, String m, String p, String i, double pc, Capital cap){
        Nombre=n;
        Moneda=m;
        Presidente=p;
        Idioma=i;
        Poblacion=pc;
        this.cap=cap;
    }
    
  //RETORNAR:  
    public String toString(){
        return "\nPaís: "+Nombre+"\nMoneda: "+Moneda+"\nIdioma: "+Idioma+
               "\nPresidente: "+Presidente+"\nPoblación: "+Poblacion+"\nCapital: "+cap.toString() ;
    }
}
