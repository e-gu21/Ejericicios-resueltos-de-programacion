package problema1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problema1 {
    static BufferedReader br = new BufferedReader ( new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {
    
        int c;
        int n;
        int contador=0;
        
        do {
            System.out.println("Ingrese numero");
            n = Integer.parseInt(br.readLine());
        }while(n<=0 || n>=100);
                
        String [] nombres = new String [n];
        int [] edades = new int [n];
        char [] sexo = new char [n];
                
        for(int i = 0; i<nombres.length;i++){
            
        System.out.print("Ingrese el nombre de la "+(i+1)+"° persona: ");
        nombres[i]=br.readLine();
        System.out.print("Ingrese la edad de la "+(i+1)+"° persona: ");
        edades[i]=Integer.parseInt(br.readLine());
        
        System.out.print("Ingrese el sexo de la "+(i+1)+"° persona: 'M' o 'F' ");
        sexo[i]=br.readLine().toLowerCase().charAt(0);
        }
        
        System.out.println("Los nombres de las mujeres");
        System.out.println("\tnombre\tedad");
        for (int i = 0; i<n; i++) {
            if(sexo[i]=='f'){                
                System.out.println("\t"+nombres[i]+"\t"+edades[i]);
            }
        }
        
        System.out.println("Los nombres de los hombres");
        int suma=0;
        
        System.out.println("\tnombre\tedad");       
        for (int i = 0; i<n; i++) {
            if(sexo[i]=='m'){                
                System.out.println("\t"+nombres[i]+"\t"+edades[i]);
                suma = suma + edades[i];
            }
        }
        
        System.out.println("La suma de las edades de los hombres es "+suma);
        
        System.out.println("Las alumnas mayores de edad");       
        for (int i = 0; i<n; i++) {
            if(sexo[i]=='f' && edades[i]>=18){                
                System.out.println("\t"+nombres[i]+"\t"+edades[i]);
                contador=contador+1;
            }
        }
        
    }    
}
