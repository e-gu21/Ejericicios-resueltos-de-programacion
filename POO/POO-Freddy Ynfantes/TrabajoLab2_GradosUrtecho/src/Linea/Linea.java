/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Linea;

/**
 *
 * @author Usuario
 */
public class Linea {
        Punto ptoA,ptoB;
    
    Linea(){
        ptoA = new Punto();
        ptoB = new Punto();
    }
    
    Linea(Punto a,Punto b){
        ptoA=a;
        ptoB=b;
    }
    
    public void mueveDerecha(double x){
        ptoA.x=ptoA.x+x;
        ptoB.x=ptoB.x+x;
    }
    
    public void mueveIzquierda(double x){
        ptoA.x=ptoA.x-x;
        ptoB.x=ptoB.x-x;
    }
    
    public void mueveArriba(double y){
        ptoA.y=ptoA.y+y;
        ptoB.y=ptoB.y+y;
    }
    
    public void mueveAbajo(double y){
        ptoA.y=ptoA.y-y;
        ptoB.y=ptoB.y-y;
    }
    
    public String toString(){
        return "("+ptoA+" ; "+ptoB+")";
    }
}
