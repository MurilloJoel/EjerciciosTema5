/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio3;

/**
 *
 * @author developer
 */
public class HistoriaRectangulos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Rectangulo r1= new Rectangulo(1,3,1,3,"Rectangulo 1");
       
        System.out.println(r1.toString());
        System.out.println(r1.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r1.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------");
        System.out.println("                R1 desplazado");
        r1.desplazar(1, 2);
        System.out.println(r1.toString());
        System.out.println(r1.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r1.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------\n");
        System.out.println("---------------------------------------------------");
        Rectangulo r2= new Rectangulo();
       
        System.out.println(r2.toString());
        System.out.println(r2.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r2.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------");
        System.out.println("                R2 desplazado");
        r2.desplazar(1, 2);
        System.out.println(r2.toString());
        System.out.println(r2.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r2.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------\n");
        System.out.println("---------------------------------------------------");
        Rectangulo r3= new Rectangulo(1.5,2.0);
       
        System.out.println(r3.toString());
        System.out.println(r3.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r3.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------");
        System.out.println("                R3 desplazado");
        r3.desplazar(1, 2);
        System.out.println(r3.toString());
        System.out.println(r3.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r3.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------\n");
        System.out.println("---------------------------------------------------");
        Rectangulo r4= new Rectangulo(r3);
       
        System.out.println(r4.toString());
        System.out.println(r4.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r4.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------");
        System.out.println("                R4 desplazado");
        r3.desplazar(1, 2);
        System.out.println(r4.toString());
        System.out.println(r4.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r4.calcularSuperficie()+ " --> Area");
        
         System.out.println("---------------------------------------------------\n");
        System.out.println("---------------------------------------------------");
        Rectangulo r5= r4;
       
        System.out.println(r5.toString());
        System.out.println(r5.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r5.calcularSuperficie()+ " --> Area");
        
        System.out.println("---------------------------------------------------");
        System.out.println("                R5 desplazado");
        r5.desplazar(1, 2);
        System.out.println(r5.toString());
        System.out.println(r5.calcularPerimetro()+ " --> Perimetro");
        System.out.println(r5.calcularSuperficie()+ " --> Area");
        
        
        if(r3==r4){
            System.out.println("r3 y r4 son la misma referencia");
        }else{
            System.out.println("r3 y r4 no son la misma referencia");
        }
        
        if (r4==r5) {
            System.out.println("r4 y r5 son la misma referencia");
        }else{
            System.out.println("r4 y r5 no son la misma referencia");
        }
    }
    
}
