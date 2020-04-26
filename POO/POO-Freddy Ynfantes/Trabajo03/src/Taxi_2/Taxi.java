
package Taxi_2;

public class Taxi {
    
    private String placa,marca,modelo;
    private Chofer chofer;
    
    /// CONSTRUCTOR CON PARAMETROS ///
    
    Taxi(String p,String ma,String mo,Chofer c){
        placa=p;
        marca=ma;
        modelo=mo;
        chofer=c;
    }
    
    /// METODOS GET Y SET ///
    
    public String getPlaca(){
        return placa;
    }
    
    public void setChofer(Chofer c){
        chofer=c;
    }
    
    /// METODO TOSTRING ///
    
    public String toString(){
        return "***TAXI***\nPlaca:\t"+placa+"\nMarca:\t"+marca+"\nModelo:\t"+modelo+"\n***CHOFER***\n"+chofer;
    }
}
