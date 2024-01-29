
package EjemploInstituto;

import java.time.LocalDate;

/**
 *
 * @author joel
 */

public class Profesor extends Persona{
    String especialidad;
    double salario;

    //Constructor

    public Profesor(String nombre, String apellidos, LocalDate fechaNac, String especialidad, double salario) {
        super(nombre, apellidos, fechaNac);
        this.especialidad = especialidad;
        this.salario = salario;
    }
    
    //Metodo mostrar heredado de la superclase

    @Override
    public void mostrar() {

            super.mostrar ();     // Llamada al método “mostrar” de la superclase


    // A continuación mostramos la información “especializada” de esta subclase   

        System.out.printf ("Especialidad: %s\n", this.especialidad);

        System.out.printf ("Salario: %7.2f euros\n", this.salario);                   

    }


    
    //Metodos Getter Setter
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    @Override
    public String getNombre(){
        return "Profesor: "+nombre;
    }
    
}
