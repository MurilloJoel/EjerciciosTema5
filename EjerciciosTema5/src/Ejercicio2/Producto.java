/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio2;

/**
 *
 * @author joel
 */

import java.time.LocalDate;

public class Producto {
    protected String nombre;
    protected int numLote;
    protected LocalDate fechaCaducidad;
    
    //constructor
    public Producto(String nombre, int numLote, LocalDate fechaCaducidad) {
        this.nombre = nombre;
        this.numLote = numLote;
        this.fechaCaducidad = fechaCaducidad;
    }
    
    //Metodos Getter Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumLote() {
        return numLote;
    }

    public void setNumLote(int numLote) {
        this.numLote = numLote;
    }

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Producto{" + "\nnombre=" + nombre + "\nnumLote=" + numLote + "\nfechaCaducidad=" + fechaCaducidad + '}';
    }
    
}
