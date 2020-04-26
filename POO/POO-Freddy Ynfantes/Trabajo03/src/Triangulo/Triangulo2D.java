
package Triangulo;

public class Triangulo2D {
    
    private Vertice2D v1;
    private Vertice2D v2;
    private Vertice2D v3;
    
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    public Triangulo2D(Vertice2D a,Vertice2D b,Vertice2D c){
        v1=a;
        v2=b;
        v3=c;
        ladoA=Math.sqrt(Math.pow((v1.getX()-v2.getX()),2)+Math.pow((v1.getY()-v2.getY()),2));
        ladoB=Math.sqrt(Math.pow((v2.getX()-v3.getX()),2)+Math.pow((v2.getY()-v3.getY()),2));
        ladoC=Math.sqrt(Math.pow((v3.getX()-v1.getX()),2)+Math.pow((v3.getY()-v1.getY()),2));
    }
    
    public double calcularPerimetro(){
        double p;
        p=ladoA+ladoB+ladoC;
        return p;
    }
    
    public String devolverTipoTriangulo(){
        
        if(ladoA==ladoB&&ladoB==ladoC){
            return "Equilatero";
        }
        else{
            
            if(ladoA==ladoB||ladoB==ladoC||ladoC==ladoA){
            return "Isoceles";
            }
            
            else{
                
                if(ladoA!=ladoB&&ladoB!=ladoC){
                return "Escaleno";
                }
                
            }
        
        }
        return "";
    }
    
    public String toString(){
        return "[ v1: "+v1.toString()+" ,v2: "+v2.toString()+" ,v3: "+v3.toString()+" ]";
    }
}