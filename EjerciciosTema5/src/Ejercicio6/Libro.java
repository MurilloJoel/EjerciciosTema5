
package Ejercicio6;

/**
 *
 * @author developer
 */

public class Libro {
    
    private String nombre;
    private String editorial;
    private int año;
    private Autor autor;
    private TipoLibro tipo;

    public Libro(String nombre, String editorial, int año, Autor autor, TipoLibro tipo) {
        this.nombre = nombre;
        this.editorial = editorial;
        this.año = año;
        this.autor = autor;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public TipoLibro getTipo() {
        return tipo;
    }

    public void setTipo(TipoLibro tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Libro{" + "nombre=" + nombre + ", editorial=" + editorial + ", a\u00f1o=" + año + ", autor=" + autor + ", tipo=" + tipo + '}';
    }

    
    
    
}
