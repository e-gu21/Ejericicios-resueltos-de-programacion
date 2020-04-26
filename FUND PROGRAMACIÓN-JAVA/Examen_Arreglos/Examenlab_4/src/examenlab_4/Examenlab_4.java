
package examenlab_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examenlab_4 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String [][] datosg;
    static int numero;
    public static void main(String[] args) throws IOException {
        
        char resp='s';
        do{
            resp=mostrarMenu();
            
        }while(resp=='s');
        
    } 
    
    static char mostrarMenu() throws IOException{                   
       
        int op;
        char resp='s';
        
        System.out.println("1. Ingrese datos de alumnos");
        System.out.println("2. Reportar datos");
        System.out.println("3. Consultar datos por alumno");
        System.out.println("4. Eliminar datos de alumno");
        System.out.println("5. Terminar");   
        
        System.out.println("\nINGRESE UNA OPCION:");
        op=Integer.parseInt(br.readLine());            
               
        switch(op){
            case 1: String[][] datos = leerDatos();
                    datosg = datos;
                    break;      
            case 2: reportarDatos(datosg);  
                    break;
            case 3: consultarDatos(datosg);  
                    break;        
            case 4: eliminarDatos(datosg);  
                    break;         
            case 5: resp = leerTerminar();            
                    break;
        }
        
        return resp;
            
    }  

    private static String[][] leerDatos() throws IOException {
        
        int n;        
        
        System.out.println("Ingrese la cantidad de alumnos");
        n = Integer.parseInt(br.readLine());
        
        numero = n;
        
        String [][] datos = new String[n][4];
        
        for(int i=0; i<n; i++) {
            System.out.println("Ingrese los datos del alumno "+(i+1));
            for(int j=0; j<4; j++) {
                if(j == 0) {
                    System.out.println("Ingrese nombre: ");
                    datos[i][j] = br.readLine();
                }else if(j == 1) {
                    System.out.println("Ingrese edad: ");
                    datos[i][j] = br.readLine();
                }else if(j == 2) {
                    System.out.println("Ingrese nota: ");
                    datos[i][j] = br.readLine();
                }else {
                    System.out.println("Ingrese sexo 'H' o 'M': ");
                    datos[i][j] = br.readLine();
                }
                
            }
        }
        
        return datos;
    }

    private static void reportarDatos(String[][] datos) {
        
        for(int i=0; i<numero; i++) {
            System.out.println("Los datos del alumno "+(i+1)+" son:");
            for(int j=0; j<4; j++) {
                if(j == 0) {
                    System.out.println("Nombre :"+datos[i][j]);                    
                }else if(j == 1) {
                    System.out.println("Edad :"+datos[i][j]);                    
                }else if(j == 2) {
                    System.out.println("Nota :"+datos[i][j]);                    
                }else {
                    System.out.println("Sexo :"+datos[i][j]);                    
                }
                
            }
            System.out.print("\n");
        }
        
    }

    private static char leerTerminar() throws IOException {
        System.out.println("Gracias por usar el sistema");
        return 'n';  
    }

    private static void consultarDatos(String[][] datosg) throws IOException {
        
        String nombre = "";
        int indice=999;
        
        System.out.println("Ingrese el nombre a buscar");
        nombre = br.readLine();
        
        for(int i=0; i<numero; i++) {
            if(datosg[i][0].equals(nombre)) {
                indice = i;
                break;
            }else {
                indice = 999;
            }
        }
        
        if(indice < 999) {
            
            System.out.println("Los datos del alumno "+(indice+1)+" son:");
            for(int j=0; j<4; j++) {
                if(j == 0) {
                    System.out.println("Nombre :"+datosg[indice][j]);                    
                }else if(j == 1) {
                    System.out.println("Edad :"+datosg[indice][j]);                    
                }else if(j == 2) {
                    System.out.println("Nota :"+datosg[indice][j]);                    
                }else {
                    System.out.println("Sexo :"+datosg[indice][j]);                    
                }
                
            }
            System.out.print("\n");
            
        }else {            
            System.out.println("El usuario no existe");          
        }      
        
        
    }

    private static void eliminarDatos(String[][] datosg) throws IOException {
        
        String nombre = "";
        int indice=999;
        
        System.out.println("Ingrese el nombre a eliminar");
        nombre = br.readLine();
        
        for(int i=0; i<numero; i++) {
            if(datosg[i][0].equals(nombre)) {
                indice = i;
                break;
            }else {
                indice = 999;
            }
        }
        
        if(indice < 999) {
            
            System.out.println("Se eliminó los datos del alumno "+(indice+1)+":");
            for(int j=0; j<4; j++) {
                if(j == 0) {
                    datosg[indice][j]="ELIMINADO";                  
                }else if(j == 1) {
                    datosg[indice][j]="ELIMINADO";                      
                }else if(j == 2) {
                    datosg[indice][j]="ELIMINADO";                     
                }else {
                    datosg[indice][j]="ELIMINADO";                      
                }
                
            }
            System.out.print("\n");
            
        }else {            
            System.out.println("El usuario no existe");        
        
        }      
    }
}
