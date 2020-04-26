package ejercicio1_GradosUrtecho;
import java.io.*;
public class Prueba {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
     //Variables primitivas:
     //CAPITAL
     String cd1, cd2, cd3, cd4, cd5; //codigo postal
     String nc1,nc2,nc3,nc4,nc5;//Nombre capital
     String n1,n2,n3,n4,n5;//Nombre alcalde
     //PAÍS:
     String p1,p2,p3;//Nombre país
     String m1,m2,m3;//Moneda
     String i1,i2,i3;//Idioma
     String pr1,pr2,pr3;//Presidente
     double pb1,pb2,pb3;//Población
     //Opciones
     int opc;
     //Creación de objetos:   
     //CAPITAL: 
     System.out.println("CAPITAL 1:");
        System.out.print("\tCódigo Postal: ");
        cd1=br.readLine();
        System.out.print("\tNombre: ");
        nc1=br.readLine();
        System.out.print("\tAlcalde: ");
        n1=br.readLine();
     System.out.println("CAPITAL 2:");
        System.out.print("\tCódigo Postal: ");
        cd2=br.readLine();
        System.out.print("\tNombre: ");
        nc2=br.readLine();
        System.out.print("\tAlcalde: ");
        n2=br.readLine();    
     System.out.println("CAPITAL 3:");
        System.out.print("\tCódigo Postal: ");
        cd3=br.readLine();
        System.out.print("\tNombre: ");
        nc3=br.readLine();
        System.out.print("\tAlcalde: ");
        n3=br.readLine();   
     System.out.println("CAPITAL 4:");
        System.out.print("\tCódigo Postal: ");
        cd4=br.readLine();
        System.out.print("\tNombre: ");
        nc4=br.readLine();
        System.out.print("\tAlcalde: ");
        n4=br.readLine();   
     System.out.println("CAPITAL 5:");
        System.out.print("\tCódigo Postal: ");
        cd5=br.readLine();
        System.out.print("\tNombre: ");
        nc5=br.readLine();
        System.out.print("\tAlcalde: ");
        n5=br.readLine();   
        
    Capital Cap1,Cap2,Cap3,Cap4,Cap5;
        Cap1=new Capital(cd1,n1,n1);
        Cap2=new Capital(cd2,n2,n2);
        Cap3=new Capital(cd3,n3,n3);
        Cap4=new Capital(cd4,n4,n4);
        Cap5=new Capital(cd5,n5,n5);    
    //PAÍS:
    System.out.println("PAÍS 1: ");
        System.out.print("\tNombre: ");
        p1=br.readLine();
        System.out.print("\tMoneda: ");
        m1=br.readLine();
        System.out.print("\tIdioma: ");
        i1=br.readLine();
        System.out.print("\tPresidente: ");
        pr1=br.readLine();
        do{
         System.out.print("\tPoblación: ");
        pb1=Double.parseDouble(br.readLine());
        }while(pb1<=500);
    System.out.println("PAÍS 2: ");
        System.out.print("\tNombre: ");
        p2=br.readLine();
        System.out.print("\tMoneda: ");
        m2=br.readLine();
        System.out.print("\tIdioma: ");
        i2=br.readLine();
        System.out.print("\tPresidente: ");
        pr2=br.readLine();
        do{
         System.out.print("\tPoblación: ");
        pb2=Double.parseDouble(br.readLine());
        }while(pb2<=500);   
    System.out.println("PAÍS 3: ");
        System.out.print("\tNombre: ");
        p3=br.readLine();
        System.out.print("\tMoneda: ");
        m3=br.readLine();
        System.out.print("\tIdioma: ");
        i3=br.readLine();
        System.out.print("\tPresidente: ");
        pr3=br.readLine();
        do{
         System.out.print("\tPoblación: ");
        pb3=Double.parseDouble(br.readLine());
        }while(pb3<=500);    
        
    PaisSud ps1,ps2,ps3;
    ps1=new PaisSud(p1,m1,i1,pr1,pb1,Cap1);
    ps2=new PaisSud(p2,m2,i2,pr2,pb2,Cap2);
    ps3=new PaisSud(p3,m3,i3,pr3,pb3,Cap3);
    
    System.out.print("\nPAÍS 1: \n"+ps1.toString());
    System.out.print("\nPAÍS 2: \n"+ps2.toString());
    System.out.print("\nPAÍS 3: \n"+ps3.toString());
    
    //MODIFICAR CAPITAL:
    System.out.println("\n MODIFCAR CAPITAL");
       System.out.print("Seleccione un país"); 
       System.out.println("1- País 1");
       System.out.println("2- País 2");
       System.out.println("3- País 3");
       System.out.println("4- Finalizar modificación");
       do{
          System.out.print("\nSeleccione opción: ");
          opc=Integer.parseInt(br.readLine());
          }while(opc<1 || opc>4);
        switch (opc){
            case 1: System.out.print("\nCAPITAL 1");
                    System.out.print("\n\tIngrese nuevo código postal: ");
                    cd1=br.readLine();
                    System.out.print("\n\tIngrese nuevo nombre de capital: ");
                    nc1=br.readLine();
                    System.out.print("\n\tIngrese nuevo nombre de alcalde: ");
                    n1=br.readLine();
                    Cap1.setCapital(cd1,nc1,n1);
                    System.out.print("\nNUEVO REPORTE - PAÍS: "+Cap1.toString());
;
                    break;
            case 2: System.out.print("\nCAPITAL 2");
                    System.out.print("\n\tIngrese nuevo código postal: ");
                    cd2=br.readLine();
                    System.out.print("\n\tIngrese nuevo nombre de capital: ");
                    nc2=br.readLine();
                    System.out.print("\n\tIngrese nuevo nombre de alcalde: ");
                    n2=br.readLine();
                    Cap2.setCapital(cd2,nc2,n2);
                    System.out.print("\nNUEVO REPORTE - PAÍS: "+Cap2.toString());
                    break;
            case 3: System.out.print("\nCAPITAL 3");
                    System.out.print("\n\tIngrese nuevo código postal: ");
                    cd3=br.readLine();
                    System.out.print("\n\tIngrese nuevo nombre de capital: ");
                    nc3=br.readLine();
                    System.out.print("\n\tIngrese nuevo nombre de alcalde: ");
                    n3=br.readLine();
                    Cap3.setCapital(cd3,nc3,n3);
                    System.out.print("\nNUEVO REPORTE - PAÍS: "+Cap3.toString());
                    break;  
            case 4: System.out.println("Fin de programa");
                    break;
        }
    
    
    
    }
    
}
