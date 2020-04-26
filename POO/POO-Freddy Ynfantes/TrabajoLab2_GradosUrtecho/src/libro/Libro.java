package libro;
public class Libro {
//Atributos:
private String codigo,titulo,autor,editorial;
int        nropag;
static int        s=1;
//Constructor vacío:
public Libro(){
    codigo="L0"+s;
    titulo="Programación con java";
    autor="Luis Joyanes Aguilar";
    editorial="Prentice-Hall, 11 de Abril de 2011";        
    nropag=1200;
    s++;
}
//Métodos get
public String getcodigo(){
    return codigo;
}
public String gettitulo(){
    return titulo;
}
public String getautor(){
    return autor;
}        
public String geteditorial(){
    return editorial;
}
public int getnropag(){
    return nropag;
}
//Métodos get:
public void setcodigo(String x){
    codigo=x;
}
public void settitulo(String x){
    titulo=x;
}
public void setautor(String x){
    autor=x;
}
public void seteditorial(String x){
    editorial=x;
}
public void setnropag(int x){
    nropag=x;
}
//Método toString para reportar:
public String toString(){
    return "\nCódigo: "+codigo+"\nTítulo: "+titulo+"\nAutor: "+autor+"\nEditorial: "+editorial+"\nNro. Páginas: "+nropag;
}
}
