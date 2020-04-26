package examen3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Examen3 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException{
        char resp='s';
        do{
            resp=mostrarMenu();
            
        }while(resp=='s');
        
    }        
    
    static char mostrarMenu() throws IOException{
                   
        int n;   
        char resp='s';      
        
        System.out.println("1. Hallar los divisores de un numero");
        System.out.println("2. Determinar MCD de los numeros");
        System.out.println("3. Determinar si es capicua o no");
        System.out.println("4. Determinar si es primo o no");
        System.out.println("5. Terminar");   
        
        System.out.println("\nINGRESE UNA OPCION:");
        n=Integer.parseInt(br.readLine());            
               
        switch(n){
            case 1: divisores();                   
                    break;
            case 2: mcd();
                     break;
            case 3: capicua();
                    break;
            case 4: primo();
                    break;           
            default:resp = terminar();  
                    break;
        }
        
        return resp;
            
    }  
    
    static void primo() throws IOException{
        int n;
        int contador=0;
        
        System.out.println("Ingrese numero");
        n=Integer.parseInt(br.readLine());
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                contador++;
            }
        }
        
        if(contador<=2){
            System.out.println("\nEl numero es primo");
        }else {
            System.out.println("\nEl numero no es primo");
        }
    }
    
    static void divisores() throws IOException{
        int n;
        
        System.out.println("Ingrese numero");
        n=Integer.parseInt(br.readLine());
        
        System.out.println("\nLos divisores son ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print("\t"+i);
            }
        }
        System.out.print("\n");
    }
   
    static void mcd() throws IOException{       
        int[] numeros=new int[2];
        System.out.println("Ingrese el primer numero");
        numeros[0] = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el segundo numero");
        numeros[1] = Integer.parseInt(br.readLine());
         
        int aux=0;
        for(int i=numeros[1];i>0;i--){
            if(numeros[0]%i==0 && numeros[1]%i==0){
                if(i>aux){
                    aux=i;                    
                }
            }                
        }
        
        System.out.println("El MCD es "+aux);
    }
        
    static char terminar(){
        System.out.println("\nGracias por usar el sistema");
        return 'n';        
    }
    
    static void capicua() throws IOException{
        
        int numero;
        System.out.println("Ingrese el numero");
        numero=Integer.parseInt(br.readLine());
        int falta=numero, ninvertido=0, resto=0;
        while(falta!=0){
            resto=falta%10;
            ninvertido=ninvertido*10+resto;
            falta=falta/10;
        }
        
        if(ninvertido==numero)
            System.out.println("\nEl numero es capicua\n");
        else
            System.out.println("\nEl numero no es capicua\n");
    }
    
    
    
}
