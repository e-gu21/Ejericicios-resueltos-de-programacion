
package entidades;

public class Cliente {
    
    private String codigo,nombre,telefono,direccion,correo;

    public Cliente(String codigo, String nombre, String telefono, String direccion, String correo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    @Override
    public String toString(){
        return codigo+"\tNombre: "+nombre+"\tTelefono: "+telefono+"\tDireccion: "+direccion+"\tCorreo: "+correo;
    }
}
