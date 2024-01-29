
package EjemploInstituto;

import java.time.LocalDate;

/**
 *
 * @author joel
 */

public class Alumno extends Persona{
    String grupo;
    double notaMedia;

    //Constructor

    public Alumno(String nombre, String apellidos, LocalDate fechaNac, String grupo, double notaMedia) {
        super(nombre, apellidos, fechaNac);
        this.grupo = grupo;
        this.notaMedia = notaMedia;
    }
    
    //Metodo mostrar heredado de la superclase
    
    @Override
    public void mostrar(){
        super.mostrar();
             System.out.printf ("Grupo: %s\n", this.grupo);

             System.out.printf ("Nota media: %5.2f\n", this.notaMedia); 

    }
    
    //Metodos getter Settter
    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public double getNotaMedia() {
        return notaMedia;
    }

    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    
    /**
     *
     * @return nombre Nombre del alumno
     */
    
    @Override
    public String getNombre(){
        return "Alumno: "+ nombre;
    }

    
}
