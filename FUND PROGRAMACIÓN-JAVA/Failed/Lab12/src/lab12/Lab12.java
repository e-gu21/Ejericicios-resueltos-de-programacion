/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Lab12 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        int cantidad;
        
        System.out.println("Ingrese cantidad");
        cantidad = Integer.parseInt(br.readLine());
        
        String [] nombres = new String [cantidad];
        int [] edades = new int [cantidad];
        char [] sexos = new char [cantidad];
        
        String [] nombresOrd = new String [cantidad];
        
        String nombreaux = "";
        int n = 0;
        
        for (int i = 0; i<cantidad; i++) {
            System.out.println("Ingrese "+(i+1)+"° nombre: ");
            nombres[i] = br.readLine();
            //System.out.println("Ingrese "+(i+1)+"° edad: ");
            //edades[i] = Integer.parseInt(br.readLine());
            //System.out.println("Ingrese "+(i+1)+"°sexo: ");
            //sexos[i] = br.readLine().toLowerCase().charAt(0);
        }
        
        for (int i = 0; i<cantidad; i++) {            
            nombresOrd[i] = "null";           
        }
                
        for (int i = 0; i<cantidad ; i++) {  
        if (!existeDato(nombres[i],nombresOrd)) {
            nombreaux = nombres[i];        
            for (int j = 0; j<cantidad; j++) {
                if (nombreaux.compareTo(nombres[j])>0) {   
                    if (!existeDato(nombres[j],nombresOrd)) {
                        nombreaux = nombres[j];    
                    }                                   
                }
            }  
            nombresOrd [i] = nombreaux;
        }        
        }
        
        //System.out.println(""+existeDato("abe",nombresOrd));
        
        
        for (int i = 0; i<cantidad; i++) {
            System.out.println(nombresOrd[i]);
        }      
             
    }    
    
    static public boolean existeDato(String dato, String [] arreglo){
        
        boolean resp = false;
        
        for (int i = 0; i<arreglo.length; i++) {
            if (dato.compareTo(arreglo [i]) == 0) {
                resp = true;
                break;
            }
        }
        
        return resp ;
    }
}
