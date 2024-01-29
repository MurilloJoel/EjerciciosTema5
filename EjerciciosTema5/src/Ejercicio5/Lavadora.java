package Ejercicio5;

/**
 *
 * @author Mario Martín
 */

public class Lavadora extends Electrodomestico{
    
// atributo de instancia
    private double carga = CARGA_DEFAULT;
    
    //atributo de clase
    private static final double CARGA_DEFAULT = 5;
    
    
    
    public Lavadora() {
        super();        
    }

    /**
     * 
     * @param precioBase PrecioBase de la lavadora
     * @param peso Peso de la lavadora
     */
    public Lavadora(double precioBase, double peso) {
        super(precioBase, peso);
    }

    /**
     * 
     * @param precioBase PrecioBase de la lavadora
     * @param color color de la lavadora
     * @param consumoEnergetico ConsumoEnergetico de la lavadora
     * @param peso Peso de la lavadora
     * @param carga Carga de la lavadora 
     */
    
    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }
    
    /**
     * 
     * @return dinero Costo final de la lavadora
     */
    public double precioFinal(){
        double dinero =super.precioFinal();
        if (this.carga>30) {
            dinero+=50;
        }
        return dinero;
    }
    
    
}
