package Triangulo;
public class Vertice2D {
    private double X;
    private double Y;
    
    public Vertice2D(double x, double y){
        X=x;
        Y=y;
    }
    public double getX() {
        return X;
    }
    public double getY() {
        return Y;
    }

    @Override
    public String toString() {
        return "Vertices:"+"("+X+","+Y+")";
    }
    
}
