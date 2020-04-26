package DoncenteSueldo;

import java.io.*;

public class PruebaDocente {

    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException  {
        
        String n1,n2,n3,c1,c2,c3;
        double x1,x2,x3;
        int y1,y2,y3;
        int opc;
        boolean continuar=true;
        Docente doc1,doc2,doc3;
        doc1= new Docente();
        doc2= new Docente();
        doc3= new Docente();
        
        System.out.println("Info. Docente 1: " + doc1.toString());
        System.out.println("Info. Docenete 2:" + doc2.toString());
        System.out.println("Info. Docenete 3:" + doc3.toString());
        
        System.out.println("\n***INGRESO DE SUELDO Y HORAS***");
        
        while(continuar){
             System.out.println("MENU");
             System.out.println("1.-Ingresar Datos de Docentes");
             System.out.println("2.-Ejecución de Operaciones");
             System.out.println("3.-Consultar Datos");
             System.out.println("4.-Salir del Programa");
             opc=Integer.parseInt(br.readLine());
             
             switch(opc){
                 case 1:
                         System.out.print("Codigo Doc. 1: ");
                         c1=br.readLine();
                         
                         System.out.print("Nombre Doc. 1: ");
                         n1=br.readLine();
                         
                         System.out.print("Sueldo Doc. 1: ");
                         x1=Double.parseDouble(br.readLine());
                         
                         System.out.print("N° Horas Doc. 1: ");
                         y1=Integer.parseInt(br.readLine());
                         
                         System.out.print("Codigo Doc. 2: ");
                         c2=br.readLine();
                         
                         System.out.print("Nombre Doc. 2: ");
                         n2=br.readLine();
                         
                         System.out.print("Sueldo Doc. 2: ");
                         x2=Double.parseDouble(br.readLine());
                         
                         System.out.print("N° Horas Doc. 2: ");
                         y2=Integer.parseInt(br.readLine());
                         
                         System.out.print("Codigo Doc. 3: ");
                         c3=br.readLine();
                         
                         System.out.print("Nombre Doc. 3: ");
                         n3=br.readLine();
                         
                         System.out.print("Sueldo Doc. 3: ");
                         x3=Double.parseDouble(br.readLine());
                         
                         System.out.print("N° Horas Doc. 3: ");
                         y3=Integer.parseInt(br.readLine());
                         
                         doc1.modificar(c1, n1, x1, y1);
                         doc2.modificar(c2, n2, x2, y2);
                         doc3.modificar(c3, n3, x3, y3);
                     break;
                     
                 case 2:
                     doc1.sueldobruto();
                     doc2.sueldobruto();
                     doc3.sueldobruto();
                     System.out.println("Consultar para ver resultado de operaciones");
                     break;
                     
                 case 3:
                     System.out.println("Datos de Docente 1:" +doc1.toString() );
                     System.out.println("Datos de Docente 2:" +doc2.toString() );
                     System.out.println("Datos de Docente 3:" +doc3.toString() );
                     break;
                     
                 case 4:
                     continuar=false;
             }
         }
        
    }
    
}