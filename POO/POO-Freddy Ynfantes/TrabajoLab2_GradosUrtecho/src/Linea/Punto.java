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
public class Punto {
    protected double x,y;
    
    Punto(){
        x=0;
        y=0;
    }
    
    Punto(int a, int b){
        x=a;
        y=b;
    }
    
    public String toString(){
        return "("+x+" , "+y+")";
    } 
}
