package CuentaBancaria;
import java.io.*;
public class PruebaCuentabancaria {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in)); 
         Cuentabancaria c1;
         double t, cant;
    //CREACIÓN DE OBJETO:    
        c1=new Cuentabancaria("73817367",5,7);
    //MODIFICAR SALDO:
        System.out.println("Ingrese su saldo: ");
        t=Integer.parseInt(br.readLine());
        c1.setsaldo(t);
    //OBTENER SALDO:
        c1.getsaldo();
    //Obtener actualización de dato:
        System.out.println("Saldo actualizado");
        c1.actualizarsaldo(t);
    //INGRESAR DINERO A LA CUENTA:
        System.out.print("Ingrese la cantidad a depositar: ");
        cant=Double.parseDouble(br.readLine());
        c1.ingresar(cant);
    //RETIRAR DINERO DE LA CUENTA:    
        System.out.print("Ingrese la cantidad a girar: ");
        cant= Double.parseDouble(br.readLine()); 
        c1.retirar(cant);
     //REPORTAR TODO:
        System.out.println("\nDatos de Cuenta: "+c1.toString());
    }  
}
