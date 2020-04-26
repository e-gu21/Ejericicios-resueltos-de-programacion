package pruebacirculoo;

public class Cilindro extends Circulo{
    
    float altura;
    Cilindro (float r,float h){
    super(r);
    altura=h;
    }
    
    
    float areaCilindro(){
        return 2*super.area()+Circunferencia()*altura;    
    }
    
    float volumen (){
        return super.area()*altura;
    }
    
    public String toString (){
   return
            "\nLa altura del circulo es: " + radio+
            "\nEl area del circulo es:"+area()+
            "\nEl la circunferencia del circulo es : "+Circunferencia()+
            "\n"+
            "\nla altura del cilindro es: " + altura+
            "\nel area del ciliondro es:"+areaCilindro()+
            "\nel volumen del cilindro es : "+volumen();
    

  
    }
}
