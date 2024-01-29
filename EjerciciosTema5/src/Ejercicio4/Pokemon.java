package Ejercicio4;

/**
 *
 * @author joel
 */
public class Pokemon {

    protected String nombre;
    protected double hp;
    protected double at;

    //Constructor
    public Pokemon(String nombre, double hp, double at) {
        this.nombre = nombre;
        this.hp = hp;
        this.at = at;
    }

    //Metodo estaMuerto
    public boolean estaMuerto() {
        if (hp > 0) {
            return false;
        } else {
            return true;
        }
    }

    //Metodo atacarPokemon
    public void atacarPokemon(Pokemon p) {
        
    }

    //Metodo ToString
    @Override
    public String toString() {
        return "nombre=" + nombre + ", hp=" + hp + ", at=" + at + '}';
    }

    //Metodos Getter Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAt() {
        return at;
    }

    public void setAt(double at) {
        this.at = at;
    }

}
