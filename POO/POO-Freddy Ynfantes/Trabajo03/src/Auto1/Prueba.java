/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Auto1;

/**
 *
 * @author Usuario
 */
public class Prueba {
    public static void main(String[] args) {
    //Creación de objetos
    Auto f, l; 
    f=new Auto();
    l=new Auto("kd43n2","negro","Lamborghini","veneno",2);
    //Reporte de datos
    System.out.println("Auto 1: "+f.toString());
    System.out.println("Auto 2: "+l.toString());
    //Modificar datos de auto1
    f.modAuto("D1B3S1","Rojo","Ferrari","portofino",2);
    //Reportar datos de auto1
    System.out.println("Auto 1: "+f.toString());
    //Encender autos
    f.opc(true);
    l.opc(true);
    //Apagar auto2
    l.opc(false);
    //Reportar si están enendidos o no
    System.out.println("Auto 1: encendido?"+f.encendido());
    System.out.println("Auto 2: encendido?"+l.encendido());
    }
}
