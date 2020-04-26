/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class Pruebas {    
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
     
        String cadena = "hola mundo";
        String resp = "";
        
        for(int i = 0; i<cadena.length(); i++){
            resp = resp + caracter(cadena.charAt(i));
        }
        
        System.out.println(resp);
    } 
    
    static private char caracter(char caracter) {
        
        char resp = caracter;
        
        if(caracter==' ') {
            resp = '\u0000';
        }
        
        return resp;
    }
}
