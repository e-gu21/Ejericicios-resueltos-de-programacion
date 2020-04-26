
package Tiempo;

public class Tiempo {
    //////
    private int horas,minutos,segundos;
    
    //////
    public Tiempo(int h,int m,int s){
        horas=h;
        minutos=m;
        segundos=s;
        
    }
    //////
    public void suma(int hs,int ms,int ss){
        
        int x=0,y=0;        
        int seg,min,hor;    
        
        seg=segundos+ss;    
        if(seg>=60){
            seg=seg-60;
            x++;
        }
        min=minutos+ms+x;
        if(min>=60){
            min=min-60;
            y++;
        }
        hor=horas+hs+y;
        
        horas=hor;
        minutos=min;
        segundos=seg;
        
    }
    ///////
    public void resta(int hr,int mr,int sr){
        
        int x=0,y=0;
        int seg,min,hor;
        
        seg=segundos-sr;
        if(seg<0){
            seg=(60+segundos)-sr;
            x++;
        }
        min=minutos-mr-x;
        if(min<0){
            min=(60+minutos)-mr-x;
            y++;
        }
        hor=horas-hr-y;
        
        horas=hor;
        minutos=min;
        segundos=seg;
    
    }
    ////////
    public String Reporte(){
        return horas+"h "+minutos+"m "+segundos+"s";
    }
    
}