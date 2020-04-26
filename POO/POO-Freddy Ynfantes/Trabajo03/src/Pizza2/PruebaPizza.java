package Pizza2;
public class PruebaPizza {
    public static void main(String[] args) {
        
       Pizza p1,p2,p3;
       
       p1=new Pizza("Mediana","Margarita",10);
       p2=new Pizza("Familiar","Tres Quesos",10);
       p3=new Pizza("Mediana","Funghi",10);
       
       System.out.println("Pizza 1:"+p1.Reporte());
       System.out.println("Pizza 2:"+p2.Reporte());
       System.out.println("Pizza 3:"+p3.Reporte());
       
       System.out.println("***CAMBIO DE ESTADO DE PIZZAS***");
       p1.setPizza("Pedido");
        System.out.println("Pizza 1:"+ p1.getPizza());
       p2.setPizza("Pedido");
        System.out.println("Pizza 2:"+ p2.getPizza());
       p2.setPizza("Servido");
        System.out.println("Pizza 2:"+ p2.getPizza());
       p3.setPizza("Servido");
        System.out.println("Pizza 3:"+ p3.getPizza());
       

       }
    }
    

