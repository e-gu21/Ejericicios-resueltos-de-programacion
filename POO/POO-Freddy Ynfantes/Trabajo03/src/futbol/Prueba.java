
package futbol;

import java.io.*;
public class Prueba {

    static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args)throws IOException {
        
        /// IMPLEMENTACION DE ARREGLO ///
        
        int n=3; /// Variable que define numero de equipos, puede ser reducido para acortar proceso.
        
        Equipo e[]=new Equipo[3];
        
        /// VARIABLES A USAR ///
        
        String s1,s2,s3,a;
        int m;
        
        /// CREACION DE EQUIPOS ///
        
        /*for( int i=1;i<=n;i++){
            System.out.println("Ingrese Nombre de Equipo e"+i+": ");
            a=br.readLine();
            
            e[i-1]= new Equipo(a);
            //System.out.println("Jugadores del "+a);
        }*/
        
        /// CREACION DE JUGADORES (15 por Equipo) ///
        System.out.println("INGRESAR EQUIPO (3) Y SUS 15 JUGADORES");
        for(int i=1;i<=n;i++){
            System.out.print("Ingrese Nombre de Equipo: ");
            a=br.readLine();  
            e[i-1]= new Equipo(a);
            System.out.println("JUGADORES DEL "+a);
            for(int j=1;j<=15;j++){
                //System.out.println("Jugadores del "+a);
                System.out.println("\n");
                System.out.print("Ingrese Nombre del "+j+ "° jugador: ");
                s1=br.readLine();              
                do{System.out.print("Ingrese Dorsal del "+j+"° jugador: ");
                m=Integer.parseInt(br.readLine());}while(m<0||m>999);
                
                System.out.print("Ingrese Posicion del "+j+"° Jugador: ");
                s2=br.readLine();
                
                System.out.print("Ingrese Tipo del del "+j+"° Jugador: ");
                s3=br.readLine();
                
                e[i-1].agregarJugador(new Jugador(s1,m,s2,s3,e[i-1]));
            }
            System.out.println("\n");
        }
        
        /// BUSCAR JUGADOR POR NOMBRE ///
        
        System.out.println("Equipo donde desea buscar: ");
        for(int i=1;i<=n;i++){
        System.out.println(i+". "+e[i-1].getEquipo());
        }
        do{
        m=Integer.parseInt(br.readLine());
        }while(m<0||m>n);
        
        System.out.println("Ingrese nombre a buscar: ");
        s1=br.readLine();
        
        System.out.println(e[m-1].buscarJugador(s1));
        
        /// REPORTE POR TOSTRING Y METODO LISTAJUGADOR() ///
        
        for(int i=0;i<n;i++){
        System.out.println(e[i].toString());
        e[i].listaJugador();
        }
    }
    
}
