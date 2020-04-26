package CuentaBancaria;
public class Cuentabancaria {
//Atributos:    
private long ncuenta;
private String DNI;
private double saldo;
private double interes;
static int c=0;
//Constructor vacío:
public Cuentabancaria(){
    ncuenta=100001+c;
    DNI=null;
    saldo=0;
    interes=0;
    c++;
}
//Segundo constructor
public Cuentabancaria(String dni, double s, double i){
    DNI=dni;
    saldo=s;
    interes=i;
}
//Métodos get
public long getncuenta(){
    return ncuenta;
}
public String getDNI(){
    return DNI;
}
public double getsaldo(){
    return saldo;
}
public double getinteres(){
    return interes;
}
//Métodos set:
public void setDNI(String x){
    DNI=x;
}
public void setsaldo(double x){
    saldo=x;
}
public void setinteres(double x){
    interes=x;
}
//Actualizar saldo:

public void actualizarsaldo(double s){
    double a;
    a=((interes/30)*saldo)+saldo;
    a=saldo;
}
//Ingresar un monto:
public void ingresar(double monto){
    saldo=saldo+monto;
    System.out.println("Saldo Actual: "+saldo);
}
//Retirar un monto:
public void retirar(double monto){
    if(saldo>monto){
    saldo=saldo-monto;
    }
    else{
       System.out.println("Retiro inválido");
    }
    System.out.println("Saldo Actual: "+saldo);
}
public String toString(){
    return "\nCuenta: "+ncuenta+"\nDNI: "+DNI+"\nSaldo Actual: "+saldo+"\nInterés Mensual: "+interes;
}
}
