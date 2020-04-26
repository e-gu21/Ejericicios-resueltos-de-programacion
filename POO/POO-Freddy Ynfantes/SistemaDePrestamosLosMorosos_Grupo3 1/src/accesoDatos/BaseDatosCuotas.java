
package accesoDatos;

import entidades.*;
import java.util.*;

public class BaseDatosCuotas {
    private ArrayList<Cuota> cuotas;

    public BaseDatosCuotas() {
        cuotas = new ArrayList();
    }
    
    public void agregarCuota(Cuota c){
        cuotas.add(c);
    }
    
    public void mostrarListaCuota(){
        System.out.println("nro\tAmortizacion\tInteres\tCuota\tFechaVenc");
        for(int i=0;i<cuotas.size();i++){
            System.out.println(cuotas.get(i));
        }
    }

    public ArrayList<Cuota> getCuotas() {
        return cuotas;
    }

    public void setCuotas(ArrayList<Cuota> cuotas) {
        this.cuotas = cuotas;
    }
    
}
