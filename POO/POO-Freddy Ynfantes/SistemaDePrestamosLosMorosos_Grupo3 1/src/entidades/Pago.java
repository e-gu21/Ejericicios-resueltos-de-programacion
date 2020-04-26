
package entidades;

import java.util.*;

public class Pago {
    private Calendar fechaPago,numeroDiaMora;
    private float pagoxInteres;
    private String cajero;
    private Cuota cuota;

    public Pago(Calendar fechaPago, Calendar numeroDiaMora, float pagoxInteres, String cajero, Cuota cuota) {
        this.fechaPago = fechaPago;
        this.numeroDiaMora = numeroDiaMora;
        this.pagoxInteres = pagoxInteres;
        this.cajero = cajero;
        this.cuota = cuota;
    }

    public Calendar getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Calendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    public Calendar getNumeroDiaMora() {
        return numeroDiaMora;
    }

    public void setNumeroDiaMora(Calendar numeroDiaMora) {
        this.numeroDiaMora = numeroDiaMora;
    }

    public float getPagoxInteres() {
        return pagoxInteres;
    }

    public void setPagoxInteres(float pagoxInteres) {
        this.pagoxInteres = pagoxInteres;
    }

    public String getCajero() {
        return cajero;
    }

    public void setCajero(String cajero) {
        this.cajero = cajero;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }
    
    @Override
    public String toString(){
        return "Fecha de Pago: "+fechaPago+"\t Cajero: "+cajero+"\t Numero dia Mora: "+numeroDiaMora+"\t Pago por interes: "+pagoxInteres;
    }
}
