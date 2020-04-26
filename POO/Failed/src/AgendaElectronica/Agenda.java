
package AgendaElectronica;

import java.util.*;

public class Agenda {
    
    private ArrayList<Persona> agenda;
    private ArrayList<ContactosProfesional> agCP;
    private ArrayList<Familia> agF;
    private ArrayList<ContactosEstudio> agCE;
    
    public Agenda(){
        agenda = new ArrayList();
        agCP = new ArrayList();
        agF = new ArrayList();
        agCE = new ArrayList();
    }
    
    public void agregarAgenda(Persona n){
        agenda.add(n);
    }
    
    public void agregarProfesional(ContactosProfesional n){
        agCP.add(n);
        agregarAgenda(n);
    }
    
    public void agregarFamilia(Familia n){
        agF.add(n);
        agregarAgenda(n);
    }
    
    public void agregarEstudio(ContactosEstudio n){
        agCE.add(n);
        agregarAgenda(n);
    }
    
    public void buscarNombre(String n){
        int p=-1;
        for(int i=0;i<agenda.size();i++){
            if(agenda.get(i).getNombre().compareTo(n)==0){
                p=i;
                i=agenda.size();
            }
        }
        if(p==-1){
            System.out.println("*No se encontro Nombre*");
        }
        else{
            System.out.println(agenda.get(p));
        }
    }
    
    public void buscarDNI(String n){
        int p=-1;
        for(int i=0;i<agenda.size();i++){
            if(agenda.get(i).getDNI().compareTo(n)==0){
                p=i;
                i=agenda.size();
            }
        }
        if(p==-1){
            System.out.println("*No se encontro DNI*");
        }
        else{
            System.out.println(agenda.get(p));
        }
    }
    
    public void actualizarTelefono(int i,String n){
        agenda.get(i-1).setTelefono(n);
    }
    
    public void actualizarDireccion(int i,String n){
        agCE.get(i-1).setDireccion(n);
    }
    
    public void eliminarContacto(int i){
        agenda.remove(i-1);
        for(int j=0;j<agCP.size();j++){
            if(agenda.get(i-1)==agCP.get(j)){
                agCP.remove(j-1);
            }
        }
        for(int j=0;j<agF.size();j++){
            if(agenda.get(i-1)==agF.get(j)){
                agF.remove(j-1);
            }
        }
        for(int j=0;j<agCE.size();j++){
            if(agCE.get(j)==agenda.get(i-1)){
                agCE.remove(j-1);
            }
        }
    }
    
    public void mostrarAgenda(){
        System.out.println("***LISTA GENERAL***");
        for(int i=0;i<agenda.size();i++){
            System.out.println((i+1)+". "+agenda.get(i));
        }
    }
    
    public void mostrarAgCP(){
        System.out.println("*CONTACTOS PROFESIONALES*");
        for(int i=0;i<agCP.size();i++){
            System.out.println((i+1)+". "+agCP.get(i));
        }
    }
    
    public void mostrarAgF(){
        System.out.println("*FAMILIA*");
        for(int i=0;i<agF.size();i++){
            System.out.println((i+1)+". "+agF.get(i));
        }
    }
    
    public void mostrarAgCE(){
        System.out.println("*CONTACTOS DE ESTUDIO*");
        for(int i=0;i<agCE.size();i++){
            System.out.println((i+1)+". "+agCE.get(i));
        }
    }
    
    public int getNContactos(){
        return agenda.size();
    }
    
    public int getNCE(){
        return agCE.size();
    }
}
