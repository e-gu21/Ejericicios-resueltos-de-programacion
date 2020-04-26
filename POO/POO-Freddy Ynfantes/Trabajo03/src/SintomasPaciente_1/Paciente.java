
package SintomasPaciente_1;

public class Paciente {
    
    private long dni;
    private String nombre;
    private Sintomas sintoma[];
    private int c=0;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Paciente(long d,String n){
        dni=d;
        nombre=n;
        sintoma=new Sintomas[100];
    }
    
    /// METODO PARA AGREGAR LOS SINTOMAS ///
    
    public void agregarSintoma(Sintomas n){
        if(c<100){
            sintoma[c]=n;
            c++;
        }
    }
    
    /// METODO GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    /// METODO PARA MOSTRAT LA LISTA DE TODOS LOS SINTOMAS ///
    
    public void listaSintomas(){
        for(int i=0;i<c;i++){
            System.out.println(sintoma[i].toString());
        }
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "\n***PACIENTE***\nDNI:\t"+dni+"\nNombre:\t"+nombre+"\n***SINTOMAS***";
    }
}
