package SintomasPaciente_2;
public class sintomas {
    private String descripcion,tipo;
    
    sintomas(String d,String t){
        descripcion=d;
        tipo=t;
    }
    public String toString(){
        return "\nDescripción: "+descripcion+"\ntipo: "+tipo;
    }
}
