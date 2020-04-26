package Semaforo1;

import java.io.*;

public class PruebaSemaforo {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        
        //Creacion de bobjeto vacio
        semaforo x;
        x= new semaforo();
        
        //cambio de colores
        int y;
        do{
            do{System.out.print("presione 1 para cambiar el color o 0 para terminar: ");
            y=Integer.parseInt(br.readLine());
            }while(y!=1 && y!=0);
            
            if(y==1){
                x.modocolor(y);
                System.out.println("color: "+x.toString());
            }
            else{
                System.out.print("Fin del programa");
            }
            
        }while(y==1);
    }
    
}
  
