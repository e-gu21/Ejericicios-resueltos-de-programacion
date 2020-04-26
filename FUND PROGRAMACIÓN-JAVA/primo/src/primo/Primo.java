import java.io.*;

public class Primo { static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));    
    public static void main(String[] args)throws IOException  {       
      
        int numero;
        System.out.println("Ingrese número: ");
        numero=Integer.parseInt(br.readLine());
        int contador =0;
        
        for(int i=1; i<numero; i++) {
            if(numero%i==0){
                contador++;               
            }            
        }
        
        if(contador<2) {            
            System.out.println("es primo");
        }else {            
            System.out.println("no es primo");
        }         
    }
}