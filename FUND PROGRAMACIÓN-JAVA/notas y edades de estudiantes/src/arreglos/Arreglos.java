package arreglos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Arreglos {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        int [][] datos;        
        int n;
        int contador=1;
        
        do{
            System.out.print("Ingrese la cantidad de alumnos: ");            
            n=Integer.parseInt(br.readLine());
        }while(n<=0);
        
        datos = new int[n][2];
        
        do{
            
            System.out.print("Ingrese la edad del "+contador+"° alumno: ");
            datos[contador-1][0]=Integer.parseInt(br.readLine());
            System.out.print("Ingrese la nota del "+contador+"° alumno: ");
            datos[contador-1][1]=Integer.parseInt(br.readLine());
            contador++;
        }while(contador<=n);
                
        reportarTodos(datos);
        mayorEdades(datos);
        aprobados(datos);
        aprobadosMayores(datos);
        aprobadosMenores(datos);
    }   
    
    static void reportarTodos(int [][] datos){
        System.out.println("Reporte de todos los datos:");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++ ){
            System.out.print("\t"+datos[i][0]);
            System.out.print("\t"+datos[i][1]+"\n");
        }
    }
    
    static void mayorEdades(int [][] datos){
        int cantidad=0;
        int suma=0;
        System.out.println("Reporte de los mayores de edad:");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++){
            if(datos[i][0]>=18){
                System.out.print("\t"+datos[i][0]);
                System.out.print("\t"+datos[i][1]+"\n");
                cantidad++; 
                suma=suma+datos[i][1];
            }
        }        
        System.out.println("La cantidad de mayores de edad es: "+cantidad);
        System.out.println("La suma de sus notas es: "+suma);
    }
    
    static void aprobados(int [][] datos){    
        int cantidad=0;
        int suma=0;
        System.out.println("Reporte de los aprobados: ");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++){
            if(datos[i][1]>=11){
                System.out.print("\t"+datos[i][0]);
                System.out.print("\t"+datos[i][1]+"\n");                
                suma=suma+datos[i][0];
                cantidad++;
            }
        }        
        System.out.println("La cantidad de aprobados es: "+cantidad);
        System.out.println("La suma de sus edades es: "+suma);
    }
    
    static void aprobadosMayores(int [][] datos){
        System.out.println("Reporte de los aprobados mayores de edad: ");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++){
            if(datos[i][1]>=11 && datos[i][0]>=18){
                System.out.print("\t"+datos[i][0]);
                System.out.print("\t"+datos[i][1]+"\n");                
                
            }
        }        
    }
    
    static void aprobadosMenores(int [][] datos){
        System.out.println("Reporte de los aprobados menores de edad: ");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++){
            if(datos[i][1]>=11 && datos[i][0]<18){
                System.out.print("\t"+datos[i][0]);
                System.out.print("\t"+datos[i][1]+"\n");                      
            }
        }    
    }
    
    static void desaprobadosMenores(int [][] datos){
        System.out.println("Reporte de los desaprobados menores de edad: ");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++){
            if(datos[i][1]<11 && datos[i][0]<18){
                System.out.print("\t"+datos[i][0]);
                System.out.print("\t"+datos[i][1]+"\n");                      
            }
        }  
    }
    
    static void desaprobadosMayores(int [][] datos){
        System.out.println("Reporte de los desaprobados mayores de edad: ");
        System.out.print("\tEdad");
        System.out.print("\tNota\n");
        for(int i=0; i<datos.length; i++){
            if(datos[i][1]<11 && datos[i][0]>=18){
                System.out.print("\t"+datos[i][0]);
                System.out.print("\t"+datos[i][1]+"\n");                      
            }
        }  
    }
    
}
