/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio6;

/**
 *
 * @author alumnotd
 */
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lector l= new Lector("Joel",1,1234,"Hola 10",2);
        Autor a=new Autor("Cervantes","Española",LocalDate.of(1547, Month.SEPTEMBER, 29));
        Copia c= new Copia("1",Estado.DISPONIBLE,"El Quijote","Paraninfo",1605,a,TipoLibro.NOVELA);
        Prestamo p= new Prestamo(LocalDate.of(2000, Month.MARCH, 1), LocalDate.of(2001, Month.MARCH, 1),l,c,10,10);
        
        ArrayList <Prestamo> prestamos = new ArrayList<>();
        prestamos.add(p);
        ArrayList <Copia> copias = new ArrayList<>();
        copias.add(c);
        
        ArrayList <Lector> lectores = new ArrayList<>();
        lectores.add(l);
        
        System.out.println(copias.toString()+"\n");
        System.out.println(prestamos.toString()+"\n");
        System.out.println(lectores.toString()+"\n");
    }
    
}
