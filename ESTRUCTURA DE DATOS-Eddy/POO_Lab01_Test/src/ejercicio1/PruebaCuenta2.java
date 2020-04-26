package ejercicio1;

import java.io.*;

class PruebaCuenta2{
    public static void main (String argum[]) throws IOException{
        BufferedReader op=new BufferedReader (new InputStreamReader(System.in));
        String opc; int cant, opcion;
        Cuenta         cta1=new Cuenta();
        boolean continuar=true;
        
        while(continuar){
            System.out.println("Seleccione una opción ");
            System.out.println("1.-Depositar.  2.-Girar.  3.-Consultar saldo.  4.-Salir ");
            opcion=Integer.parseInt(op.readLine());
             switch (opcion){
                 case 1:
                     System.out.println("Ingrese la cantidad a depositar ");
                     cant= Integer.parseInt(op.readLine());
                     cta1.depositar(cant);
                     break;
                     
                 case 2:
                     System.out.println("Ingrese la cantidad a girar ");
                     cant= Integer.parseInt(op.readLine()); 
                     cta1.girar(cant);
                     break;
                     
                 case 3:
                     System.out.println("Saldo: "+ cta1.obtenerSaldo());
                     System.out.println("Trans: "+ cta1.obtenerTransacciones());
                     break;
                     
                 case 4:   
                     continuar=false;
             
             }
        }
    }      
}
