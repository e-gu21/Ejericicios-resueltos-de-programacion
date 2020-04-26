package Semaforo1;
public class semaforo {
 
    // Variables de instancia
    private String color;
    
    
    //Constructor vacio
    public semaforo(){
        color="rojo";
    }
    
    //metodo de cambio de color
    public void modocolor(int s){
            
        if(color=="rojo" && s==1){
            color="verde";
            s++;
        }
        if(color=="verde" && s==1){
            color="amarillo";
            s++;
        }
        if(color=="amarillo" && s==1){
            color="rojo";
            s++;
        }
        
    }
    
    //reportar 
    public String toString(){
    
        return "semaforo = " +this.color;
    }
    
}
