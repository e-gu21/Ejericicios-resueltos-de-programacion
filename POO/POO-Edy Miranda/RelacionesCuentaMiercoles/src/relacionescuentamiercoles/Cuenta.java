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
public class Cuenta {
    public Cliente elCliente;
    private float saldo;
    public static int numeroCuentas=0;
    private int numeroDeTransacciones=0;

    public Cuenta(float s,int nc,int nt){
    saldo=s;
    numeroCuentas=nc;
    numeroDeTransacciones=nt;
    }
    Cuenta(Cliente c){
          elCliente=c;
	  saldo=0;
	  numeroCuentas++;
  }
  Cuenta(Cliente c,float s){
          elCliente=c;
	  saldo=s;
	  numeroCuentas++;
  }
  //Métodos
  void Deposito(float d) {
	  saldo=saldo+d;
	  numeroDeTransacciones++;
          System.out.println("Deposito:"+d);
  }
    void Retiro(float r) {
        if(saldo>=r){
            saldo=saldo-r;
            numeroDeTransacciones++;
            System.out.println("Retiro:"+r);
        }
        else{
            System.out.println("la cantidad: "+r+" Excede a su saldo");     
        }
    }
  
   float getSaldo() {
	    return saldo;
   }
   long getTransacciones() {
	   return numeroDeTransacciones;
  
   }
   @Override
   public String toString(){
       return elCliente.toString()+"\nSaldo:" +saldo+ "\nNumero de Transacciones:"+numeroDeTransacciones+"\n";
   }
}
