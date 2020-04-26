package futbol;
public class Equipo {
    private String nomp;
    private Jugador jugador[];
    private int cj;
    
    public Equipo (String n){
        nomp=n;
        jugador=new Jugador[15];
        cj=0;    
    }
    public void totaljugadores(Jugador j){
        if(cj<15){
            jugador[cj]=j;
            cj++;
        }   
    }
    public String toString()    {
        String rep="";
        
        for(int i=0;i<cj;i++) {
            rep=rep+jugador[i].toString();
        }
        return nomp+"\n"+rep;
    }
    public String buscar(String nom)  {
        int x=0, i;
        String rep="";
        
        for( i=0;i<cj;i++) {
            if(nom.equals(jugador[i].getNombre()))  {
                rep=rep+jugador[i].toString();
                i=cj;
            }   else    {
                x++;
            }
        }
        
        if(x==cj) {
            rep="No existe en lista";
        }
        
        return rep;
    }
    public String listaTitulares()  {
        String rep="";
        int i;
        for(i=0;i<cj;i++) {
            if(jugador[i].getTipo().equals("Titular"))    {
                rep=rep+jugador[i].toString();
            }
        }
        
        return rep;
    }
    
    public String listaSuplentes() {
        String rep="";
        
        for(int i=0;i<cj;i++) {
            if(jugador[i].getTipo().equals("Suplente"))  {
                rep=rep+jugador[i].toString();
            }
        }
        
        return rep;
    }    

}
