package ejercicio2_GradosUretcho;
import java.util.*;    
public class AgendaElectronica {
    private ArrayList<Familia> familia;
    private ArrayList<ContactoProfesional> cp;
    private ArrayList<ContactoEstudio> ce;

    public AgendaElectronica() {
       ce=new ArrayList<ContactoEstudio> ();
       cp=new ArrayList<ContactoProfesional> ();
       familia=new ArrayList<Familia>();
    }
    
    public void agregarContactoF(Familia x){
        familia.add(x);
    }
    public void agregarContactoP(ContactoProfesional x){
        cp.add(x);
    }
    public void agregarContactoE(ContactoEstudio x){
        ce.add(x);
    }
    
    public void eliminarF(Familia x){
    familia.remove(x);
    }
    public void eliminarCP(ContactoProfesional x){
    cp.remove(x);
    }
    public void eliminarCE(ContactoEstudio x){
    ce.remove(x);
    }
    public Familia buscarContactoxNombreFamilia(String x){
        Familia cto= null;
        for(Familia c: familia){
            if(x.compareTo(c.getNombre())==0){
                cto=c;
            }
        }
        return cto;
    }
    public ContactoEstudio buscarContactoxNombreCE(String x){
        ContactoEstudio cto= null;
        for(ContactoEstudio c: ce){
            if(x.compareTo(c.getNombre())==0){
                cto=c;
            }
        }
        return cto;
    }
     public ContactoProfesional buscarContactoxNombreCP(String x){
        ContactoProfesional cto= null;
        for(ContactoProfesional c: cp){
            if(x.compareTo(c.getNombre())==0){
                cto=c;
            }
        }
        return cto;
    } 
    public Familia buscarContactoxDNIFamilia(String x){
        Familia cto= null;
        for(Familia c: familia){
            if(x.compareTo(c.getDNI())==0){
                cto=c;
            }
        }
        return cto;
    }
    public ContactoEstudio buscarContactoxDNICE(String x){
        ContactoEstudio cto= null;
        for(ContactoEstudio c: ce){
            if(x.compareTo(c.getDNI())==0){
                cto=c;
            }
        }
        return cto;
    }
    public ContactoProfesional buscarContactoxDNICP(String x){
        ContactoProfesional cto= null;
        for(ContactoProfesional c: cp){
            if(x.compareTo(c.getDNI())==0){
                cto=c;
            }
        }
        return cto;
    }   
    public void actualizarTelefonoFamilia(String obj,int telefono){
        for (int i=0;i<familia.size();i++){
            if(obj.equals(familia.get(i).getTelefono())){
                familia.get(i).setTelefono(telefono);
            }
        }
    } 
    public void actualizarTelefonoCE(String obj,int telefono){
        for (int i=0;i<ce.size();i++){
            if(obj.equals(ce.get(i).getTelefono())){
                ce.get(i).setTelefono(telefono);
            }
        }
    }
    public void actualizarTelefonoCP(String obj,int telefono){
        for (int i=0;i<cp.size();i++){
            if(obj.equals(cp.get(i).getTelefono())){
                cp.get(i).setTelefono(telefono);
            }
        }
    }
    public void actualizarDireccionCE(String obj,String direccion){
        for (int i=0;i<ce.size();i++){
            if(obj.equals(ce.get(i).getTelefono())){
                ce.get(i).setDireccion(direccion);
            }
        }
    }
    public String listaContactoFamilia(){
        String cto="";
        for(Persona c: familia){
            cto=cto+c.toString()+"\n";
        }
        return cto;
    }
    public String listaContactoCP(){
        String cto="";
        for(Persona c: ce){
            cto=cto+c.toString()+"\n";
        }
        return cto;
    }
    public String listaContactoCE(){
        String cto="";
        for(Persona c: ce){
            cto=cto+c.toString()+"\n";
        }
        return cto;
    }
    
}
