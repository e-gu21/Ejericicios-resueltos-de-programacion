
package DocenteyAdministrador;

import java.util.*;

public class Control {
    
    private ArrayList<Persona> lista;
    private ArrayList<Administrativo> listaA;
    private ArrayList<Docente> listaD;
    private ArrayList<DocenteContratado> listaDC;
    private ArrayList<DocenteNombrado> listaDN;
    
    public Control(){
        lista = new ArrayList();
        listaA = new ArrayList();
        listaD = new ArrayList();
        listaDC = new ArrayList();
        listaDN = new ArrayList();
    }
    
    public void agregarControl(Persona n){
        lista.add(n);
    }
    
    public void agregarAdministrativo(Administrativo n){
        listaA.add(n);
        agregarControl(n);
    }
    
    public void agregarDocente(Docente n){
        listaD.add(n);
        agregarControl(n);
    }
    
    public void agregarDocenteC(DocenteContratado n){
        listaDC.add(n);
        agregarDocente(n);
    }
    
    public void agregarDocenteN(DocenteNombrado n){
        listaDN.add(n);
        agregarDocente(n);
    }
    
    public void edadPromedioDocente(){
        int s=0,p;
        for(int i=0;i<listaD.size();i++){
            s=s+listaD.get(i).getEdad();
        }
        p=s/listaD.size();
        System.out.println("Edad promedio de Docentes: "+p);
    }
    
    public void mayorSueldoContratado(){
        float max=0;
        for(int i=0;i<listaDC.size();i++){
            for(int j=0;j<listaDC.size();j++){
                if(listaDC.get(i).getSueldo()>listaDC.get(j).getSueldo()){
                    max=listaDC.get(i).getSueldo();
                }
            }
        }
        System.out.println("Mayor Sueldo en los Docentes Contratados: "+max);
    }
    
    public void buscarID(String n){
        int p=-1;
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getID().compareTo(n)==0){
                p=i;
                i=lista.size();
            }
        }
        if(p==-1){
            System.out.println("*No se encontro ID*");
        }
        else{
            System.out.println(lista.get(p));
        }
    }
    
    public void eliminarTrabajador(int i){
        lista.remove(i-1);
        for(int j=0;j<listaA.size();j++){
            if(lista.get(i-1)==listaA.get(j)){
                listaA.remove(j-1);
            }
        }
        for(int j=0;j<listaD.size();j++){
            if(lista.get(i-1)==listaD.get(j)){
                listaD.remove(j-1);
            }
        }
        for(int j=0;j<listaDC.size();j++){
            if(lista.get(i-1)==listaDC.get(j)){
                listaDC.remove(j-1);
            }
        }
        for(int j=0;j<listaDN.size();j++){
            if(lista.get(i-1)==listaDN.get(j)){
                listaDN.remove(j-1);
            }
        }
    }
    
    public void mostrarLista(){
        System.out.println("***LISTA GENERAL***");
        for(int i=0;i<lista.size();i++){
            System.out.println((i+1)+". "+lista.get(i));
        }
    }
    
    public void mostrarListaA(){
        System.out.println("**ADMINISTRATIVOS**");
        for(int i=0;i<listaA.size();i++){
            System.out.println((i+1)+". "+listaA.get(i));
        }
    }
    
    public void mostrarListaDC(){
        System.out.println("*DOCENTES CONTRATADOS*");
        for(int i=0;i<listaDC.size();i++){
            System.out.println((i+1)+". "+listaDC.get(i));
        }
    }
    
    public void mostrarListaDN(){
        System.out.println("*DOCENTES NOMBRADOS*");
        for(int i=0;i<listaDN.size();i++){
            System.out.println((i+1)+". "+listaDN.get(i));
        }
    }
    
    public void mostrarListaD(){
        System.out.println("**DOCENTES**");
        mostrarListaDC();
        mostrarListaDN();
    }
    
    public int getNTrabajadores(){
        return lista.size();
    }
}
