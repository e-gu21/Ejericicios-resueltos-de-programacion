
package accesoDatos;

import entidades.*;
import java.util.*;

public class BaseDatosPrestamo {
    private ArrayList<Prestamo> prestamos;

    public BaseDatosPrestamo() {
        prestamos = new ArrayList();
    }
    
    public void agregarPrestamo(Prestamo p){
        prestamos.add(p);
    }
    
    public void eliminarPrestamo(String codigo){
        for(int i=0;i<prestamos.size();i++){
            if(prestamos.get(i).getCliente().getCodigo().equals(codigo)){
                prestamos.remove(i);
            }
        }
    }
    
    public void modificarPrestamo(Prestamo p, String codigo){
        for(int i=0;i<prestamos.size();i++){
            if(prestamos.get(i).getCliente().getCodigo().equals(codigo)){
                prestamos.set(i, p);
            }
        }
    }
    
    public void mostrarListaPrestamo(){
        for(int i=0;i<prestamos.size();i++){
            System.out.println(prestamos.get(i));
        }
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }
    
    
}
