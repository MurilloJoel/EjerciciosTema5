
package Ejercicio3;

/**
 *
 * @author joel
 */
public class ProfesorEmerito extends Profesor{
    int añosEmerito;
    
    //Atributos de clase
    public static final double PLUS_EMERITO=67.8;
    
    //Constructor

    public ProfesorEmerito(String nombre, int edad, int añosConsolidados,int añosEmerito) {
        super(nombre, edad, añosConsolidados);
        this.añosEmerito = añosEmerito;
    }

    //Metodo obtenerSalarioBase
    @Override
    public double obtenerSalarioBase(){
        return super.obtenerSalarioBase()+añosEmerito*PLUS_EMERITO;
    }
    
    //Metodo ToString

    @Override
    public String toString() {
        return "ProfesorEmerito{" + "añosEmerito=" + añosEmerito + '}'
                + "\n" + super.toString();
    }
    
    
    //Metodos Getter Setter
    public int getAñosEmerito() {
        return añosEmerito;
    }

    public void setAñosEmerito(int añosEmerito) {
        this.añosEmerito = añosEmerito;
    }
    
    
    
}
