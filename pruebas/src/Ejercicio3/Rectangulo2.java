
package Ejercicio3;

/**
 *
 * @author joel
 */

//version utilizando composicion
public class Rectangulo2 {

    
    //atributos de instancia
    private Punto vertice1;
    private Punto vertice2;
    private String nombre;
    
    //atibutos de clase
    private static int numRectangulos = 0;
    
    //Constructor sin argumentos
    private Rectangulo2(){
        this.vertice1= new Punto(0,0);
        this.vertice2= new Punto(1,1);
        numRectangulos++;
        this.nombre="Rectangulo " +numRectangulos;
    }
    
    //Constructor con todos los argumentos
    public Rectangulo2(Punto vertice1, Punto vertice2, String nombre) {
        this.vertice1 = new Punto(vertice1);
        this.vertice2 = new Punto(vertice2);
        this.nombre = nombre;
        numRectangulos++;
    }
    
    //Constructor con dos parametros: base y altura
    public Rectangulo2(double base, double altura) {
        this.vertice1= new Punto(0,0);
        this.vertice2= new Punto(base,altura);
        numRectangulos++;
        this.nombre="Rectangulo " +numRectangulos;
    }
    
    //Constructor copia
    public Rectangulo2(Rectangulo2 r) {
        Punto v1= new Punto(r.getVertice1());
        this.setVertice1(v1);
        
        Punto v2= new Punto(r.getVertice2());
        this.setVertice2(v2);
        
        this.nombre = r.getNombre();
        numRectangulos++;
        
    }
    
    //Constructor con todos los argumentos de x e y
    public Rectangulo2 (double x1, double y1, double x2, double y2, String nombre){
        this.vertice1= new Punto(x1, y1);
        this.vertice2= new Punto(x2, y2);
        this.nombre= nombre;
        numRectangulos++;
    }

    //Metodo para sacar la base
    public double base(){
        //extraer x1, x2 de los vertices
        double x2= this.getVertice2().getX();
        double x1= this.getVertice1().getX();
        
        return Math.abs(x2 - x1);
    }
    
    //Metodo para sacar la altura
    public double altura(){
        //extraer y1, y2 de los vertices
        double y2= this.getVertice2().getY();
        double y1= this.getVertice1().getY();
        
        return Math.abs(y2 - y1);
    }
    
    //metodo calcularSuperficie()
    public double calcularSuperficie() {
        
        
        
        double area = base() * altura();

        return area;

    }

    //Metodo calcularPerimetro
    public double calcularPerimetro() {
        
        double perimetro = 2* (base()+ altura());

        return perimetro;

    }

    public void desplazar(double x, double y) {
        /*
        
            VERSION 1: RESERVA MAS MEMORIA
        

        //extraer x1, x2 de los vertices
        double x2= this.getVertice2().getX();
        double x1= this.getVertice1().getX();
        
        //extraer y1, y2 de los vertices
        double y2= this.getVertice2().getY();
        double y1= this.getVertice1().getY();
        
        this.setVertice1(new Punto(x1+x, y1+y));
        this.setVertice2(new Punto(x2+x, y2+x));
        
        */
        
        /*
            VERSION 2: SIN RESERVA DE MAS MEMORIA
        */
        
        vertice1.setX(vertice1.getX()+x);
        vertice1.setY(vertice1.getY()+y);
        
        vertice2.setX(vertice2.getX()+x);
        vertice2.setY(vertice2.getY()+y);

    }
    
    
    
    //Getters y setters
    
    public Punto getVertice1() {
        return new Punto(vertice1);
    }

    public void setVertice1(Punto vertice1) {
        vertice1.setX(vertice1.getX());
        vertice1.setY(vertice1.getY());
    }

    public Punto getVertice2() {
        return new Punto(vertice2);
    }

    public void setVertice2(Punto vertice2) {
        vertice2.setX(vertice2.getX());
        vertice2.setY(vertice2.getY());
    }

    public String getNombre() {
        return new String(nombre);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static int getNumRectangulos() {
        return numRectangulos;
    }

    @Override
    public String toString() {
        return "Rectangulo2{" + "vertice1=" + vertice1 + ", vertice2=" + vertice2 + ", nombre=" + nombre + '}';
    }
    
    
}
