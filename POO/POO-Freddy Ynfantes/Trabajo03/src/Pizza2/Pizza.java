package Pizza2;
public class Pizza {
    
    private String tamaño;
    private String tipo;
    private int cantidad;
    private String estado;
    private  int np;
    
    public Pizza(String t, String ti, int ca){
        tamaño=t;
        tipo=ti;
        cantidad=ca;
        estado="Pedido";
        np=0;
        
    }
    public String Reporte(){
       return "\n\tTamaño: "+tamaño+"\n\tTipo: "+tipo+"\n\tCantidad: "+cantidad+"\n\tEstado:"+estado; 
    }
    
    public void setPizza(String piz){
        
       estado=piz;
       np++;
       
    }
    public String getPizza(){
      return estado + "\n\tN° de veces pedidos/servidos:"+ np;
    }
    
    
    
}
