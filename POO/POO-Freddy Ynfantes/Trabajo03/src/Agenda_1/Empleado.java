package Agenda_1;
public class Empleado {
    private String Nombre,DNI;
    private Agenda agenda;
    
    Empleado(String n,String dni){
        Nombre=n;
        DNI=dni;
    }
    
    
    public String toString(){
        return "\nEl nombre: "+Nombre+"\nEl dni: "+DNI;
    }
}
