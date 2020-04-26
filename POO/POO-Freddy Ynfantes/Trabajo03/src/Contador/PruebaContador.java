package Contador;

import java.io.*;
public class PruebaContador {   
    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int x,y;
        int opc;
        boolean continuar=true;
        Contador c1,c2;
        
        System.out.println("***INGRESO DE VALORES***");
        System.out.print("Primer valor: ");
        x=Integer.parseInt(br.readLine());
        c1=new Contador(x);
        System.out.print("Segundo valor: ");
        y=Integer.parseInt(br.readLine());
        c2=new Contador(y);
        
       System.out.println("Contador 1:" +c1.getContador());
       System.out.println("Contador 2:" +c2.getContador());
       
         while(continuar){
             System.out.println("\n***MENU***");
             System.out.println("1.-Incrementar 1 para cada valor");
             System.out.println("2.-Decrementar 1 para cada valor");
             System.out.println("3.-Consultar valores actuales");
             System.out.println("4.-Terminar");
             opc=Integer.parseInt(br.readLine());
             
             switch(opc){
                 case 1:
                     c1.incrementar();
                     c2.incrementar();
                     System.out.println("contador1:" +c1.getContador());
             System.out.println("contador2:" +c2.getContador());
                     break;
                 case 2:
                     c1.decrementar();
                     c2.decrementar();
                     System.out.println("contador1:" +c1.getContador());
             System.out.println("contador2:" +c2.getContador());
                     break;
                 case 3:
                     System.out.println("contador1:" +c1.getContador());
             System.out.println("contador2:" +c2.getContador());
                     break;
                 case 4:
                     continuar=false;
             }
         }
        

    }
    
}
