
package Ejercicio7;

/**
 *
 * @author joel
 */

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        M objM= new M();
        A objA= new A();
        B objB= new B();
        C objC= new C();
        
        ArrayList<M> lista= new ArrayList<>();
        lista.add(objM);
        lista.add(objA);
        lista.add(objB);
        lista.add(objC);
        
        for (M e: lista) {
            System.out.println(e.toString());
        }
        
    }
    
}
