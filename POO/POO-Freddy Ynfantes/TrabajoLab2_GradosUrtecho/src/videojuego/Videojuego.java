package videojuego;
public class Videojuego {
//Atributos
    private String titulo, genero, compañia;
    private int horas;
    private boolean entregado;
//Constructor vacío:    
    public Videojuego(){
    titulo=null;
    horas=10;
    entregado=false;
    genero=null;
    compañia=null;
    }
//Constructor 2:
    public Videojuego(String t, int h){
     titulo=t;
     horas=h;
    }    
//Constructor 3:
    public Videojuego(String t, int h, String g, String c){
    titulo=t;
    horas=h;
    genero=g;
    compañia=c;
    }
//Mostrar valores, excepto el método entregado:    
    public String gettitulo(){
        return titulo;
    }
    public int gethoras(){
        return horas;
    }
    public String getgenero(){
        return genero;
    }
    public String getcompañia(){
        return compañia;
    }
//Modificar valores, excepto el atributo entregado:
    public void settitulo(String x){
        titulo=x;
    }
    public void sethoras(int x){
        horas=x;
    }
    public void setgenero(String x){
        genero=x;
    }
    public void setcompañia(String x){
        compañia=x;
    }
//Método toString para reportar:    
    public String toString(){
        return "\nTítulo: "+titulo+"\nHoras estimadas: "+horas+"\nEntregado: "+entregado+"\nGénero: "+genero+"\nCompañía: "+compañia;
    }         
}
