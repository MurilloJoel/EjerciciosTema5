/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alumnotd
 */

import java.time.LocalDate;
public class Prestamo {
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Lector lectores;
    private Copia libroPrestado;
    private int multa;
    private int maxTiempo;

    public Prestamo(LocalDate fechaInicio, LocalDate fechaFin, Lector lectores, Copia libroPrestado, int multa, int maxTiempo) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.lectores = lectores;
        this.libroPrestado = libroPrestado;
        this.multa = multa;
        this.maxTiempo = maxTiempo;
    }

    public int getMaxTiempo() {
        return maxTiempo;
    }

    public void setMaxTiempo(int maxTiempo) {
        this.maxTiempo = maxTiempo;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Lector getLectores() {
        return lectores;
    }

    public void setLectores(Lector lectores) {
        this.lectores = lectores;
    }

    public Copia getLibroPrestado() {
        return libroPrestado;
    }

    public void setLibroPrestado(Copia libroPrestado) {
        this.libroPrestado = libroPrestado;
    }

    public int getMulta() {
        return multa;
    }

    public void setMulta(int multa) {
        this.multa = multa;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", lectores=" + lectores + ", libroPrestado=" + libroPrestado + ", multa=" + multa + ", maxTiempo=" + maxTiempo + '}';
    }
    
    
    
}
