
package futbol;

import java.io.*;
public class Prueba {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
        String n,p,t,e,nom;
        int i,j=15,d;
        Jugador jugador[]=new Jugador[j];
        //CREACIÓN DE OBJETOS jugadores:
        
         for(i=1;i<=j;i++){
             System.out.println("Nombre jugador"+i+": ");
             n=br.readLine();
             do{System.out.println("Dorsal"+i+": ");
               d=Integer.parseInt(br.readLine());
             }while(d<=0);
             System.out.println("Posición"+i+": ");
             p=br.readLine();
             System.out.println("Tipo"+i+": ");
             t=br.readLine();
             System.out.println("Equipo"+i+": ");
             e=br.readLine();
             jugador[i-1]=new Jugador(n,d,p,t,e);
         }
        System.out.println("\nPaís del equipo: ");
        nom=br.readLine();
    
        Equipo eq;
        eq=new Equipo(nom); 
        
        //Jugadores seleccionados:
        eq.totaljugadores(jugador[i-1]);
        System.out.println("\nEQUIPO Y JUGADORES: ");
        System.out.print(eq.toString());
        
        System.out.println("\nBUSCAR JUGADOR, ingrese nombre: ");
        nom=br.readLine();
        System.out.print(eq.buscar(nom)+"\n");
        
        System.out.println("\nJUGADORES TITULARES: ");
        System.out.print(eq.listaTitulares());
    
        System.out.println("\nJUGADORES SUPLENTES: ");
        System.out.print(eq.listaSuplentes());
    }
    
}
