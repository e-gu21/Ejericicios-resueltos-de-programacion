package ejercicio1;

public class PruebaCuenta1 {

    public static void main (String arg[]) {
        Cuenta     cta1=new         Cuenta();
        Cuenta     cta2=new         Cuenta();
        
      cta1.depositar(1000);   
      cta2.depositar(500);   
      cta1.girar(800);   
      
      System.out.println("el saldo de cuenta 2 es "+ cta2.obtenerSaldo());
      System.out.println("Hubo "+cta1.obtenerTransacciones()+" transacciones en cuenta 1");
    }
}
