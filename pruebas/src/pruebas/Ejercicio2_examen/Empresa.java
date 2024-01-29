

package pruebas.Ejercicio2_examen;

/**
   @author developer
*/

public class Empresa {
    private String nombre;
    private int numEmpleados;
    private double beneficios;

    /**
     *
     * @param nombre
     * @param numEmpleados
     * @param beneficios
     */
    public Empresa(String nombre, int numEmpleados, double beneficios) {
        this.nombre = nombre;
        this.setNumEmpleados(numEmpleados);
        this.beneficios = beneficios;
    }

    /**
     *
     * @param numEmpleados
     */
    public void setNumEmpleados(int numEmpleados) {
        if (numEmpleados > 0) {
            this.numEmpleados = numEmpleados;
        }
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return nombre + "\t" + numEmpleados + "\t" + beneficios + " euritos";
    }

    /**
     *
     * @return
     */
    public String getNombre() {
        return nombre;
    }

    /**
     *
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     *
     * @return
     */
    public double getBeneficios() {
        return beneficios;
    }

    /**
     *
     * @param beneficios
     */
    public void setBeneficios(double beneficios) {
        this.beneficios = beneficios;
    }

    /**
     *
     * @return
     */
    public int getNumEmpleados() {
        return numEmpleados;
    }
}
