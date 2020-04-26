
package entidades;

import java.util.*;

public class Prestamo {
    private Cliente cliente;
    private float monto, interesMensual;
    private int numeroDeCuotas;
    private Calendar fechaEmisionPrestamo, fechaEntregaDinero;
    private boolean estado;

    public Prestamo(Cliente cliente, float monto, float interesMensual, int numeroDeCuotas, Calendar fechaEntregaDinero, boolean estado) {
        this.cliente = cliente;
        this.monto = monto;
        this.interesMensual = interesMensual;
        this.numeroDeCuotas = numeroDeCuotas;
        this.fechaEmisionPrestamo = Calendar.getInstance();
        this.fechaEmisionPrestamo.add(Calendar.MONTH, 1);
        this.fechaEntregaDinero = fechaEntregaDinero;
        this.estado = estado;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public float getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(float interesMensual) {
        this.interesMensual = interesMensual;
    }

    public int getNumeroDeCuotas() {
        return numeroDeCuotas;
    }

    public void setNumeroDeCuotas(int numeroDeCuotas) {
        this.numeroDeCuotas = numeroDeCuotas;
    }
    
    public Calendar getFechaEmisionPrestamo() {
        return fechaEmisionPrestamo;
    }

    public void setFechaEmisionPrestamo(Calendar fechaEmisionPrestamo) {
        this.fechaEmisionPrestamo = fechaEmisionPrestamo;
    }

    public Calendar getFechaEntregaDinero() {
        return fechaEntregaDinero;
    }

    public void setFechaEntregaDinero(Calendar fechaEntregaDinero) {
        this.fechaEntregaDinero = fechaEntregaDinero;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString(){
        return "Monto: "+monto+"\n Interes Mensual: "+interesMensual+"\n Numero de Cuotas: "+numeroDeCuotas+"\n Fecha de Emision: "+fechaEmisionPrestamo.getTime()+"\n Fecha Entrega de Dinero: "+fechaEntregaDinero.getTime()+"\n Estado: "+estado;
    }
}
