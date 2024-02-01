
package Ejercicio6;

import java.time.LocalDate;

/**
 *
 * @author alumnotd
 */
public class Autor {
    private String nombreAutor;
    private String nacionalidad;
    private LocalDate fechaNacimiento;

    public Autor(String nombreAutor, String nacionalidad, LocalDate fechaNacimiento) {
        this.nombreAutor = nombreAutor;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fechaNacimiento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autores{" + "nombreAutor=" + nombreAutor + ", nacionalidad=" + nacionalidad + ", fechaNacimiento=" + fechaNacimiento + '}';
    }
    
    
}
