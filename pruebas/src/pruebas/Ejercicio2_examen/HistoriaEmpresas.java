/*

 Escribe un programa que utilice una clase Empresa que tenga como atributos el nombre, el número de empleados y los beneficios (con decimales y podrían ser negativos). Habrá un constructor que recibirá 3 argumentos correspondientes a los 3 atributos.

Se utilizará la encapsulación. El método setNumEmpleados no permitirá que el n de empleados sea menor o igual a cero.

Tendrá un método toString que devolverá el String de su nombre, su n de empleados y sus beneficios separados por tabuladores.

        Ejemplo:

        Market Digital      28      12522.35

El programa tendrá también una clase HistoriaEmpresas:

Primero se escribirá por pantalla la fecha de hoy haciendo uso de la clase que Java tiene en sus librerías de manejo tiempos históricos.

Se leerá un número entero n por teclado que será el número de empresas que se van a crear. 
Con ese número se crearán n objetos Empresa, donde el nombre se leerá por teclado,
el número de empleados será un número al azar entre 1 y 50, 
los beneficios serán un número que se leerá por teclado (se capturará la excepción en caso de que no se escriba un número, 
escribiendo el mensaje "No es un número" y terminando la ejecución del programa).

        A continuación, se mostrará un menú con las siguientes opciones:

            1. Mostrar empresas (todas)

            2. Mostrar empresa/s con más beneficios

            3. Mostrar el número medio de empleados de las empresas introducidas.

            0. Salir




 */
package pruebas.Ejercicio2_examen;

import java.util.Scanner;
import java.time.LocalDate;


public class HistoriaEmpresas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LocalDate fecha= LocalDate.now();
        // Mostrar la fecha de hoy
        System.out.println("Fecha de hoy: " + fecha); // Aquú­ deberú­as usar las librerú­as de manejo de tiempos históricos de Java

        // Leer el número de empresas a crear
        System.out.print("Ingrese el número de empresas a crear: ");
        int n = teclado.nextInt();

        Empresa[] empresas = new Empresa[n];

        for (int i = 0; i < n; i++) {
            // Leer los datos de la empresa
            System.out.println("Ingrese los datos de la empresa " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = teclado.next();
            
            int numEmpleados = 1+(int)(Math.random()*49);
            System.out.print("Número de empleados (1-50): " + numEmpleados+ "\n");
            

            System.out.print("Beneficios: ");
            double beneficios;
            try {
                beneficios = teclado.nextDouble();
            } catch (Exception e) {
                System.out.println("No es un número");
                return;
            }

            // Crear el objeto Empresa
            empresas[i] = new Empresa(nombre, numEmpleados, beneficios);
        }

        // Mostrar el menú
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Mostrar empresas (todas)");
            System.out.println("2. Mostrar empresa/s con más beneficios");
            System.out.println("3. Mostrar el número medio de empleados de las empresas introducidas.");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    mostrarEmpresas(empresas);
                    break;
                case 2:
                    mostrarEmpresasConMasBeneficios(empresas);
                    break;
                case 3:
                    mostrarNumMedioEmpleados(empresas);
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opcion != 0);

        teclado.close();
    }

    public static void mostrarEmpresas(Empresa[] empresas) {
        System.out.println("\nEmpresas:");
        for (Empresa empresa : empresas) {
            System.out.println(empresa.toString());
        }
    }

    public static void mostrarEmpresasConMasBeneficios(Empresa[] empresas) {
        double maxBeneficios = Double.MIN_VALUE;
        System.out.println("\nEmpresa/s con más beneficios:");
        for (Empresa empresa : empresas) {
            if (empresa.getBeneficios() > maxBeneficios) {
                maxBeneficios = empresa.getBeneficios();
            }
        }

        for (Empresa empresa : empresas) {
            if (empresa.getBeneficios() == maxBeneficios) {
                System.out.println(empresa.toString());
            }
        }
    }

    public static void mostrarNumMedioEmpleados(Empresa[] empresas) {
        int totalEmpleados = 0;
        for (Empresa empresa : empresas) {
            totalEmpleados += empresa.getNumEmpleados();
        }

        double numMedioEmpleados = (double) totalEmpleados / empresas.length;

        System.out.println("\nNúmero medio de empleados: " + numMedioEmpleados);
    }
}
