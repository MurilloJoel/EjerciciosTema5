package PruebasInput;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author joel
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Cuenta> cuentas = new ArrayList<>();
        int opcion = -1;
        double saldo;
        long numCuenta;
        
        do {
            try {
                menu();
                System.out.println("Elija una opción: ");
                opcion = sc.nextInt();
                sc.nextLine(); // borrar buffer
                switch (opcion) {
                    case 1: // crear cuenta nueva
                    try {
                        System.out.print("Escriba un nº de cuenta: ");
                        numCuenta = sc.nextLong();
                        sc.nextLine(); // borrar buffer
                        for (Cuenta c : cuentas) {
                            if (c.getNumCuenta() == numCuenta) // cuenta ya existe
                            {
                                throw new ExcepcionPropia("Este número de cuenta ya existe");
                            }
                        }
                        System.out.print("\nTitular? ");
                        String titular = sc.nextLine();
                        System.out.print("\nSaldo inicial? ");
                        saldo = sc.nextDouble();
                        sc.nextLine(); // borrar buffer
                        Cuenta c = new Cuenta(numCuenta, saldo, titular);
                        cuentas.add(c);

                    } catch (InputMismatchException ex) {
                        System.out.println("El número de cuenta o el saldo tiene caracteres no válidos");
                        sc.nextLine(); // borrar buffer
                    } catch (ExcepcionPropia ex) {
                        System.out.println(ex.getMessage());
                        sc.nextLine(); // borrar buffer
                    }
                    break;
                    case 2: // ingresar dinero
                        try {
                        System.out.print("Escriba un nº de cuenta: ");
                        numCuenta = sc.nextLong();
                        
                        sc.nextLine(); // borrar buffer
                        System.out.print("\nSaldo a ingresar? ");
                        double dinero = sc.nextDouble();
                        sc.nextLine(); // borrar buffer
                        cuentas.get(0).ingresar(dinero);
                        System.out.println(cuentas.toString());
                            
                        for (Cuenta c : cuentas) {
                            if (c.getNumCuenta() != numCuenta) // cuenta ya existe
                            {
                                throw new ExcepcionPropia("Este número de cuenta no existe");
                            }
                            else if(dinero<=0){
                                throw new ExcepcionPropia("Introduce un valor valido campeon");
                            }
                        }
                    } catch (InputMismatchException ex) {
                        System.out.println("El número de cuenta o el saldo tiene caracteres no válidos");
                        sc.nextLine(); // borrar buffer
                    } catch (ExcepcionPropia ex) {
                        System.out.println(ex.getMessage());
                        
                    }finally{
                            sc.nextLine(); // borrar buffer
                        }
                        break;
                    case 3: // sacar dinero
                        
                        break;
                    case 4: // transferencia entre 2 cuentas
                        break;
                    case 5: // imprimir el saldo
                        break;
                    case 6: // imprimir los datos
                        break;
                    case 0:
                        System.out.println("Adios, tenga un buen día");
                        break;
                    default:
                        System.out.println("Opción no contemplada");
                }
            
            } catch (InputMismatchException ex) {
                System.out.println("La opción de menú no es un número");
                sc.nextLine(); // borrar buffer
            }
        } while (opcion != 0);
        
    }
    
    public static void menu(){
        System.out.println("1. Crear cuenta\n" +
                           "2. Ingresar dinero\n" +
                           "3. Sacar dinero\n" +
                           "4. Transferencia entre dos cuentas\n" +
                           "5. Imprimir el saldo\n" +
                           "6. Imprimir datos\n"+
                           "0. Salir");
    }
    
}
