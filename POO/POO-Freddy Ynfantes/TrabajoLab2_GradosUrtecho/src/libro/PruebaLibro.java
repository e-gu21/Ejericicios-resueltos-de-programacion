package libro;
import java.io.*;
public class PruebaLibro {
    public static void main(String[] args) throws IOException{
      BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
      int t;
      String x;
    //CREACIÓN DE OBJETOS:  
       Libro l1,l2,l3;
       l1=new Libro();
       l2=new Libro();
       l3=new Libro(); 
       
    //DATOS PARA LIBRO 2:  
       System.out.println("\nLIBRO 2:");
       System.out.print("Ingrese Título: ");
       x=br.readLine();
       l2.gettitulo();
       l2.settitulo(x);
       
       System.out.print("Ingrese Autor: ");
       x=br.readLine();
       l2.getautor();
       l2.setautor(x);
       
       System.out.print("Ingrese Editorial: ");
       x=br.readLine();
       l2.geteditorial();
       l2.seteditorial(x);
       
       System.out.print("Ingrese Nro. pags: ");
       t=Integer.parseInt(br.readLine());
       l2.getnropag();
       l2.setnropag(t);
       
    //DATOS PARA LIBRO 3:   
       System.out.println("\nLIBRO 3:");
       System.out.print("Ingrese Título: ");
       x=br.readLine();
       l3.gettitulo();
       l3.gettitulo();
       
       System.out.print("Ingrese Autor: ");
       x=br.readLine();
       l3.getautor();
       l3.setautor(x);
       
       System.out.print("Ingrese Editorial: ");
       x=br.readLine();
       l3.geteditorial();
       l3.seteditorial(x);
       
       System.out.print("Ingrese Nro. pags: ");
       t=Integer.parseInt(br.readLine());
       l3.getnropag();
       l3.setnropag(t);
       
    //MODIFICACIONES:   
       System.out.print("\nCambie Nro de paginas de Libro 1: ");
       t=Integer.parseInt(br.readLine());
       l1.setnropag(t);
       l1.getnropag();
       System.out.print("\nCambie Editorial de Libro 2: ");
       x=br.readLine();
       l2.seteditorial(x);
       l2.geteditorial();
    //REPORTAR   
       System.out.println("\nLibro 1: "+l1.toString());
       System.out.println("\nLibro 2: "+l2.toString());
       System.out.println("\nLibro 3: "+l3.toString());
    }
    
    
}
