/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alumnotd
 */
public class Lector {
    private String lector;
    private int numSocio;
    private int telefono;
    private String direccion;
    private int maxLibros;

    public Lector(String lector, int numSocio, int telefono, String direccion, int maxLibros) {
        this.lector = lector;
        this.numSocio = numSocio;
        this.telefono = telefono;
        this.direccion = direccion;
        this.maxLibros = maxLibros;
    }

    public int getMaxLibros() {
        return maxLibros;
    }

    public void setMaxLibros(int maxLibros) {
        this.maxLibros = maxLibros;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public int getNumSocio() {
        return numSocio;
    }

    public void setNumSocio(int numSocio) {
        this.numSocio = numSocio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Lector{" + "lector=" + lector + ", numSocio=" + numSocio + ", telefono=" + telefono + ", direccion=" + direccion + ", maxLibros=" + maxLibros + '}';
    }
    
    
}
