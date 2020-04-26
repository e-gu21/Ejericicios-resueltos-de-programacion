package ejercicio3_GradosUrtecho;
import java.io.*;
public class Prueba {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     static int n=0;
    static String id,nom;
    static String esp;
    static int edad;
    static float sueld;
    static Administrativo oa;
    static DocenteContratado odc;
    static DocenteNombrado odn;
    
    static Control trabajadores= new Control();
    
    public static void main(String[] args) throws IOException {
        
        int opc;
        char t;
        do{
            opc=menu();
            switch(opc){
                case 1: n=LeerN();
                        t=LeerTipo();
                        if(t=='A')
                            ingresar1();
                        if(t=='C')
                            ingresar2();
                        if(t=='N')
                            ingresar3();
                        break;
                
                case 2: edadPromedio();
                        break;
                      
                case 3: mayorSueldo();
                        break;
                        
                case 4: buscar();
                        break;
                    
                case 5: eliminar();
                        break;
                        
                case 6: reportar();
                        break;
                        
                case 7: finalizar();
                        break;
            }
        }while(opc!=7);
        }
     static int menu()throws IOException{
            int opc;
            do{
                System.out.println("Menu de opciones");
                System.out.println("1.-Crear trabajadores");
                System.out.println("2.-Mostrar la edad promedio de los docentes");
                System.out.println("3.-Mayor sueldo de los docentes contratados");
                System.out.println("4.-Buscar un trabajador por id");
                System.out.println("5.-Eliminar un trabajador");
                System.out.println("6.-Reportar la lista de trabajadores");
                System.out.println("7.-Finalizar");
                System.out.println("Ingrese la opcion: ");
                opc=Integer.parseInt(br.readLine());
            }while(opc<1 || opc>7);
            return opc;
        }
      static int LeerN()throws IOException{
            do{
            System.out.println("Ingrese la cantidad de trabajadores");
            n=Integer.parseInt(br.readLine());
            }while(n<=0);
            return n;
        }
              static char LeerTipo()throws IOException{
            char tip;
            do{
            System.out.println("Ingrese tipo de trabajador:");
            System.out.println("A=Administrativo");
            System.out.println("C=Docene contratado");
            System.out.println("N=Docente nombrado");
            System.out.println("Elija una opcion");
            tip=br.readLine().toUpperCase().charAt(0);
            }while(tip!='A' && tip!='C' && tip!='N');
            return tip;
        }
    static void ingresar1()throws IOException{
            String esc,lab;
            float suel;
            int k=1;
            System.out.println("Ingreso de datos del Administrativo!");
            for(int i=0; i<n;i++){
                System.out.println("\nIngreso del "+k+" administrativo");
                System.out.println("Ingrese ID: ");
                id=br.readLine();
                System.out.println("Ingrese nombre: ");
                nom=br.readLine();
                System.out.println("Ingrese escuela: ");
                esc=br.readLine();
                System.out.println("Ingrese labor: ");
                lab=br.readLine();
                System.out.println("Ingrese sueldo: ");
                suel=Float.parseFloat(br.readLine());
                
                oa=new Administrativo(id,nom,esc,lab,suel);
                trabajadores.agregarAdministrativos(oa);
                k++;
            }
        }
        static void ingresar2()throws IOException{
            int hxs;
            float pxh,pex;
            int k=1;
            System.out.println("Ingreso de datos del Docente contratado!");
            for(int i=0; i<n;i++){
                System.out.println("\nIngreso del "+k+" docente contratado");
                System.out.println("Ingrese ID: ");
                id=br.readLine();
                System.out.println("Ingrese nombre: ");
                nom=br.readLine();
                System.out.println("Ingrese edad: ");
                edad=Integer.parseInt(br.readLine());
                System.out.println("Ingrese especialidad: ");
                esp=br.readLine();
                System.out.println("Ingrese numero de horas por semana: ");
                hxs=Integer.parseInt(br.readLine());
                System.out.println("Ingrese el pago por hora: ");
                pxh=Float.parseFloat(br.readLine());
                System.out.println("Ingrese el pago extra del docente: ");
                pex=Float.parseFloat(br.readLine());
                    
                odc=new DocenteContratado(id,nom,edad,esp,hxs,pxh,pex);
                trabajadores.agregarDocenteContratado(odc);
            }
        }
        static void ingresar3()throws IOException{
            String com;
            float suel;
            int k=1;
            System.out.println("Ingreso de datos del Docente nombrado!");
            for(int i=0; i<n;i++){
                System.out.println("\nIngreso del "+k+" doncete nombrado");
                System.out.println("Ingrese ID: ");
                id=br.readLine();
                System.out.println("Ingrese nombre: ");
                nom=br.readLine();
                System.out.println("Ingrese edad: ");
                edad=Integer.parseInt(br.readLine());
                System.out.println("Ingrese especialidad");
                esp=br.readLine();
                System.out.println("Ingrese sueldo: ");
                suel=Float.parseFloat(br.readLine());
                System.out.println("Ingrese la comicion a la que pertenece ");
                com=br.readLine();
                
                odn=new DocenteNombrado(id,nom,edad,esp,suel,com);
                trabajadores.agregarDocenteNombrado(odn);
            }
        }
                static void edadPromedio()throws IOException{
            float ed;
            ed=trabajadores.calcularEdadPromedio();
            System.out.println("La edad promedio es: "+ed);
        }
                static void mayorSueldo()throws IOException{
            float may=0;
            for(int i=0;i<trabajadores.obtenerNumeroDocentesContratados();i++){
                odc=trabajadores.retornarDocenteContratado(i);
                sueld=odc.calcularSueldoContratado();
                if(sueld>may){
                   may=sueld; 
                }
            }
            System.out.println("El mayor sueldo es: "+may);
        }
        static void buscar()throws IOException{
            System.out.println("Ingrese ID del trabajador: ");
            id=br.readLine();
            odc=trabajadores.buscarContratadoID(id);
            if(odc!=null){
                System.out.println("Trabajador: "+odc+"\nSueldo: "+odc.calcularSueldoContratado());
            }
            odn=trabajadores.buscarNombradoID(id);
            if(odn!=null){
                System.out.println("Trabajador: "+odn+"\nSueldo: "+odn.calcularSueldoNombrado());
            }
            oa=trabajadores.buscarAdministrativoID(id);
            if(oa!=null){
                System.out.println("Trabajador: "+oa+"\nSueldo: "+oa.calcularSueldoAdministrativos());
            }
        }
         static void eliminar()throws IOException{
            System.out.println("Buscar el trabajador que desea eliminar");
            buscar();
            if(odc!=null){
                    trabajadores.eliminarContratado(odc);
                    System.out.println("Se ha eliminado el trabajador");
                }
            if(odn!=null){
                    trabajadores.eliminarNombrado(odn);
                    System.out.println("Se ha eliminado el trabajador");
                }
            if(oa!=null){
                    trabajadores.eliminarAdminstrativos(oa);
                    System.out.println("Se ha eliminado el trabajador");
                }
        }
        static void reportar()throws IOException{
            System.out.println("Reporte");
            System.out.println("Docentes Contratados");
            System.out.println(trabajadores.reportarContratado());
            System.out.println("Docentes Nombrados");
            System.out.println(trabajadores.reportarNombrado());
            System.out.println("Administrativos");
            System.out.println(trabajadores.reportarAdministrativos());
        }
        static void finalizar()throws IOException{
            System.out.println("Fin del programa");
            System.out.println("GRACIAS");
        } 
}
