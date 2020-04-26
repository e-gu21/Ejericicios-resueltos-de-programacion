package Semaforo2;

import java.io.*;

public class PruebaSemaforo {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader (System.in));
        
        Semaforo s=new Semaforo();
        
        char res;
       
        s.setColor("Rojo");
    
        do{
            
          if(s.getColor().compareTo("Rojo")==0){
             System.out.println("El color del semáforo es "+s.getColor());
             s.setColor("Verde");
          }
          else{
          
          if(s.getColor().compareTo("Verde")==0){
             System.out.println("El color del semáforo es "+s.getColor());
             s.setColor("Amarillo");
          }
          
          else{
          if(s.getColor().compareTo("Amarillo")==0){
             System.out.println("El color del semáforo es "+s.getColor());
             s.setColor("Rojo");
          }
          }
          }
          do{
              System.out.println("¿Cambio de color?");
              res=br.readLine().toUpperCase().charAt(0);
          }while(res!='S'&&res!='N');
          
        }while(res=='S');
    
    }       
}


