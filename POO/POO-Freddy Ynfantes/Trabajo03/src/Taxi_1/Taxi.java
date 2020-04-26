package Taxi_1;
public class Taxi {
    private String Placa, Marca, Modelo;
    private Conductor conductor;
    Taxi(String p,String m,String mod, Conductor conductor){
        Placa=p;
        Marca=m;
        Modelo=mod;
        this.conductor=conductor;
    }
    public void setConductor(Conductor conductor)  {
        this.conductor=conductor;
    }
    public String toString(){
        return "\nPlaca: "+Placa+"\nMarca: "+Marca+"\nModelo: "+Modelo+"\nChofer: "+conductor.toString();
    }
}
