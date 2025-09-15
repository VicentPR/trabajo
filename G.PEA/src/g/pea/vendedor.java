/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package g.pea;
import java.time.LocalDate;
import   java.util.Scanner;

/**
 *
 * @author Duoc
 */
public class vendedor {
private String nombre;
private String Nvendedor;
private LocalDate fechaDeIngreso;
private int rut;
private String ZonaGeografica;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNvendedor() {
        return Nvendedor;
    }

    public void setNvendedor(String Nvendedor) {
        this.Nvendedor = Nvendedor;
    }

    public LocalDate getFechaDeIngreso() {
        return fechaDeIngreso;
    }

    public void setFechaDeIngreso(LocalDate fechaDeIngreso) {
        this.fechaDeIngreso = fechaDeIngreso;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getZonaGeografica() {
        return ZonaGeografica;
    }

    public void setZonaGeografica(String ZonaGeografica) {
        this.ZonaGeografica = ZonaGeografica;
    }

    public vendedor(String nombre, String Nvendedor, LocalDate fechaDeIngreso, int rut, String ZonaGeografica) {
        this.nombre = nombre;
        this.Nvendedor = Nvendedor;
        this.fechaDeIngreso = fechaDeIngreso;
        this.rut = rut;
        this.ZonaGeografica = ZonaGeografica;
    }

    void setNroVendedor(int numero) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    boolean comprobarNombre(String lectura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setFechaIngreso(LocalDate fechaIngreso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void setRegionTrabaja(String lectura) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
 


    
    
    
    
    
   
}
  