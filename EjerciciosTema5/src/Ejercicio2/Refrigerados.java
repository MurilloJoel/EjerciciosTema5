
package Ejercicio2;

/**
 *
 * @author joel
 */


import java.time.LocalDate;

public class Refrigerados extends Producto{
    protected int codOSA;
    
    //Constructor
    public Refrigerados(String nombre, int numLote, LocalDate fechaCaducidad, int codOSA) {
        super(nombre, numLote, fechaCaducidad);
        this.codOSA = codOSA;
    }
    
    //Metodos Getter Setter

    public int getCodOSA() {
        return codOSA;
    }

    public void setCodOSA(int codOSA) {
        this.codOSA = codOSA;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        super.toString();
        return "Refrigerados{" + "codOSA=" + codOSA + '}'+ "\n"+ super.toString();
    }
    
    
}
