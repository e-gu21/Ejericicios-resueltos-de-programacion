package Auto2;
public class PruebaAuto {
    public static void main(String[] args) {

        Auto a1,a2;
        a1=new Auto();
        a2=new Auto("A23-452","Blanco","Toyota","C-HR",4);
        
    /////////
    System.out.println("***PRIMER PROCESO***");
        
    System.out.println("Auto 1: "+ a1.Reporte()+ "\tEstado actual: "+ a1.getEstado());
    System.out.println("Auto 2: "+ a2.Reporte()+ "\tEstado actual: "+ a2.getEstado());
    
    /////////
    System.out.println("\n***SEGUNDO PROCESO***");
    a1.setEstado("Encendido");
    a1.setAuto("B01-672", "Negro","Nissan", "NP3000", 4);
    
    /////////
    
    a1.Reporte();
    System.out.println("Auto 1: "+ a1.Reporte()+ "\n\tEstado actual: " + a1.getEstado());
    
    /////////
    a2.setEstado("Apagado");
    System.out.println("\n***PROCESO DE ENCENDIDO/APAGADO***");
    
   System.out.println("Auto 1 Estado actual: "+ a1.getEstado());
   System.out.println("Auto 2 Estado actual: "+ a2.getEstado());
    }
    

}
