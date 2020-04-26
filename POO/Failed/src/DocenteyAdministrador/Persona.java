
package DocenteyAdministrador;

public abstract class Persona {
    private String id;
    private String nombres;
    private float descuento;
    private String tipo;
    
    public Persona(String i,String n,float d ,String t){
        id=i;
        nombres=n;
        descuento=d;
        tipo=t;
    }
    
    public String getID(){
        return id;
    }
    
    public float getDescuento(){
        return descuento;
    }
    
    public String toString(){
        return "Tipo de Trabajador: "+tipo+"\t ID: "+id+"\t Nombres: "+nombres+"\t Descuento: "+descuento;
    }
}
