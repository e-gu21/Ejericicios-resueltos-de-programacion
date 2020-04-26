package SintomasPaciente_2;
public class pacientes {
    private String nombre;
    private String DNI;
    private sintomas sintomas[];
    private int ns;
    //CONSTRUCTOR CON PARÁMETROS
    pacientes(String n, String dni){
        nombre=n;
        DNI=dni;
        sintomas=new sintomas[10];
        ns=0;
    }
    //AGREGAR SÍNTOMAS:
    public void ASintomas(sintomas s){
        sintomas[ns]=s;
        ns++;
    }
    //REPORTAR SÍNTOMAS Y PACIENTE
    public String verSintomas(){
        String rep="";
        int i;
        for(i=0;i<ns;i++){
            rep=rep+sintomas[i].toString();
        }
        return "\n\tDNI: "+DNI+"\n\tNombre: "+nombre+rep;
    }
}
