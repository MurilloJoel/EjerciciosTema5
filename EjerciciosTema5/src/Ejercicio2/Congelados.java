
package Ejercicio2;

import java.time.LocalDate;

/**
 *
 * @author joel
 */
public class Congelados extends Producto{
    protected double tempCongRec;
    
    //Constructor
    public Congelados(String nombre, int numLote, LocalDate fechaCaducidad, double tempCongRec) {
        super(nombre, numLote, fechaCaducidad);
        this.tempCongRec = tempCongRec;
    }
    
    //Metodos Getter Setter

    public double getTempCongRec() {
        return tempCongRec;
    }

    public void setTempCongRec(double tempCongRec) {
        this.tempCongRec = tempCongRec;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "Congelados{" + "tempCongRec=" + tempCongRec + '}'+ "\n"+ super.toString();
    }
    
}
