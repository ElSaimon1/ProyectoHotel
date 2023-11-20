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
public class Reserva {
    private int idReserva;
    private Habitacion idHabitacion;
    private Cliente idCliente;
    private Date fechaReserva,fechaIngreso,fechaSalida;
    private int costoAlojamiento;

    public Reserva() {
    }

    public Reserva(int idReserva, Habitacion idHabitacion, Cliente idCliente, Date fechaReserva, Date fechaIngreso, Date fechaSalida, int costoAlojamiento) {
        this.idReserva = idReserva;
        this.idHabitacion = idHabitacion;
        this.idCliente = idCliente;
        this.fechaReserva = fechaReserva;
        this.fechaIngreso = fechaIngreso;
        this.fechaSalida = fechaSalida;
        this.costoAlojamiento = costoAlojamiento;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public Habitacion getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(Habitacion idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Cliente getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Cliente idCliente) {
        this.idCliente = idCliente;
    }

    public Date getFechaReserva() {
        return fechaReserva;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCostoAlojamiento() {
        return costoAlojamiento;
    }

    public void setCostoAlojamiento(int costoAlojamiento) {
        this.costoAlojamiento = costoAlojamiento;
    }

    @Override
    public String toString() {
        return "Reserva{" + "idReserva=" + idReserva + ", idHabitacion=" + idHabitacion + ", idCliente=" + idCliente + ", fechaReserva=" + fechaReserva + ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", costoAlojamiento=" + costoAlojamiento + '}';
    }
    
}
