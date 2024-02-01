/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alumnotd
 */
public class Copia extends Libro {
    private String identificador;
    private Estado estado;

    public Copia(String identificador, Estado estado, String nombre, String editorial, int año, Autor autor, TipoLibro tipo) {
        super(nombre, editorial, año, autor, tipo);
        this.identificador = identificador;
        this.estado = estado;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Copia{" + "identificador=" + identificador + ", estado=" + estado + "\n"+ super.toString();
    }

    
    
    
}
