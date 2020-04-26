package Ejercicio1;
public class Ejer1 {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);
        int i;
        double Product = 0;
        double a[]=new double [N];
        for(i=0;i<N;i++){
            a[i]=Math.random();
            System.out.println("a"+"["+ i+"]="+a[i]);
        }
       
        System.out.println("REFERENCIA a= "+a);
        System.out.println();
        
        //Valor máximo:
        double max=Double.NEGATIVE_INFINITY;
        for(i=0;i<N;i++){
            if (a[i]>max)max=a[i];
        }
        System.out.println("Valor Maximo del arreglo = " + max);
        
        //Promedio:
        double sum = 0.0;
        for(i=0;i<N;i++){
        sum +=a[i];
        double average=sum/N;
        }
        System.out.println("Promedio del arreglo = " + sum / N);
        
        //Copiar otro arreglo:
        double []b=new double [N];
        for(i=0;i<N;i++){
            b[i]=a[i];
        }
        System.out.println("b[] ");
        
        for (i = 0; i < N; i++) {
            System.out.println("b"+"["+ i+"]="+b[i]);
        }
        
        //Revertir el orden:
        for (i = 0; i < N/2; i++) {
            double temp=b[i];
            b[i]=b[N-1-i];
            b[N-1-i]=temp;
        }
        // Imprimir los valores de loa arreglos uno por linea:
        System.out.println("b"+"["+ i+"]="+b[i]);
        System.out.println();
        
        // Producto punto de a[] y b[]:
        double producto=0;
        for(i=0;i<N;i++){
            Product=Product+a[i]*b[i];
        }
        System.out.println("Producto Punto de a[] y b[] = " + Product);
    }
    
}
