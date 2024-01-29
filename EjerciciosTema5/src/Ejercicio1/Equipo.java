
package Ejercicio1;

import java.util.Arrays;

/**
 *
 * @author joel
 */
public class Equipo {
    private String nombre;
    private Persona[] miembros;

    //Constructor
    public Equipo(String nombre, Persona[] miembros) {
        this.nombre = nombre;
        this.miembros = miembros;
    }

    //Metodos Getter Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona[] getMiembros() {
        return miembros;
    }

    public void setMiembros(Persona[] miembros) {
        this.miembros = miembros;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Equipo{" + "\nnombre=" + nombre + "\nmiembros=" + Arrays.toString(miembros) + '}';
    }
    
}
