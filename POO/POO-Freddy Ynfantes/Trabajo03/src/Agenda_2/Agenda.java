
package Agenda_2;

public class Agenda {
    
    private String dni,nombre;
    private Contacto contacto[];
    private int c=0;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Agenda(String d,String n){
        dni=d;
        nombre=n;
        contacto= new Contacto[100];
    }
    
    /// METODO DONDE SE AGREGAN LOS CONTACTOS ///
    
    public void agregarContacto(Contacto n){
        if(c<100){
            contacto[c]=n;
            c++;
        }
    }
    
    /// METODO PARA BUSCAR CONTACTO POR NOMBRE ///
    
    public String buscarContacto(String n){
        int p=-1;
        for(int i=0;i<c;i++)
        {
            if(n.equals(contacto[i].getNombre())){
                return contacto[i].toString();
            }
        }
        if(p==-1){
            return "No se encontraron datos";
        }
        return "";
    }
    
    /// METODO PARA MOSTRAR LA LISTA DE CONTACTOS ///
    
    public void listaContacto(){
        for(int i=0;i<c;i++){
            System.out.println(contacto[i].toString());
        }
    }
    
    /// METODO GET ///
    
    public String getNombre(){
        return nombre;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "\n***EMPLEADO(AGENDA)***\nDNI: "+dni+"\nNombre:"+nombre+"\n***LISTA DE CONTACTOS***\n";
    }
}
