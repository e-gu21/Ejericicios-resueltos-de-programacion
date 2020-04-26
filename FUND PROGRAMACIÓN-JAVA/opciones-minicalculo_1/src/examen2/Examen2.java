package examen2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Examen2 {
     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     static int[] x=new int[2];
     
    public static void main(String[] args) throws IOException{
        char resp='s';
        do{
            resp=mostrarMenu();
            
        }while(resp=='s');
        
    }
           
    static char mostrarMenu() throws IOException{                   
        int n;   
        char resp='s';
        int[] y=new int[2];             
        System.out.println("1. Leer 2 numeros enteros positivos");
        System.out.println("2. Calcular la potencia");
        System.out.println("3. Calcular MCD");
        System.out.println("4. Calcular factorial");
        System.out.println("5. Terminar");   
        
        System.out.println("\nINGRESE UNA OPCION:");
        n=Integer.parseInt(br.readLine());            
               
        switch(n){
            case 1: y=leerNumeros();    
                    x=y;
                    break;
            case 2: calcularPotencia(x);
                    break;
            case 3: calcularMCD(x);
                    break;
            case 4: calcularFactorial(x);
                    break;
            default:resp = terminar();  
                    break;
        }
        
        return resp;
            
    }  
    
    static int[] leerNumeros() throws IOException{
        int[] numero=new int[2];
        System.out.print("Ingrese el primer numero: ");
        numero[0] = Integer.parseInt(br.readLine());
        System.out.print("Ingrese el segundo numero: ");
        numero[1] = Integer.parseInt(br.readLine());
        System.out.println("Los numeros ingresados son "+numero[0]+" y "+numero[1]+"\n");    
        
        return numero;
    }
    
    static void calcularPotencia(int[] numeros){
        System.out.println("Base: "+numeros[0]);
        System.out.println("Exponente: "+numeros[1]);
        int pot=1;
        for(int i=1;i<=numeros[1];i++){
            pot=pot*numeros[0];
        }
        System.out.println(numeros[0] + " a la potencia " + numeros[1]);
        System.out.println("La potencia es "+pot);
        System.out.println("\n");
    }
        
    static void calcularMCD(int[] numeros){           
        int aux=0;
        for(int i=numeros[1];i>0;i--){
            if(numeros[0]%i==0 && numeros[1]%i==0){
                if(i>aux){
                    aux=i;                    
                }
            }                
        }
        
        System.out.println("El MCD es "+aux);
        System.out.println("\n");
    }
       
    
    static void calcularFactorial(int[] numeros){
        int numero=numeros[0]+numeros[1];
        int fact=1;
        for(int i=1;i<=numero;i++){
            fact=fact*i;
        }
        
        System.out.println("El factorial de la suma de los números es "+fact);
        System.out.println("\n");
    }
    
    static char terminar(){
        System.out.println("Gracias por usar el sistema");
        return 'n';        
    }
           
    
}
