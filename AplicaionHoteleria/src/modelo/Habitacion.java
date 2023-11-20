/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author allen
 */
public class Habitacion {
    private int idHabitacion,numero;
    private Boolean tipoHabitacion,estado;
    private int valorDiario;

    public Habitacion() {
    }

    public Habitacion(int idHabitacion, int numero, Boolean tipoHabitacion, Boolean estado, int valorDiario) {
        this.idHabitacion = idHabitacion;
        this.numero = numero;
        this.tipoHabitacion = tipoHabitacion;
        this.estado = estado;
        this.valorDiario = valorDiario;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Boolean getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(Boolean tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public int getValorDiario() {
        return valorDiario;
    }

    public void setValorDiario(int valorDiario) {
        this.valorDiario = valorDiario;
    }

    @Override
    public String toString() {
        return "Habitacion{" + "idHabitacion=" + idHabitacion + ", numero=" + numero + ", tipoHabitacion=" + tipoHabitacion + ", estado=" + estado + ", valorDiario=" + valorDiario + '}';
    }
    
    
    
}
