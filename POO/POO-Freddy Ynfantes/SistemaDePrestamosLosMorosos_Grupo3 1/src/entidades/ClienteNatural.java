
package entidades;

public class ClienteNatural extends Cliente{
    
    private String labor;
    
    public ClienteNatural(String codigo, String nombre, String telefono, String direccion, String correo, String labor) {
        super(codigo, nombre, telefono, direccion, correo);
        this.labor=labor;
    }

    public String getLabor() {
        return labor;
    }

    public void setLabor(String labor) {
        this.labor = labor;
    }
    
    @Override
    public String toString(){
        return "DNI: "+super.toString()+"\tLabor: "+labor;
    }
}
