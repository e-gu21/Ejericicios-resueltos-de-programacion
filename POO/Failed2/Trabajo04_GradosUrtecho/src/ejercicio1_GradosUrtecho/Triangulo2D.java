package ejercicio1_GradosUrtecho;
public class Triangulo2D {
    private Vertice2D V1,V2,V3;
    private double l1,l2,l3;

    public Triangulo2D(Vertice2D v1, Vertice2D v2, Vertice2D v3) {
        V1 = v1;
        V2 = v2;
        V3 = v3;
        
        l1=Math.sqrt(Math.pow((V1.getX()-V2.getX()),2)+Math.pow((V1.getY()-V2.getY()),2));
        l2=Math.sqrt(Math.pow((V2.getX()-V3.getX()),2)+Math.pow((V2.getY()-V3.getY()),2));
        l3=Math.sqrt(Math.pow((V3.getX()-V1.getX()),2)+Math.pow((V3.getY()-V1.getY()),2));
    }
    public double Perimetro(){
        double p;
        p=l1+l2+l3;
        return p;
    }
    public String TipTriangulo(){
        if(l1==l2&&l2==l3){
            return "Triángulo Equilátero";
        }
        if(l1==l2||l2==l3||l1==l3){
            return"Triángulo Isósceles";
        }
        if(l1!=l2&&l2!=l3&&l1!=l3){
            return "Triángulo Escaleno";
        }
        return "";
    }
    public String toString(){
        return "[ v1: "+V1.toString()+" ,v2: "+V2.toString()+" ,v3: "+V3.toString()+" ]";
    }
}
