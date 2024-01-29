
package Ejercicio3;

/**
 *
 * @author joel
 */
public class HistoriaProfes {

    public static void main(String[] args) {
        ProfesorEmerito pe= new ProfesorEmerito("Felix Garcia",70,37,3);
        Profesor p= new Profesor("Juana Mato", 50, 20);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(pe.toString());
        System.out.println(pe.obtenerSalarioBase());
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(p.toString());
        System.out.println(p.obtenerSalarioBase());
        
        System.out.println("----------------------------------------------------");
    }
    
}
