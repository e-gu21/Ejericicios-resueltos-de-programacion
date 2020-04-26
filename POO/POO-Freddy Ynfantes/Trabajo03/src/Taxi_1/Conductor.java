package Taxi_1;
public class Conductor {
    private String Nombre, DNI, NumBrevete;
    
    Conductor(String dni, String nom, String nb){
        Nombre=nom;
        DNI=dni;
        NumBrevete=nb;
    }

    @Override
    public String toString(){
        return "\n\tNombre: "+Nombre+"\n\tDNI: "+DNI+"\n\tNumero de Brevete: "+NumBrevete;
    }
}
