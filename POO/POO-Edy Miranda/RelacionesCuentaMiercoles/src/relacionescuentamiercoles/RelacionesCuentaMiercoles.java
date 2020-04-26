/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionescuentamiercoles;

/**
 *
 * @author Sistemas
 */
public class RelacionesCuentaMiercoles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cliente cl1=new Cliente("Cliente 1","46563245"); 
        Cuenta c1=new Cuenta(cl1,500);
        System.out.println(c1);
        System.out.println();
        
        c1.Deposito(100);
        c1.Retiro(1000);
        c1.Retiro(100);
        c1.Deposito(25);
        System.out.println();
        
        System.out.println(c1);
        
        System.out.println("---------------------------------------");
        Cliente cl2=new Cliente("Cliente 2","05438533"); 
        Cuenta c2=new Cuenta(cl2,100);
        System.out.println(c2);
        System.out.println();
        
        c2.Deposito(100);
        c2.Retiro(1000);
        c2.Retiro(100);
        c2.Deposito(25);
        System.out.println();
        
        System.out.println(c2);
        System.out.println();
        
        BaseDatosCuenta bdc=new BaseDatosCuenta(10);
        bdc.agregarCuenta(c1);
        bdc.agregarCuenta(c2);
        bdc.mostrarCuentas();
        System.out.println();
        System.out.println("El número de clientes es:"+Cliente.numeroClientes);
        System.out.println("El número de cuentas es:"+Cuenta.numeroCuentas);
       
        
        
    }
    
}
