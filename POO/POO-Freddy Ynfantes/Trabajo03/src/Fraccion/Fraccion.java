package Fraccion;

public class Fraccion {
    
    private int num,dem;
    
    public Fraccion(){
        num=0;
        dem=0;
    }
    
    public Fraccion(int n, int d){
        num=n;
        dem=d;
    }
    
    public String sumar(int n,int d){
        
        int x,y;
        x=(n*dem)+(d*num);
        y=d*dem;
        return x+"/"+y;
    }
    
    public String restar(int n,int d){
        
        int x,y;
        x=(num*d)-(dem*n);
        y=d*dem;
        return x+"/"+y;
    }
    
    public String multiplicar(int n,int d){
        
        int x,y;
        x=n*num;
        y=d*dem;
        return x+"/"+y;
    }
    
    public String dividir(int n,int d){
        
        int x,y;
        x=num*d;
        y=dem*n;
        return x+"/"+y;
    }
    
    public String comparar(int n,int d){
        
        int x,y;
        String c="0";
        x=num*d;
        y=n*dem;
        
        if(x==y){
            c="=";
        }
        
        else{
            
        if(x>y){
            c=">";
        }
        
        else
        {
        if(x<y){
            c="<";
        }
        }
        }
        return c;
    }
    
    public int getNum(){
        return num;
    }
    public int getDem(){
        return dem;
    }
    public void setNum(int n){
        num=n;
    }
    public void setDem(int n){
        dem=n;
    }
    public String reporte(){
        return num+"/"+dem;
    }
    
}
