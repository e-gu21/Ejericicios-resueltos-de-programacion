package problema6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LENOVO
 */
public class Problema6 {
    static BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        
        int n;
        int i;
        
        do{
        System.out.println(" numero");
        n=Integer.parseInt(br.readLine());
        }while(n<=0 || n>80);
        int []  X = new int [n];
        int [] Y = new int [n];
        
        for ( i = 0;i<n;i++) {
        System.out.println("arreglo A");
        X[i]=Integer.parseInt(br.readLine());
        
        System.out.println("Arreglo B");
        Y[i]=Integer.parseInt(br.readLine());        
        }
        
        String resp="";
        
        for (i=0; i<n;i++){
            if(X[i]==Y[i]){
                resp="true";
            }else {
                resp="false";
            }
            System.out.println("Arreglo A " + X[i]);
        System.out.println("Arreglo B " + Y[i]);
        }
        
        if(resp.equals("true")){
            System.out.println("iguales");
        }else {
            System.out.println("diferentes");
        }
        
    }    
}
