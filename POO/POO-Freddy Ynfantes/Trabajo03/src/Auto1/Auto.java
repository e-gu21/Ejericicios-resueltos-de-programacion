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
public class Auto {
    //Características
    private String placa;
    private String color;
    private String marca;
    private String modelo;
    private int puertas; 
    private boolean encender;
 //Constructor vacío    
 public Auto(){
    placa=null;
    color=null;
    marca=null;
    modelo=null;
    puertas=0;       
 }
 //Constructor con parámetros
 public Auto(String p, String c, String m, String mo,int n){
    placa=p;
    color=c;
    marca=m;
    modelo=mo;
    puertas=n;
 }
//////////////////////////////////////////////////////////////////////////////////////////////////// 
//reportar
 public String toString(){
    return "\nplaca: "+placa+" \ncolor: "+color+" \nmarca: "+marca+" \nmodelo: "+modelo+" \nnúmero de puertas: "+puertas;
 }
 //Modificar datos del auto
 public void modAuto(String p, String c, String m, String mo,int n){
    placa=p;
    color=c;
    marca=m;
    modelo=mo;
    puertas=n; 
 }
 //Encender auto
 public void opc (boolean e){
     encender=e;
 }
 //Comprobar si está encendido
 public boolean encendido(){
     return encender;
 }

}
