/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import bd.Conexion;
import modelo.Cliente;
import java.sql.Connection;
import java.util.ArrayList;
import modelo.Habitacion;
import modelo.Reserva;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author allen
 */
public class Metodos {
public boolean agregarCliente(Cliente cliente) {
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "INSERT INTO cliente(idCliente,nombre,apaterno,telefono,email) VALUES ?,?,?,?,?)";
            PreparedStatement stmt = conx.prepareCall(query);
            stmt.setInt(1,cliente.getIdCliente());
            stmt.setString(2,cliente.getNombre());
            stmt.setString(3, cliente.getaPaterno());
            stmt.setInt(4, cliente.getTelefono());
            stmt.setString(5, cliente.getEmail());
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Ingresando Cliente", 1);
            return false;
        }
    }
            
    
    //Agregar reserva(?
    public boolean agregarReserva(Reserva reserva) {
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "insert into reserva(idReserva,idHabitacion,fechaReserva,fechaIngreso,fechaSalida,costoAlojamiento)values ?,?,?,?,?,?";
            PreparedStatement stmt = conx.prepareCall(query);
            stmt.setInt(1, reserva.getIdReserva());
            stmt.setInt(2, reserva.getIdHabitacion());
            stmt.setDate(3, reserva.getFechaReserva());
            stmt.setDate(4, reserva.getFechaIngreso());
            stmt.setDate(5, reserva.getFechaSalida());
            stmt.setInt(6, reserva.getCostoAlojamiento());
            
            stmt.executeUpdate();
            stmt.close();
            conx.close();
            
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar datos", "Ingresando Reserva", 1);
            return false;
        }
    }
    
    //Listar reserva por columna(?
    public Reserva buscarReserva(int idReserva) {
        Reserva reserva = new Reserva();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from reserva where idReserva = ?";
            PreparedStatement stmt = conx.prepareCall(query);
            
            stmt.setInt(0, idReserva);
            ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setFechaReserva(rs.getDate("fechaReserva"));
                reserva.setFechaIngreso(rs.getDate("fechaIngreso"));
                reserva.setFechaSalida(rs.getDate("fechaSalida"));
                reserva.setCostoAlojamiento(rs.getInt("costoAlojamiento"));      
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar la reserva: " + e.getMessage());
        }return reserva;        
    }
    
    //Listar todas las reservas
    public ArrayList<Reserva> buscarTodaReserva() {
        ArrayList<Reserva> listaReservas = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from reserva order by idReserva ";
            PreparedStatement stmt = conx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Reserva reserva = new Reserva();
                reserva.setIdReserva(rs.getInt("idReserva"));
                reserva.setFechaReserva(rs.getDate("fechaReserva"));
                reserva.setFechaIngreso(rs.getDate("fechaIngreso"));
                reserva.setFechaSalida(rs.getDate("fechaSalida"));
                reserva.setCostoAlojamiento(rs.getInt("costoAlojamiento")); 
                
                listaReservas.add(reserva);
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar las reservas: " + e.getMessage());
        }return listaReservas;        
    }

    //Listar todos los clientes
    public ArrayList<Cliente> buscarTodoCliente() {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from cliente where nombre = ?";
            PreparedStatement stmt = conx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setaPaterno(rs.getString("aPaterno"));
                cliente.setTelefono(rs.getInt("telefono"));
                cliente.setEmail(rs.getString("email")); 
                
                listaClientes.add(cliente);
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar los clientes: " + e.getMessage());
        }return listaClientes;        
    }
    
    //Listar todas las habitaciones
    public ArrayList<Habitacion> buscarTodoHabitacion() {
        ArrayList<Habitacion> listaHabitaciones = new ArrayList<>();
        
        try {
            Conexion con = new Conexion();
            Connection conx = con.conexion();
            
            String query = "Select * from habitacion order by numero ";
            PreparedStatement stmt = conx.prepareCall(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Habitacion habitacion = new Habitacion();
                habitacion.setIdHabitacion(rs.getInt("idCliente"));
                habitacion.setTipoHabitacion(rs.getBoolean("tipoHabitacion"));
                habitacion.setNumero(rs.getInt("numero"));
                habitacion.setEstado(rs.getBoolean("estado"));
                habitacion.setValorDiario(rs.getInt("valorDiario"));
                
                listaHabitaciones.add(habitacion);
            }
            
            rs.close();
            stmt.close();
            conx.close();
            
        } catch (SQLException e) {
            System.out.println("Error al listar las habitaciones: " + e.getMessage());
        }return listaHabitaciones;        
    }
    
    //TODO:
    //actualizar?
    //borrar
    
}
    

