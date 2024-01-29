
package Ejercicio3;

/**
 *
 * @author developer
 */
public class Punto {

    
    private double x,y;

    /**
     * Atributos de Clase
     */
    public static int cantidadPuntos=0;

    /**
     * Atributos de Clase
     */
    public static String nombre="Punto";

    /**
     * Atributos de Instancia
     * @param x Atributo Instancia
     * @param y Atributo Instancia
     */
    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
        cantidadPuntos++;
    }
    
    //Constructor copia
    public Punto(Punto p){
        this.x= p.x;
        this.y= p.y;
        cantidadPuntos++;
    }
    
    /**
     *
     * @return
     */
    public double getX() {
        return x;
    }

    /**
     *
     * @param x
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     *
     * @return
     */
    public double getY() {
        return y;
    }

    /**
     *
     * @param y
     */
    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Punto{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
