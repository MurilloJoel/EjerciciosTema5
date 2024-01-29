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

public class Frescos extends Producto{
    protected String paisOrigen;
    protected LocalDate fechaEnvasado;
    
    //Constructor
    public Frescos(String nombre, int numLote, LocalDate fechaCaducidad, String paisOrigen, LocalDate fechaEnvasado) {
        super(nombre, numLote, fechaCaducidad);
        this.paisOrigen = paisOrigen;
        this.fechaEnvasado = fechaEnvasado;
    }
    
    //Metodos Getter Setter

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public LocalDate getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(LocalDate fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    //Metodo ToString

    @Override
    public String toString() {
        
        return "Frescos{" + "\npaisOrigen=" + paisOrigen + "\nfechaEnvasado=" + fechaEnvasado + '}'+ "\n"+ super.toString();
    }
    
}
