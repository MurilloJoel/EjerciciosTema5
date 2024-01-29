/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author joel
 */
public class Rectangulo {

    //atributos de instancia
    private double x1, x2;
    private double y1, y2;
    private String nombre;

    //atibutos de clase
    private static int numRectangulos = 0;

    public Rectangulo() {
        this.x1=0;
        this.y1=0;
        this.x2=10;
        this.y2=10;
        numRectangulos++;
        this.nombre="Rectangulo " +numRectangulos;
    }
    
    public Rectangulo(double base, double altura) {
        this.x1=0;
        this.y1=0;
        this.x2=base;
        this.y2=altura;
        numRectangulos++;
        this.nombre="Rectangulo " +numRectangulos;
    }

    public Rectangulo(Rectangulo r) {
        this.x1 = r.getX1();
        this.x2 = r.getX2();
        this.y1 = r.y1;
        this.y2 = r.getY2();
        this.nombre = r.getNombre();
        numRectangulos++;
        
    }

    public Rectangulo(double x1, double x2, double y1, double y2, String nombre) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
        this.nombre = nombre;
        numRectangulos++;
    }
    
    

    public double calcularSuperficie() {

        double area = Math.abs(x2 - x1) * Math.abs(y2 - y1);

        return area;

    }

    public double calcularPerimetro() {

        double perimetro = Math.abs(2 * (x2 - x1)) + Math.abs(2 * (y2 - this.y1));

        return perimetro;

    }

    public void desplazar(double x, double y) {
        this.x1 += x;
        this.x2 += x;

        this.y1 += y;
        this.y2 += y;

    }

    public static int getNumRectangulos() {
        return numRectangulos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getX1() {
        return x1;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public double getX2() {
        return x2;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public double getY1() {
        return y1;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public double getY2() {
        return y2;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    @Override
    public String toString() {
        return "x1=" + x1 + ", x2=" + x2 + ", y1=" + y1 + ", y2=" + y2 + ", nombre=" + nombre;
    }

}
