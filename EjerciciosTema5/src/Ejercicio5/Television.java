package Ejercicio5;

/**
 *
 * @author Mario Martín
 */
public class Television extends Electrodomestico {
    // atributos de clase
    private static final boolean SMART_TV_DEFAULT = false;
    private static final double RESOLUCION_DEFAULT = 32;
    
    // atributos de instancia
    private boolean smartTV = SMART_TV_DEFAULT;
    private double resolucion = RESOLUCION_DEFAULT;

    public Television() {
        super();
    }

    public Television(double precioBase, double peso) {
        super(precioBase, peso);
    }

    public Television(boolean smartTV, double resolucion, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.smartTV = smartTV;
        this.resolucion = resolucion;
    }

    public boolean isSmartTV() {
        return smartTV;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setSmartTV(boolean smartTV) {
        this.smartTV = smartTV;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public double precioFinal() {
        double dinero = super.precioFinal();
        double aumentoResolucion = dinero * 0.3;
        if (this.resolucion > 40) {
            dinero += aumentoResolucion;
        }
        if (smartTV) {
            dinero += 50;
        }
        return dinero;
    }
}
