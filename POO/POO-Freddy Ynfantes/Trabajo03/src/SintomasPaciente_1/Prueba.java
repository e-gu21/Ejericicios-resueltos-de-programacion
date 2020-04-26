
package SintomasPaciente_1;

import java.io.*;
public class Prueba {

    static BufferedReader br=new BufferedReader (new InputStreamReader (System.in));
    public static void main(String[] args)throws IOException {
        
        /// IMPLEMENTACION DE ARREGLO ///
        
        int n=10; /// Esta variable es para el tamaño del arreglo, originalmente esta en 10 por como indica 
                 /// el caso, pero puede ponerse un valor mas bajo para hacer mas corto el proceso.
        
        Paciente p[]=new Paciente[n];
        
        /// VARIABLES A USAR ///
        
        String s1,s2;
        long l;
        
        /// CREACION DE PACIENTES (10) ///
        
        for(int i=1;i<=n;i++){
            System.out.println("PACIENTE "+i+":");
            System.out.print("Ingrese DNI: ");
            l=Long.parseLong(br.readLine());           
            System.out.print("Ingrese Nombre: ");
            s1=br.readLine();          
            p[i-1]= new Paciente(l,s1);
            for(int j=1;j<=3;j++){
                System.out.println("SÍNTOMA "+j+":");
                System.out.print("Ingrese Descripcion de Sintoma: ");
                s1=br.readLine();
                
                System.out.print("Ingrese Tipo de Síntoma: ");
                s2=br.readLine();
                
                p[i-1].agregarSintoma(new Sintomas(s1,s2));
                
            }
            System.out.println("\n");
        }
        
        /// CREACION DE SINTOMAS (3 por Paciente) ///
        
        /*for(int i=1;i<=n;i++){
            for(int j=1;j<=3;j++){
                System.out.println("Ingrese Descripcion de Sintoma("+j+") de Paciente p"+i+": ");
                s1=br.readLine();
                
                System.out.println("Ingrese Tipo de Sintoma("+j+") de Paciente p"+i+": ");
                s2=br.readLine();
                
                p[i-1].agregarSintoma(new Sintomas(s1,s2));
            }
        }*/
        
        /// REPORTE CON TOSTRING Y EL METODO LISTASINTOMAS() ///
        
        for(int i=0;i<n;i++){
        System.out.println(p[i].toString());
        p[i].listaSintomas();
        }
    }
    
}
