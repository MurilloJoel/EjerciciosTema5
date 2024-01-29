package Ejercicio5;

/**
 *
 * @author Mario Martín
 */

public class Principal {

    public static void main(String[] args) {
        
        //Punto 1
        
        Electrodomestico Frigorifico = new Electrodomestico (400,"Rojo",'B',85.6);
        Lavadora Lavadorinha = new Lavadora ();
        Television Pantallote = new Television(true,58.5,700,"Negro",'E',20);
       
        //Punto 2
        System.out.println(Frigorifico.precioFinal());
        System.out.println(Lavadorinha.precioFinal());
        System.out.println(Pantallote.precioFinal());
        
        //Punto 3
        Electrodomestico [] Arraysito = new Electrodomestico[3];
        Arraysito[0] = Frigorifico;
        Arraysito[1] = Lavadorinha;
        Arraysito[2] = Pantallote;
        
        //Punto 4
        for (int i = 0; i < Arraysito.length; i++) {
            System.out.println(Arraysito[i].precioFinal()); // polimorfismo
        }
     
        
        
    }
    
}
