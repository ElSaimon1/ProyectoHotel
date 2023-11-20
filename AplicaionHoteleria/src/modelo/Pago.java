/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author allen
 */
public class Pago {
    private int idPago;
    private Reserva idReserva;
    private int numComprobante;
    private int totalPago;
    private Date fechaEmision;

    public Pago() {
    }

    public Pago(int idPago, Reserva idReserva, int numComprobante, int totalPago, Date fechaEmision) {
        this.idPago = idPago;
        this.idReserva = idReserva;
        this.numComprobante = numComprobante;
        this.totalPago = totalPago;
        this.fechaEmision = fechaEmision;
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Reserva getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(Reserva idReserva) {
        this.idReserva = idReserva;
    }

    public int getNumComprobante() {
        return numComprobante;
    }

    public void setNumComprobante(int numComprobante) {
        this.numComprobante = numComprobante;
    }

    public int getTotalPago() {
        return totalPago;
    }

    public void setTotalPago(int totalPago) {
        this.totalPago = totalPago;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    @Override
    public String toString() {
        return "Pago{" + "idPago=" + idPago + ", idReserva=" + idReserva + ", numComprobante=" + numComprobante + ", totalPago=" + totalPago + ", fechaEmision=" + fechaEmision + '}';
    }

    
}
