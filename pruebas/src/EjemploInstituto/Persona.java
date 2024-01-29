
package EjemploInstituto;


/**
 *
 * @author joel
 */

import java.time.LocalDate;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected LocalDate fechaNac;

    //Constructor

    public Persona(String nombre, String apellidos, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }
    
    //Metodo mostrar
    

    public void mostrar () {

        System.out.printf ("Nombre: %s\n", this.nombre);

        System.out.printf ("Apellidos: %s\n", this.apellidos);

        System.out.printf ("Fecha de nacimiento: %s\n", this.fechaNac);

    }


    
    //Metodos Getter y setter
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

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }
}
