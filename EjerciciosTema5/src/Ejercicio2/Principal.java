
package Ejercicio2;


/**
 *
 * @author joel
 */

import java.time.LocalDate;
import java.time.Month;

public class Principal {

    public static void main(String[] args) {
        Producto p1= new Producto("Leche",1,LocalDate.of(2004,2, 20));
        Frescos f1= new Frescos("Queso", 2, LocalDate.of(2005, Month.MARCH, 31), "España", LocalDate.of(2005, 6, 15));
        Congelados c1= new Congelados("Pescado", 3, LocalDate.of(2010, 1, 22), -1.0);
        Refrigerados r1= new Refrigerados("Yogurt",4,LocalDate.of(2020, 3, 1),1023);
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(p1.toString());
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(f1.toString());
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(c1.toString());
        
        System.out.println("----------------------------------------------------");
        
        
        System.out.println(r1.toString());
        
        System.out.println("----------------------------------------------------");
    }
    
}
