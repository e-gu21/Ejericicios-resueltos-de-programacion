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
public class BaseDatosCuenta {
    private Cuenta []misCuentas;
    int indice=0;
    //Métodos
    public BaseDatosCuenta(int N){
        misCuentas=new Cuenta[N];
    }
    public void agregarCuenta(Cuenta c){
        misCuentas[indice]=c;
        indice++;
    } 
    void mostrarCuentas(){
        System.out.println("_____________BASE DE DATOS_____________"+"\n");
        
        for(int i=0;i<indice;i++)
        System.out.println(misCuentas[i]);
        
 
    }
}
