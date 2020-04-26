package pruebas;

/**
 *
 * @author LENOVO
 */
public abstract class Boxeador extends Persona implements Interfaces{   
    
    Boxeador(){
        super.nombre="huangal";        
    }
    
    public void salida (){
        System.out.println(super.getNombre());
        imim();
    }
    
    public String getNombrecito(){
        return super.getNombre();
    }
    
    public void imim () {
        System.out.print("weikiwaka");
    }
  
    
}
