package Contador;
public class Contador {
    
    private int cant;
    public Contador(int c){
        if(c>0){
            cant=c;
        }else{
            cant=0;
        }
    }
    public int getContador(){
        return cant;
    }
    public void incrementar(){
        cant++;
    }
    public void decrementar(){
        cant--;
        if(cant<0){
            cant=0;
        }
    }
    
}
