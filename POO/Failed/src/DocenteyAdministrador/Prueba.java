
package DocenteyAdministrador;

import java.io.*;

public class Prueba {
    
    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));

    public static void main(String[] args)throws IOException {
        
        Control control = new Control();
        
        int opc;
        do{
            opc=menu();
            switch(opc){
                case 1:agregarN(control);control.mostrarLista();break;
                case 2:
                    if(control.getNTrabajadores()!=0){
                        control.edadPromedioDocente();
                    }
                    else{
                        System.out.println("*NO HAY TRABAJADORES EN LA BASE DE DATOS*");
                    }
                    break;
                case 3:control.mayorSueldoContratado();break;
                case 4:buscarID(control);break;
                case 5:
                    if(control.getNTrabajadores()!=0){
                        eliminar(control);control.mostrarLista();
                    }
                    else{
                        System.out.println("*NO HAY TRABAJADORES EN LA BASE DE DATOS*");
                    }
                    break;
                case 6:
                    if(control.getNTrabajadores()!=0){
                        control.mostrarListaA();control.mostrarListaD();
                    }
                    else{
                        System.out.println("*NO HAY TRABAJADORES EN LA BASE DE DATOS*");
                    }
                    break;
                case 7:terminar();break;
            }
        }while(opc!=7);
    }
    
    static int menu()throws IOException{
        int n;
        
        do{
            System.out.println("*MENU*");
            System.out.println("1. Agregar N Trabajadores");
            System.out.println("2. Edad Promedio de Docentes");
            System.out.println("3. Mayor Sueldo de Docentes Contratados");
            System.out.println("4. Buscar Trabajador por ID");
            System.out.println("5. Eliminar Trabajador");
            System.out.println("6. Mostrar Trabajadores por Tipo");
            System.out.println("7. Terminar");
            n=Integer.parseInt(br.readLine());
        }while(n<1||n>7);
        
        return n;
    }
    
    static void agregarN(Control c) throws IOException{
        String s1,s2,s3,s4;
        float f1,f2;
        int e,f,ed,h;
        System.out.println("¿Cuantos Trabajadores desea agregar?: ");
        int n=Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            System.out.println("*Ingreso de Datos de Trabajador "+(i+1)+"*");
            System.out.print("ID: ");
            s1=br.readLine();
            System.out.print("Nombre: ");
            s2=br.readLine();
            do{
                System.out.println("1. Administrativo");
                System.out.println("2. Docente");
                System.out.print("¿Que tipo de Trabajador es?: ");
                e=Integer.parseInt(br.readLine());
            }while(e<1||e>2);
            if(e==1){
                System.out.print("Escuela: ");
                s3=br.readLine();
                System.out.print("Labor: ");
                s4=br.readLine();
                System.out.print("Sueldo: ");
                f1=Float.parseFloat(br.readLine());
                c.agregarAdministrativo(new Administrativo(s1,s2,s3,s4,f1));
            }
            if(e==2){
                System.out.print("Edad: ");
                ed=Integer.parseInt(br.readLine());
                System.out.print("Especialidad: ");
                s3=br.readLine();
                do{
                    System.out.println("1. Contratado");
                    System.out.println("2. Nombrado");
                    System.out.print("¿Que tipo de Docente es?: ");
                    f=Integer.parseInt(br.readLine());
                }while(f<1||f>2);
                if(f==1){
                    System.out.print("Horas por Semana: ");
                    h=Integer.parseInt(br.readLine());
                    System.out.print("Pago por Hora: ");
                    f1=Float.parseFloat(br.readLine());
                    System.out.print("Pago Extra: ");
                    f2=Float.parseFloat(br.readLine());
                    c.agregarDocenteC(new DocenteContratado(s1,s2,ed,s3,h,f1,f2));
                }
                if(f==2){
                    System.out.print("sueldo: ");
                    f1=Float.parseFloat(br.readLine());
                    System.out.print("Comision: ");
                    s4=br.readLine();
                    c.agregarDocenteN(new DocenteNombrado(s1,s2,ed,s3,f1,s4));
                }
            }
        }
    }
    
    static void buscarID(Control c)throws IOException{
        System.out.print("Ingrese ID de Trabajador a buscar: ");
        String e=br.readLine();
        
        c.buscarID(e);
    }
    
    static void eliminar(Control c)throws IOException{
        System.out.print("¿Que Trabajador desea eliminar?(Numero de la Lista General): ");
        int i=Integer.parseInt(br.readLine());
        c.eliminarTrabajador(i);
    }
    
    static void terminar()throws IOException{
        System.out.println("*FIN DEL PROGRAMA*");
    }
}
