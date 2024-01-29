package Ejercicio5;

import java.util.ArrayList;

/**
 *
 * @author madrid
 */
public class Principal2 {

    public static void main(String[] args) {
        //Punto 1
        Electrodomestico frigorifico = new Electrodomestico (400,"Rojo",'B',85.6);
        Lavadora lavadorinha = new Lavadora ();
        Television pantallote = new Television(true,58.5,700,"Negro",'E',20);
       
        //Punto 2
        System.out.println(frigorifico.precioFinal());
        System.out.println(lavadorinha.precioFinal());
        System.out.println(pantallote.precioFinal());
        
        //Punto 3: con ArrayList
        ArrayList<Electrodomestico> lista = new ArrayList<>();
        lista.add(frigorifico);
        lista.add(lavadorinha);
        lista.add(pantallote);
        
        
        //Punto 4
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).precioFinal()); // polimorfismo
        }
        
        // Punto 4: lo mismo pero con for-loop
        for(Electrodomestico e : lista){
            System.out.println(e.precioFinal());
        }
     
    }
    
}
