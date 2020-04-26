package Agenda_1;
public class Agenda {
        private Contactos contactos[];
    private Empleado empleado;
    private int CNom;
    

    public Agenda(Empleado e) {
        contactos=new Contactos[100];
        CNom=0;
        empleado=e;
    }

    public void agregarContacto(Contactos c)  {
        if(CNom<100)    {
            contactos[CNom]=c;
            CNom++;
        }  
    }
    

    public String buscar(String nom)  {
        String rep="";
        int y=0;
        
        for(int i=0;i<CNom;i++) {
            if(nom.equals(contactos[i].getNombre()))  {
             rep=rep+contactos[i].toString();   
             i=CNom;
            }   else    {
                y++;
            }
            
            if(y==CNom) {
                rep=rep+"El contacto no existe";
            }
        }
        
        return rep;
    }
    
    
    public String toString()    {
        return empleado.toString();
    }
    

    public String listaContactos()  {
        String rep="";
        
        for(int i=0;i<CNom;i++) {
            rep=rep+contactos[i].toString();
        }

        return rep;
    }
    
}

