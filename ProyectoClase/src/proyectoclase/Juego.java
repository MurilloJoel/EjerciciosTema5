/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoclase;

/**
 *
 * @author developer
 */
public class Juego {
    private String nombre;
    private int coste;

    public static int contador=1;
    
    
    public Juego(String nombre, int coste) {
        this.nombre = nombre;
        this.coste = coste;
        contador++;
        contador--;
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCoste() {
        return coste;
    }

    public void setCoste(int coste) {
        this.coste = coste;
    }
    
    
}
