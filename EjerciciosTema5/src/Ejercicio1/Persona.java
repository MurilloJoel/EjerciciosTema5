
package Ejercicio1;

/**
 *
 * @author joel
 */

import java.time.LocalDate;

public class Persona {
    private String id;
    private String nombre;
    private String apellidos;
    private LocalDate fechaNacimiento;

    //Constructor
    public Persona(String id, String nombre, String apellidos, LocalDate fechaNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
    }

    //Metodos Getter Setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Persona{" + "\nid=" + id + "\nnombre=" + nombre + "\napellidos=" + apellidos + "\nfechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
