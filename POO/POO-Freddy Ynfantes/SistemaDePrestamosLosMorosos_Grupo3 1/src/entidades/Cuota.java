
package entidades;

import java.util.*;

public class Cuota {
    private Prestamo prestamo;
    private int numeroDeCuota;
    private float saldoRestante, amortizacion, interes, cuota;
    private Date fechaVencimiento;
    private boolean estadoCuota;
    private Pago pago;

    public Cuota(Prestamo prestamo, int numeroDeCuota, float saldoRestante, float amortizacion, float interes, float cuota, Date fechaVencimiento, boolean estadoCuota) {
        this.prestamo = prestamo;
        this.numeroDeCuota = numeroDeCuota;
        this.saldoRestante = saldoRestante;
        this.amortizacion = amortizacion;
        this.interes = interes;
        this.cuota = cuota;
        this.fechaVencimiento = fechaVencimiento;
        this.estadoCuota = estadoCuota;
        this.pago = null;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public int getNumeroDeCuota() {
        return numeroDeCuota;
    }

    public void setNumeroDeCuota(int numeroDeCuota) {
        this.numeroDeCuota = numeroDeCuota;
    }

    public float getSaldoRestante() {
        return saldoRestante;
    }

    public void setSaldoRestante(float saldoRestante) {
        this.saldoRestante = saldoRestante;
    }

    public float getAmortizacion() {
        return amortizacion;
    }

    public void setAmortizacion(float amortizacion) {
        this.amortizacion = amortizacion;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean isEstadoCuota() {
        return estadoCuota;
    }

    public void setEstadoCuota(boolean estadoCuota) {
        this.estadoCuota = estadoCuota;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    @Override
    public String toString(){
        return numeroDeCuota+"\t"+amortizacion+"\t"+interes+"\t"+cuota+"\t"+fechaVencimiento.getTime();
    }
}
