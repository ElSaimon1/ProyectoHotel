/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Complementos;

import java.util.Date;

/**
 *
 * @author ridox
 */
public class Reservacion {
    
    private String NombreCL, rut, Habitacion;
    private Date FechaIn, FechaFin;
    private boolean insumos;

    public Reservacion() {
    }

    public Reservacion(String NombreCL, String rut, String Habitacion, Date FechaIn, Date FechaFin, boolean insumos) {
        this.NombreCL = NombreCL;
        this.rut = rut;
        this.Habitacion = Habitacion;
        this.FechaIn = FechaIn;
        this.FechaFin = FechaFin;
        this.insumos = insumos;
    }

    public String getNombreCL() {
        return NombreCL;
    }

    public void setNombreCL(String NombreCL) {
        this.NombreCL = NombreCL;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getHabitacion() {
        return Habitacion;
    }

    public void setHabitacion(String Habitacion) {
        this.Habitacion = Habitacion;
    }

    public Date getFechaIn() {
        return FechaIn;
    }

    public void setFechaIn(Date FechaIn) {
        this.FechaIn = FechaIn;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public boolean isInsumos() {
        return insumos;
    }

    public void setInsumos(boolean insumos) {
        this.insumos = insumos;
    }

    @Override
    public String toString() {
        return "Reservacion{" + "NombreCL=" + NombreCL + ", rut=" + rut + ", Habitacion=" + Habitacion + ", FechaIn=" + FechaIn + ", FechaFin=" + FechaFin + ", insumos=" + insumos + '}';
    }
    
    
}
