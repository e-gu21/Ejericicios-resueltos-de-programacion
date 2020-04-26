package ejercicio2_GradosUretcho;
import java.io.*;
public class PruebaAgenda {
    static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    static int n=0;
    static String dni,nom; 
    static int tel;
    static ContactoProfesional cp;
    static Familia f;
    static ContactoEstudio ce;
    static AgendaElectronica contactos= new AgendaElectronica();
    public static void main(String[] args) throws IOException{
       int opc;
       char t;
       do{
           opc=menu();
           switch(opc){
               case 1: n=LeerN();
                       t=LeerTipo();
                       if(t=='P'){
                         ingresar1();
                       }
                     if(t=='F'){
                         ingresar2();
                     }
                     if(t=='E'){
                         ingresar3();
                     }
                     break;
                case 2: buscar();
                        break;
                      
                case 3: actualizar();
                        break;
                        
                case 4: eliminar();
                        break;
                    
                case 5: reportar();
                        break;
                        
                case 6: finalizar();
                        break;     
           }
       }while(opc!=6);       
    }
    static int menu()throws IOException{
        int opc;
        do{
         System.out.println("BIENVENIDO AL MENÚ DE OPCIONES");
         System.out.println("Por favor, elija una opción: ");
         opc=Integer.parseInt(br.readLine());
         System.out.println("1.-Crear contacto");
         System.out.println("2.-Buscar contacto");
         System.out.println("3.-Actualizar contacto");
         System.out.println("4.-Eliminar contacto");
         System.out.println("6.-Terminar");
        }while(opc<1||opc>6);
        return opc;
    }
    static int LeerN()throws IOException{
        int n;
        do{
            System.out.println("Cantidad de contactos nuevos");
            n=Integer.parseInt(br.readLine());
        }while(n<=0);
        return n;
    }
    
    static char LeerTipo()throws IOException{
        char t;
        do{
            System.out.println("Tipo de contacto:");
            System.out.println("Elija una opcion");
            System.out.println("Contacto Profesional: P");
            System.out.println("Familia: F" );
            System.out.println("Contactos Estudio: E");           
            t=br.readLine().toUpperCase().charAt(0);
            }while(t!='P' && t!='F' && t!='E');
            return t;
    }
    static void ingresar1()throws IOException{
        String profesion;
        int o=1,i;
        System.out.println("CONTACTO PROFESIONAL");
        for(i=0;i<n;i++){
           System.out.println("\nIngreso del "+o+" Contacto");
                System.out.println("Nombre: ");
                nom=br.readLine();
                System.out.println("Telefono: ");
                tel=Integer.parseInt(br.readLine());
                System.out.println("DNI: ");
                dni=br.readLine();
                System.out.println("Profesión: ");
                profesion=br.readLine();
                
                cp=new ContactoProfesional(nom,dni,tel,profesion);
                contactos.agregarContactoP(cp);
                o++; 
        }
    }
    static void ingresar2()throws IOException{
       String parentesco;
       int o=1,i;
       System.out.println("CONTACTO FAMILIAR");
       for(i=0;i<n;i++){
           System.out.println("\nIngreso del "+o+" Contacto");
                System.out.println("Nombre: ");
                nom=br.readLine();
                System.out.println("Telefono: ");
                tel=Integer.parseInt(br.readLine());
                System.out.println("DNI: ");
                dni=br.readLine();
                System.out.println("Parentesco: ");
                parentesco=br.readLine();
                
                f=new Familia(nom,dni,tel,parentesco);
                contactos.agregarContactoF(f);
                o++;
       }
    }
    static void ingresar3()throws IOException{
        String lg,dir;
        int o=1,i;
        System.out.println("CONTACTO DE ESTUDIO");
       for(i=0;i<n;i++){
           System.out.println("\nIngreso del "+o+" Contacto");
                System.out.println("Nombre: ");
                nom=br.readLine();
                System.out.println("Telefono: ");
                tel=Integer.parseInt(br.readLine());
                System.out.println("DNI: ");
                dni=br.readLine();
                System.out.println("Lugar de trabajo: ");
                lg=br.readLine();
                System.out.println("Dirección: ");
                dir=br.readLine();
                
                ce=new ContactoEstudio(nom,dni,tel,lg,dir);
                contactos.agregarContactoE(ce);
                o++;
       } 
    }
    static void buscar()throws IOException {
        int opc;
        do{
           System.out.println("BUSCAR CONTACTO");
            System.out.println("Elija una forma de buscar");
            System.out.println("1.- Nombre");
            System.out.println("2.- DNI");
            opc=Integer.parseInt(br.readLine());           
        }while(opc<1||opc>2);
            if(opc==1){
                System.out.println("Ingrese nombre: ");
                nom=br.readLine();
                cp=contactos.buscarContactoxNombreCP(nom);
                if(cp!=null){
                    System.out.println(cp);
                }
                ce=contactos.buscarContactoxNombreCE(nom);
                if(ce!=null){
                    System.out.println(ce);
                }
                f=contactos.buscarContactoxNombreFamilia(nom);
                if(f!=null){
                    System.out.print(f);
                }               
            } 
            if(opc==2){
               System.out.println("Ingrese dni: ");
               dni=br.readLine();
               cp=contactos.buscarContactoxNombreCP(dni);
               if(cp!=null){
                    System.out.println(cp);
                }
               ce=contactos.buscarContactoxNombreCE(dni);
               if(ce!=null){
                    System.out.println(ce);
                }
               f=contactos.buscarContactoxDNIFamilia(dni);
               if(f!=null){
                    System.out.print(f);
                }
            }      
    }
    static void actualizar()throws IOException{
            int opc,tel;
            String dir;
            do{
                System.out.println("¿Qué desea actualizar?");
                System.out.println("1.-Telefono");
                System.out.println("2.-Direccion");
                opc=Integer.parseInt(br.readLine());
            }while(opc<1 || opc>2);            
            if(opc==1){
                System.out.println("Buscar el contacto que desea actualizar");
                buscar();
                if(ce!=null){
                    System.out.println("Ingrese nuevo número de teléfono");
                    tel=Integer.parseInt(br.readLine());
                    ce.setTelefono(tel);
                }
                if(f!=null){
                    System.out.println("Ingrese nuevo telefono");
                    tel=Integer.parseInt(br.readLine());
                    f.setTelefono(tel);
                }
                if(cp!=null){
                    System.out.println("Ingrese nuevo telefono");
                    tel=Integer.parseInt(br.readLine());
                    cp.setTelefono(tel);
                }
            }            
            if(opc==2){
                System.out.println("Buscar el contacto que desea actualizar");
                buscar();
                if(ce!=null){
                    System.out.println("Ingrese nueva direccion");
                    dir=br.readLine();
                    ce.setDireccion(dir);
                }
                else{
                    System.out.println("No existen datos;");
                    System.out.println(" :'v ");
                }
            }
        }
    static void eliminar()throws IOException{
            System.out.println("Buscar el contacto que desea eliminar");
            buscar();
            if(ce!=null){
                    contactos.eliminarCE(ce);
                    System.out.println("Se ha eliminado el contacto");
                }
            if(f!=null){
                    contactos.eliminarF(f);
                    System.out.println("Se ha eliminado el contacto");
                }
            if(cp!=null){
                    contactos.eliminarCP(cp);
                    System.out.println("Se ha eliminado el contacto");
                }
        }
    static void reportar()throws IOException{
            System.out.println("REPORTE DE CONTACTOS");
            System.out.println("Contactos profesional");
            System.out.println(contactos.listaContactoCP());
            System.out.println("Contactos Familia");
            System.out.println(contactos.listaContactoFamilia());
            System.out.println("Contactos Estudio");
            System.out.println(contactos.listaContactoCE());        
        }
    static void finalizar()throws IOException{
            System.out.println("Hasta luego");
        }   
}
