
package examenlab_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Examenlab_3 {
    static BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args) throws IOException {
        
       char resp;     
       
       do{
       
            int cantidad1 = leerCantidad("A");
            int [] arregloA = leerArreglo(cantidad1,"A");
            int cantidad2 = leerCantidad("B");
            int [] arregloB = leerArreglo(cantidad2,"B");

            reportarArreglos(arregloA,arregloB,cantidad1,cantidad2);

            calcularMCM(arregloA,arregloB);

            calcularProducto(arregloA,arregloB);

            resp = leerResp();
       
       }while(resp=='s');
       
    }    

    private static int leerCantidad(String letra) throws IOException {
        
        int  cantidad;
        
        if(letra.equals("A")) {
           
            System.out.println("INGRESE CANTIDAD PARA EL ARREGLO "+letra);
            cantidad = Integer.parseInt(br.readLine());   
            
        }else {
            
            System.out.println("INGRESE CANTIDAD PARA EL ARREGLO "+letra);
            cantidad = Integer.parseInt(br.readLine());       
        }
        
        return cantidad;       
       
    }      
    
    private static void reportarArreglos(int[] arregloA, int[] arregloB, int cantidad1, int cantidad2) {
        
        System.out.println("ARREGLO A:");
        
        for(int i=0; i<cantidad1; i++) {            
            System.out.println("\t"+arregloA[i]);
        } 
       
        System.out.println("ARREGLO B:");
        
        for(int i=0; i<cantidad2; i++) {            
            System.out.println("\t"+arregloB[i]);
        } 
    }

    private static int[] leerArreglo(int cantidad, String sarreglo) throws IOException {
        
        int [] arregloA = new int[cantidad]; 
        
        for(int i=0; i<cantidad; i++) {
            System.out.println("Ingrese el dato para el arreglo "+sarreglo);
            arregloA[i] = Integer.parseInt(br.readLine());
        }
        
        return arregloA;
    }

    private static void calcularMCM(int[] arregloA, int[] arregloB) {
        
        if(arregloA.length!=arregloB.length) {
            System.out.println("POR FAVOR INGRESE CANTIDADES IGUALES, SINO OCURRA UN PROBLEMA");
        }else {
            
            int [] arregloD = new int[arregloA.length];
        
            for(int i=0; i<arregloA.length; i++) {
                arregloD[i] = mcm(arregloA[i],arregloB[i]);
            }

            System.out.println("ARREGLO MCM:");

            for(int i=0; i<arregloD.length; i++) {
                System.out.println("\t"+arregloD[i]);
            }
        
        }      
       
        
    }
    
    private static void calcularProducto(int[] arregloA, int[] arregloB) {
        
        if(arregloA.length!=arregloB.length) {
            System.out.println("PORFAVOR INGRESE CANTIDADES IGUALES, SINO OCURRA UN PROBLEMA");
        }else {
            
            int[] arregloG = new int[arregloA.length];
        
            for(int i=0; i<arregloA.length; i++) {
                arregloG[i]=sumaSuc(arregloA[i],arregloB[i]);
            }

            System.out.println("ARREGLO PRODUCTO:");

            for(int i=0; i<arregloG.length; i++) {
                System.out.println("\t"+arregloG[i]);
            }        
        }       
    }

    private static int sumaSuc(int n1, int n2) {
        
        int suma = 0;
        
        for(int i=n2;i>0;i--) {
            suma = suma + n1;
        }     
        
        return suma;
    }   

    private static char leerResp() throws IOException {
        char resp;
        
        System.out.println("Desea continuar?: ");
        System.out.println("Escrina si o no");
        resp = br.readLine().toLowerCase().charAt(0);
        
        return resp;
    }

    private static int mcm(int n1, int n2) {
        
       int num1 = n1;
       int num2 = n2;
       
       int mcm=1;
       int i=2;
       
        while(i <= num1 || i <= num2)
        {
            if(num1%i==0 || num2%i==0)
            {
            mcm=mcm*i;
            if(num1%i==0) num1=num1/i;
            if(num2%i==0) num2=num2/i;
            }
            else
                i=i+1;               
        }    
        
        return mcm;                     
    }   
}
