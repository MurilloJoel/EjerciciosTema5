
package Ejercicio3;

/**
 *
 * @author joel
 */
public class Profesor {
    protected String nombre;
    protected int edad;
    protected int añosConsolidados;
    
    //Atributos de clase
    protected static final double BASE= 925;
    protected static final double AÑO= 45.5;
    
    //Constructor

    public Profesor(String nombre, int edad, int añosConsolidados) {
        this.nombre = nombre;
        this.edad = edad;
        this.añosConsolidados = añosConsolidados;
    }

    
    //Metodo ObtenerSalarioBase
    public double obtenerSalarioBase(){
        return BASE+añosConsolidados*AÑO;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Profesor{" + "nombre=" + nombre + "\nedad=" + edad + "\nañosConsolidados=" + añosConsolidados + '}';
    }
    
    
    //Metodos Getter Setter

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAñosConsolidados() {
        return añosConsolidados;
    }

    public void setAñosConsolidados(int añosConsolidados) {
        this.añosConsolidados = añosConsolidados;
    }
    
   
}
