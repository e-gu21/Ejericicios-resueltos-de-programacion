package videojuego;
import java.io.*;
public class PruebaVideojuego {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        Videojuego vj1, vj2;
        vj1=new Videojuego();
        vj2=new Videojuego("PES 2018",4);
        int opc;
        do{
          System.out.print("\nMenu de opciones");  
          System.out.print("\n1. modificar y muestrar los atributos del 1er Objeto que se creó vacío.");  
          System.out.print("\n2. modificar y muestrar las horas estimadas del 2do Objeto.");
          System.out.print("\n3. muestrar todos los atributos de cada Objeto en pantalla.");
          
          do{
              System.out.print("\n\nIngrese la opción: ");
              opc=Integer.parseInt(br.readLine());
          }while(opc<1||opc>3);
          
          if(opc==1){
              String t,g,c;
              int h;
              
              System.out.print("Ingrese Titulo: ");
              t=br.readLine();
              vj1.settitulo(t);
              
              do{
              System.out.print("Ingrese Horas estimadas: ");
              h=Integer.parseInt(br.readLine());
              }while(h<1);
              vj1.sethoras(h);
              
              System.out.print("Ingrese Genero: ");
              g=br.readLine();
              vj1.setgenero(g);
            
              System.out.print("Ingrese Compañia: ");
              c=br.readLine();
              vj1.setcompañia(c);
          }
         if(opc==2){
             int h;
             do{
              System.out.print("Ingrese Horas estimadas: ");
              h=Integer.parseInt(br.readLine());
              }while(h<1);
              vj2.sethoras(h);
              vj2.gethoras();
         }
         if(opc==3){
             System.out.print("\nVideojuego 1: "+vj1.toString());
             System.out.print("\nVideojuego 2: "+vj2.toString());
         }
        }while(opc!=3);
    }
    
}