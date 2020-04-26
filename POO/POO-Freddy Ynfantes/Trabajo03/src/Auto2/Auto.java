package Auto2;

public class Auto {

    private String placa;
    private String color;
    private String marca;
    private String modelo;
    private int npuertas;
    private String estado;
    
    
    public Auto(){
       placa=null;
       color=null;
       marca=null;
       modelo=null;
       npuertas=0;
       estado=null; 
    }
    
    public Auto(String p,String c,String ma,String mo,int  np){
        placa=p;
        color=c;
        marca=ma;
        modelo=mo;
        npuertas=np;
        estado="Encendido";    
    }
    
    public String Reporte(){
        return "\n\tPlaca: "+placa+"\n\tColor: "+color+"\n\tMarca: "+marca+"\n\tModelo: "+modelo+"\n\tNumero de puertas: "+npuertas;
    }
    
    public void setAuto(String p,String c,String ma,String mo,int  np){
        placa=p;
        color=c;
        marca=ma;
        modelo=mo;
        npuertas=np;
    }
    
    public void setEstado(String e){
        
        estado=e;
    }
    
    public String getEstado(){
        
        return estado;
    }
   

        }