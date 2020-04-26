/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Usuario
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        {int N=8;
        //Números al azar
        double[] a=new double[N];
        for(int i=0;i<N;i++)
            a[i]= Math.random();
            
        //valores de array por linea
        System.out.println("a[]");
        System.out.println("------------------");
        for(int i=0;i<N;i++){
            System.out.println("a"+"["+i+"]="+a[i]);}
        System.out.println();
        System.out.println("Referencia a="+a);
        System.out.println();
        //Hayando valor máximo
        {double max = Double.NEGATIVE_INFINITY;
        for(int i=0;i<N;i++)
            if(a[i]>max) max=a[i];
         System.out.println("Valor máximo del arreglo="+max);
        
        //Promedio
       N=a.length;
        double sum=0;
         for(int i=0;i<N;i++)
             sum=sum+N;
         double prom=sum/N;
        System.out.println("Promedio del arreglo="+N);
        System.out.println();
        
        //Copiar otro arreglo
          System.out.println("b[]");  
          System.out.println("------------------");
          double[] b=new double[N];
        for(int i=0;i<N;i++){
            b[i] = a[i];}
   
        for(int i=0;i<N;i++){
            System.out.println("b"+"["+i+"]="+b[i]);}
        System.out.println();
 
        
        //Elementos en reversa
            for(int i=0;i<N/2;i++){
                double temp=b[i];
                b[i]=b[N-1-i];
                b[N-1-i]=temp;}
            System.out.println("b[]");  
            System.out.println("Con elementosd e orden revertido");
          for(int i=0;i<N;i++)
            System.out.println("b"+"["+i+"]="+b[i]);
            
        //producto punto
        double producto=0;
        for(int i=0;i<N;i++){
            producto=producto+a[i]*b[i];}
        System.out.println();
        System.out.println("El producto punto es="+producto);}
        }
    }
    
}
