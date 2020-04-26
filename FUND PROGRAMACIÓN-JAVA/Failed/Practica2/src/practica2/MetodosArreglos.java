/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class MetodosArreglos {
    static BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
    static String [] Capicua (int [] datos) {      
        String [] resultado = new String [datos.length];
        for (int i = 0; i<datos.length; i++) {
            int falta=datos[i], ninvertido=0, resto=0;
            while(falta!=0){
            resto=falta%10;
            ninvertido=ninvertido*10+resto;
            falta=falta/10;            
            if (ninvertido==datos[i]) {
                resultado [i] = "capicua";
            }else {
                resultado [i] = "no capicua";
            }            
        }        
    }    
        return resultado;
    }
    
    static String [] primos (int [] datos) {        
        String [] resultados = new String [datos.length];        
        for (int i = 0; i<datos.length; i++) {            
            int n = datos[i];
            int contador=0;               
            for(int j=1; j<=n; j++){
                if(n%j==0){
                    contador++;
                }
            }
            if(contador<=2){
                resultados [i] = "primo";
            }else {
                resultados [i] = "no primo";
            }            
        }        
        return resultados;
    }
    
    static int [] producto2ArreglosEnTercer (int [] datos1, int [] datos2, int cantidad) {
        int [] resultados = new int [cantidad];
        
        for (int i = 0; i<cantidad; i++) {
            resultados [i] = datos1 [i] * datos2 [i]; 
        }
        return resultados;    
    }
    
    static int leerNumero () throws IOException {
        int n;
        System.out.println("Ingrese tamaño del arreglo");
        n = Integer.parseInt(br.readLine());        
        return n;
    }
    
    static int [] factorialArregloEnSeg (int [] datos, int cantidad) {
        int [] resultados = new int [cantidad];        
        for (int i = 0; i<cantidad; i++) {           
            int numero = datos [i];
            int fact=1;
            for(int j=1;j<=numero;j++){
                fact=fact*j;
            }
            resultados [i] = fact;
            }        
        return resultados;
    }
    
    static char deseaSeguir () throws IOException {
        String respuesta;
        char r;
        System.out.println("Desea seguir ingresando datos ?");
        respuesta = br.readLine();
        respuesta = respuesta.toLowerCase();
        r = respuesta.charAt(0);        
        return r;        
    }
    
    static int [] reves (int [] datos) {
        int [] resultado = new int [datos.length];
        for (int i = 0; i<datos.length; i++) {
            int numero = datos[i];
            int falta=numero, ninvertido=0, resto=0;
            while(falta!=0){
                resto=falta%10;
                ninvertido=ninvertido*10+resto;
                falta=falta/10;
            }
            resultado [i] = ninvertido;
        }        
        return resultado;
    }
    
    static int [] arregloDeNoRepetidos (int [] datos) {          
        int [] B = new int [datos.length];
        int [] C = new int [datos.length];
            for(int i = 0;i<datos.length;i++) {
                B[i]=datos[i];
            }        
        for (int h = 0; h<datos.length; h++) {           
            int n;
            int numero = datos [h];
            int contador;
            int c=0;  
            for (int i = 0;i<datos.length;i++) {
                numero=datos[i];    
                if (numero<999) {
                    contador =0;
                    for(int j=0;j<datos.length;j++) {
                        if(numero==datos[j]){
                            contador++;
                            if(contador>1){
                                datos[j]=999;
                            }
                        }
                    }
                }
            }
            for (int i=0;i<datos.length;i++) {
                if(datos[i]<999){
                    C[c]=datos[i];
                    c++;
                }
            }           
        }        
        return C;        
    }   
    
}