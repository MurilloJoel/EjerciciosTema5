/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pruebas.Ejercicio2_examen;

/**
 *
 

    @author developer*/

public class Empresa {
    private String nombre;
    private int numEmpleados;
    private double beneficios;

    public Empresa(String nombre, int numEmpleados, double beneficios) {
        this.nombre = nombre;
        this.setNumEmpleados(numEmpleados);
        this.beneficios = beneficios;
    }

    public void setNumEmpleados(int numEmpleados) {
        if (numEmpleados > 0) {
            this.numEmpleados = numEmpleados;
        }
    }

    @Override
    public String toString() {
        return nombre + "\t" + numEmpleados + "\t" + beneficios + " euros";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

    public int getNumEmpleados() {
        return numEmpleados;
    }
}
