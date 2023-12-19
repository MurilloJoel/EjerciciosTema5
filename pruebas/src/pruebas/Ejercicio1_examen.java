/*
                                 EJERCICIO 1 DEL EXAMEN

Las nuevas políticas de seguridad de contraseñas que se aplican en el instituto recomiendan que éstas sean de al menos 8 caracteres,
que contengan al menos una letra mayúscula, al menos 3 minúsculas, al menos 2 dígitos que no se repitan en toda la contraseña,
uno o más de los siguientes caracteres no alfanuméricos: #, %, +, *, -, _, $ y que empiece por letra. 
No se permitirá ningún otro carácter que no esté contemplado entre los antedichos.

Realiza en Java un programa que lea por teclado una contraseña y diga si es válida o no. Si no es válida,
que diga por pantalla el/los motivos.


Ejemplos:

        Ca51ta_7

    Es válida


        C0raz0n

    No es válida

    No tiene la longitud mínima

    Tiene dos dígitos repetidos

    No tiene al menos un caracter no alfanumérico

 */
package pruebas;

import java.util.Scanner;

/*
 

    @author Mario Martin*/

public class Ejercicio1_examen {

    /*
    @param args the command line arguments
    */
      public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);


        boolean verificador = true;
        String contraseña;

        boolean numRep = false;
        char num2 = '0';
        char valorA = 'A';
        int contador1 = 0;
        int contador2 = 0;
        int contadorSimbolos=0;
        int contadorMayus = 0;
        String resultado = "";
        System.out.println("Introduce una contraseña");
        contraseña = sc.nextLine();

        char[] contraseña2 = new char[contraseña.length()];

        if (contraseña.length() < 8) {
            verificador = false;
            resultado += "Tu contraseña es demasiado corta\n";
        }
        for (int i = 0; i < contraseña.length(); i++) {
            contraseña2[i] = contraseña.charAt(i);
        }
        if (contraseña.toLowerCase() == contraseña) {
            resultado += "Falta al menos una mayuscula en tu contraseña\n";
            verificador = false;

        }

        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < contraseña.length(); j++) {
                if (contraseña2[j] == valorA) {
                    contadorMayus++;
                }
            }
            valorA++;
        }
if (contadorMayus < 1) {
            resultado += "Te falta una mayúscula\n";
            verificador = false;
        }
        for (int i = 0; i < contraseña2.length; i++) {
            switch (contraseña2[i]) {
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case '0':
                    contador1++;
                    break;
            }
        }
        if (contador1 < 2) {
            resultado += "Te faltan 2 numeros titan\n";
            verificador = false;
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < contraseña2.length; j++) {
                if (contraseña2[j] == num2) {
                    contador2++;
                }
                if (contador2 > 2) {
                    numRep = true;
                }
            }
            num2++;
        }
        if (numRep == true) {
            resultado += "Se repiten 2 numeros titan\n";
            verificador = false;
        }
        for (int i = 0; i < contraseña2.length; i++) {
            switch (contraseña2[i]) {
                case '&':
                case '%':
                case '_':
                case '-':
                case '/':
                case '$':
                    contadorSimbolos++;
                    break;
            }
        }
        if (contadorSimbolos<2){
            resultado+="Te faltan simbolos crack\n";
            verificador=false;
        }

        //Resultado de la contraseña
        if (verificador == true) {
            System.out.println("Contraseña bien hecha");
        } else {
            System.out.println("Contraseña mal hecha");
            System.out.print(resultado);

        }

    }

}