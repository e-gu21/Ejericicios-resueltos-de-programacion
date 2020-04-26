package Agenda_1;
public class Contactos {
    private String Nombre,Telefono,Direccion;
    
    Contactos(String n, String tel, String dir){
        Nombre=n;
        Telefono=tel;
        Direccion=dir; 
    }

    public String getNombre(){
        return Nombre;
    }
    
    @Override
    public String toString(){
        return "\nNombre: "+Nombre+"\nTelefono: "+Telefono+"\nDireccion: "+Direccion;
    }
}
