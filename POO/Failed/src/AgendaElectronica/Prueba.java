
package AgendaElectronica;

import java.io.*;

public class Prueba {

    static BufferedReader br=new BufferedReader (new InputStreamReader(System.in));
    
    public static void main(String[] args) throws IOException {
        
        Agenda agenda = new Agenda();
        
        int opc;
        
        do{
            opc=menu();
            switch(opc){
                case 1:agregarN(agenda);agenda.mostrarAgenda();break;
                case 2:buscarDNI(agenda);break;
                case 3:buscarNombre(agenda);break;
                case 4:
                    if(agenda.getNContactos()!=0){
                        actualizarT(agenda);agenda.mostrarAgenda();
                    }else{
                        System.out.println("*NO HAY CONTACTOS EN LA AGENDA*");
                    }
                    break;
                case 5:
                    if(agenda.getNCE()!=0){
                        actualizarD(agenda);agenda.mostrarAgCE();
                    }else{
                        System.out.println("*NO HAY CONTACTOS DE ESTUDIO*");
                    }
                    break;
                case 6:
                    if(agenda.getNContactos()!=0){
                        eliminar(agenda);agenda.mostrarAgenda();
                    }
                    else{
                        System.out.println("*NO HAY CONTACTOS EN LA AGENDA*");
                    }
                    break;
                case 7:
                    if(agenda.getNContactos()!=0){
                        agenda.mostrarAgCP();agenda.mostrarAgF();agenda.mostrarAgCE();
                    }
                    else{
                        System.out.println("*NO HAY CONTACTOS EN LA AGENDA*");
                    }
                    break;
                case 8:terminar();break;
            }
        }while(opc!=8);
    }
    
    static int menu()throws IOException{
        int n;
        
        do{
            System.out.println("*MENU*");
            System.out.println("1. Agregar N Contactos");
            System.out.println("2. Buscar contacto por DNI");
            System.out.println("3. Buscar contacto por Nombre");
            System.out.println("4. Actualizar telefono");
            System.out.println("5. Actualizar direccion");
            System.out.println("6. Eliminar contacto");
            System.out.println("7. Mostrar contactos por Tipo");
            System.out.println("8. Terminar");
            n=Integer.parseInt(br.readLine());
        }while(n<1||n>8);
        
        return n;
    }
    
    static void agregarN(Agenda a) throws IOException{
        String s1,s2,s3,s4,s5;
        int e;
        System.out.println("¿Cuantos contactos desea agregar?: ");
        int n=Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            System.out.println("*Ingreso de Datos de Contacto "+(i+1)+"*");
            System.out.print("DNI: ");
            s1=br.readLine();
            System.out.print("Nombre: ");
            s2=br.readLine();
            System.out.print("Telefono: ");
            s3=br.readLine();
            do{
                System.out.println("1. Contacto Profesional");
                System.out.println("2. Familia");
                System.out.println("3. Contacto de Estudio");
                System.out.print("¿Que tipo de contacto es?: ");
                e=Integer.parseInt(br.readLine());
            }while(e<1||e>3);
            if(e==1){
                System.out.print("Profesion: ");
                s4=br.readLine();
                a.agregarProfesional(new ContactosProfesional(s1,s2,s3,s4));
            }
            if(e==2){
                System.out.print("Parentesco: ");
                s4=br.readLine();
                a.agregarFamilia(new Familia(s1,s2,s3,s4));
            }
            if(e==3){
                System.out.print("Lugar de Trabajo: ");
                s4=br.readLine();
                System.out.print("Direccion: ");
                s5=br.readLine();
                a.agregarEstudio(new ContactosEstudio(s1,s2,s3,s4,s5));
            }
        }
    }
    
    static void buscarNombre(Agenda a)throws IOException{
        System.out.print("Ingrese Nombre de contacto a buscar: ");
        String e=br.readLine();
        
        a.buscarNombre(e);
    }
    
    static void buscarDNI(Agenda a)throws IOException{
        System.out.print("Ingrese DNI de contacto a buscar: ");
        String e=br.readLine();
        
        a.buscarDNI(e);
    }
    
    static void actualizarT(Agenda a)throws IOException{
        System.out.print("¿Que contacto desea actualizarle el telefono?(Numero de la Lista General): ");
        int i=Integer.parseInt(br.readLine());
        System.out.print("Ingrese numero a actualizar: ");
        String e=br.readLine();
        a.actualizarTelefono(i, e);
    }
    
    static void actualizarD(Agenda a)throws IOException{
        a.mostrarAgCE();
        System.out.print("¿Que Contacto de Estudio desea actualizarle la direccion?(Numero de la Lista): ");
        int i=Integer.parseInt(br.readLine());
        System.out.print("Ingrese direccion a actualizar: ");
        String e=br.readLine();
        a.actualizarDireccion(i, e);
    }
    
    static void eliminar(Agenda a)throws IOException{
        System.out.print("¿Que contacto desea eliminar?(Numero de la Lista General): ");
        int i=Integer.parseInt(br.readLine());
        a.eliminarContacto(i);
    }
    
    static void terminar()throws IOException{
        System.out.println("*FIN DEL PROGRAMA*");
    }
}
