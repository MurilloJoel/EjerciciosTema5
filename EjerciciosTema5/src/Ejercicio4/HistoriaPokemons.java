package Ejercicio4;

/**
 *
 * @author joel
 */
import java.util.Scanner;

public class HistoriaPokemons {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int muertesPlanta;
        int muertesFuego;
        int muertesAgua;
        int muertesNormal;

        Pokemon p = new Pokemon("Ratata", 30, 56);
        Pokemon pa = new PokemonAgua("Squirtle", 44, 48);
        Pokemon pf = new PokemonFuego("Charizard", 78, 84);
        Pokemon pp = new PokemonPlanta("Snivy", 45, 45);

        System.out.println(pp.getClass().getSimpleName() + "\n" + pp.toString());

        System.out.println("Que pokemon eliges?");
        String eleccionP = teclado.nextLine();

        System.out.println("A que pokemon quieres atacar?");
        String eleccionA = teclado.nextLine();

        if (eleccionP.equalsIgnoreCase("Ratata")) {
            System.out.println("Has elegido a ratata");
            if (eleccionA.equalsIgnoreCase("Squirtle")) {
                System.out.println("Has atacado a squirtle");
                p.atacarPokemon(pa);
                System.out.println(p.getClass().getSimpleName() + "\n" + p.toString());
                System.out.println(pa.getClass().getSimpleName() + "\n" + pa.toString());

            } else if (eleccionA.equalsIgnoreCase("Charizard")) {
                System.out.println("Has atacado a Charizard");
                p.atacarPokemon(pf);
                System.out.println(p.getClass().getSimpleName() + "\n" + p.toString());
                System.out.println(pf.getClass().getSimpleName() + "\n" + pf.toString());

            } else if (eleccionA.equalsIgnoreCase("Snivy")) {
                System.out.println("Has atacado a Snivy");
                p.atacarPokemon(pp);
                System.out.println(p.getClass().getSimpleName() + "\n" + p.toString());
                System.out.println(pp.getClass().getSimpleName() + "\n" + pp.toString());

            } else {
                if (eleccionA.equalsIgnoreCase(eleccionP)) {
                    System.out.println("No puedes atacarte a ti mismo");
                } else {
                    System.out.println("Ese pokemon que intentas atacar no es valido");
                }
            }
        } else if (eleccionP.equalsIgnoreCase("Squirtle")) {
            System.out.println("Has elegido a squirtle");
            if (eleccionA.equalsIgnoreCase("Ratata") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a ratata");
                pa.atacarPokemon(p);
                System.out.println(pa.getClass().getSimpleName() + "\n" + pa.toString());
                System.out.println(p.getClass().getSimpleName() + "\n" + p.toString());

            }else if (eleccionA.equalsIgnoreCase("Charizard") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a Charizard");
                pa.atacarPokemon(pf);
                System.out.println(pa.getClass().getSimpleName() + "\n" + pa.toString());
                System.out.println(pf.getClass().getSimpleName() + "\n" + pf.toString());

            } else if (eleccionA.equalsIgnoreCase("Snivy") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a Snivy");
                pa.atacarPokemon(pp);
                System.out.println(pa.getClass().getSimpleName() + "\n" + pa.toString());
                System.out.println(pp.getClass().getSimpleName() + "\n" + pp.toString());

            } else {
                if (eleccionA.equalsIgnoreCase(eleccionP)) {
                    System.out.println("No puedes atacarte a ti mismo");
                } else {
                    System.out.println("Ese pokemon que intentas atacar no es valido");
                }
            }
        } else if (eleccionP.equalsIgnoreCase("Charizard")) {
            System.out.println("Has elegido a Charizard");

            if (eleccionA.equalsIgnoreCase("Ratata") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a ratata");

            } else if (eleccionA.equalsIgnoreCase("Squirtle") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a squirtle");

            } else if (eleccionA.equalsIgnoreCase("Charizard") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a Charizard");

            } else if (eleccionA.equalsIgnoreCase("Snivy") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a Snivy");

            } else {
                if (eleccionA.equalsIgnoreCase(eleccionP)) {
                    System.out.println("No puedes atacarte a ti mismo");
                } else {
                    System.out.println("Ese pokemon que intentas atacar no es valido");
                }
            }
        } else if (eleccionP.equalsIgnoreCase("Snivy")) {
            System.out.println("Has elegido a Snivy");
            if (eleccionA.equalsIgnoreCase("Ratata") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a ratata");

            } else if (eleccionA.equalsIgnoreCase("Squirtle") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a squirtle");

            } else if (eleccionA.equalsIgnoreCase("Charizard") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a Charizard");

            } else if (eleccionA.equalsIgnoreCase("Snivy") && (eleccionA.equalsIgnoreCase(eleccionP) == false)) {
                System.out.println("Has atacado a Snivy");

            } else {
                if (eleccionA.equalsIgnoreCase(eleccionP)) {
                    System.out.println("No puedes atacarte a ti mismo");
                } else {
                    System.out.println("Ese pokemon que intentas atacar no es valido");
                }
            }
        } else {
            System.out.println("Ese pokemon no existe");
        }

    }

}
