
package Ejercicio3;

/**
 *
 * @author joel
 */
public class HistoriaRectangulos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Punto p1= new Punto(0,0);
        Punto p2= new Punto(10,5);
        
        Rectangulo2 r1= new Rectangulo2(p1,p2,"Mi rectangulo");
        System.out.println("El punto 1: "+p1.toString());
        System.out.println("El punto 2: "+p2.toString());
        System.out.println("El rectangulo: "+r1.toString());
        
        System.out.println("---------------------------------------------------");
        System.out.println("                R1 desplazado");
        r1.desplazar(2, 2);
        System.out.println("El punto 1: "+p1.toString());
        System.out.println("El punto 2: "+p2.toString());
        System.out.println("El rectangulo: "+r1.toString());
    }
    
}
