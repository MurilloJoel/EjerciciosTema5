
package Ejercicio1;

import java.time.LocalDate;

/**
 *
 * @author joel
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Persona p1= new Persona("12A","Pepe","Martin", LocalDate.of(1998, 7, 20));
       Persona p2= new Persona("15MA","Pepa","Martinez", LocalDate.of(2000, 6, 12));
       Persona p3= new Persona("7899689T","Luis","Zamora", LocalDate.of(2004, 9, 16));
       
       //Equipo con p1 y p2
       Persona [] miembros1={p1,p2};
       Equipo a= new Equipo("A", miembros1);
       
       //Equipo con las tres
       Persona [] miembros2= {p1,p2,p3};
       Equipo b= new Equipo("B",miembros2);
       
       //Otro equipo de 5 personas
       Equipo c= new Equipo("C", new Persona[5]);
       
        System.out.println("----------------------------------------------------");
        
        System.out.println(a.toString());
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(b.toString());
        
        System.out.println("----------------------------------------------------");
        
        System.out.println(c.toString());
        
        System.out.println("----------------------------------------------------");
    }
    
}
