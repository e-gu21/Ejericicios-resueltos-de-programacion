package ejercicio3_GradosUrtecho;
import java.util.*;
public class Control {
    private ArrayList<DocenteContratado> contratado;
    private ArrayList<DocenteNombrado> nombrado;
    private ArrayList<Administrativo> administrativos;
    
    Control(){
        contratado=new ArrayList<>();
        nombrado=new ArrayList<>();
        administrativos=new ArrayList<>();
    }
    public void agregarDocenteContratado(DocenteContratado t){
        contratado.add(t);
    }
    public void agregarDocenteNombrado(DocenteNombrado t){
        nombrado.add(t);
    }
    public void agregarAdministrativos(Administrativo t){
        administrativos.add(t);
    }
    public DocenteContratado retornarDocenteContratado(int x){
        return contratado.get(x);
    }
    public DocenteNombrado retornarDocenteNombrado(int x){
        return nombrado.get(x);
    }
    public Administrativo retornarAdministrativo(int x){
        return administrativos.get(x);
    }
    public int obtenerNumeroDocentesContratados(){
        return contratado.size();
    }
    public int obtenerNumeroDocentesNombrado(){
        return nombrado.size();
    }
    public int obtenerNumeroAdministrativo(){
        return administrativos.size();
    }
    public float calcularEdadPromedio(){
         float nom=0,cont=0,prom,sum;
        for(DocenteNombrado n: nombrado){
            nom=nom+n.getEdad();
        }
        for(DocenteContratado c: contratado){
            cont=cont+c.getEdad();
        }
        sum=nom+cont;
        prom=sum/(this.obtenerNumeroDocentesContratados()+this.obtenerNumeroDocentesNombrado());
        return prom;
    }
        public DocenteContratado buscarContratadoID(String x){
        DocenteContratado dc=null;
        for(DocenteContratado d: contratado){
            if(x.compareTo(d.getID())==0){
                dc=d;
            }
        }
        return dc;
    }
    public DocenteNombrado buscarNombradoID(String x){
        DocenteNombrado dc=null;
        for(DocenteNombrado d: nombrado){
            if(x.compareTo(d.getID())==0){
                dc=d;
            }
        }
        return dc;
    }
    public Administrativo buscarAdministrativoID(String x){
        Administrativo dc=null;
        for(Administrativo d: administrativos){
            if(x.compareTo(d.getID())==0){
                dc=d;
            }
        }
        return dc;
    }
    public void eliminarContratado(DocenteContratado x){
        contratado.remove(x);
    }
    public void eliminarNombrado(DocenteNombrado x){
        nombrado.remove(x);
    }
    public void eliminarAdminstrativos(Administrativo x){
        administrativos.remove(x);
    }
        public String reportarContratado(){
        String cad=" ";
        for(DocenteContratado d: contratado){
            cad=cad+d.toString()+"\n";
        }
        return cad;
    }
    public String reportarNombrado(){
        String cad=" ";
        for(DocenteNombrado d: nombrado){
            cad=cad+d.toString()+"\n";
        }
        return cad;
    }
    public String reportarAdministrativos(){
        String cad=" ";
        for(Administrativo d: administrativos){
            cad=cad+d.toString()+"\n";
        }
        return cad;
    }
}
