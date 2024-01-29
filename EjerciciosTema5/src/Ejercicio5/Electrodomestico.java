package Ejercicio5;

/**
 *
 * @author Mario Martín
 */
public class Electrodomestico {
    
    private double precioBase = PRECIO_BASE;
    private String color = COLOR_DEFAULT;
    private char consumoEnergetico = CONSUMO_DEFAULT;
    private double peso = PESO_DEFAULT;
    
    private static final double PRECIO_BASE = 100;
    private static final String COLOR_DEFAULT = "Blanco";
    private static final char CONSUMO_DEFAULT = 'F';
    private static final double PESO_DEFAULT = 5;

    public Electrodomestico() {
        
    }

    public Electrodomestico(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        
    }

    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        setConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public final void setConsumoEnergetico(char consumoEnergetico) {
        if (consumoEnergetico>='A' && consumoEnergetico<='F')
            this.consumoEnergetico = consumoEnergetico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public final boolean comprobarConsumoEnergetico(char letra){
        setConsumoEnergetico(letra);
        return (letra >= 'A' && letra <='F');
    }
    
    public double precioFinal(){
        double dinero=0;
        double plusLetra=0;
        double plusPeso=0;
        switch(this.consumoEnergetico){
            case 'A':
                plusLetra=100;
                break;
            case 'B':
                plusLetra=80;
                break;
            case 'C':
                plusLetra=60;
                break;
            case 'D':
                plusLetra=50;
                break;
            case 'E':
                plusLetra=30;
                break;
            case 'F':
                plusLetra=10;
                break;
        }
        if (this.peso>=80) {
            plusPeso = 100;
        }else if(this.peso>=50&&this.peso<80){
            plusPeso = 80;
            }else if(this.peso>=20&&this.peso<50){
                plusPeso = 50;
                }else if(this.peso>0){
                    plusPeso = 10;
        }
        dinero= this.precioBase+plusPeso+plusLetra;
        return dinero;
    }
    
    
    
    
    
    
}
